package com.vcc.type.workspace;

import java.util.Objects;

public enum VPGMainFormProperty {
    WorkspaceForms(0),
    Initialize(1);

    public final Integer value;

    VPGMainFormProperty(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    public static VPGMainFormProperty parse(Integer value) {
        for (VPGMainFormProperty type : values()) {
            if (Objects.equals(type.value, value)) {
                return type;
            }
        }
        throw new IllegalArgumentException("Invalid VPGMainFormProperty value: " + value);
    }

}
