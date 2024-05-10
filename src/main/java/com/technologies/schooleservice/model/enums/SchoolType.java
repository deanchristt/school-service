package com.technologies.schooleservice.model.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum SchoolType {

    TK("Kindergarten"),
    SD("Elementary school"),
    SMP("Junior High School"),
    SMA("Senior Highschool"),
    UNIVERSITY("University");

    private String name;
}
