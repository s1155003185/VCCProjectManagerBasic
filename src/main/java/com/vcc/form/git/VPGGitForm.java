package com.vcc.form.git;

import com.sun.jna.Pointer;
import com.vcc.VPGDllFunctions;
import com.vcc.model.git.VPGGitLog;
import com.vcc.type.VPGObjectType;
import com.vcc.type.git.VPGGitFormProperty;

public class VPGGitForm {

    public Pointer Handle = null;

    public VPGGitForm(Pointer handle) {
        this.Handle = handle;
    }

    public VPGGitForm() {
        this.Handle = VPGDllFunctions.Instance.applicationCreateForm(VPGObjectType.GitForm.getValue());
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Properties">
    public VPGGitLog getLog() {
        return new VPGGitLog(VPGDllFunctions.Instance.readObject(Handle, VPGGitFormProperty.Log.getValue()));
    }

    public void setLog(VPGGitLog value) {
        VPGDllFunctions.Instance.writeObject(Handle, VPGGitFormProperty.Log.getValue(), value.Handle);
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
