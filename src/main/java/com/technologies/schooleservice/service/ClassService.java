package com.technologies.schooleservice.service;

import com.technologies.schooleservice.model.dto.request.ClassDtoRequest;
import com.technologies.schooleservice.model.dto.response.ClassDtoResponse;
import com.technologies.schooleservice.model.entity.Class;
import com.technologies.schooleservice.model.entity.School;
import com.technologies.schooleservice.model.repository.ClassRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ClassService {

    private final ClassRepository classRepository;

    private final SchoolService schoolService;

    private final ModelMapper modelMapper;

    public Class saveClass(Long schoolId, ClassDtoRequest classDtoRequest) {
        School school = schoolService.getSchoolById(schoolId);
        Class classObj = Class.builder()
                .className(classDtoRequest.getClassName())
                .classType(classDtoRequest.getClassType())
                .school(school)
                .build();
        return classRepository.save(classObj);
    }

    public void deleteClass(Long id) {
        classRepository.deleteById(id);
    }

    public List<ClassDtoResponse> getAllClasses() {
        List<Class> classes = classRepository.findAll();
        return classes.stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    private ClassDtoResponse convertToDTO(Class classObj) {
        ClassDtoResponse classDTOResponse = modelMapper.map(classObj, ClassDtoResponse.class);
        classDTOResponse.setSchoolName(classObj.getSchool().getName());
        return classDTOResponse;
    }

    public ClassDtoResponse getClassById(Long id) {
        return convertToDTO(classRepository.findById(id).orElse(null));
    }
}


