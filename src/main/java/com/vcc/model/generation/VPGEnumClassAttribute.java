package com.vcc.model.generation;

import com.sun.jna.Memory;
import com.sun.jna.Native;
import com.sun.jna.Pointer;
import com.sun.jna.ptr.PointerByReference;
import com.vcc.VPGDllFunctions;
import com.vcc.type.enumtype.VPGEnumClassAttributeAccessMode;
import com.vcc.type.enumtype.VPGEnumClassAttributeType;
import com.vcc.type.enumtype.VPGEnumClassMacroType;
import com.vcc.type.generation.VPGEnumClassAttributeProperty;

public class VPGEnumClassAttribute {

    public Pointer Handle = null;

    public VPGEnumClassAttribute(Pointer handle) {
        this.Handle = handle;
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Properties">
    public VPGEnumClassAttributeType getPropertyType() {
        return VPGEnumClassAttributeType.parse((int)VPGDllFunctions.Instance.readLong(Handle, VPGEnumClassAttributeProperty.PropertyType.getValue()));
    }

    public void setPropertyType(VPGEnumClassAttributeType value) {
        VPGDllFunctions.Instance.writeLong(Handle, VPGEnumClassAttributeProperty.PropertyType.getValue(), value.getValue());
    }

    public String getEnum() {
        PointerByReference result = new PointerByReference();
        VPGDllFunctions.Instance.readString(Handle, VPGEnumClassAttributeProperty.Enum.getValue(), result);
        return result.getValue().getWideString(0);
    }

    public void setEnum(String value) {
        Pointer valuePtr = new Memory(Native.WCHAR_SIZE * (value.length() + 1));
        valuePtr.setWideString(0, value);
        PointerByReference valueReference = new PointerByReference();
        valueReference.setValue(valuePtr);
        VPGDllFunctions.Instance.writeString(Handle, VPGEnumClassAttributeProperty.Enum.getValue(), valueReference);
    }

    public long getEnumValue() {
        return VPGDllFunctions.Instance.readLong(Handle, VPGEnumClassAttributeProperty.EnumValue.getValue());
    }

    public void setEnumValue(long value) {
        VPGDllFunctions.Instance.writeLong(Handle, VPGEnumClassAttributeProperty.EnumValue.getValue(), value);
    }

    public String getMacro() {
        PointerByReference result = new PointerByReference();
        VPGDllFunctions.Instance.readString(Handle, VPGEnumClassAttributeProperty.Macro.getValue(), result);
        return result.getValue().getWideString(0);
    }

    public void setMacro(String value) {
        Pointer valuePtr = new Memory(Native.WCHAR_SIZE * (value.length() + 1));
        valuePtr.setWideString(0, value);
        PointerByReference valueReference = new PointerByReference();
        valueReference.setValue(valuePtr);
        VPGDllFunctions.Instance.writeString(Handle, VPGEnumClassAttributeProperty.Macro.getValue(), valueReference);
    }

    public VPGEnumClassMacroType getMacroType() {
        return VPGEnumClassMacroType.parse((int)VPGDllFunctions.Instance.readLong(Handle, VPGEnumClassAttributeProperty.MacroType.getValue()));
    }

    public void setMacroType(VPGEnumClassMacroType value) {
        VPGDllFunctions.Instance.writeLong(Handle, VPGEnumClassAttributeProperty.MacroType.getValue(), value.getValue());
    }

    public String getType1() {
        PointerByReference result = new PointerByReference();
        VPGDllFunctions.Instance.readString(Handle, VPGEnumClassAttributeProperty.Type1.getValue(), result);
        return result.getValue().getWideString(0);
    }

    public void setType1(String value) {
        Pointer valuePtr = new Memory(Native.WCHAR_SIZE * (value.length() + 1));
        valuePtr.setWideString(0, value);
        PointerByReference valueReference = new PointerByReference();
        valueReference.setValue(valuePtr);
        VPGDllFunctions.Instance.writeString(Handle, VPGEnumClassAttributeProperty.Type1.getValue(), valueReference);
    }

    public boolean getIsType1Custom() {
        return VPGDllFunctions.Instance.readBool(Handle, VPGEnumClassAttributeProperty.IsType1Custom.getValue());
    }

    public String getType2() {
        PointerByReference result = new PointerByReference();
        VPGDllFunctions.Instance.readString(Handle, VPGEnumClassAttributeProperty.Type2.getValue(), result);
        return result.getValue().getWideString(0);
    }

    public void setType2(String value) {
        Pointer valuePtr = new Memory(Native.WCHAR_SIZE * (value.length() + 1));
        valuePtr.setWideString(0, value);
        PointerByReference valueReference = new PointerByReference();
        valueReference.setValue(valuePtr);
        VPGDllFunctions.Instance.writeString(Handle, VPGEnumClassAttributeProperty.Type2.getValue(), valueReference);
    }

    public boolean getIsType2Custom() {
        return VPGDllFunctions.Instance.readBool(Handle, VPGEnumClassAttributeProperty.IsType2Custom.getValue());
    }

    public String getPropertyName() {
        PointerByReference result = new PointerByReference();
        VPGDllFunctions.Instance.readString(Handle, VPGEnumClassAttributeProperty.PropertyName.getValue(), result);
        return result.getValue().getWideString(0);
    }

    public void setPropertyName(String value) {
        Pointer valuePtr = new Memory(Native.WCHAR_SIZE * (value.length() + 1));
        valuePtr.setWideString(0, value);
        PointerByReference valueReference = new PointerByReference();
        valueReference.setValue(valuePtr);
        VPGDllFunctions.Instance.writeString(Handle, VPGEnumClassAttributeProperty.PropertyName.getValue(), valueReference);
    }

    public String getValidate() {
        PointerByReference result = new PointerByReference();
        VPGDllFunctions.Instance.readString(Handle, VPGEnumClassAttributeProperty.Validate.getValue(), result);
        return result.getValue().getWideString(0);
    }

    public void setValidate(String value) {
        Pointer valuePtr = new Memory(Native.WCHAR_SIZE * (value.length() + 1));
        valuePtr.setWideString(0, value);
        PointerByReference valueReference = new PointerByReference();
        valueReference.setValue(valuePtr);
        VPGDllFunctions.Instance.writeString(Handle, VPGEnumClassAttributeProperty.Validate.getValue(), valueReference);
    }

    public String getDefaultValue() {
        PointerByReference result = new PointerByReference();
        VPGDllFunctions.Instance.readString(Handle, VPGEnumClassAttributeProperty.DefaultValue.getValue(), result);
        return result.getValue().getWideString(0);
    }

    public void setDefaultValue(String value) {
        Pointer valuePtr = new Memory(Native.WCHAR_SIZE * (value.length() + 1));
        valuePtr.setWideString(0, value);
        PointerByReference valueReference = new PointerByReference();
        valueReference.setValue(valuePtr);
        VPGDllFunctions.Instance.writeString(Handle, VPGEnumClassAttributeProperty.DefaultValue.getValue(), valueReference);
    }

    public String getCommand() {
        PointerByReference result = new PointerByReference();
        VPGDllFunctions.Instance.readString(Handle, VPGEnumClassAttributeProperty.Command.getValue(), result);
        return result.getValue().getWideString(0);
    }

    public void setCommand(String value) {
        Pointer valuePtr = new Memory(Native.WCHAR_SIZE * (value.length() + 1));
        valuePtr.setWideString(0, value);
        PointerByReference valueReference = new PointerByReference();
        valueReference.setValue(valuePtr);
        VPGDllFunctions.Instance.writeString(Handle, VPGEnumClassAttributeProperty.Command.getValue(), valueReference);
    }

    public boolean getIsGeneralType() {
        return VPGDllFunctions.Instance.readBool(Handle, VPGEnumClassAttributeProperty.IsGeneralType.getValue());
    }

    public boolean getIsCustom() {
        return VPGDllFunctions.Instance.readBool(Handle, VPGEnumClassAttributeProperty.IsCustom.getValue());
    }

    public boolean getIsObject() {
        return VPGDllFunctions.Instance.readBool(Handle, VPGEnumClassAttributeProperty.IsObject.getValue());
    }

    public boolean getIsVector() {
        return VPGDllFunctions.Instance.readBool(Handle, VPGEnumClassAttributeProperty.IsVector.getValue());
    }

    public boolean getIsMap() {
        return VPGDllFunctions.Instance.readBool(Handle, VPGEnumClassAttributeProperty.IsMap.getValue());
    }

    public boolean getIsOrderedMap() {
        return VPGDllFunctions.Instance.readBool(Handle, VPGEnumClassAttributeProperty.IsOrderedMap.getValue());
    }

    public boolean getIsSet() {
        return VPGDllFunctions.Instance.readBool(Handle, VPGEnumClassAttributeProperty.IsSet.getValue());
    }

    public boolean getIsAction() {
        return VPGDllFunctions.Instance.readBool(Handle, VPGEnumClassAttributeProperty.IsAction.getValue());
    }

    public boolean getIsManager() {
        return VPGDllFunctions.Instance.readBool(Handle, VPGEnumClassAttributeProperty.IsManager.getValue());
    }

    public boolean getIsCollection() {
        return VPGDllFunctions.Instance.readBool(Handle, VPGEnumClassAttributeProperty.IsCollection.getValue());
    }

    public boolean getIsHavingValidate() {
        return VPGDllFunctions.Instance.readBool(Handle, VPGEnumClassAttributeProperty.IsHavingValidate.getValue());
    }

    public VPGEnumClassAttributeAccessMode getAccessMode() {
        return VPGEnumClassAttributeAccessMode.parse((int)VPGDllFunctions.Instance.readLong(Handle, VPGEnumClassAttributeProperty.AccessMode.getValue()));
    }

    public void setAccessMode(VPGEnumClassAttributeAccessMode value) {
        VPGDllFunctions.Instance.writeLong(Handle, VPGEnumClassAttributeProperty.AccessMode.getValue(), value.getValue());
    }

    public boolean getIsInherit() {
        return VPGDllFunctions.Instance.readBool(Handle, VPGEnumClassAttributeProperty.IsInherit.getValue());
    }

    public void setIsInherit(boolean value) {
        VPGDllFunctions.Instance.writeBool(Handle, VPGEnumClassAttributeProperty.IsInherit.getValue(), value);
    }

    public long getInitializePropertiesCount() {
        return VPGDllFunctions.Instance.getCount(Handle, VPGEnumClassAttributeProperty.InitializeProperties.getValue());
    }

    public String getInitializePropertiesAtIndex(long index) {
        PointerByReference result = new PointerByReference();
        VPGDllFunctions.Instance.readStringAtIndex(Handle, VPGEnumClassAttributeProperty.InitializeProperties.getValue(), result, index);
        return result.getValue().getWideString(0);
    }

    public void setInitializePropertiesAtIndex(long index, String value) {
        Pointer valuePtr = new Memory(Native.WCHAR_SIZE * (value.length() + 1));
        valuePtr.setWideString(0, value);
        PointerByReference valueReference = new PointerByReference();
        valueReference.setValue(valuePtr);
        VPGDllFunctions.Instance.writeStringAtIndex(Handle, VPGEnumClassAttributeProperty.InitializeProperties.getValue(), valueReference, index);
    }

    public void insertInitializeProperties(String value) {
        insertInitializePropertiesAtIndex(-1, value);
    }

    public void insertInitializePropertiesAtIndex(long index, String value) {
        Pointer valuePtr = new Memory(Native.WCHAR_SIZE * (value.length() + 1));
        valuePtr.setWideString(0, value);
        PointerByReference valueReference = new PointerByReference();
        valueReference.setValue(valuePtr);
        VPGDllFunctions.Instance.insertStringAtIndex(Handle, VPGEnumClassAttributeProperty.InitializeProperties.getValue(), valueReference, index);
    }

    public void removeInitializePropertiesAtIndex(long index) {
        VPGDllFunctions.Instance.removeAtIndex(Handle, VPGEnumClassAttributeProperty.InitializeProperties.getValue(), index);
    }

    public void clearInitializeProperties() {
        VPGDllFunctions.Instance.clear(Handle, VPGEnumClassAttributeProperty.InitializeProperties.getValue());
    }

    public boolean getIsNoHistory() {
        return VPGDllFunctions.Instance.readBool(Handle, VPGEnumClassAttributeProperty.IsNoHistory.getValue());
    }

    public void setIsNoHistory(boolean value) {
        VPGDllFunctions.Instance.writeBool(Handle, VPGEnumClassAttributeProperty.IsNoHistory.getValue(), value);
    }

    public String getActionResultRedoClass() {
        PointerByReference result = new PointerByReference();
        VPGDllFunctions.Instance.readString(Handle, VPGEnumClassAttributeProperty.ActionResultRedoClass.getValue(), result);
        return result.getValue().getWideString(0);
    }

    public void setActionResultRedoClass(String value) {
        Pointer valuePtr = new Memory(Native.WCHAR_SIZE * (value.length() + 1));
        valuePtr.setWideString(0, value);
        PointerByReference valueReference = new PointerByReference();
        valueReference.setValue(valuePtr);
        VPGDllFunctions.Instance.writeString(Handle, VPGEnumClassAttributeProperty.ActionResultRedoClass.getValue(), valueReference);
    }

    public String getActionResultUndoClass() {
        PointerByReference result = new PointerByReference();
        VPGDllFunctions.Instance.readString(Handle, VPGEnumClassAttributeProperty.ActionResultUndoClass.getValue(), result);
        return result.getValue().getWideString(0);
    }

    public void setActionResultUndoClass(String value) {
        Pointer valuePtr = new Memory(Native.WCHAR_SIZE * (value.length() + 1));
        valuePtr.setWideString(0, value);
        PointerByReference valueReference = new PointerByReference();
        valueReference.setValue(valuePtr);
        VPGDllFunctions.Instance.writeString(Handle, VPGEnumClassAttributeProperty.ActionResultUndoClass.getValue(), valueReference);
    }

    public boolean getIsNoJson() {
        return VPGDllFunctions.Instance.readBool(Handle, VPGEnumClassAttributeProperty.IsNoJson.getValue());
    }

    public void setIsNoJson(boolean value) {
        VPGDllFunctions.Instance.writeBool(Handle, VPGEnumClassAttributeProperty.IsNoJson.getValue(), value);
    }

    public boolean getIsInitializeInClassConstructorNeeded() {
        return VPGDllFunctions.Instance.readBool(Handle, VPGEnumClassAttributeProperty.IsInitializeInClassConstructorNeeded.getValue());
    }
    // </editor-fold>
}
