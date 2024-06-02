package com.vcc.type.common;

import java.util.Objects;

public enum VPGGenerationOptionInterfaceType {
    Java(0);

    public final Integer value;

    VPGGenerationOptionInterfaceType(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    public static VPGGenerationOptionInterfaceType parse(Integer value) {
        for (VPGGenerationOptionInterfaceType type : values()) {
            if (Objects.equals(type.value, value)) {
                return type;
            }
        }
        throw new IllegalArgumentException("Invalid VPGGenerationOptionInterfaceType value: " + value);
    }

}
