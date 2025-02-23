package com.vcc.type;

import java.util.Objects;

public enum VPGExceptionType {
    NoError(0),
    NotSupport(1),
    NotImplement(2),
    ArgumentNotValid(3),
    DllError(4),
    DirectoryNotFound(5),
    DirectoryCannotCreate(6),
    FileNotFound(7),
    FileBlocked(8),
    FileAlreadyExist(9),
    FileCannotOpen(10),
    ParserError(11),
    KeyInvalid(12),
    KeyNotFound(13),
    KeyDuplicated(14),
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
