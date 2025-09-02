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
        return VPGExceptionType.parse((int)VPGDllFunctions.Instance.applicationGetResultErrorCode(Handle));
    }

    public String getMessage() {
        PointerByReference result = new PointerByReference();
        VPGDllFunctions.Instance.applicationGetResultMessage(Handle, result);
        return result.getValue().getWideString(0);
    }
    public boolean isError() {
        return VPGDllFunctions.Instance.applicationIsErrorResult(Handle);
    }

    public boolean isWarning() {
        return VPGDllFunctions.Instance.applicationIsWarningResult(Handle);
    }

    public void close() {
        VPGDllFunctions.Instance.applicationEraseResult(Handle);
    }
}
