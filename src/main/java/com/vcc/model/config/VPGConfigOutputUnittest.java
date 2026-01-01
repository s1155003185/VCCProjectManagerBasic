package com.vcc.model.config;

import com.sun.jna.Memory;
import com.sun.jna.Native;
import com.sun.jna.Pointer;
import com.sun.jna.ptr.PointerByReference;
import com.vcc.VPGDllFunctions;
import com.vcc.type.config.VPGConfigOutputUnittestProperty;

public class VPGConfigOutputUnittest {

    public Pointer Handle = null;

    public VPGConfigOutputUnittest(Pointer handle) {
        this.Handle = handle;
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Properties">
    public String getActionDirectoryCpp() {
        PointerByReference result = new PointerByReference();
        VPGDllFunctions.Instance.readString(Handle, VPGConfigOutputUnittestProperty.ActionDirectoryCpp.getValue(), result);
        return result.getValue().getWideString(0);
    }

    public void setActionDirectoryCpp(String value) {
        Pointer valuePtr = new Memory(Native.WCHAR_SIZE * (value.length() + 1));
        valuePtr.setWideString(0, value);
        PointerByReference valueReference = new PointerByReference();
        valueReference.setValue(valuePtr);
        VPGDllFunctions.Instance.writeString(Handle, VPGConfigOutputUnittestProperty.ActionDirectoryCpp.getValue(), valueReference);
    }

    public long getUnittestNamesCount() {
        return VPGDllFunctions.Instance.getCount(Handle, VPGConfigOutputUnittestProperty.UnittestNames.getValue());
    }

    public String getUnittestNamesAtIndex(long index) {
        PointerByReference result = new PointerByReference();
        VPGDllFunctions.Instance.readStringAtIndex(Handle, VPGConfigOutputUnittestProperty.UnittestNames.getValue(), result, index);
        return result.getValue().getWideString(0);
    }

    public void setUnittestNamesAtIndex(long index, String value) {
        Pointer valuePtr = new Memory(Native.WCHAR_SIZE * (value.length() + 1));
        valuePtr.setWideString(0, value);
        PointerByReference valueReference = new PointerByReference();
        valueReference.setValue(valuePtr);
        VPGDllFunctions.Instance.writeStringAtIndex(Handle, VPGConfigOutputUnittestProperty.UnittestNames.getValue(), valueReference, index);
    }

    public void insertUnittestNames(String value) {
        insertUnittestNamesAtIndex(-1, value);
    }

    public void insertUnittestNamesAtIndex(long index, String value) {
        Pointer valuePtr = new Memory(Native.WCHAR_SIZE * (value.length() + 1));
        valuePtr.setWideString(0, value);
        PointerByReference valueReference = new PointerByReference();
        valueReference.setValue(valuePtr);
        VPGDllFunctions.Instance.insertStringAtIndex(Handle, VPGConfigOutputUnittestProperty.UnittestNames.getValue(), valueReference, index);
    }

    public void removeUnittestNamesAtIndex(long index) {
        VPGDllFunctions.Instance.removeAtIndex(Handle, VPGConfigOutputUnittestProperty.UnittestNames.getValue(), index);
    }

    public void clearUnittestNames() {
        VPGDllFunctions.Instance.clear(Handle, VPGConfigOutputUnittestProperty.UnittestNames.getValue());
    }
    // </editor-fold>
}
