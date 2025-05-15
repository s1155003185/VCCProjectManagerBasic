package com.vcc.type.common;

import java.util.Objects;

public enum VPGConfigActionHistoryType {
    NoHistory(0),
    Local(1),
    Global(2);

    public final Integer value;

    VPGConfigActionHistoryType(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    public static VPGConfigActionHistoryType parse(Integer value) {
        for (VPGConfigActionHistoryType type : values()) {
            if (Objects.equals(type.value, value)) {
                return type;
            }
        }
        throw new IllegalArgumentException("Invalid VPGConfigActionHistoryType value: " + value);
    }

}
