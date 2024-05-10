package com.technologies.schooleservice.model.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class ClassDtoResponse {
    private Long id;
    private String className;
    private String schoolName;
}
