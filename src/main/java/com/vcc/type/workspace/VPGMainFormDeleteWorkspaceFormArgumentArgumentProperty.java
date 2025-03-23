package com.vcc.type.workspace;

import java.util.Objects;

public enum VPGMainFormDeleteWorkspaceFormArgumentArgumentProperty {
    WorkspaceForm(0);

    public final Integer value;

    VPGMainFormDeleteWorkspaceFormArgumentArgumentProperty(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    public static VPGMainFormDeleteWorkspaceFormArgumentArgumentProperty parse(Integer value) {
        for (VPGMainFormDeleteWorkspaceFormArgumentArgumentProperty type : values()) {
            if (Objects.equals(type.value, value)) {
                return type;
            }
        }
        throw new IllegalArgumentException("Invalid VPGMainFormDeleteWorkspaceFormArgumentArgumentProperty value: " + value);
    }

}
