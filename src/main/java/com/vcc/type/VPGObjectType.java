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
    EnumClass(7),
    EnumClassAttribute(8),
    GitForm(9),
    GitLog(10),
    MainForm(11),
    MainFormAddWorkspaceFormArgument(12),
    MainFormDeleteWorkspaceFormArgument(13),
    MainFormRenameWorkspaceFormArgument(14),
    OperationResult(15),
    WorkspaceForm(16);

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
