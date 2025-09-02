package com.vcc.model.config;

import com.sun.jna.Memory;
import com.sun.jna.Native;
import com.sun.jna.Pointer;
import com.sun.jna.ptr.PointerByReference;
import com.vcc.VPGDllFunctions;
import com.vcc.type.config.VPGConfigOutputProperty;

public class VPGConfigOutput {

    public Pointer Handle = null;

    public VPGConfigOutput(Pointer handle) {
        this.Handle = handle;
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Properties">
    public String getExceptionTypeDirectory() {
        PointerByReference result = new PointerByReference();
        VPGDllFunctions.Instance.readString(Handle, VPGConfigOutputProperty.ExceptionTypeDirectory.getValue(), result);
        return result.getValue().getWideString(0);
    }

    public void setExceptionTypeDirectory(String value) {
        Pointer valuePtr = new Memory(Native.WCHAR_SIZE * (value.length() + 1));
        valuePtr.setWideString(0, value);
        PointerByReference valueReference = new PointerByReference();
        valueReference.setValue(valuePtr);
        VPGDllFunctions.Instance.writeString(Handle, VPGConfigOutputProperty.ExceptionTypeDirectory.getValue(), valueReference);
    }

    public String getObjectTypeDirectory() {
        PointerByReference result = new PointerByReference();
        VPGDllFunctions.Instance.readString(Handle, VPGConfigOutputProperty.ObjectTypeDirectory.getValue(), result);
        return result.getValue().getWideString(0);
    }

    public void setObjectTypeDirectory(String value) {
        Pointer valuePtr = new Memory(Native.WCHAR_SIZE * (value.length() + 1));
        valuePtr.setWideString(0, value);
        PointerByReference valueReference = new PointerByReference();
        valueReference.setValue(valuePtr);
        VPGDllFunctions.Instance.writeString(Handle, VPGConfigOutputProperty.ObjectTypeDirectory.getValue(), valueReference);
    }

    public String getApplicationDirectoryHpp() {
        PointerByReference result = new PointerByReference();
        VPGDllFunctions.Instance.readString(Handle, VPGConfigOutputProperty.ApplicationDirectoryHpp.getValue(), result);
        return result.getValue().getWideString(0);
    }

    public void setApplicationDirectoryHpp(String value) {
        Pointer valuePtr = new Memory(Native.WCHAR_SIZE * (value.length() + 1));
        valuePtr.setWideString(0, value);
        PointerByReference valueReference = new PointerByReference();
        valueReference.setValue(valuePtr);
        VPGDllFunctions.Instance.writeString(Handle, VPGConfigOutputProperty.ApplicationDirectoryHpp.getValue(), valueReference);
    }

    public String getApplicationDirectoryCpp() {
        PointerByReference result = new PointerByReference();
        VPGDllFunctions.Instance.readString(Handle, VPGConfigOutputProperty.ApplicationDirectoryCpp.getValue(), result);
        return result.getValue().getWideString(0);
    }

    public void setApplicationDirectoryCpp(String value) {
        Pointer valuePtr = new Memory(Native.WCHAR_SIZE * (value.length() + 1));
        valuePtr.setWideString(0, value);
        PointerByReference valueReference = new PointerByReference();
        valueReference.setValue(valuePtr);
        VPGDllFunctions.Instance.writeString(Handle, VPGConfigOutputProperty.ApplicationDirectoryCpp.getValue(), valueReference);
    }

    public String getActionDirectoryHpp() {
        PointerByReference result = new PointerByReference();
        VPGDllFunctions.Instance.readString(Handle, VPGConfigOutputProperty.ActionDirectoryHpp.getValue(), result);
        return result.getValue().getWideString(0);
    }

    public void setActionDirectoryHpp(String value) {
        Pointer valuePtr = new Memory(Native.WCHAR_SIZE * (value.length() + 1));
        valuePtr.setWideString(0, value);
        PointerByReference valueReference = new PointerByReference();
        valueReference.setValue(valuePtr);
        VPGDllFunctions.Instance.writeString(Handle, VPGConfigOutputProperty.ActionDirectoryHpp.getValue(), valueReference);
    }

    public String getActionDirectoryCpp() {
        PointerByReference result = new PointerByReference();
        VPGDllFunctions.Instance.readString(Handle, VPGConfigOutputProperty.ActionDirectoryCpp.getValue(), result);
        return result.getValue().getWideString(0);
    }

    public void setActionDirectoryCpp(String value) {
        Pointer valuePtr = new Memory(Native.WCHAR_SIZE * (value.length() + 1));
        valuePtr.setWideString(0, value);
        PointerByReference valueReference = new PointerByReference();
        valueReference.setValue(valuePtr);
        VPGDllFunctions.Instance.writeString(Handle, VPGConfigOutputProperty.ActionDirectoryCpp.getValue(), valueReference);
    }

    public String getFormDirectoryHpp() {
        PointerByReference result = new PointerByReference();
        VPGDllFunctions.Instance.readString(Handle, VPGConfigOutputProperty.FormDirectoryHpp.getValue(), result);
        return result.getValue().getWideString(0);
    }

    public void setFormDirectoryHpp(String value) {
        Pointer valuePtr = new Memory(Native.WCHAR_SIZE * (value.length() + 1));
        valuePtr.setWideString(0, value);
        PointerByReference valueReference = new PointerByReference();
        valueReference.setValue(valuePtr);
        VPGDllFunctions.Instance.writeString(Handle, VPGConfigOutputProperty.FormDirectoryHpp.getValue(), valueReference);
    }

    public String getFormDirectoryCpp() {
        PointerByReference result = new PointerByReference();
        VPGDllFunctions.Instance.readString(Handle, VPGConfigOutputProperty.FormDirectoryCpp.getValue(), result);
        return result.getValue().getWideString(0);
    }

    public void setFormDirectoryCpp(String value) {
        Pointer valuePtr = new Memory(Native.WCHAR_SIZE * (value.length() + 1));
        valuePtr.setWideString(0, value);
        PointerByReference valueReference = new PointerByReference();
        valueReference.setValue(valuePtr);
        VPGDllFunctions.Instance.writeString(Handle, VPGConfigOutputProperty.FormDirectoryCpp.getValue(), valueReference);
    }

    public String getObjectDirectoryHpp() {
        PointerByReference result = new PointerByReference();
        VPGDllFunctions.Instance.readString(Handle, VPGConfigOutputProperty.ObjectDirectoryHpp.getValue(), result);
        return result.getValue().getWideString(0);
    }

    public void setObjectDirectoryHpp(String value) {
        Pointer valuePtr = new Memory(Native.WCHAR_SIZE * (value.length() + 1));
        valuePtr.setWideString(0, value);
        PointerByReference valueReference = new PointerByReference();
        valueReference.setValue(valuePtr);
        VPGDllFunctions.Instance.writeString(Handle, VPGConfigOutputProperty.ObjectDirectoryHpp.getValue(), valueReference);
    }

    public String getObjectDirectoryCpp() {
        PointerByReference result = new PointerByReference();
        VPGDllFunctions.Instance.readString(Handle, VPGConfigOutputProperty.ObjectDirectoryCpp.getValue(), result);
        return result.getValue().getWideString(0);
    }

    public void setObjectDirectoryCpp(String value) {
        Pointer valuePtr = new Memory(Native.WCHAR_SIZE * (value.length() + 1));
        valuePtr.setWideString(0, value);
        PointerByReference valueReference = new PointerByReference();
        valueReference.setValue(valuePtr);
        VPGDllFunctions.Instance.writeString(Handle, VPGConfigOutputProperty.ObjectDirectoryCpp.getValue(), valueReference);
    }

    public String getPropertyAccessorDirectoryHpp() {
        PointerByReference result = new PointerByReference();
        VPGDllFunctions.Instance.readString(Handle, VPGConfigOutputProperty.PropertyAccessorDirectoryHpp.getValue(), result);
        return result.getValue().getWideString(0);
    }

    public void setPropertyAccessorDirectoryHpp(String value) {
        Pointer valuePtr = new Memory(Native.WCHAR_SIZE * (value.length() + 1));
        valuePtr.setWideString(0, value);
        PointerByReference valueReference = new PointerByReference();
        valueReference.setValue(valuePtr);
        VPGDllFunctions.Instance.writeString(Handle, VPGConfigOutputProperty.PropertyAccessorDirectoryHpp.getValue(), valueReference);
    }

    public String getPropertyAccessorDirectoryCpp() {
        PointerByReference result = new PointerByReference();
        VPGDllFunctions.Instance.readString(Handle, VPGConfigOutputProperty.PropertyAccessorDirectoryCpp.getValue(), result);
        return result.getValue().getWideString(0);
    }

    public void setPropertyAccessorDirectoryCpp(String value) {
        Pointer valuePtr = new Memory(Native.WCHAR_SIZE * (value.length() + 1));
        valuePtr.setWideString(0, value);
        PointerByReference valueReference = new PointerByReference();
        valueReference.setValue(valuePtr);
        VPGDllFunctions.Instance.writeString(Handle, VPGConfigOutputProperty.PropertyAccessorDirectoryCpp.getValue(), valueReference);
    }

    public String getObjectFactoryDirectoryHpp() {
        PointerByReference result = new PointerByReference();
        VPGDllFunctions.Instance.readString(Handle, VPGConfigOutputProperty.ObjectFactoryDirectoryHpp.getValue(), result);
        return result.getValue().getWideString(0);
    }

    public void setObjectFactoryDirectoryHpp(String value) {
        Pointer valuePtr = new Memory(Native.WCHAR_SIZE * (value.length() + 1));
        valuePtr.setWideString(0, value);
        PointerByReference valueReference = new PointerByReference();
        valueReference.setValue(valuePtr);
        VPGDllFunctions.Instance.writeString(Handle, VPGConfigOutputProperty.ObjectFactoryDirectoryHpp.getValue(), valueReference);
    }

    public String getObjectFactoryDirectoryCpp() {
        PointerByReference result = new PointerByReference();
        VPGDllFunctions.Instance.readString(Handle, VPGConfigOutputProperty.ObjectFactoryDirectoryCpp.getValue(), result);
        return result.getValue().getWideString(0);
    }

    public void setObjectFactoryDirectoryCpp(String value) {
        Pointer valuePtr = new Memory(Native.WCHAR_SIZE * (value.length() + 1));
        valuePtr.setWideString(0, value);
        PointerByReference valueReference = new PointerByReference();
        valueReference.setValue(valuePtr);
        VPGDllFunctions.Instance.writeString(Handle, VPGConfigOutputProperty.ObjectFactoryDirectoryCpp.getValue(), valueReference);
    }

    public String getPropertyAccessorFactoryDirectoryHpp() {
        PointerByReference result = new PointerByReference();
        VPGDllFunctions.Instance.readString(Handle, VPGConfigOutputProperty.PropertyAccessorFactoryDirectoryHpp.getValue(), result);
        return result.getValue().getWideString(0);
    }

    public void setPropertyAccessorFactoryDirectoryHpp(String value) {
        Pointer valuePtr = new Memory(Native.WCHAR_SIZE * (value.length() + 1));
        valuePtr.setWideString(0, value);
        PointerByReference valueReference = new PointerByReference();
        valueReference.setValue(valuePtr);
        VPGDllFunctions.Instance.writeString(Handle, VPGConfigOutputProperty.PropertyAccessorFactoryDirectoryHpp.getValue(), valueReference);
    }

    public String getPropertyAccessorFactoryDirectoryCpp() {
        PointerByReference result = new PointerByReference();
        VPGDllFunctions.Instance.readString(Handle, VPGConfigOutputProperty.PropertyAccessorFactoryDirectoryCpp.getValue(), result);
        return result.getValue().getWideString(0);
    }

    public void setPropertyAccessorFactoryDirectoryCpp(String value) {
        Pointer valuePtr = new Memory(Native.WCHAR_SIZE * (value.length() + 1));
        valuePtr.setWideString(0, value);
        PointerByReference valueReference = new PointerByReference();
        valueReference.setValue(valuePtr);
        VPGDllFunctions.Instance.writeString(Handle, VPGConfigOutputProperty.PropertyAccessorFactoryDirectoryCpp.getValue(), valueReference);
    }
    // </editor-fold>
}
