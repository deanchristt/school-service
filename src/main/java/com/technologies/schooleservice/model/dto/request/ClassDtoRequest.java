package com.technologies.schooleservice.model.dto.request;

import com.technologies.schooleservice.model.enums.ClassType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class ClassDtoRequest {
    private String className;
    private ClassType classType;
}
