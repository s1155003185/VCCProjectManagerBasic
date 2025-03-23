package com.vcc.type.workspace;

import java.util.Objects;

public enum VPGMainFormAddWorkspaceFormArgumentProperty {
    Name(0);

    public final Integer value;

    VPGMainFormAddWorkspaceFormArgumentProperty(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    public static VPGMainFormAddWorkspaceFormArgumentProperty parse(Integer value) {
        for (VPGMainFormAddWorkspaceFormArgumentProperty type : values()) {
            if (Objects.equals(type.value, value)) {
                return type;
            }
        }
        throw new IllegalArgumentException("Invalid VPGMainFormAddWorkspaceFormArgumentProperty value: " + value);
    }

}
