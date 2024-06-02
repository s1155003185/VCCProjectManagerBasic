package com.vcc.model.generation;

import com.sun.jna.Memory;
import com.sun.jna.Native;
import com.sun.jna.Pointer;
import com.sun.jna.ptr.PointerByReference;
import com.vcc.VPGDllFunctions;
import com.vcc.type.common.VPGGenerationOptionInterfaceType;
import com.vcc.type.generation.VPGGenerationOptionExportProperty;

public class VPGGenerationOptionExport {
    public Pointer Handle = null;

    public VPGGenerationOptionExport(Pointer handle) {
        this.Handle = handle;
    }

    public VPGGenerationOptionInterfaceType getInterface() {
        return VPGGenerationOptionInterfaceType.parse((int)VPGDllFunctions.Instance.ReadLong(Handle, VPGGenerationOptionExportProperty.Interface.getValue(), -1));
    }

    public void setInterface(VPGGenerationOptionInterfaceType value) {
        VPGDllFunctions.Instance.WriteLong(Handle, VPGGenerationOptionExportProperty.Interface.getValue(), value.getValue(), -1);
    }

    public String getWorkspace() {
        PointerByReference result = new PointerByReference();
        VPGDllFunctions.Instance.ReadString(Handle, VPGGenerationOptionExportProperty.Workspace.getValue(), result, -1);
        return result.getValue().getWideString(0);
    }

    public void setWorkspace(String value) {
        Pointer valuePtr = new Memory(Native.WCHAR_SIZE * (value.length() + 1));
        valuePtr.setWideString(0, value);
        PointerByReference valueReference = new PointerByReference();
        valueReference.setValue(valuePtr);
        VPGDllFunctions.Instance.WriteString(Handle, VPGGenerationOptionExportProperty.Workspace.getValue(), valueReference, -1);
    }

    public boolean getIsExportExternalLib() {
        return VPGDllFunctions.Instance.ReadBool(Handle, VPGGenerationOptionExportProperty.IsExportExternalLib.getValue(), -1);
    }

    public void setIsExportExternalLib(boolean value) {
        VPGDllFunctions.Instance.WriteBool(Handle, VPGGenerationOptionExportProperty.IsExportExternalLib.getValue(), value, -1);
    }

    public String getExportDirectoryDll() {
        PointerByReference result = new PointerByReference();
        VPGDllFunctions.Instance.ReadString(Handle, VPGGenerationOptionExportProperty.ExportDirectoryDll.getValue(), result, -1);
        return result.getValue().getWideString(0);
    }

    public void setExportDirectoryDll(String value) {
        Pointer valuePtr = new Memory(Native.WCHAR_SIZE * (value.length() + 1));
        valuePtr.setWideString(0, value);
        PointerByReference valueReference = new PointerByReference();
        valueReference.setValue(valuePtr);
        VPGDllFunctions.Instance.WriteString(Handle, VPGGenerationOptionExportProperty.ExportDirectoryDll.getValue(), valueReference, -1);
    }

    public String getExportDirectoryExe() {
        PointerByReference result = new PointerByReference();
        VPGDllFunctions.Instance.ReadString(Handle, VPGGenerationOptionExportProperty.ExportDirectoryExe.getValue(), result, -1);
        return result.getValue().getWideString(0);
    }

    public void setExportDirectoryExe(String value) {
        Pointer valuePtr = new Memory(Native.WCHAR_SIZE * (value.length() + 1));
        valuePtr.setWideString(0, value);
        PointerByReference valueReference = new PointerByReference();
        valueReference.setValue(valuePtr);
        VPGDllFunctions.Instance.WriteString(Handle, VPGGenerationOptionExportProperty.ExportDirectoryExe.getValue(), valueReference, -1);
    }

    public String getDllBridgeDirectory() {
        PointerByReference result = new PointerByReference();
        VPGDllFunctions.Instance.ReadString(Handle, VPGGenerationOptionExportProperty.DllBridgeDirectory.getValue(), result, -1);
        return result.getValue().getWideString(0);
    }

    public void setDllBridgeDirectory(String value) {
        Pointer valuePtr = new Memory(Native.WCHAR_SIZE * (value.length() + 1));
        valuePtr.setWideString(0, value);
        PointerByReference valueReference = new PointerByReference();
        valueReference.setValue(valuePtr);
        VPGDllFunctions.Instance.WriteString(Handle, VPGGenerationOptionExportProperty.DllBridgeDirectory.getValue(), valueReference, -1);
    }

    public String getObjectDirectory() {
        PointerByReference result = new PointerByReference();
        VPGDllFunctions.Instance.ReadString(Handle, VPGGenerationOptionExportProperty.ObjectDirectory.getValue(), result, -1);
        return result.getValue().getWideString(0);
    }

    public void setObjectDirectory(String value) {
        Pointer valuePtr = new Memory(Native.WCHAR_SIZE * (value.length() + 1));
        valuePtr.setWideString(0, value);
        PointerByReference valueReference = new PointerByReference();
        valueReference.setValue(valuePtr);
        VPGDllFunctions.Instance.WriteString(Handle, VPGGenerationOptionExportProperty.ObjectDirectory.getValue(), valueReference, -1);
    }

    public String getTypeDirectory() {
        PointerByReference result = new PointerByReference();
        VPGDllFunctions.Instance.ReadString(Handle, VPGGenerationOptionExportProperty.TypeDirectory.getValue(), result, -1);
        return result.getValue().getWideString(0);
    }

    public void setTypeDirectory(String value) {
        Pointer valuePtr = new Memory(Native.WCHAR_SIZE * (value.length() + 1));
        valuePtr.setWideString(0, value);
        PointerByReference valueReference = new PointerByReference();
        valueReference.setValue(valuePtr);
        VPGDllFunctions.Instance.WriteString(Handle, VPGGenerationOptionExportProperty.TypeDirectory.getValue(), valueReference, -1);
    }
}
