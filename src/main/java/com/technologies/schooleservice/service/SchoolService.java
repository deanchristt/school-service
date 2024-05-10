package com.technologies.schooleservice.service;

import com.technologies.schooleservice.model.dto.request.ClassDtoRequest;
import com.technologies.schooleservice.model.dto.request.SchoolDtoRequest;
import com.technologies.schooleservice.model.entity.Class;
import com.technologies.schooleservice.model.entity.School;
import com.technologies.schooleservice.model.repository.SchoolRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SchoolService {

    private final SchoolRepository schoolRepository;

    public List<School> getAllSchools() {
        return schoolRepository.findAll();
    }

    public School getSchoolById(Long id) {
        return schoolRepository.findById(id).orElse(null);
    }

    @Transactional
    public School saveSchool(SchoolDtoRequest schoolDtoRequest){
        School school = new School();
        school.setName(schoolDtoRequest.getSchoolName());
        school.setSchoolType(schoolDtoRequest.getSchoolType());

        List<ClassDtoRequest> classDTOList = schoolDtoRequest.getClasses();
        if (classDTOList != null && !classDTOList.isEmpty()) {
            for (ClassDtoRequest classDTO : classDTOList) {
                Class schoolClass = Class.builder()
                        .className(classDTO.getClassName())
                        .classType(classDTO.getClassType())
                        .school(school)
                        .build();
                school.getClasses().add(schoolClass);
            }
        }

        return schoolRepository.save(school);
    }

    public void deleteSchool(Long id) {
        schoolRepository.deleteById(id);
    }
}

