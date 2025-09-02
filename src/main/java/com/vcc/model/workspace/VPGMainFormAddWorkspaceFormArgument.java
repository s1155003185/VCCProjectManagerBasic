package com.vcc.model.workspace;

import com.sun.jna.Memory;
import com.sun.jna.Native;
import com.sun.jna.Pointer;
import com.sun.jna.ptr.PointerByReference;
import com.vcc.VPGDllFunctions;
import com.vcc.type.VPGObjectType;
import com.vcc.type.workspace.VPGMainFormAddWorkspaceFormArgumentProperty;

public class VPGMainFormAddWorkspaceFormArgument {

    public Pointer Handle = null;

    public VPGMainFormAddWorkspaceFormArgument(Pointer handle) {
        this.Handle = handle;
    }

    public VPGMainFormAddWorkspaceFormArgument() {
        this.Handle = VPGDllFunctions.Instance.applicationCreateActionArgument(VPGObjectType.MainFormAddWorkspaceFormArgument.getValue());
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Properties">
    public String getName() {
        PointerByReference result = new PointerByReference();
        VPGDllFunctions.Instance.readString(Handle, VPGMainFormAddWorkspaceFormArgumentProperty.Name.getValue(), result);
        return result.getValue().getWideString(0);
    }

    public void setName(String value) {
        Pointer valuePtr = new Memory(Native.WCHAR_SIZE * (value.length() + 1));
        valuePtr.setWideString(0, value);
        PointerByReference valueReference = new PointerByReference();
        valueReference.setValue(valuePtr);
        VPGDllFunctions.Instance.writeString(Handle, VPGMainFormAddWorkspaceFormArgumentProperty.Name.getValue(), valueReference);
    }
    // </editor-fold>
}
