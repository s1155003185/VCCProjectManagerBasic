package com.vcc.type.workspace;

import java.util.Objects;

public enum VPGMainFormRenameWorkspaceFormArgumentProperty {
    WorkspaceForm(0),
    NewName(1);

    public final Integer value;

    VPGMainFormRenameWorkspaceFormArgumentProperty(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    public static VPGMainFormRenameWorkspaceFormArgumentProperty parse(Integer value) {
        for (VPGMainFormRenameWorkspaceFormArgumentProperty type : values()) {
            if (Objects.equals(type.value, value)) {
                return type;
            }
        }
        throw new IllegalArgumentException("Invalid VPGMainFormRenameWorkspaceFormArgumentProperty value: " + value);
    }

}
