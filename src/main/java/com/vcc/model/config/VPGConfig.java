package com.vcc.model.config;

import com.sun.jna.Memory;
import com.sun.jna.Native;
import com.sun.jna.Pointer;
import com.sun.jna.ptr.PointerByReference;
import com.vcc.VPGDllFunctions;
import com.vcc.type.VPGObjectType;
import com.vcc.type.config.VPGConfigProperty;
import com.vcc.type.enumtype.VPGConfigActionHistoryType;
import com.vcc.type.enumtype.VPGProjectType;

public class VPGConfig {

    public Pointer Handle = null;

    public VPGConfig(Pointer handle) {
        this.Handle = handle;
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Properties">
    public String getVersion() {
        PointerByReference result = new PointerByReference();
        VPGDllFunctions.Instance.readString(Handle, VPGConfigProperty.Version.getValue(), result);
        return result.getValue().getWideString(0);
    }

    public void setVersion(String value) {
        Pointer valuePtr = new Memory(Native.WCHAR_SIZE * (value.length() + 1));
        valuePtr.setWideString(0, value);
        PointerByReference valueReference = new PointerByReference();
        valueReference.setValue(valuePtr);
        VPGDllFunctions.Instance.writeString(Handle, VPGConfigProperty.Version.getValue(), valueReference);
    }

    public VPGProjectType getProjectType() {
        return VPGProjectType.parse((int)VPGDllFunctions.Instance.readLong(Handle, VPGConfigProperty.ProjectType.getValue()));
    }

    public void setProjectType(VPGProjectType value) {
        VPGDllFunctions.Instance.writeLong(Handle, VPGConfigProperty.ProjectType.getValue(), value.getValue());
    }

    public String getProjectPrefix() {
        PointerByReference result = new PointerByReference();
        VPGDllFunctions.Instance.readString(Handle, VPGConfigProperty.ProjectPrefix.getValue(), result);
        return result.getValue().getWideString(0);
    }

    public void setProjectPrefix(String value) {
        Pointer valuePtr = new Memory(Native.WCHAR_SIZE * (value.length() + 1));
        valuePtr.setWideString(0, value);
        PointerByReference valueReference = new PointerByReference();
        valueReference.setValue(valuePtr);
        VPGDllFunctions.Instance.writeString(Handle, VPGConfigProperty.ProjectPrefix.getValue(), valueReference);
    }

    public String getProjectName() {
        PointerByReference result = new PointerByReference();
        VPGDllFunctions.Instance.readString(Handle, VPGConfigProperty.ProjectName.getValue(), result);
        return result.getValue().getWideString(0);
    }

    public void setProjectName(String value) {
        Pointer valuePtr = new Memory(Native.WCHAR_SIZE * (value.length() + 1));
        valuePtr.setWideString(0, value);
        PointerByReference valueReference = new PointerByReference();
        valueReference.setValue(valuePtr);
        VPGDllFunctions.Instance.writeString(Handle, VPGConfigProperty.ProjectName.getValue(), valueReference);
    }

    public String getProjectNameDll() {
        PointerByReference result = new PointerByReference();
        VPGDllFunctions.Instance.readString(Handle, VPGConfigProperty.ProjectNameDll.getValue(), result);
        return result.getValue().getWideString(0);
    }

    public void setProjectNameDll(String value) {
        Pointer valuePtr = new Memory(Native.WCHAR_SIZE * (value.length() + 1));
        valuePtr.setWideString(0, value);
        PointerByReference valueReference = new PointerByReference();
        valueReference.setValue(valuePtr);
        VPGDllFunctions.Instance.writeString(Handle, VPGConfigProperty.ProjectNameDll.getValue(), valueReference);
    }

    public String getProjectNameExe() {
        PointerByReference result = new PointerByReference();
        VPGDllFunctions.Instance.readString(Handle, VPGConfigProperty.ProjectNameExe.getValue(), result);
        return result.getValue().getWideString(0);
    }

    public void setProjectNameExe(String value) {
        Pointer valuePtr = new Memory(Native.WCHAR_SIZE * (value.length() + 1));
        valuePtr.setWideString(0, value);
        PointerByReference valueReference = new PointerByReference();
        valueReference.setValue(valuePtr);
        VPGDllFunctions.Instance.writeString(Handle, VPGConfigProperty.ProjectNameExe.getValue(), valueReference);
    }

    public boolean getIsGit() {
        return VPGDllFunctions.Instance.readBool(Handle, VPGConfigProperty.IsGit.getValue());
    }

    public void setIsGit(boolean value) {
        VPGDllFunctions.Instance.writeBool(Handle, VPGConfigProperty.IsGit.getValue(), value);
    }

    public VPGConfigTemplate getTemplate() {
        return new VPGConfigTemplate(VPGDllFunctions.Instance.readObject(Handle, VPGConfigProperty.Template.getValue()));
    }

    public void setTemplate(VPGConfigTemplate value) {
        VPGDllFunctions.Instance.writeObject(Handle, VPGConfigProperty.Template.getValue(), value.Handle);
    }

    public String getTemplateUrl() {
        PointerByReference result = new PointerByReference();
        VPGDllFunctions.Instance.readString(Handle, VPGConfigProperty.TemplateUrl.getValue(), result);
        return result.getValue().getWideString(0);
    }

    public String getTemplateWorkspace() {
        PointerByReference result = new PointerByReference();
        VPGDllFunctions.Instance.readString(Handle, VPGConfigProperty.TemplateWorkspace.getValue(), result);
        return result.getValue().getWideString(0);
    }

    public boolean getTemplateIsExcludeUnittest() {
        return VPGDllFunctions.Instance.readBool(Handle, VPGConfigProperty.TemplateIsExcludeUnittest.getValue());
    }

    public boolean getTemplateIsExcludeVCCUnitTest() {
        return VPGDllFunctions.Instance.readBool(Handle, VPGConfigProperty.TemplateIsExcludeVCCUnitTest.getValue());
    }

    public VPGConfigBehavior getBehavior() {
        return new VPGConfigBehavior(VPGDllFunctions.Instance.readObject(Handle, VPGConfigProperty.Behavior.getValue()));
    }

    public void setBehavior(VPGConfigBehavior value) {
        VPGDllFunctions.Instance.writeObject(Handle, VPGConfigProperty.Behavior.getValue(), value.Handle);
    }

    public VPGConfigActionHistoryType getBehaviorActionHistoryType() {
        return VPGConfigActionHistoryType.parse((int)VPGDllFunctions.Instance.readLong(Handle, VPGConfigProperty.BehaviorActionHistoryType.getValue()));
    }

    public boolean getBehaviorIsActionResultThrowException() {
        return VPGDllFunctions.Instance.readBool(Handle, VPGConfigProperty.BehaviorIsActionResultThrowException.getValue());
    }

    public VPGConfigInput getInput() {
        return new VPGConfigInput(VPGDllFunctions.Instance.readObject(Handle, VPGConfigProperty.Input.getValue()));
    }

    public void setInput(VPGConfigInput value) {
        VPGDllFunctions.Instance.writeObject(Handle, VPGConfigProperty.Input.getValue(), value.Handle);
    }

    public String getInputTypeWorkspace() {
        PointerByReference result = new PointerByReference();
        VPGDllFunctions.Instance.readString(Handle, VPGConfigProperty.InputTypeWorkspace.getValue(), result);
        return result.getValue().getWideString(0);
    }

    public VPGConfigOutput getOutput() {
        return new VPGConfigOutput(VPGDllFunctions.Instance.readObject(Handle, VPGConfigProperty.Output.getValue()));
    }

    public void setOutput(VPGConfigOutput value) {
        VPGDllFunctions.Instance.writeObject(Handle, VPGConfigProperty.Output.getValue(), value.Handle);
    }

    public String getOutputExceptionTypeDirectory() {
        PointerByReference result = new PointerByReference();
        VPGDllFunctions.Instance.readString(Handle, VPGConfigProperty.OutputExceptionTypeDirectory.getValue(), result);
        return result.getValue().getWideString(0);
    }

    public String getOutputObjectTypeDirectory() {
        PointerByReference result = new PointerByReference();
        VPGDllFunctions.Instance.readString(Handle, VPGConfigProperty.OutputObjectTypeDirectory.getValue(), result);
        return result.getValue().getWideString(0);
    }

    public String getOutputApplicationDirectoryHpp() {
        PointerByReference result = new PointerByReference();
        VPGDllFunctions.Instance.readString(Handle, VPGConfigProperty.OutputApplicationDirectoryHpp.getValue(), result);
        return result.getValue().getWideString(0);
    }

    public String getOutputApplicationDirectoryCpp() {
        PointerByReference result = new PointerByReference();
        VPGDllFunctions.Instance.readString(Handle, VPGConfigProperty.OutputApplicationDirectoryCpp.getValue(), result);
        return result.getValue().getWideString(0);
    }

    public String getOutputActionDirectoryHpp() {
        PointerByReference result = new PointerByReference();
        VPGDllFunctions.Instance.readString(Handle, VPGConfigProperty.OutputActionDirectoryHpp.getValue(), result);
        return result.getValue().getWideString(0);
    }

    public String getOutputActionDirectoryCpp() {
        PointerByReference result = new PointerByReference();
        VPGDllFunctions.Instance.readString(Handle, VPGConfigProperty.OutputActionDirectoryCpp.getValue(), result);
        return result.getValue().getWideString(0);
    }

    public String getOutputFormDirectoryHpp() {
        PointerByReference result = new PointerByReference();
        VPGDllFunctions.Instance.readString(Handle, VPGConfigProperty.OutputFormDirectoryHpp.getValue(), result);
        return result.getValue().getWideString(0);
    }

    public String getOutputFormDirectoryCpp() {
        PointerByReference result = new PointerByReference();
        VPGDllFunctions.Instance.readString(Handle, VPGConfigProperty.OutputFormDirectoryCpp.getValue(), result);
        return result.getValue().getWideString(0);
    }

    public String getOutputObjectDirectoryHpp() {
        PointerByReference result = new PointerByReference();
        VPGDllFunctions.Instance.readString(Handle, VPGConfigProperty.OutputObjectDirectoryHpp.getValue(), result);
        return result.getValue().getWideString(0);
    }

    public String getOutputObjectDirectoryCpp() {
        PointerByReference result = new PointerByReference();
        VPGDllFunctions.Instance.readString(Handle, VPGConfigProperty.OutputObjectDirectoryCpp.getValue(), result);
        return result.getValue().getWideString(0);
    }

    public String getOutputPropertyAccessorDirectoryHpp() {
        PointerByReference result = new PointerByReference();
        VPGDllFunctions.Instance.readString(Handle, VPGConfigProperty.OutputPropertyAccessorDirectoryHpp.getValue(), result);
        return result.getValue().getWideString(0);
    }

    public String getOutputPropertyAccessorDirectoryCpp() {
        PointerByReference result = new PointerByReference();
        VPGDllFunctions.Instance.readString(Handle, VPGConfigProperty.OutputPropertyAccessorDirectoryCpp.getValue(), result);
        return result.getValue().getWideString(0);
    }

    public String getOutputObjectFactoryDirectoryHpp() {
        PointerByReference result = new PointerByReference();
        VPGDllFunctions.Instance.readString(Handle, VPGConfigProperty.OutputObjectFactoryDirectoryHpp.getValue(), result);
        return result.getValue().getWideString(0);
    }

    public String getOutputObjectFactoryDirectoryCpp() {
        PointerByReference result = new PointerByReference();
        VPGDllFunctions.Instance.readString(Handle, VPGConfigProperty.OutputObjectFactoryDirectoryCpp.getValue(), result);
        return result.getValue().getWideString(0);
    }

    public String getOutputPropertyAccessorFactoryDirectoryHpp() {
        PointerByReference result = new PointerByReference();
        VPGDllFunctions.Instance.readString(Handle, VPGConfigProperty.OutputPropertyAccessorFactoryDirectoryHpp.getValue(), result);
        return result.getValue().getWideString(0);
    }

    public String getOutputPropertyAccessorFactoryDirectoryCpp() {
        PointerByReference result = new PointerByReference();
        VPGDllFunctions.Instance.readString(Handle, VPGConfigProperty.OutputPropertyAccessorFactoryDirectoryCpp.getValue(), result);
        return result.getValue().getWideString(0);
    }

    public String getOutputUnittestActionDirectoryCpp() {
        PointerByReference result = new PointerByReference();
        VPGDllFunctions.Instance.readString(Handle, VPGConfigProperty.OutputUnittestActionDirectoryCpp.getValue(), result);
        return result.getValue().getWideString(0);
    }

    public long getPluginsCount() {
        return VPGDllFunctions.Instance.getCount(Handle, VPGConfigProperty.Plugins.getValue());
    }

    public String getPluginsAtIndex(long index) {
        PointerByReference result = new PointerByReference();
        VPGDllFunctions.Instance.readStringAtIndex(Handle, VPGConfigProperty.Plugins.getValue(), result, index);
        return result.getValue().getWideString(0);
    }

    public void setPluginsAtIndex(long index, String value) {
        Pointer valuePtr = new Memory(Native.WCHAR_SIZE * (value.length() + 1));
        valuePtr.setWideString(0, value);
        PointerByReference valueReference = new PointerByReference();
        valueReference.setValue(valuePtr);
        VPGDllFunctions.Instance.writeStringAtIndex(Handle, VPGConfigProperty.Plugins.getValue(), valueReference, index);
    }

    public void insertPlugins(String value) {
        insertPluginsAtIndex(-1, value);
    }

    public void insertPluginsAtIndex(long index, String value) {
        Pointer valuePtr = new Memory(Native.WCHAR_SIZE * (value.length() + 1));
        valuePtr.setWideString(0, value);
        PointerByReference valueReference = new PointerByReference();
        valueReference.setValue(valuePtr);
        VPGDllFunctions.Instance.insertStringAtIndex(Handle, VPGConfigProperty.Plugins.getValue(), valueReference, index);
    }

    public void removePluginsAtIndex(long index) {
        VPGDllFunctions.Instance.removeAtIndex(Handle, VPGConfigProperty.Plugins.getValue(), index);
    }

    public void clearPlugins() {
        VPGDllFunctions.Instance.clear(Handle, VPGConfigProperty.Plugins.getValue());
    }

    public long getExportsCount() {
        return VPGDllFunctions.Instance.getCount(Handle, VPGConfigProperty.Exports.getValue());
    }

    public VPGConfigExport getExportsAtIndex(long index) {
        return new VPGConfigExport(VPGDllFunctions.Instance.readObjectAtIndex(Handle, VPGConfigProperty.Exports.getValue(), index));
    }

    public void setExportsAtIndex(long index, VPGConfigExport value) {
        VPGDllFunctions.Instance.writeObjectAtIndex(Handle, VPGConfigProperty.Exports.getValue(), value.Handle, index);
    }

    public VPGConfigExport addExports() {
        return addExportsAtIndex(-1);
    }

    public VPGConfigExport addExportsAtIndex(long index) {
        return new VPGConfigExport(VPGDllFunctions.Instance.addObjectAtIndex(Handle, VPGConfigProperty.Exports.getValue(), VPGObjectType.ConfigExport.getValue(), index));
    }

    public void insertExports(VPGConfigExport value) {
        insertExportsAtIndex(-1, value);
    }

    public void insertExportsAtIndex(long index, VPGConfigExport value) {
        VPGDllFunctions.Instance.insertObjectAtIndex(Handle, VPGConfigProperty.Exports.getValue(), value.Handle, index);
    }

    public void removeExports(VPGConfigExport value) {
        VPGDllFunctions.Instance.removeObject(Handle, VPGConfigProperty.Exports.getValue(), value.Handle);
    }

    public void removeExportsAtIndex(long index) {
        VPGDllFunctions.Instance.removeAtIndex(Handle, VPGConfigProperty.Exports.getValue(), index);
    }

    public void clearExports() {
        VPGDllFunctions.Instance.clear(Handle, VPGConfigProperty.Exports.getValue());
    }
    // </editor-fold>
}
