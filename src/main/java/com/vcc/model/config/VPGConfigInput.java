package com.vcc.model.config;

import com.sun.jna.Memory;
import com.sun.jna.Native;
import com.sun.jna.Pointer;
import com.sun.jna.ptr.PointerByReference;
import com.vcc.VPGDllFunctions;
import com.vcc.type.config.VPGConfigInputProperty;

public class VPGConfigInput {

    public Pointer Handle = null;

    public VPGConfigInput(Pointer handle) {
        this.Handle = handle;
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Properties">
    public String getTypeWorkspace() {
        PointerByReference result = new PointerByReference();
        VPGDllFunctions.Instance.ReadString(Handle, VPGConfigInputProperty.TypeWorkspace.getValue(), result);
        return result.getValue().getWideString(0);
    }

    public void setTypeWorkspace(String value) {
        Pointer valuePtr = new Memory(Native.WCHAR_SIZE * (value.length() + 1));
        valuePtr.setWideString(0, value);
        PointerByReference valueReference = new PointerByReference();
        valueReference.setValue(valuePtr);
        VPGDllFunctions.Instance.WriteString(Handle, VPGConfigInputProperty.TypeWorkspace.getValue(), valueReference);
    }
    // </editor-fold>
}
