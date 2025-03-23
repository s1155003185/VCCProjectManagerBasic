package com.vcc.type.workspace;

import java.util.Objects;

public enum VPGMainFormReorderWorkspaceFormArgumentProperty {
    WorkspaceForm(0),
    NewName(1);

    public final Integer value;

    VPGMainFormReorderWorkspaceFormArgumentProperty(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    public static VPGMainFormReorderWorkspaceFormArgumentProperty parse(Integer value) {
        for (VPGMainFormReorderWorkspaceFormArgumentProperty type : values()) {
            if (Objects.equals(type.value, value)) {
                return type;
            }
        }
        throw new IllegalArgumentException("Invalid VPGMainFormReorderWorkspaceFormArgumentProperty value: " + value);
    }

}
