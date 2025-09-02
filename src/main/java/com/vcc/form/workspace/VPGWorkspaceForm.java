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
        this.Handle = VPGDllFunctions.Instance.applicationCreateForm(VPGObjectType.WorkspaceForm.getValue());
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Properties">
    public String getName() {
        PointerByReference result = new PointerByReference();
        VPGDllFunctions.Instance.readString(Handle, VPGWorkspaceFormProperty.Name.getValue(), result);
        return result.getValue().getWideString(0);
    }

    public void setName(String value) {
        Pointer valuePtr = new Memory(Native.WCHAR_SIZE * (value.length() + 1));
        valuePtr.setWideString(0, value);
        PointerByReference valueReference = new PointerByReference();
        valueReference.setValue(valuePtr);
        VPGDllFunctions.Instance.writeString(Handle, VPGWorkspaceFormProperty.Name.getValue(), valueReference);
    }

    public long getTabOrder() {
        return VPGDllFunctions.Instance.readLong(Handle, VPGWorkspaceFormProperty.TabOrder.getValue());
    }

    public void setTabOrder(long value) {
        VPGDllFunctions.Instance.writeLong(Handle, VPGWorkspaceFormProperty.TabOrder.getValue(), value);
    }

    public long getGitFormsCount() {
        return VPGDllFunctions.Instance.getCount(Handle, VPGWorkspaceFormProperty.GitForms.getValue());
    }

    public VPGGitForm getGitFormsAtIndex(long index) {
        return new VPGGitForm(VPGDllFunctions.Instance.readObjectAtIndex(Handle, VPGWorkspaceFormProperty.GitForms.getValue(), index));
    }

    public void setGitFormsAtIndex(long index, VPGGitForm value) {
        VPGDllFunctions.Instance.writeObjectAtIndex(Handle, VPGWorkspaceFormProperty.GitForms.getValue(), value.Handle, index);
    }

    public VPGGitForm addGitForms() {
        return addGitFormsAtIndex(-1);
    }

    public VPGGitForm addGitFormsAtIndex(long index) {
        return new VPGGitForm(VPGDllFunctions.Instance.addObjectAtIndex(Handle, VPGWorkspaceFormProperty.GitForms.getValue(), VPGObjectType.GitForm.getValue(), index));
    }

    public void insertGitForms(VPGGitForm value) {
        insertGitFormsAtIndex(-1, value);
    }

    public void insertGitFormsAtIndex(long index, VPGGitForm value) {
        VPGDllFunctions.Instance.insertObjectAtIndex(Handle, VPGWorkspaceFormProperty.GitForms.getValue(), value.Handle, index);
    }

    public void removeGitForms(VPGGitForm value) {
        VPGDllFunctions.Instance.removeObject(Handle, VPGWorkspaceFormProperty.GitForms.getValue(), value.Handle);
    }

    public void removeGitFormsAtIndex(long index) {
        VPGDllFunctions.Instance.removeAtIndex(Handle, VPGWorkspaceFormProperty.GitForms.getValue(), index);
    }

    public void clearGitForms() {
        VPGDllFunctions.Instance.clear(Handle, VPGWorkspaceFormProperty.GitForms.getValue());
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
}
