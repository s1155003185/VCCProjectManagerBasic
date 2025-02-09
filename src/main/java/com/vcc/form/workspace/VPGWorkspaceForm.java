package com.vcc.form.workspace;

import com.sun.jna.Memory;
import com.sun.jna.Native;
import com.sun.jna.Pointer;
import com.sun.jna.ptr.PointerByReference;
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
        this.Handle = VPGDllFunctions.Instance.ApplicationCreateForm(VPGObjectType.WorkspaceForm.getValue());
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Properties">
    public String getName() {
        PointerByReference result = new PointerByReference();
        VPGDllFunctions.Instance.ReadString(Handle, VPGWorkspaceFormProperty.Name.getValue(), result);
        return result.getValue().getWideString(0);
    }

    public void setName(String value) {
        Pointer valuePtr = new Memory(Native.WCHAR_SIZE * (value.length() + 1));
        valuePtr.setWideString(0, value);
        PointerByReference valueReference = new PointerByReference();
        valueReference.setValue(valuePtr);
        VPGDllFunctions.Instance.WriteString(Handle, VPGWorkspaceFormProperty.Name.getValue(), valueReference);
    }

    public long getGitFormsCount() {
        return VPGDllFunctions.Instance.GetCount(Handle, VPGWorkspaceFormProperty.GitForms.getValue());
    }

    public VPGGitForm getGitFormsAtIndex(long index) {
        return new VPGGitForm(VPGDllFunctions.Instance.ReadObjectAtIndex(Handle, VPGWorkspaceFormProperty.GitForms.getValue(), index));
    }

    public void setGitFormsAtIndex(long index, VPGGitForm value) {
        VPGDllFunctions.Instance.WriteObjectAtIndex(Handle, VPGWorkspaceFormProperty.GitForms.getValue(), value.Handle, index);
    }

    public VPGGitForm addGitForms() {
        return addGitFormsAtIndex(-1);
    }

    public VPGGitForm addGitFormsAtIndex(long index) {
        return new VPGGitForm(VPGDllFunctions.Instance.AddObjectAtIndex(Handle, VPGWorkspaceFormProperty.GitForms.getValue(), VPGObjectType.GitForm.getValue(), index));
    }

    public void insertGitForms(VPGGitForm value) {
        insertGitFormsAtIndex(-1, value);
    }

    public void insertGitFormsAtIndex(long index, VPGGitForm value) {
        VPGDllFunctions.Instance.InsertObjectAtIndex(Handle, VPGWorkspaceFormProperty.GitForms.getValue(), value.Handle, index);
    }

    public void removeGitForms(VPGGitForm value) {
        VPGDllFunctions.Instance.RemoveObject(Handle, VPGWorkspaceFormProperty.GitForms.getValue(), value.Handle);
    }

    public void removeGitFormsAtIndex(long index) {
        VPGDllFunctions.Instance.RemoveAtIndex(Handle, VPGWorkspaceFormProperty.GitForms.getValue(), index);
    }

    public void clearGitForms() {
        VPGDllFunctions.Instance.Clear(Handle, VPGWorkspaceFormProperty.GitForms.getValue());
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
}
