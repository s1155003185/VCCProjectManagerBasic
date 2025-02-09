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
        this.Handle = VPGDllFunctions.Instance.ApplicationCreateForm(VPGObjectType.GitForm.getValue());
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Properties">
    public VPGGitLog getLog() {
        return new VPGGitLog(VPGDllFunctions.Instance.ReadObject(Handle, VPGGitFormProperty.Log.getValue()));
    }

    public void setLog(VPGGitLog value) {
        VPGDllFunctions.Instance.WriteObject(Handle, VPGGitFormProperty.Log.getValue(), value.Handle);
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
