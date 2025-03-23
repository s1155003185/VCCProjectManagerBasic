package com.vcc.type.workspace;

import java.util.Objects;

public enum VPGMainFormAddWorkspaceFormArgumentArgumentProperty {
    Name(0);

    public final Integer value;

    VPGMainFormAddWorkspaceFormArgumentArgumentProperty(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    public static VPGMainFormAddWorkspaceFormArgumentArgumentProperty parse(Integer value) {
        for (VPGMainFormAddWorkspaceFormArgumentArgumentProperty type : values()) {
            if (Objects.equals(type.value, value)) {
                return type;
            }
        }
        throw new IllegalArgumentException("Invalid VPGMainFormAddWorkspaceFormArgumentArgumentProperty value: " + value);
    }

}
