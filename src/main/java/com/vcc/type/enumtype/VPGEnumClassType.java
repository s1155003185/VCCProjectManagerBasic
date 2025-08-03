package com.vcc.type.enumtype;

import java.util.Objects;

public enum VPGEnumClassType {
    Object(0),
    Form(1),
    ActionArgument(2),
    Result(3);

    public final Integer value;

    VPGEnumClassType(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    public static VPGEnumClassType parse(Integer value) {
        for (VPGEnumClassType type : values()) {
            if (Objects.equals(type.value, value)) {
                return type;
            }
        }
        throw new IllegalArgumentException("Invalid VPGEnumClassType value: " + value);
    }

}
