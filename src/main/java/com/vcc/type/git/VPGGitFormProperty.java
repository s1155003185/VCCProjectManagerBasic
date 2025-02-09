package com.vcc.type.git;

import java.util.Objects;

public enum VPGGitFormProperty {
    Log(0),
    GitManager(1);

    public final Integer value;

    VPGGitFormProperty(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    public static VPGGitFormProperty parse(Integer value) {
        for (VPGGitFormProperty type : values()) {
            if (Objects.equals(type.value, value)) {
                return type;
            }
        }
        throw new IllegalArgumentException("Invalid VPGGitFormProperty value: " + value);
    }

}
