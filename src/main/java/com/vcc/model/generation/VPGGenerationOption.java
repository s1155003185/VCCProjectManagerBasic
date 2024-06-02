package com.vcc.model.generation;

import com.sun.jna.Memory;
import com.sun.jna.Native;
import com.sun.jna.Pointer;
import com.sun.jna.ptr.PointerByReference;
import com.vcc.VPGDllFunctions;
import com.vcc.type.VPGObjectType;
import com.vcc.type.common.VPGProjectType;
import com.vcc.type.generation.VPGGenerationOptionProperty;

public class VPGGenerationOption {
    public Pointer Handle = null;

    public VPGGenerationOption(Pointer handle) {
        this.Handle = handle;
    }

    public String getVersion() {
        PointerByReference result = new PointerByReference();
        VPGDllFunctions.Instance.ReadString(Handle, VPGGenerationOptionProperty.Version.getValue(), result, -1);
        return result.getValue().getWideString(0);
    }

    public void setVersion(String value) {
        Pointer valuePtr = new Memory(Native.WCHAR_SIZE * (value.length() + 1));
        valuePtr.setWideString(0, value);
        PointerByReference valueReference = new PointerByReference();
        valueReference.setValue(valuePtr);
        VPGDllFunctions.Instance.WriteString(Handle, VPGGenerationOptionProperty.Version.getValue(), valueReference, -1);
    }

    public VPGProjectType getProjectType() {
        return VPGProjectType.parse((int)VPGDllFunctions.Instance.ReadLong(Handle, VPGGenerationOptionProperty.ProjectType.getValue(), -1));
    }

    public void setProjectType(VPGProjectType value) {
        VPGDllFunctions.Instance.WriteLong(Handle, VPGGenerationOptionProperty.ProjectType.getValue(), value.getValue(), -1);
    }

    public String getTemplateGitUrl() {
        PointerByReference result = new PointerByReference();
        VPGDllFunctions.Instance.ReadString(Handle, VPGGenerationOptionProperty.TemplateGitUrl.getValue(), result, -1);
        return result.getValue().getWideString(0);
    }

    public void setTemplateGitUrl(String value) {
        Pointer valuePtr = new Memory(Native.WCHAR_SIZE * (value.length() + 1));
        valuePtr.setWideString(0, value);
        PointerByReference valueReference = new PointerByReference();
        valueReference.setValue(valuePtr);
        VPGDllFunctions.Instance.WriteString(Handle, VPGGenerationOptionProperty.TemplateGitUrl.getValue(), valueReference, -1);
    }

    public String getTemplateWorkspace() {
        PointerByReference result = new PointerByReference();
        VPGDllFunctions.Instance.ReadString(Handle, VPGGenerationOptionProperty.TemplateWorkspace.getValue(), result, -1);
        return result.getValue().getWideString(0);
    }

    public void setTemplateWorkspace(String value) {
        Pointer valuePtr = new Memory(Native.WCHAR_SIZE * (value.length() + 1));
        valuePtr.setWideString(0, value);
        PointerByReference valueReference = new PointerByReference();
        valueReference.setValue(valuePtr);
        VPGDllFunctions.Instance.WriteString(Handle, VPGGenerationOptionProperty.TemplateWorkspace.getValue(), valueReference, -1);
    }

    public String getProjectPrefix() {
        PointerByReference result = new PointerByReference();
        VPGDllFunctions.Instance.ReadString(Handle, VPGGenerationOptionProperty.ProjectPrefix.getValue(), result, -1);
        return result.getValue().getWideString(0);
    }

    public void setProjectPrefix(String value) {
        Pointer valuePtr = new Memory(Native.WCHAR_SIZE * (value.length() + 1));
        valuePtr.setWideString(0, value);
        PointerByReference valueReference = new PointerByReference();
        valueReference.setValue(valuePtr);
        VPGDllFunctions.Instance.WriteString(Handle, VPGGenerationOptionProperty.ProjectPrefix.getValue(), valueReference, -1);
    }

    public String getProjectName() {
        PointerByReference result = new PointerByReference();
        VPGDllFunctions.Instance.ReadString(Handle, VPGGenerationOptionProperty.ProjectName.getValue(), result, -1);
        return result.getValue().getWideString(0);
    }

    public void setProjectName(String value) {
        Pointer valuePtr = new Memory(Native.WCHAR_SIZE * (value.length() + 1));
        valuePtr.setWideString(0, value);
        PointerByReference valueReference = new PointerByReference();
        valueReference.setValue(valuePtr);
        VPGDllFunctions.Instance.WriteString(Handle, VPGGenerationOptionProperty.ProjectName.getValue(), valueReference, -1);
    }

    public String getProjectNameDll() {
        PointerByReference result = new PointerByReference();
        VPGDllFunctions.Instance.ReadString(Handle, VPGGenerationOptionProperty.ProjectNameDll.getValue(), result, -1);
        return result.getValue().getWideString(0);
    }

    public void setProjectNameDll(String value) {
        Pointer valuePtr = new Memory(Native.WCHAR_SIZE * (value.length() + 1));
        valuePtr.setWideString(0, value);
        PointerByReference valueReference = new PointerByReference();
        valueReference.setValue(valuePtr);
        VPGDllFunctions.Instance.WriteString(Handle, VPGGenerationOptionProperty.ProjectNameDll.getValue(), valueReference, -1);
    }

    public String getProjectNameExe() {
        PointerByReference result = new PointerByReference();
        VPGDllFunctions.Instance.ReadString(Handle, VPGGenerationOptionProperty.ProjectNameExe.getValue(), result, -1);
        return result.getValue().getWideString(0);
    }

    public void setProjectNameExe(String value) {
        Pointer valuePtr = new Memory(Native.WCHAR_SIZE * (value.length() + 1));
        valuePtr.setWideString(0, value);
        PointerByReference valueReference = new PointerByReference();
        valueReference.setValue(valuePtr);
        VPGDllFunctions.Instance.WriteString(Handle, VPGGenerationOptionProperty.ProjectNameExe.getValue(), valueReference, -1);
    }

    public boolean getIsGit() {
        return VPGDllFunctions.Instance.ReadBool(Handle, VPGGenerationOptionProperty.IsGit.getValue(), -1);
    }

    public void setIsGit(boolean value) {
        VPGDllFunctions.Instance.WriteBool(Handle, VPGGenerationOptionProperty.IsGit.getValue(), value, -1);
    }

    public boolean getIsExcludeUnittest() {
        return VPGDllFunctions.Instance.ReadBool(Handle, VPGGenerationOptionProperty.IsExcludeUnittest.getValue(), -1);
    }

    public void setIsExcludeUnittest(boolean value) {
        VPGDllFunctions.Instance.WriteBool(Handle, VPGGenerationOptionProperty.IsExcludeUnittest.getValue(), value, -1);
    }

    public boolean getIsExcludeVCCUnitTest() {
        return VPGDllFunctions.Instance.ReadBool(Handle, VPGGenerationOptionProperty.IsExcludeVCCUnitTest.getValue(), -1);
    }

    public void setIsExcludeVCCUnitTest(boolean value) {
        VPGDllFunctions.Instance.WriteBool(Handle, VPGGenerationOptionProperty.IsExcludeVCCUnitTest.getValue(), value, -1);
    }

    public String getTypeWorkspace() {
        PointerByReference result = new PointerByReference();
        VPGDllFunctions.Instance.ReadString(Handle, VPGGenerationOptionProperty.TypeWorkspace.getValue(), result, -1);
        return result.getValue().getWideString(0);
    }

    public void setTypeWorkspace(String value) {
        Pointer valuePtr = new Memory(Native.WCHAR_SIZE * (value.length() + 1));
        valuePtr.setWideString(0, value);
        PointerByReference valueReference = new PointerByReference();
        valueReference.setValue(valuePtr);
        VPGDllFunctions.Instance.WriteString(Handle, VPGGenerationOptionProperty.TypeWorkspace.getValue(), valueReference, -1);
    }

    public String getActionTypeDirectory() {
        PointerByReference result = new PointerByReference();
        VPGDllFunctions.Instance.ReadString(Handle, VPGGenerationOptionProperty.ActionTypeDirectory.getValue(), result, -1);
        return result.getValue().getWideString(0);
    }

    public void setActionTypeDirectory(String value) {
        Pointer valuePtr = new Memory(Native.WCHAR_SIZE * (value.length() + 1));
        valuePtr.setWideString(0, value);
        PointerByReference valueReference = new PointerByReference();
        valueReference.setValue(valuePtr);
        VPGDllFunctions.Instance.WriteString(Handle, VPGGenerationOptionProperty.ActionTypeDirectory.getValue(), valueReference, -1);
    }

    public String getExceptionTypeDirectory() {
        PointerByReference result = new PointerByReference();
        VPGDllFunctions.Instance.ReadString(Handle, VPGGenerationOptionProperty.ExceptionTypeDirectory.getValue(), result, -1);
        return result.getValue().getWideString(0);
    }

    public void setExceptionTypeDirectory(String value) {
        Pointer valuePtr = new Memory(Native.WCHAR_SIZE * (value.length() + 1));
        valuePtr.setWideString(0, value);
        PointerByReference valueReference = new PointerByReference();
        valueReference.setValue(valuePtr);
        VPGDllFunctions.Instance.WriteString(Handle, VPGGenerationOptionProperty.ExceptionTypeDirectory.getValue(), valueReference, -1);
    }

    public String getManagerTypeDirectory() {
        PointerByReference result = new PointerByReference();
        VPGDllFunctions.Instance.ReadString(Handle, VPGGenerationOptionProperty.ManagerTypeDirectory.getValue(), result, -1);
        return result.getValue().getWideString(0);
    }

    public void setManagerTypeDirectory(String value) {
        Pointer valuePtr = new Memory(Native.WCHAR_SIZE * (value.length() + 1));
        valuePtr.setWideString(0, value);
        PointerByReference valueReference = new PointerByReference();
        valueReference.setValue(valuePtr);
        VPGDllFunctions.Instance.WriteString(Handle, VPGGenerationOptionProperty.ManagerTypeDirectory.getValue(), valueReference, -1);
    }

    public String getObjectTypeDirectory() {
        PointerByReference result = new PointerByReference();
        VPGDllFunctions.Instance.ReadString(Handle, VPGGenerationOptionProperty.ObjectTypeDirectory.getValue(), result, -1);
        return result.getValue().getWideString(0);
    }

    public void setObjectTypeDirectory(String value) {
        Pointer valuePtr = new Memory(Native.WCHAR_SIZE * (value.length() + 1));
        valuePtr.setWideString(0, value);
        PointerByReference valueReference = new PointerByReference();
        valueReference.setValue(valuePtr);
        VPGDllFunctions.Instance.WriteString(Handle, VPGGenerationOptionProperty.ObjectTypeDirectory.getValue(), valueReference, -1);
    }

    public String getObjectDirectoryHpp() {
        PointerByReference result = new PointerByReference();
        VPGDllFunctions.Instance.ReadString(Handle, VPGGenerationOptionProperty.ObjectDirectoryHpp.getValue(), result, -1);
        return result.getValue().getWideString(0);
    }

    public void setObjectDirectoryHpp(String value) {
        Pointer valuePtr = new Memory(Native.WCHAR_SIZE * (value.length() + 1));
        valuePtr.setWideString(0, value);
        PointerByReference valueReference = new PointerByReference();
        valueReference.setValue(valuePtr);
        VPGDllFunctions.Instance.WriteString(Handle, VPGGenerationOptionProperty.ObjectDirectoryHpp.getValue(), valueReference, -1);
    }

    public String getObjectDirectoryCpp() {
        PointerByReference result = new PointerByReference();
        VPGDllFunctions.Instance.ReadString(Handle, VPGGenerationOptionProperty.ObjectDirectoryCpp.getValue(), result, -1);
        return result.getValue().getWideString(0);
    }

    public void setObjectDirectoryCpp(String value) {
        Pointer valuePtr = new Memory(Native.WCHAR_SIZE * (value.length() + 1));
        valuePtr.setWideString(0, value);
        PointerByReference valueReference = new PointerByReference();
        valueReference.setValue(valuePtr);
        VPGDllFunctions.Instance.WriteString(Handle, VPGGenerationOptionProperty.ObjectDirectoryCpp.getValue(), valueReference, -1);
    }

    public String getPropertyAccessorDirectoryHpp() {
        PointerByReference result = new PointerByReference();
        VPGDllFunctions.Instance.ReadString(Handle, VPGGenerationOptionProperty.PropertyAccessorDirectoryHpp.getValue(), result, -1);
        return result.getValue().getWideString(0);
    }

    public void setPropertyAccessorDirectoryHpp(String value) {
        Pointer valuePtr = new Memory(Native.WCHAR_SIZE * (value.length() + 1));
        valuePtr.setWideString(0, value);
        PointerByReference valueReference = new PointerByReference();
        valueReference.setValue(valuePtr);
        VPGDllFunctions.Instance.WriteString(Handle, VPGGenerationOptionProperty.PropertyAccessorDirectoryHpp.getValue(), valueReference, -1);
    }

    public String getPropertyAccessorDirectoryCpp() {
        PointerByReference result = new PointerByReference();
        VPGDllFunctions.Instance.ReadString(Handle, VPGGenerationOptionProperty.PropertyAccessorDirectoryCpp.getValue(), result, -1);
        return result.getValue().getWideString(0);
    }

    public void setPropertyAccessorDirectoryCpp(String value) {
        Pointer valuePtr = new Memory(Native.WCHAR_SIZE * (value.length() + 1));
        valuePtr.setWideString(0, value);
        PointerByReference valueReference = new PointerByReference();
        valueReference.setValue(valuePtr);
        VPGDllFunctions.Instance.WriteString(Handle, VPGGenerationOptionProperty.PropertyAccessorDirectoryCpp.getValue(), valueReference, -1);
    }

    public String getObjectFactoryDirectoryHpp() {
        PointerByReference result = new PointerByReference();
        VPGDllFunctions.Instance.ReadString(Handle, VPGGenerationOptionProperty.ObjectFactoryDirectoryHpp.getValue(), result, -1);
        return result.getValue().getWideString(0);
    }

    public void setObjectFactoryDirectoryHpp(String value) {
        Pointer valuePtr = new Memory(Native.WCHAR_SIZE * (value.length() + 1));
        valuePtr.setWideString(0, value);
        PointerByReference valueReference = new PointerByReference();
        valueReference.setValue(valuePtr);
        VPGDllFunctions.Instance.WriteString(Handle, VPGGenerationOptionProperty.ObjectFactoryDirectoryHpp.getValue(), valueReference, -1);
    }

    public String getObjectFactoryDirectoryCpp() {
        PointerByReference result = new PointerByReference();
        VPGDllFunctions.Instance.ReadString(Handle, VPGGenerationOptionProperty.ObjectFactoryDirectoryCpp.getValue(), result, -1);
        return result.getValue().getWideString(0);
    }

    public void setObjectFactoryDirectoryCpp(String value) {
        Pointer valuePtr = new Memory(Native.WCHAR_SIZE * (value.length() + 1));
        valuePtr.setWideString(0, value);
        PointerByReference valueReference = new PointerByReference();
        valueReference.setValue(valuePtr);
        VPGDllFunctions.Instance.WriteString(Handle, VPGGenerationOptionProperty.ObjectFactoryDirectoryCpp.getValue(), valueReference, -1);
    }

    public String getPropertyAccessorFactoryDirectoryHpp() {
        PointerByReference result = new PointerByReference();
        VPGDllFunctions.Instance.ReadString(Handle, VPGGenerationOptionProperty.PropertyAccessorFactoryDirectoryHpp.getValue(), result, -1);
        return result.getValue().getWideString(0);
    }

    public void setPropertyAccessorFactoryDirectoryHpp(String value) {
        Pointer valuePtr = new Memory(Native.WCHAR_SIZE * (value.length() + 1));
        valuePtr.setWideString(0, value);
        PointerByReference valueReference = new PointerByReference();
        valueReference.setValue(valuePtr);
        VPGDllFunctions.Instance.WriteString(Handle, VPGGenerationOptionProperty.PropertyAccessorFactoryDirectoryHpp.getValue(), valueReference, -1);
    }

    public String getPropertyAccessorFactoryDirectoryCpp() {
        PointerByReference result = new PointerByReference();
        VPGDllFunctions.Instance.ReadString(Handle, VPGGenerationOptionProperty.PropertyAccessorFactoryDirectoryCpp.getValue(), result, -1);
        return result.getValue().getWideString(0);
    }

    public void setPropertyAccessorFactoryDirectoryCpp(String value) {
        Pointer valuePtr = new Memory(Native.WCHAR_SIZE * (value.length() + 1));
        valuePtr.setWideString(0, value);
        PointerByReference valueReference = new PointerByReference();
        valueReference.setValue(valuePtr);
        VPGDllFunctions.Instance.WriteString(Handle, VPGGenerationOptionProperty.PropertyAccessorFactoryDirectoryCpp.getValue(), valueReference, -1);
    }

    public long getPluginsCount() {
        return VPGDllFunctions.Instance.GetContainerCount(Handle, VPGGenerationOptionProperty.Plugins.getValue());
    }

    public String getPluginsAt(long index) {
        PointerByReference result = new PointerByReference();
        VPGDllFunctions.Instance.ReadString(Handle, VPGGenerationOptionProperty.Plugins.getValue(), result, index);
        return result.getValue().getWideString(0);
    }

    public void setPluginsAt(long index, String value) {
        Pointer valuePtr = new Memory(Native.WCHAR_SIZE * (value.length() + 1));
        valuePtr.setWideString(0, value);
        PointerByReference valueReference = new PointerByReference();
        valueReference.setValue(valuePtr);
        VPGDllFunctions.Instance.WriteString(Handle, VPGGenerationOptionProperty.Plugins.getValue(), valueReference, index);
    }

    public void insertPlugins(String value) {
        insertPluginsAt(-1, value);
    }

    public void insertPluginsAt(long index, String value) {
        Pointer valuePtr = new Memory(Native.WCHAR_SIZE * (value.length() + 1));
        valuePtr.setWideString(0, value);
        PointerByReference valueReference = new PointerByReference();
        valueReference.setValue(valuePtr);
        VPGDllFunctions.Instance.InsertString(Handle, VPGGenerationOptionProperty.Plugins.getValue(), valueReference, index);
    }

    public void removePluginsAt(long index) {
        VPGDllFunctions.Instance.RemoveContainerElement(Handle, VPGGenerationOptionProperty.Plugins.getValue(), index);
    }

    public void clearPlugins() {
        VPGDllFunctions.Instance.ClearContainer(Handle, VPGGenerationOptionProperty.Plugins.getValue());
    }

    public long getExportsCount() {
        return VPGDllFunctions.Instance.GetContainerCount(Handle, VPGGenerationOptionProperty.Exports.getValue());
    }

    public VPGGenerationOptionExport getExportsAt(long index) {
        return new VPGGenerationOptionExport(VPGDllFunctions.Instance.ReadObject(Handle, VPGGenerationOptionProperty.Exports.getValue(), index));
    }

    public void setExportsAt(long index, VPGGenerationOptionExport value) {
        VPGDllFunctions.Instance.WriteObject(Handle, VPGGenerationOptionProperty.Exports.getValue(), value.Handle, index);
    }

    public VPGGenerationOptionExport addExports() {
        return addExportsAt(-1);
    }

    public VPGGenerationOptionExport addExportsAt(long index) {
        return new VPGGenerationOptionExport(VPGDllFunctions.Instance.AddObject(Handle, VPGGenerationOptionProperty.Exports.getValue(), VPGObjectType.GenerationOptionExport.getValue(), index));
    }

    public void insertExports(VPGGenerationOptionExport value) {
        insertExportsAt(-1, value);
    }

    public void insertExportsAt(long index, VPGGenerationOptionExport value) {
        VPGDllFunctions.Instance.InsertObject(Handle, VPGGenerationOptionProperty.Exports.getValue(), value.Handle, index);
    }

    public void removeExportsAt(long index) {
        VPGDllFunctions.Instance.RemoveContainerElement(Handle, VPGGenerationOptionProperty.Exports.getValue(), index);
    }

    public void clearExports() {
        VPGDllFunctions.Instance.ClearContainer(Handle, VPGGenerationOptionProperty.Exports.getValue());
    }
}
