package com.vcc.type.config;

import java.util.Objects;

public enum VPGConfigTemplateProperty {
    Url(0),
    Workspace(1),
    IsExcludeUnittest(2),
    IsExcludeVCCUnitTest(3),
    IsCppCheckerEnabled(4);

    public final Integer value;

    VPGConfigTemplateProperty(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    public static VPGConfigTemplateProperty parse(Integer value) {
        for (VPGConfigTemplateProperty type : values()) {
            if (Objects.equals(type.value, value)) {
                return type;
            }
        }
        throw new IllegalArgumentException("Invalid VPGConfigTemplateProperty value: " + value);
    }

}
