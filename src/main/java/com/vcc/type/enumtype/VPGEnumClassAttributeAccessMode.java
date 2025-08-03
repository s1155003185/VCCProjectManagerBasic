package com.vcc.type.enumtype;

import java.util.Objects;

public enum VPGEnumClassAttributeAccessMode {
    ReadWrite(0),
    ReadOnly(1),
    WriteOnly(2),
    NoAccess(3);

    public final Integer value;

    VPGEnumClassAttributeAccessMode(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    public static VPGEnumClassAttributeAccessMode parse(Integer value) {
        for (VPGEnumClassAttributeAccessMode type : values()) {
            if (Objects.equals(type.value, value)) {
                return type;
            }
        }
        throw new IllegalArgumentException("Invalid VPGEnumClassAttributeAccessMode value: " + value);
    }

}
