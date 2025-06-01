package com.vcc.type.config;

import java.util.Objects;

public enum VPGConfigInputProperty {
    TypeWorkspace(0);

    public final Integer value;

    VPGConfigInputProperty(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    public static VPGConfigInputProperty parse(Integer value) {
        for (VPGConfigInputProperty type : values()) {
            if (Objects.equals(type.value, value)) {
                return type;
            }
        }
        throw new IllegalArgumentException("Invalid VPGConfigInputProperty value: " + value);
    }

}
