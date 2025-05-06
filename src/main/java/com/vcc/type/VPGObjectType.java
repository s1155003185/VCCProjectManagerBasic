package com.vcc.type;

import java.util.Objects;

public enum VPGObjectType {
    NA(0),
    Config(1),
    ConfigBehavior(2),
    ConfigExport(3),
    ConfigInput(4),
    ConfigOutput(5),
    ConfigTemplate(6),
    GitForm(7),
    GitLog(8),
    MainForm(9),
    MainFormAddWorkspaceFormArgument(10),
    MainFormDeleteWorkspaceFormArgument(11),
    MainFormRenameWorkspaceFormArgument(12),
    OperationResult(13),
    WorkspaceForm(14);

    public final Integer value;

    VPGObjectType(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    public static VPGObjectType parse(Integer value) {
        for (VPGObjectType type : values()) {
            if (Objects.equals(type.value, value)) {
                return type;
            }
        }
        throw new IllegalArgumentException("Invalid VPGObjectType value: " + value);
    }

}
