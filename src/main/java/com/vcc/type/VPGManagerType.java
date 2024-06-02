package com.vcc.type;

import java.util.Objects;

public enum VPGManagerType {
    NA(0),
    Action(1),
    Git(2);

    public final Integer value;

    VPGManagerType(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    public static VPGManagerType parse(Integer value) {
        for (VPGManagerType type : values()) {
            if (Objects.equals(type.value, value)) {
                return type;
            }
        }
        throw new IllegalArgumentException("Invalid VPGManagerType value: " + value);
    }

}
