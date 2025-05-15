package com.vcc.type.workspace;

import java.util.Objects;

public enum VPGWorkspaceFormProperty {
    Name(0),
    TabOrder(1),
    GitForms(2);

    public final Integer value;

    VPGWorkspaceFormProperty(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    public static VPGWorkspaceFormProperty parse(Integer value) {
        for (VPGWorkspaceFormProperty type : values()) {
            if (Objects.equals(type.value, value)) {
                return type;
            }
        }
        throw new IllegalArgumentException("Invalid VPGWorkspaceFormProperty value: " + value);
    }

}
