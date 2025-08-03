package com.vcc.type.enumtype;

import java.util.Objects;

public enum VPGEnumClassMacroType {
    NA(0),
    Getcustom(1),
    Setcustom(2),
    GetcustomSptr(3),
    SetcustomSptr(4),
    Getset(5),
    GetsetValidate(6),
    GetsetSptr(7),
    GetsetSptrNull(8),
    GetsetValidateSptrNull(9),
    Vector(10),
    VectorValidate(11),
    VectorSptr(12),
    VectorValidateSptr(13),
    Set(14),
    SetValidate(15),
    SetSptr(16),
    SetValidateSptr(17),
    Map(18),
    MapValidate(19),
    MapSptrR(20),
    MapValidateSptrR(21),
    OrderedMap(22),
    OrderedMapValidate(23),
    OrderedMapSptrR(24),
    OrderedMapValidateSptrR(25),
    ManagerSptr(26),
    ManagerSptrNull(27),
    ManagerSptrParent(28),
    Action(29),
    ActionWithArgSptr(30);

    public final Integer value;

    VPGEnumClassMacroType(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    public static VPGEnumClassMacroType parse(Integer value) {
        for (VPGEnumClassMacroType type : values()) {
            if (Objects.equals(type.value, value)) {
                return type;
            }
        }
        throw new IllegalArgumentException("Invalid VPGEnumClassMacroType value: " + value);
    }

}
