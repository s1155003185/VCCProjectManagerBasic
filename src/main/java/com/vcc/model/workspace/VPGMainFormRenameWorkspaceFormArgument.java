package com.vcc.model.workspace;

import com.sun.jna.Memory;
import com.sun.jna.Native;
import com.sun.jna.Pointer;
import com.sun.jna.ptr.PointerByReference;
import com.vcc.VPGDllFunctions;
import com.vcc.form.workspace.VPGWorkspaceForm;
import com.vcc.type.VPGObjectType;
import com.vcc.type.workspace.VPGMainFormRenameWorkspaceFormArgumentProperty;

public class VPGMainFormRenameWorkspaceFormArgument {

    public Pointer Handle = null;

    public VPGMainFormRenameWorkspaceFormArgument(Pointer handle) {
        this.Handle = handle;
    }

    public VPGMainFormRenameWorkspaceFormArgument() {
        this.Handle = VPGDllFunctions.Instance.ApplicationCreateActionArgument(VPGObjectType.MainFormRenameWorkspaceFormArgument.getValue());
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Properties">
    public VPGWorkspaceForm getWorkspaceForm() {
        return new VPGWorkspaceForm(VPGDllFunctions.Instance.ReadObject(Handle, VPGMainFormRenameWorkspaceFormArgumentProperty.WorkspaceForm.getValue()));
    }

    public void setWorkspaceForm(VPGWorkspaceForm value) {
        VPGDllFunctions.Instance.WriteObject(Handle, VPGMainFormRenameWorkspaceFormArgumentProperty.WorkspaceForm.getValue(), value.Handle);
    }

    public String getNewName() {
        PointerByReference result = new PointerByReference();
        VPGDllFunctions.Instance.ReadString(Handle, VPGMainFormRenameWorkspaceFormArgumentProperty.NewName.getValue(), result);
        return result.getValue().getWideString(0);
    }

    public void setNewName(String value) {
        Pointer valuePtr = new Memory(Native.WCHAR_SIZE * (value.length() + 1));
        valuePtr.setWideString(0, value);
        PointerByReference valueReference = new PointerByReference();
        valueReference.setValue(valuePtr);
        VPGDllFunctions.Instance.WriteString(Handle, VPGMainFormRenameWorkspaceFormArgumentProperty.NewName.getValue(), valueReference);
    }
    // </editor-fold>
}
