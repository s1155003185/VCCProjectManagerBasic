package com.vcc.form.workspace;

import com.sun.jna.Pointer;
import com.vcc.VPGDllFunctions;
import com.vcc.model.VPGOperationResult;
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
        this.Handle = VPGDllFunctions.Instance.applicationCreateForm(VPGObjectType.MainForm.getValue());
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Properties">
    public long getWorkspaceFormsCount() {
        return VPGDllFunctions.Instance.getCount(Handle, VPGMainFormProperty.WorkspaceForms.getValue());
    }

    public VPGWorkspaceForm getWorkspaceFormsAtIndex(long index) {
        return new VPGWorkspaceForm(VPGDllFunctions.Instance.readObjectAtIndex(Handle, VPGMainFormProperty.WorkspaceForms.getValue(), index));
    }

    public void setWorkspaceFormsAtIndex(long index, VPGWorkspaceForm value) {
        VPGDllFunctions.Instance.writeObjectAtIndex(Handle, VPGMainFormProperty.WorkspaceForms.getValue(), value.Handle, index);
    }

    public VPGWorkspaceForm addWorkspaceForms() {
        return addWorkspaceFormsAtIndex(-1);
    }

    public VPGWorkspaceForm addWorkspaceFormsAtIndex(long index) {
        return new VPGWorkspaceForm(VPGDllFunctions.Instance.addObjectAtIndex(Handle, VPGMainFormProperty.WorkspaceForms.getValue(), VPGObjectType.WorkspaceForm.getValue(), index));
    }

    public void insertWorkspaceForms(VPGWorkspaceForm value) {
        insertWorkspaceFormsAtIndex(-1, value);
    }

    public void insertWorkspaceFormsAtIndex(long index, VPGWorkspaceForm value) {
        VPGDllFunctions.Instance.insertObjectAtIndex(Handle, VPGMainFormProperty.WorkspaceForms.getValue(), value.Handle, index);
    }

    public void removeWorkspaceForms(VPGWorkspaceForm value) {
        VPGDllFunctions.Instance.removeObject(Handle, VPGMainFormProperty.WorkspaceForms.getValue(), value.Handle);
    }

    public void removeWorkspaceFormsAtIndex(long index) {
        VPGDllFunctions.Instance.removeAtIndex(Handle, VPGMainFormProperty.WorkspaceForms.getValue(), index);
    }

    public void clearWorkspaceForms() {
        VPGDllFunctions.Instance.clear(Handle, VPGMainFormProperty.WorkspaceForms.getValue());
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Generated Form Actions">
    public long clearAction() {
        return VPGDllFunctions.Instance.applicationClearFormAction(Handle);
    }

    public void close(boolean isForce) {
        VPGDllFunctions.Instance.applicationCloseForm(Handle, isForce);
    }

    public long getActionCurrentSeqNo() {
        return VPGDllFunctions.Instance.applicationGetFormActionCurrentSeqNo(Handle);
    }

    public long getActionFirstSeqNo() {
        return VPGDllFunctions.Instance.applicationGetFormActionFirstSeqNo(Handle);
    }

    public long getActionLastSeqNo() {
        return VPGDllFunctions.Instance.applicationGetFormActionLastSeqNo(Handle);
    }

    public boolean isClosable() {
        return VPGDllFunctions.Instance.applicationIsFormClosable(Handle);
    }

    public boolean isClosed() {
        return VPGDllFunctions.Instance.applicationIsFormClosed(Handle);
    }

    public void redo(long noOfStep) {
        VPGDllFunctions.Instance.applicationRedoFormAction(Handle, noOfStep);
    }

    public void redoToSeqNo(long seqNo) {
        VPGDllFunctions.Instance.applicationRedoFormActionToSeqNo(Handle, seqNo);
    }

    public long truncateAction() {
        return VPGDllFunctions.Instance.applicationTruncateFormAction(Handle);
    }

    public void undo(long noOfStep) {
        VPGDllFunctions.Instance.applicationUndoFormAction(Handle, noOfStep);
    }

    public void undoToSeqNo(long seqNo) {
        VPGDllFunctions.Instance.applicationUndoFormActionToSeqNo(Handle, seqNo);
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Generated Form Custom Actions">
    public VPGOperationResult doAddWorkspaceForm(VPGMainFormAddWorkspaceFormArgument argument) {
        return new VPGOperationResult(VPGDllFunctions.Instance.applicationDoFormAction(Handle, VPGMainFormProperty.AddWorkspaceForm.getValue(), argument.Handle));
    }

    public VPGOperationResult doDeleteWorkspaceForm(VPGMainFormDeleteWorkspaceFormArgument argument) {
        return new VPGOperationResult(VPGDllFunctions.Instance.applicationDoFormAction(Handle, VPGMainFormProperty.DeleteWorkspaceForm.getValue(), argument.Handle));
    }

    public VPGOperationResult doInitialize() {
        return new VPGOperationResult(VPGDllFunctions.Instance.applicationDoFormAction(Handle, VPGMainFormProperty.Initialize.getValue(), null));
    }

    public VPGOperationResult doRenameWorkspaceForm(VPGMainFormRenameWorkspaceFormArgument argument) {
        return new VPGOperationResult(VPGDllFunctions.Instance.applicationDoFormAction(Handle, VPGMainFormProperty.RenameWorkspaceForm.getValue(), argument.Handle));
    }
    // </editor-fold>
}
