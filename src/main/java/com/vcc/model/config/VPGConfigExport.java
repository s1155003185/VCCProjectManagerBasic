package com.vcc.model.config;

import com.sun.jna.Memory;
import com.sun.jna.Native;
import com.sun.jna.Pointer;
import com.sun.jna.ptr.PointerByReference;
import com.vcc.VPGDllFunctions;
import com.vcc.type.common.VPGConfigInterfaceType;
import com.vcc.type.config.VPGConfigExportProperty;

public class VPGConfigExport {

    public Pointer Handle = null;

    public VPGConfigExport(Pointer handle) {
        this.Handle = handle;
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Properties">
    public VPGConfigInterfaceType getInterface() {
        return VPGConfigInterfaceType.parse((int)VPGDllFunctions.Instance.ReadLong(Handle, VPGConfigExportProperty.Interface.getValue()));
    }

    public void setInterface(VPGConfigInterfaceType value) {
        VPGDllFunctions.Instance.WriteLong(Handle, VPGConfigExportProperty.Interface.getValue(), value.getValue());
    }

    public String getWorkspace() {
        PointerByReference result = new PointerByReference();
        VPGDllFunctions.Instance.ReadString(Handle, VPGConfigExportProperty.Workspace.getValue(), result);
        return result.getValue().getWideString(0);
    }

    public void setWorkspace(String value) {
        Pointer valuePtr = new Memory(Native.WCHAR_SIZE * (value.length() + 1));
        valuePtr.setWideString(0, value);
        PointerByReference valueReference = new PointerByReference();
        valueReference.setValue(valuePtr);
        VPGDllFunctions.Instance.WriteString(Handle, VPGConfigExportProperty.Workspace.getValue(), valueReference);
    }

    public boolean getIsExportExternalLib() {
        return VPGDllFunctions.Instance.ReadBool(Handle, VPGConfigExportProperty.IsExportExternalLib.getValue());
    }

    public void setIsExportExternalLib(boolean value) {
        VPGDllFunctions.Instance.WriteBool(Handle, VPGConfigExportProperty.IsExportExternalLib.getValue(), value);
    }

    public String getExportDirectoryDll() {
        PointerByReference result = new PointerByReference();
        VPGDllFunctions.Instance.ReadString(Handle, VPGConfigExportProperty.ExportDirectoryDll.getValue(), result);
        return result.getValue().getWideString(0);
    }

    public void setExportDirectoryDll(String value) {
        Pointer valuePtr = new Memory(Native.WCHAR_SIZE * (value.length() + 1));
        valuePtr.setWideString(0, value);
        PointerByReference valueReference = new PointerByReference();
        valueReference.setValue(valuePtr);
        VPGDllFunctions.Instance.WriteString(Handle, VPGConfigExportProperty.ExportDirectoryDll.getValue(), valueReference);
    }

    public String getExportDirectoryExe() {
        PointerByReference result = new PointerByReference();
        VPGDllFunctions.Instance.ReadString(Handle, VPGConfigExportProperty.ExportDirectoryExe.getValue(), result);
        return result.getValue().getWideString(0);
    }

    public void setExportDirectoryExe(String value) {
        Pointer valuePtr = new Memory(Native.WCHAR_SIZE * (value.length() + 1));
        valuePtr.setWideString(0, value);
        PointerByReference valueReference = new PointerByReference();
        valueReference.setValue(valuePtr);
        VPGDllFunctions.Instance.WriteString(Handle, VPGConfigExportProperty.ExportDirectoryExe.getValue(), valueReference);
    }

    public String getDllBridgeDirectory() {
        PointerByReference result = new PointerByReference();
        VPGDllFunctions.Instance.ReadString(Handle, VPGConfigExportProperty.DllBridgeDirectory.getValue(), result);
        return result.getValue().getWideString(0);
    }

    public void setDllBridgeDirectory(String value) {
        Pointer valuePtr = new Memory(Native.WCHAR_SIZE * (value.length() + 1));
        valuePtr.setWideString(0, value);
        PointerByReference valueReference = new PointerByReference();
        valueReference.setValue(valuePtr);
        VPGDllFunctions.Instance.WriteString(Handle, VPGConfigExportProperty.DllBridgeDirectory.getValue(), valueReference);
    }

    public String getFormDirectory() {
        PointerByReference result = new PointerByReference();
        VPGDllFunctions.Instance.ReadString(Handle, VPGConfigExportProperty.FormDirectory.getValue(), result);
        return result.getValue().getWideString(0);
    }

    public void setFormDirectory(String value) {
        Pointer valuePtr = new Memory(Native.WCHAR_SIZE * (value.length() + 1));
        valuePtr.setWideString(0, value);
        PointerByReference valueReference = new PointerByReference();
        valueReference.setValue(valuePtr);
        VPGDllFunctions.Instance.WriteString(Handle, VPGConfigExportProperty.FormDirectory.getValue(), valueReference);
    }

    public String getObjectDirectory() {
        PointerByReference result = new PointerByReference();
        VPGDllFunctions.Instance.ReadString(Handle, VPGConfigExportProperty.ObjectDirectory.getValue(), result);
        return result.getValue().getWideString(0);
    }

    public void setObjectDirectory(String value) {
        Pointer valuePtr = new Memory(Native.WCHAR_SIZE * (value.length() + 1));
        valuePtr.setWideString(0, value);
        PointerByReference valueReference = new PointerByReference();
        valueReference.setValue(valuePtr);
        VPGDllFunctions.Instance.WriteString(Handle, VPGConfigExportProperty.ObjectDirectory.getValue(), valueReference);
    }

    public String getTypeDirectory() {
        PointerByReference result = new PointerByReference();
        VPGDllFunctions.Instance.ReadString(Handle, VPGConfigExportProperty.TypeDirectory.getValue(), result);
        return result.getValue().getWideString(0);
    }

    public void setTypeDirectory(String value) {
        Pointer valuePtr = new Memory(Native.WCHAR_SIZE * (value.length() + 1));
        valuePtr.setWideString(0, value);
        PointerByReference valueReference = new PointerByReference();
        valueReference.setValue(valuePtr);
        VPGDllFunctions.Instance.WriteString(Handle, VPGConfigExportProperty.TypeDirectory.getValue(), valueReference);
    }
    // </editor-fold>
}
