package com.vcc.type;

import java.util.Objects;

public enum VPGExceptionType {
    NoError(0),
    NotSupport(1),
    NotImplement(2),
    DllError(3),
    DirectoryNotFound(4),
    DirectoryCannotCreate(5),
    FileNotFound(6),
    FileBlocked(7),
    FileAlreadyExist(8),
    FileCannotOpen(9),
    ParserError(10),
    KeyInvalid(11),
    KeyNotFound(12),
    KeyDuplicated(13),
    SystemError(50000),
    CustomError(99999);

    public final Integer value;

    VPGExceptionType(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    public static VPGExceptionType parse(Integer value) {
        for (VPGExceptionType type : values()) {
            if (Objects.equals(type.value, value)) {
                return type;
            }
        }
        throw new IllegalArgumentException("Invalid VPGExceptionType value: " + value);
    }

}
