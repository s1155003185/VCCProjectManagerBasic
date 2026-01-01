package com.vcc.type.config;

import java.util.Objects;

public enum VPGConfigOutputUnittestProperty {
    ActionDirectoryCpp(0),
    UnittestNames(1);

    public final Integer value;

    VPGConfigOutputUnittestProperty(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    public static VPGConfigOutputUnittestProperty parse(Integer value) {
        for (VPGConfigOutputUnittestProperty type : values()) {
            if (Objects.equals(type.value, value)) {
                return type;
            }
        }
        throw new IllegalArgumentException("Invalid VPGConfigOutputUnittestProperty value: " + value);
    }

}
