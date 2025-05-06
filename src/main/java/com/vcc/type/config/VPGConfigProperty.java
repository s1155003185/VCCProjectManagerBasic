package com.vcc.type.config;

import java.util.Objects;

public enum VPGConfigProperty {
    Version(0),
    ProjectType(1),
    ProjectPrefix(2),
    ProjectName(3),
    ProjectNameDll(4),
    ProjectNameExe(5),
    IsGit(6),
    Template(7),
    Behavior(8),
    Input(9),
    Ouput(10),
    Plugins(11),
    Exports(12);

    public final Integer value;

    VPGConfigProperty(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    public static VPGConfigProperty parse(Integer value) {
        for (VPGConfigProperty type : values()) {
            if (Objects.equals(type.value, value)) {
                return type;
            }
        }
        throw new IllegalArgumentException("Invalid VPGConfigProperty value: " + value);
    }

}
