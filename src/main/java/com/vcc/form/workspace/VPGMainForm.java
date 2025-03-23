package com.vcc.form.workspace;

import com.sun.jna.Pointer;
import com.vcc.VPGDllFunctions;
import com.vcc.model.workspace.VPGMainFormAddWorkspaceFormArgument;
import com.vcc.model.workspace.VPGMainFormDeleteWorkspaceFormArgument;
import com.vcc.model.workspace.VPGMainFormRenameWorkspaceFormArgument;
import com.vcc.type.VPGObjectType;
import com.vcc.type.workspace.VPGMainFormProperty;

public class VPGMainForm {
    public Pointer Handle = null;

    public VPGMainForm(Pointer handle) {
        this.Handle = handle;
    }

    public VPGMainForm() {
        this.Handle = VPGDllFunctions.Instance.ApplicationCreateForm(VPGObjectType.MainForm.getValue());
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Properties">
    public long getWorkspaceFormsCount() {
        return VPGDllFunctions.Instance.GetCount(Handle, VPGMainFormProperty.WorkspaceForms.getValue());
    }

    public VPGWorkspaceForm getWorkspaceFormsAtIndex(long index) {
        return new VPGWorkspaceForm(VPGDllFunctions.Instance.ReadObjectAtIndex(Handle, VPGMainFormProperty.WorkspaceForms.getValue(), index));
    }

    public void setWorkspaceFormsAtIndex(long index, VPGWorkspaceForm value) {
        VPGDllFunctions.Instance.WriteObjectAtIndex(Handle, VPGMainFormProperty.WorkspaceForms.getValue(), value.Handle, index);
    }

    public VPGWorkspaceForm addWorkspaceForms() {
        return addWorkspaceFormsAtIndex(-1);
    }

    public VPGWorkspaceForm addWorkspaceFormsAtIndex(long index) {
        return new VPGWorkspaceForm(VPGDllFunctions.Instance.AddObjectAtIndex(Handle, VPGMainFormProperty.WorkspaceForms.getValue(), VPGObjectType.WorkspaceForm.getValue(), index));
    }

    public void insertWorkspaceForms(VPGWorkspaceForm value) {
        insertWorkspaceFormsAtIndex(-1, value);
    }

    public void insertWorkspaceFormsAtIndex(long index, VPGWorkspaceForm value) {
        VPGDllFunctions.Instance.InsertObjectAtIndex(Handle, VPGMainFormProperty.WorkspaceForms.getValue(), value.Handle, index);
    }

    public void removeWorkspaceForms(VPGWorkspaceForm value) {
        VPGDllFunctions.Instance.RemoveObject(Handle, VPGMainFormProperty.WorkspaceForms.getValue(), value.Handle);
    }

    public void removeWorkspaceFormsAtIndex(long index) {
        VPGDllFunctions.Instance.RemoveAtIndex(Handle, VPGMainFormProperty.WorkspaceForms.getValue(), index);
    }

    public void clearWorkspaceForms() {
        VPGDllFunctions.Instance.Clear(Handle, VPGMainFormProperty.WorkspaceForms.getValue());
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

    // <editor-fold defaultstate="collapsed" desc="Generated Form Custom Actions">
    public void doAddWorkspaceForm(VPGMainFormAddWorkspaceFormArgument argument) {
        VPGDllFunctions.Instance.ApplicationDoFormAction(Handle, VPGMainFormProperty.AddWorkspaceForm.getValue(), argument.Handle);
    }

    public void doDeleteWorkspaceForm(VPGMainFormDeleteWorkspaceFormArgument argument) {
        VPGDllFunctions.Instance.ApplicationDoFormAction(Handle, VPGMainFormProperty.DeleteWorkspaceForm.getValue(), argument.Handle);
    }

    public void doInitialize() {
        VPGDllFunctions.Instance.ApplicationDoFormAction(Handle, VPGMainFormProperty.Initialize.getValue(), null);
    }

    public void doRenameWorkspaceForm(VPGMainFormRenameWorkspaceFormArgument argument) {
        VPGDllFunctions.Instance.ApplicationDoFormAction(Handle, VPGMainFormProperty.RenameWorkspaceForm.getValue(), argument.Handle);
    }
    // </editor-fold>
}
