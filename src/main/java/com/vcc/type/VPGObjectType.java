package com.vcc.type;

import java.util.Objects;

public enum VPGObjectType {
    NA(0),
    Config(1),
    ConfigBehavior(2),
    ConfigExport(3),
    ConfigInput(4),
    ConfigOutput(5),
    ConfigOutputUnittest(6),
    ConfigTemplate(7),
    EnumClass(8),
    EnumClassAttribute(9),
    GitForm(10),
    GitLog(11),
    MainForm(12),
    MainFormAddWorkspaceFormArgument(13),
    MainFormDeleteWorkspaceFormArgument(14),
    MainFormRenameWorkspaceFormArgument(15),
    OperationResult(16),
    WorkspaceForm(17);

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
