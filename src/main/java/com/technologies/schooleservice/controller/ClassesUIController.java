package com.technologies.schooleservice.controller;

import com.technologies.schooleservice.model.dto.request.ClassDtoRequest;
import com.technologies.schooleservice.model.dto.response.ClassDtoResponse;
import com.technologies.schooleservice.model.entity.Class;
import com.technologies.schooleservice.service.ClassService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/classes/ui")
@RequiredArgsConstructor
public class ClassesUIController {

    private final ClassService classService;

    @GetMapping
    public String getAllClasses(Model model) {
        List<ClassDtoResponse> classes = classService.getAllClasses();
        model.addAttribute("classes", classes);
        return "class_list";
    }
}

