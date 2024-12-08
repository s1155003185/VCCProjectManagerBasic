package com.vcc.form.workspace;

import com.sun.jna.Pointer;
import com.vcc.VPGDllFunctions;
import com.vcc.type.VPGObjectType;
import com.vcc.type.workspace.VPGMainFormProperty;

public class VPGMainForm {
    public Pointer Handle = null;

    public VPGMainForm(Pointer handle) {
        this.Handle = handle;
    }

    public VPGMainForm() {
        this.Handle = VPGDllFunctions.Instance.ApplicationCreateForm(VPGObjectType.GitForm.getValue());
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Properties">
    public long getWorkspaceFormsCount() {
        return VPGDllFunctions.Instance.GetContainerCount(Handle, VPGMainFormProperty.WorkspaceForms.getValue());
    }

    public VPGWorkspaceForm getWorkspaceFormsAt(long index) {
        return new VPGWorkspaceForm(VPGDllFunctions.Instance.ReadObject(Handle, VPGMainFormProperty.WorkspaceForms.getValue(), index));
    }

    public void setWorkspaceFormsAt(long index, VPGWorkspaceForm value) {
        VPGDllFunctions.Instance.WriteObject(Handle, VPGMainFormProperty.WorkspaceForms.getValue(), value.Handle, index);
    }

    public VPGWorkspaceForm addWorkspaceForms() {
        return addWorkspaceFormsAt(-1);
    }

    public VPGWorkspaceForm addWorkspaceFormsAt(long index) {
        return new VPGWorkspaceForm(VPGDllFunctions.Instance.AddObject(Handle, VPGMainFormProperty.WorkspaceForms.getValue(), VPGObjectType.WorkspaceForm.getValue(), index));
    }

    public void insertWorkspaceForms(VPGWorkspaceForm value) {
        insertWorkspaceFormsAt(-1, value);
    }

    public void insertWorkspaceFormsAt(long index, VPGWorkspaceForm value) {
        VPGDllFunctions.Instance.InsertObject(Handle, VPGMainFormProperty.WorkspaceForms.getValue(), value.Handle, index);
    }

    public void removeWorkspaceFormsAt(long index) {
        VPGDllFunctions.Instance.RemoveContainerElement(Handle, VPGMainFormProperty.WorkspaceForms.getValue(), index);
    }

    public void clearWorkspaceForms() {
        VPGDllFunctions.Instance.ClearContainer(Handle, VPGMainFormProperty.WorkspaceForms.getValue());
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Generated Form Actions">
    public long clearAction() {
        return VPGDllFunctions.Instance.ApplicationClearFormAction(Handle);
    }

    public void close(boolean isForce) {
        VPGDllFunctions.Instance.ApplicationCloseForm(Handle, isForce);
    }

    public long getActionFirstSeqNo() {
        return VPGDllFunctions.Instance.ApplicationGetFormActionFirstSeqNo(Handle);
    }

    public long getActionLastSeqNo() {
        return VPGDllFunctions.Instance.ApplicationGetFormActionLastSeqNo(Handle);
    }

    public void initialize() {
        VPGDllFunctions.Instance.ApplicationInitializeForm(Handle);
    }

    public boolean isClosable() {
        return VPGDllFunctions.Instance.ApplicationIsFormClosable(Handle);
    }

    public boolean isClosed() {
        return VPGDllFunctions.Instance.ApplicationIsFormClosed(Handle);
    }

    public long redo(long noOfStep) {
        return VPGDllFunctions.Instance.ApplicationRedoFormAction(Handle, noOfStep);
    }

    public long redoToSeqNo(long seqNo) {
        return VPGDllFunctions.Instance.ApplicationRedoFormActionToSeqNo(Handle, seqNo);
    }

    public void reload() {
        VPGDllFunctions.Instance.ApplicationReloadForm(Handle);
    }

    public long truncateAction() {
        return VPGDllFunctions.Instance.ApplicationTruncateFormAction(Handle);
    }

    public long undo(long noOfStep) {
        return VPGDllFunctions.Instance.ApplicationUndoFormAction(Handle, noOfStep);
    }

    public long undoToSeqNo(long seqNo) {
        return VPGDllFunctions.Instance.ApplicationUndoFormActionToSeqNo(Handle, seqNo);
    }
    // </editor-fold>
}
