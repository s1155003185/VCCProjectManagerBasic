package com.vcc.type;

import java.util.Objects;

public enum VPGExceptionType {
    NoError(0),
    Warning(1),
    NotSupport(2),
    NotImplement(3),
    ArgumentNotValid(4),
    DllError(5),
    DirectoryNotFound(6),
    DirectoryCannotCreate(7),
    FileNotFound(8),
    FileBlocked(9),
    FileAlreadyExist(10),
    FileCannotOpen(11),
    ParserError(12),
    KeyInvalid(13),
    KeyNotFound(14),
    KeyDuplicated(15),
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
