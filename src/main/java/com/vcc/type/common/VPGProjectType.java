package com.vcc.type.common;

import java.util.Objects;

public enum VPGProjectType {
    VccModule(0),
    VccComplex(1),
    VccDll(2),
    VccExe(3),
    CppComplex(4),
    CppDll(5),
    CppExe(6);

    public final Integer value;

    VPGProjectType(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    public static VPGProjectType parse(Integer value) {
        for (VPGProjectType type : values()) {
            if (Objects.equals(type.value, value)) {
                return type;
            }
        }
        throw new IllegalArgumentException("Invalid VPGProjectType value: " + value);
    }

}
