package com.vcc.form.workspace;

import com.sun.jna.Pointer;
import com.vcc.VPGDllFunctions;
import com.vcc.form.git.VPGGitForm;
import com.vcc.type.VPGObjectType;
import com.vcc.type.workspace.VPGWorkspaceFormProperty;

public class VPGWorkspaceForm {
    public Pointer Handle = null;

    public VPGWorkspaceForm(Pointer handle) {
        this.Handle = handle;
    }

    public VPGWorkspaceForm() {
        this.Handle = VPGDllFunctions.Instance.ApplicationCreateForm(VPGObjectType.GitForm.getValue());
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Properties">
    public long getGitFormsCount() {
        return VPGDllFunctions.Instance.GetContainerCount(Handle, VPGWorkspaceFormProperty.GitForms.getValue());
    }

    public VPGGitForm getGitFormsAt(long index) {
        return new VPGGitForm(VPGDllFunctions.Instance.ReadObject(Handle, VPGWorkspaceFormProperty.GitForms.getValue(), index));
    }

    public void setGitFormsAt(long index, VPGGitForm value) {
        VPGDllFunctions.Instance.WriteObject(Handle, VPGWorkspaceFormProperty.GitForms.getValue(), value.Handle, index);
    }

    public VPGGitForm addGitForms() {
        return addGitFormsAt(-1);
    }

    public VPGGitForm addGitFormsAt(long index) {
        return new VPGGitForm(VPGDllFunctions.Instance.AddObject(Handle, VPGWorkspaceFormProperty.GitForms.getValue(), VPGObjectType.GitForm.getValue(), index));
    }

    public void insertGitForms(VPGGitForm value) {
        insertGitFormsAt(-1, value);
    }

    public void insertGitFormsAt(long index, VPGGitForm value) {
        VPGDllFunctions.Instance.InsertObject(Handle, VPGWorkspaceFormProperty.GitForms.getValue(), value.Handle, index);
    }

    public void removeGitFormsAt(long index) {
        VPGDllFunctions.Instance.RemoveContainerElement(Handle, VPGWorkspaceFormProperty.GitForms.getValue(), index);
    }

    public void clearGitForms() {
        VPGDllFunctions.Instance.ClearContainer(Handle, VPGWorkspaceFormProperty.GitForms.getValue());
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
