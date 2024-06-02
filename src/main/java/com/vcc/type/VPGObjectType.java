package com.vcc.type;

import java.util.Objects;

public enum VPGObjectType {
    NA(0),
    GenerationOption(1),
    GenerationOptionExport(2);

    public final Integer value;

    VPGObjectType(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    public static VPGObjectType parse(Integer value) {
        for (VPGObjectType type : values()) {
            if (Objects.equals(type.value, value)) {
                return type;
            }
        }
        throw new IllegalArgumentException("Invalid VPGObjectType value: " + value);
    }

}
