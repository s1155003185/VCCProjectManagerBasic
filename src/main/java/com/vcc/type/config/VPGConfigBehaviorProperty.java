package com.vcc.type.config;

import java.util.Objects;

public enum VPGConfigBehaviorProperty {
    IsResultThrowException(0);

    public final Integer value;

    VPGConfigBehaviorProperty(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    public static VPGConfigBehaviorProperty parse(Integer value) {
        for (VPGConfigBehaviorProperty type : values()) {
            if (Objects.equals(type.value, value)) {
                return type;
            }
        }
        throw new IllegalArgumentException("Invalid VPGConfigBehaviorProperty value: " + value);
    }

}
