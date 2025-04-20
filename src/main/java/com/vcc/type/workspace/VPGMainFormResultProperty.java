package com.vcc.type.workspace;

import java.util.Objects;

public enum VPGMainFormResultProperty {
    ResultString(0);

    public final Integer value;

    VPGMainFormResultProperty(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    public static VPGMainFormResultProperty parse(Integer value) {
        for (VPGMainFormResultProperty type : values()) {
            if (Objects.equals(type.value, value)) {
                return type;
            }
        }
        throw new IllegalArgumentException("Invalid VPGMainFormResultProperty value: " + value);
    }

}
