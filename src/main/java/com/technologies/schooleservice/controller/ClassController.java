package com.technologies.schooleservice.controller;

import com.technologies.schooleservice.model.dto.request.ClassDtoRequest;
import com.technologies.schooleservice.model.dto.response.ClassDtoResponse;
import com.technologies.schooleservice.model.entity.Class;
import com.technologies.schooleservice.service.ClassService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/classes")
@RequiredArgsConstructor
public class ClassController {

    private final ClassService classService;

    @GetMapping
    public ResponseEntity<List<ClassDtoResponse>> getAllClasses() {
        List<ClassDtoResponse> classes = classService.getAllClasses();
        return new ResponseEntity<>(classes, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ClassDtoResponse> getClassById(@PathVariable Long id) {
        ClassDtoResponse classObj = classService.getClassById(id);
        return classObj != null ? ResponseEntity.ok(classObj) : ResponseEntity.notFound().build();
    }

    @PostMapping("/{schoolId}")
    public ResponseEntity<Class> createClass(@PathVariable Long schoolId, @RequestBody ClassDtoRequest classDtoRequest) {
        Class savedClass = classService.saveClass(schoolId, classDtoRequest);
        return new ResponseEntity<>(savedClass, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteClass(@PathVariable Long id) {
        classService.deleteClass(id);
        return ResponseEntity.noContent().build();
    }
}

