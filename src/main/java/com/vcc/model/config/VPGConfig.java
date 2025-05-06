package com.vcc.model.config;

import com.sun.jna.Memory;
import com.sun.jna.Native;
import com.sun.jna.Pointer;
import com.sun.jna.ptr.PointerByReference;
import com.vcc.VPGDllFunctions;
import com.vcc.type.VPGObjectType;
import com.vcc.type.common.VPGProjectType;
import com.vcc.type.config.VPGConfigProperty;

public class VPGConfig {

    public Pointer Handle = null;

    public VPGConfig(Pointer handle) {
        this.Handle = handle;
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Properties">
    public String getVersion() {
        PointerByReference result = new PointerByReference();
        VPGDllFunctions.Instance.ReadString(Handle, VPGConfigProperty.Version.getValue(), result);
        return result.getValue().getWideString(0);
    }

    public void setVersion(String value) {
        Pointer valuePtr = new Memory(Native.WCHAR_SIZE * (value.length() + 1));
        valuePtr.setWideString(0, value);
        PointerByReference valueReference = new PointerByReference();
        valueReference.setValue(valuePtr);
        VPGDllFunctions.Instance.WriteString(Handle, VPGConfigProperty.Version.getValue(), valueReference);
    }

    public VPGProjectType getProjectType() {
        return VPGProjectType.parse((int)VPGDllFunctions.Instance.ReadLong(Handle, VPGConfigProperty.ProjectType.getValue()));
    }

    public void setProjectType(VPGProjectType value) {
        VPGDllFunctions.Instance.WriteLong(Handle, VPGConfigProperty.ProjectType.getValue(), value.getValue());
    }

    public String getProjectPrefix() {
        PointerByReference result = new PointerByReference();
        VPGDllFunctions.Instance.ReadString(Handle, VPGConfigProperty.ProjectPrefix.getValue(), result);
        return result.getValue().getWideString(0);
    }

    public void setProjectPrefix(String value) {
        Pointer valuePtr = new Memory(Native.WCHAR_SIZE * (value.length() + 1));
        valuePtr.setWideString(0, value);
        PointerByReference valueReference = new PointerByReference();
        valueReference.setValue(valuePtr);
        VPGDllFunctions.Instance.WriteString(Handle, VPGConfigProperty.ProjectPrefix.getValue(), valueReference);
    }

    public String getProjectName() {
        PointerByReference result = new PointerByReference();
        VPGDllFunctions.Instance.ReadString(Handle, VPGConfigProperty.ProjectName.getValue(), result);
        return result.getValue().getWideString(0);
    }

    public void setProjectName(String value) {
        Pointer valuePtr = new Memory(Native.WCHAR_SIZE * (value.length() + 1));
        valuePtr.setWideString(0, value);
        PointerByReference valueReference = new PointerByReference();
        valueReference.setValue(valuePtr);
        VPGDllFunctions.Instance.WriteString(Handle, VPGConfigProperty.ProjectName.getValue(), valueReference);
    }

    public String getProjectNameDll() {
        PointerByReference result = new PointerByReference();
        VPGDllFunctions.Instance.ReadString(Handle, VPGConfigProperty.ProjectNameDll.getValue(), result);
        return result.getValue().getWideString(0);
    }

    public void setProjectNameDll(String value) {
        Pointer valuePtr = new Memory(Native.WCHAR_SIZE * (value.length() + 1));
        valuePtr.setWideString(0, value);
        PointerByReference valueReference = new PointerByReference();
        valueReference.setValue(valuePtr);
        VPGDllFunctions.Instance.WriteString(Handle, VPGConfigProperty.ProjectNameDll.getValue(), valueReference);
    }

    public String getProjectNameExe() {
        PointerByReference result = new PointerByReference();
        VPGDllFunctions.Instance.ReadString(Handle, VPGConfigProperty.ProjectNameExe.getValue(), result);
        return result.getValue().getWideString(0);
    }

    public void setProjectNameExe(String value) {
        Pointer valuePtr = new Memory(Native.WCHAR_SIZE * (value.length() + 1));
        valuePtr.setWideString(0, value);
        PointerByReference valueReference = new PointerByReference();
        valueReference.setValue(valuePtr);
        VPGDllFunctions.Instance.WriteString(Handle, VPGConfigProperty.ProjectNameExe.getValue(), valueReference);
    }

    public boolean getIsGit() {
        return VPGDllFunctions.Instance.ReadBool(Handle, VPGConfigProperty.IsGit.getValue());
    }

    public void setIsGit(boolean value) {
        VPGDllFunctions.Instance.WriteBool(Handle, VPGConfigProperty.IsGit.getValue(), value);
    }

    public VPGConfigTemplate getTemplate() {
        return new VPGConfigTemplate(VPGDllFunctions.Instance.ReadObject(Handle, VPGConfigProperty.Template.getValue()));
    }

    public void setTemplate(VPGConfigTemplate value) {
        VPGDllFunctions.Instance.WriteObject(Handle, VPGConfigProperty.Template.getValue(), value.Handle);
    }

    public VPGConfigBehavior getBehavior() {
        return new VPGConfigBehavior(VPGDllFunctions.Instance.ReadObject(Handle, VPGConfigProperty.Behavior.getValue()));
    }

    public void setBehavior(VPGConfigBehavior value) {
        VPGDllFunctions.Instance.WriteObject(Handle, VPGConfigProperty.Behavior.getValue(), value.Handle);
    }

    public VPGConfigInput getInput() {
        return new VPGConfigInput(VPGDllFunctions.Instance.ReadObject(Handle, VPGConfigProperty.Input.getValue()));
    }

    public void setInput(VPGConfigInput value) {
        VPGDllFunctions.Instance.WriteObject(Handle, VPGConfigProperty.Input.getValue(), value.Handle);
    }

    public VPGConfigOutput getOutput() {
        return new VPGConfigOutput(VPGDllFunctions.Instance.ReadObject(Handle, VPGConfigProperty.Ouput.getValue()));
    }

    public void setOutput(VPGConfigOutput value) {
        VPGDllFunctions.Instance.WriteObject(Handle, VPGConfigProperty.Ouput.getValue(), value.Handle);
    }

    public long getPluginsCount() {
        return VPGDllFunctions.Instance.GetCount(Handle, VPGConfigProperty.Plugins.getValue());
    }

    public String getPluginsAtIndex(long index) {
        PointerByReference result = new PointerByReference();
        VPGDllFunctions.Instance.ReadStringAtIndex(Handle, VPGConfigProperty.Plugins.getValue(), result, index);
        return result.getValue().getWideString(0);
    }

    public void setPluginsAtIndex(long index, String value) {
        Pointer valuePtr = new Memory(Native.WCHAR_SIZE * (value.length() + 1));
        valuePtr.setWideString(0, value);
        PointerByReference valueReference = new PointerByReference();
        valueReference.setValue(valuePtr);
        VPGDllFunctions.Instance.WriteStringAtIndex(Handle, VPGConfigProperty.Plugins.getValue(), valueReference, index);
    }

    public void insertPlugins(String value) {
        insertPluginsAtIndex(-1, value);
    }

    public void insertPluginsAtIndex(long index, String value) {
        Pointer valuePtr = new Memory(Native.WCHAR_SIZE * (value.length() + 1));
        valuePtr.setWideString(0, value);
        PointerByReference valueReference = new PointerByReference();
        valueReference.setValue(valuePtr);
        VPGDllFunctions.Instance.InsertStringAtIndex(Handle, VPGConfigProperty.Plugins.getValue(), valueReference, index);
    }

    public void removePluginsAtIndex(long index) {
        VPGDllFunctions.Instance.RemoveAtIndex(Handle, VPGConfigProperty.Plugins.getValue(), index);
    }

    public void clearPlugins() {
        VPGDllFunctions.Instance.Clear(Handle, VPGConfigProperty.Plugins.getValue());
    }

    public long getExportsCount() {
        return VPGDllFunctions.Instance.GetCount(Handle, VPGConfigProperty.Exports.getValue());
    }

    public VPGConfigExport getExportsAtIndex(long index) {
        return new VPGConfigExport(VPGDllFunctions.Instance.ReadObjectAtIndex(Handle, VPGConfigProperty.Exports.getValue(), index));
    }

    public void setExportsAtIndex(long index, VPGConfigExport value) {
        VPGDllFunctions.Instance.WriteObjectAtIndex(Handle, VPGConfigProperty.Exports.getValue(), value.Handle, index);
    }

    public VPGConfigExport addExports() {
        return addExportsAtIndex(-1);
    }

    public VPGConfigExport addExportsAtIndex(long index) {
        return new VPGConfigExport(VPGDllFunctions.Instance.AddObjectAtIndex(Handle, VPGConfigProperty.Exports.getValue(), VPGObjectType.ConfigExport.getValue(), index));
    }

    public void insertExports(VPGConfigExport value) {
        insertExportsAtIndex(-1, value);
    }

    public void insertExportsAtIndex(long index, VPGConfigExport value) {
        VPGDllFunctions.Instance.InsertObjectAtIndex(Handle, VPGConfigProperty.Exports.getValue(), value.Handle, index);
    }

    public void removeExports(VPGConfigExport value) {
        VPGDllFunctions.Instance.RemoveObject(Handle, VPGConfigProperty.Exports.getValue(), value.Handle);
    }

    public void removeExportsAtIndex(long index) {
        VPGDllFunctions.Instance.RemoveAtIndex(Handle, VPGConfigProperty.Exports.getValue(), index);
    }

    public void clearExports() {
        VPGDllFunctions.Instance.Clear(Handle, VPGConfigProperty.Exports.getValue());
    }
    // </editor-fold>
}
