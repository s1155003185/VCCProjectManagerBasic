package com.vcc.type.enumtype;

import java.util.Objects;

public enum VPGEnumClassAttributeType {
    NA(0),
    Property(1),
    Manager(2),
    Action(3);

    public final Integer value;

    VPGEnumClassAttributeType(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    public static VPGEnumClassAttributeType parse(Integer value) {
        for (VPGEnumClassAttributeType type : values()) {
            if (Objects.equals(type.value, value)) {
                return type;
            }
        }
        throw new IllegalArgumentException("Invalid VPGEnumClassAttributeType value: " + value);
    }

}
