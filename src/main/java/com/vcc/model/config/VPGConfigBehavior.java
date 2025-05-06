package com.vcc.model.config;

import com.sun.jna.Pointer;
import com.vcc.VPGDllFunctions;
import com.vcc.type.config.VPGConfigBehaviorProperty;

public class VPGConfigBehavior {

    public Pointer Handle = null;

    public VPGConfigBehavior(Pointer handle) {
        this.Handle = handle;
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Properties">
    public boolean getIsResultThrowException() {
        return VPGDllFunctions.Instance.ReadBool(Handle, VPGConfigBehaviorProperty.IsResultThrowException.getValue());
    }

    public void setIsResultThrowException(boolean value) {
        VPGDllFunctions.Instance.WriteBool(Handle, VPGConfigBehaviorProperty.IsResultThrowException.getValue(), value);
    }
    // </editor-fold>
}
