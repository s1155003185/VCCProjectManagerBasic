package com.vcc.type.generation;

import java.util.Objects;

public enum VPGEnumClassProperty {
    Type(0),
    Name(1),
    Command(2),
    Properties(3),
    IncludeSystemFiles(4),
    IncludeCustomFiles(5),
    PrivateProperties(6),
    ProtectedProperties(7),
    IsLogConfigIndependent(8),
    IsActionManagerIndependent(9),
    IsThreadManagerIndependent(10),
    IsJson(11),
    JsonAttributes(12),
    InheritClass(13),
    InheritClassAttributes(14);

    public final Integer value;

    VPGEnumClassProperty(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    public static VPGEnumClassProperty parse(Integer value) {
        for (VPGEnumClassProperty type : values()) {
            if (Objects.equals(type.value, value)) {
                return type;
            }
        }
        throw new IllegalArgumentException("Invalid VPGEnumClassProperty value: " + value);
    }

}
