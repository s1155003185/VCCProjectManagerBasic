package com.vcc.type;

import java.util.Objects;

public enum VPGActionType {
    NA(0);

    public final Integer value;

    VPGActionType(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    public static VPGActionType parse(Integer value) {
        for (VPGActionType type : values()) {
            if (Objects.equals(type.value, value)) {
                return type;
            }
        }
        throw new IllegalArgumentException("Invalid VPGActionType value: " + value);
    }

}
