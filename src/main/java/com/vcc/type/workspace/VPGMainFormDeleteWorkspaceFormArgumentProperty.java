package com.vcc.type.workspace;

import java.util.Objects;

public enum VPGMainFormDeleteWorkspaceFormArgumentProperty {
    WorkspaceForm(0);

    public final Integer value;

    VPGMainFormDeleteWorkspaceFormArgumentProperty(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    public static VPGMainFormDeleteWorkspaceFormArgumentProperty parse(Integer value) {
        for (VPGMainFormDeleteWorkspaceFormArgumentProperty type : values()) {
            if (Objects.equals(type.value, value)) {
                return type;
            }
        }
        throw new IllegalArgumentException("Invalid VPGMainFormDeleteWorkspaceFormArgumentProperty value: " + value);
    }

}
