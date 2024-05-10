package com.technologies.schooleservice.model.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ClassType {

    IPA("Natural Sciences Major"),
    IPS("Social Sciences Major"),
    BAHASA("Language Studies Major");

    private String name;
}
