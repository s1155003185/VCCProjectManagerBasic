package com.vcc.model.workspace;

import com.sun.jna.Pointer;
import com.vcc.VPGDllFunctions;
import com.vcc.form.workspace.VPGWorkspaceForm;
import com.vcc.type.VPGObjectType;
import com.vcc.type.workspace.VPGMainFormDeleteWorkspaceFormArgumentProperty;

public class VPGMainFormDeleteWorkspaceFormArgument {

    public Pointer Handle = null;

    public VPGMainFormDeleteWorkspaceFormArgument(Pointer handle) {
        this.Handle = handle;
    }

    public VPGMainFormDeleteWorkspaceFormArgument() {
        this.Handle = VPGDllFunctions.Instance.ApplicationCreateActionArgument(VPGObjectType.MainFormDeleteWorkspaceFormArgument.getValue());
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Properties">
    public VPGWorkspaceForm getWorkspaceForm() {
        return new VPGWorkspaceForm(VPGDllFunctions.Instance.ReadObject(Handle, VPGMainFormDeleteWorkspaceFormArgumentProperty.WorkspaceForm.getValue()));
    }

    public void setWorkspaceForm(VPGWorkspaceForm value) {
        VPGDllFunctions.Instance.WriteObject(Handle, VPGMainFormDeleteWorkspaceFormArgumentProperty.WorkspaceForm.getValue(), value.Handle);
    }
    // </editor-fold>
}
