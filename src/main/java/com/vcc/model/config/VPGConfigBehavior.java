package com.vcc.model.config;

import com.sun.jna.Pointer;
import com.vcc.VPGDllFunctions;
import com.vcc.type.config.VPGConfigBehaviorProperty;
import com.vcc.type.enumtype.VPGConfigActionHistoryType;

public class VPGConfigBehavior {

    public Pointer Handle = null;

    public VPGConfigBehavior(Pointer handle) {
        this.Handle = handle;
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Properties">
    public VPGConfigActionHistoryType getActionHistoryType() {
        return VPGConfigActionHistoryType.parse((int)VPGDllFunctions.Instance.readLong(Handle, VPGConfigBehaviorProperty.ActionHistoryType.getValue()));
    }

    public void setActionHistoryType(VPGConfigActionHistoryType value) {
        VPGDllFunctions.Instance.writeLong(Handle, VPGConfigBehaviorProperty.ActionHistoryType.getValue(), value.getValue());
    }

    public boolean getIsActionResultThrowException() {
        return VPGDllFunctions.Instance.readBool(Handle, VPGConfigBehaviorProperty.IsActionResultThrowException.getValue());
    }

    public void setIsActionResultThrowException(boolean value) {
        VPGDllFunctions.Instance.writeBool(Handle, VPGConfigBehaviorProperty.IsActionResultThrowException.getValue(), value);
    }
    // </editor-fold>
}
