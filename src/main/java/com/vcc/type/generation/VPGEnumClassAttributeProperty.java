package com.vcc.type.generation;

import java.util.Objects;

public enum VPGEnumClassAttributeProperty {
    PropertyType(0),
    Enum(1),
    EnumValue(2),
    Macro(3),
    MacroType(4),
    Type1(5),
    IsType1Custom(6),
    Type2(7),
    IsType2Custom(8),
    PropertyName(9),
    Validate(10),
    DefaultValue(11),
    Command(12),
    IsGeneralType(13),
    IsCustom(14),
    IsObject(15),
    IsVector(16),
    IsMap(17),
    IsOrderedMap(18),
    IsSet(19),
    IsAction(20),
    IsManager(21),
    IsCollection(22),
    IsHavingValidate(23),
    AccessMode(24),
    IsInherit(25),
    InitializeProperties(26),
    IsNoHistory(27),
    ActionResultRedoClass(28),
    ActionResultUndoClass(29),
    IsNoJson(30),
    IsInitializeInClassConstructorNeeded(31);

    public final Integer value;

    VPGEnumClassAttributeProperty(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    public static VPGEnumClassAttributeProperty parse(Integer value) {
        for (VPGEnumClassAttributeProperty type : values()) {
            if (Objects.equals(type.value, value)) {
                return type;
            }
        }
        throw new IllegalArgumentException("Invalid VPGEnumClassAttributeProperty value: " + value);
    }

}
