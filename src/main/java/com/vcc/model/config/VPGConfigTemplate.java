package com.vcc.model.config;

import com.sun.jna.Memory;
import com.sun.jna.Native;
import com.sun.jna.Pointer;
import com.sun.jna.ptr.PointerByReference;
import com.vcc.VPGDllFunctions;
import com.vcc.type.config.VPGConfigTemplateProperty;

public class VPGConfigTemplate {

    public Pointer Handle = null;

    public VPGConfigTemplate(Pointer handle) {
        this.Handle = handle;
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Properties">
    public String getUrl() {
        PointerByReference result = new PointerByReference();
        VPGDllFunctions.Instance.readString(Handle, VPGConfigTemplateProperty.Url.getValue(), result);
        return result.getValue().getWideString(0);
    }

    public void setUrl(String value) {
        Pointer valuePtr = new Memory(Native.WCHAR_SIZE * (value.length() + 1));
        valuePtr.setWideString(0, value);
        PointerByReference valueReference = new PointerByReference();
        valueReference.setValue(valuePtr);
        VPGDllFunctions.Instance.writeString(Handle, VPGConfigTemplateProperty.Url.getValue(), valueReference);
    }

    public String getWorkspace() {
        PointerByReference result = new PointerByReference();
        VPGDllFunctions.Instance.readString(Handle, VPGConfigTemplateProperty.Workspace.getValue(), result);
        return result.getValue().getWideString(0);
    }

    public void setWorkspace(String value) {
        Pointer valuePtr = new Memory(Native.WCHAR_SIZE * (value.length() + 1));
        valuePtr.setWideString(0, value);
        PointerByReference valueReference = new PointerByReference();
        valueReference.setValue(valuePtr);
        VPGDllFunctions.Instance.writeString(Handle, VPGConfigTemplateProperty.Workspace.getValue(), valueReference);
    }

    public boolean getIsExcludeUnittest() {
        return VPGDllFunctions.Instance.readBool(Handle, VPGConfigTemplateProperty.IsExcludeUnittest.getValue());
    }

    public void setIsExcludeUnittest(boolean value) {
        VPGDllFunctions.Instance.writeBool(Handle, VPGConfigTemplateProperty.IsExcludeUnittest.getValue(), value);
    }

    public boolean getIsExcludeVCCUnitTest() {
        return VPGDllFunctions.Instance.readBool(Handle, VPGConfigTemplateProperty.IsExcludeVCCUnitTest.getValue());
    }

    public void setIsExcludeVCCUnitTest(boolean value) {
        VPGDllFunctions.Instance.writeBool(Handle, VPGConfigTemplateProperty.IsExcludeVCCUnitTest.getValue(), value);
    }

    public boolean getIsCppCheckerEnabled() {
        return VPGDllFunctions.Instance.readBool(Handle, VPGConfigTemplateProperty.IsCppCheckerEnabled.getValue());
    }

    public void setIsCppCheckerEnabled(boolean value) {
        VPGDllFunctions.Instance.writeBool(Handle, VPGConfigTemplateProperty.IsCppCheckerEnabled.getValue(), value);
    }
    // </editor-fold>
}
