package com.vcc.model.workspace;

import com.sun.jna.Pointer;
import com.vcc.VPGDllFunctions;
import com.vcc.form.workspace.VPGWorkspaceForm;
import com.vcc.type.workspace.VPGMainFormDeleteWorkspaceFormArgumentArgumentProperty;

public class VPGMainFormDeleteWorkspaceFormArgumentArgument {
    public Pointer Handle = null;

    public VPGMainFormDeleteWorkspaceFormArgumentArgument(Pointer handle) {
        this.Handle = handle;
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Properties">
    public VPGWorkspaceForm getWorkspaceForm() {
        return new VPGWorkspaceForm(VPGDllFunctions.Instance.ReadObject(Handle, VPGMainFormDeleteWorkspaceFormArgumentArgumentProperty.WorkspaceForm.getValue()));
    }

    public void setWorkspaceForm(VPGWorkspaceForm value) {
        VPGDllFunctions.Instance.WriteObject(Handle, VPGMainFormDeleteWorkspaceFormArgumentArgumentProperty.WorkspaceForm.getValue(), value.Handle);
    }
    // </editor-fold>
}
