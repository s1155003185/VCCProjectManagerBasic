package com.vcc.model.workspace;

import com.sun.jna.Memory;
import com.sun.jna.Native;
import com.sun.jna.Pointer;
import com.sun.jna.ptr.PointerByReference;
import com.vcc.VPGDllFunctions;
import com.vcc.type.workspace.VPGMainFormAddWorkspaceFormArgumentArgumentProperty;

public class VPGMainFormAddWorkspaceFormArgumentArgument {
    public Pointer Handle = null;

    public VPGMainFormAddWorkspaceFormArgumentArgument(Pointer handle) {
        this.Handle = handle;
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Properties">
    public String getName() {
        PointerByReference result = new PointerByReference();
        VPGDllFunctions.Instance.ReadString(Handle, VPGMainFormAddWorkspaceFormArgumentArgumentProperty.Name.getValue(), result);
        return result.getValue().getWideString(0);
    }

    public void setName(String value) {
        Pointer valuePtr = new Memory(Native.WCHAR_SIZE * (value.length() + 1));
        valuePtr.setWideString(0, value);
        PointerByReference valueReference = new PointerByReference();
        valueReference.setValue(valuePtr);
        VPGDllFunctions.Instance.WriteString(Handle, VPGMainFormAddWorkspaceFormArgumentArgumentProperty.Name.getValue(), valueReference);
    }
    // </editor-fold>
}
