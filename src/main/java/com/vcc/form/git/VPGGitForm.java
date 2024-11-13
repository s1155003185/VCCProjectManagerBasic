package com.vcc.form.git;

import com.sun.jna.Pointer;
import com.vcc.VPGDllFunctions;
import com.vcc.model.git.VPGGitLog;
import com.vcc.type.git.VPGGitFormProperty;

public class VPGGitForm {
    public Pointer Handle = null;

    public VPGGitForm(Pointer handle) {
        this.Handle = handle;
    }

    public VPGGitLog getLog() {
        return new VPGGitLog(VPGDllFunctions.Instance.ReadObject(Handle, VPGGitFormProperty.Log.getValue(), -1));
    }

    public void setLog(VPGGitLog value) {
        VPGDllFunctions.Instance.WriteObject(Handle, VPGGitFormProperty.Log.getValue(), value.Handle, -1);
    }
}
