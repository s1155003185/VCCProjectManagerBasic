package com.vcc.type.common;

import java.util.Objects;

public enum VPGConfigInterfaceType {
    Java(0);

    public final Integer value;

    VPGConfigInterfaceType(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    public static VPGConfigInterfaceType parse(Integer value) {
        for (VPGConfigInterfaceType type : values()) {
            if (Objects.equals(type.value, value)) {
                return type;
            }
        }
        throw new IllegalArgumentException("Invalid VPGConfigInterfaceType value: " + value);
    }

}
