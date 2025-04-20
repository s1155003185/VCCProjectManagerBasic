package com.vcc.model;

import com.sun.jna.Pointer;
import com.sun.jna.ptr.PointerByReference;
import com.vcc.VPGDllFunctions;
import com.vcc.type.VPGExceptionType;

public class VPGOperationResult {
    public Pointer Handle = null;

    public VPGOperationResult(Pointer handle) {
        this.Handle = handle;
    }

    public VPGExceptionType getExceptionType() {
        return VPGExceptionType.parse((int)VPGDllFunctions.Instance.ApplicationGetResultErrorCode(Handle));
    }

    public String getMessage() {
        PointerByReference result = new PointerByReference();
        VPGDllFunctions.Instance.ApplicationGetResultMessage(Handle, result);
        return result.getValue().getWideString(0);
    }
    public boolean isError() {
        return VPGDllFunctions.Instance.ApplicationIsErrorResult(Handle);
    }

    public boolean isWarning() {
        return VPGDllFunctions.Instance.ApplicationIsWarningResult(Handle);
    }

    public void close() {
        VPGDllFunctions.Instance.ApplicationEraseResult(Handle);
    }
}
