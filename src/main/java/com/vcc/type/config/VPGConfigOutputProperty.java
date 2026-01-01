package com.vcc.type.config;

import java.util.Objects;

public enum VPGConfigOutputProperty {
    ExceptionTypeDirectory(0),
    ObjectTypeDirectory(1),
    ApplicationDirectoryHpp(2),
    ApplicationDirectoryCpp(3),
    ActionDirectoryHpp(4),
    ActionDirectoryCpp(5),
    FormDirectoryHpp(6),
    FormDirectoryCpp(7),
    ObjectDirectoryHpp(8),
    ObjectDirectoryCpp(9),
    PropertyAccessorDirectoryHpp(10),
    PropertyAccessorDirectoryCpp(11),
    ObjectFactoryDirectoryHpp(12),
    ObjectFactoryDirectoryCpp(13),
    PropertyAccessorFactoryDirectoryHpp(14),
    PropertyAccessorFactoryDirectoryCpp(15),
    Unittest(16);

    public final Integer value;

    VPGConfigOutputProperty(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    public static VPGConfigOutputProperty parse(Integer value) {
        for (VPGConfigOutputProperty type : values()) {
            if (Objects.equals(type.value, value)) {
                return type;
            }
        }
        throw new IllegalArgumentException("Invalid VPGConfigOutputProperty value: " + value);
    }

}
