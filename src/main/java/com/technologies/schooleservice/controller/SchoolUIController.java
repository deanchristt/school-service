package com.technologies.schooleservice.controller;

import com.technologies.schooleservice.model.entity.School;
import com.technologies.schooleservice.service.SchoolService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/schools/ui")
@RequiredArgsConstructor
public class SchoolUIController {

    private final SchoolService schoolService;

    @GetMapping
    public String getAllSchools(Model model) {
        List<School> schools = schoolService.getAllSchools();
        model.addAttribute("schools", schools);
        return "school_list";
    }
}

