package com.technologies.schooleservice.model.dto.request;

import com.technologies.schooleservice.model.enums.SchoolType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class SchoolDtoRequest {

    private String schoolName;
    private SchoolType schoolType;
    private List<ClassDtoRequest> classes;
}
