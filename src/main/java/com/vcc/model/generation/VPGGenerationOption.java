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

    // <editor-fold defaultstate="collapsed" desc="Generated Properties">
    public String getVersion() {
        PointerByReference result = new PointerByReference();
        VPGDllFunctions.Instance.ReadString(Handle, VPGGenerationOptionProperty.Version.getValue(), result);
        return result.getValue().getWideString(0);
    }

    public void setVersion(String value) {
        Pointer valuePtr = new Memory(Native.WCHAR_SIZE * (value.length() + 1));
        valuePtr.setWideString(0, value);
        PointerByReference valueReference = new PointerByReference();
        valueReference.setValue(valuePtr);
        VPGDllFunctions.Instance.WriteString(Handle, VPGGenerationOptionProperty.Version.getValue(), valueReference);
    }

    public VPGProjectType getProjectType() {
        return VPGProjectType.parse((int)VPGDllFunctions.Instance.ReadLong(Handle, VPGGenerationOptionProperty.ProjectType.getValue()));
    }

    public void setProjectType(VPGProjectType value) {
        VPGDllFunctions.Instance.WriteLong(Handle, VPGGenerationOptionProperty.ProjectType.getValue(), value.getValue());
    }

    public String getTemplateGitUrl() {
        PointerByReference result = new PointerByReference();
        VPGDllFunctions.Instance.ReadString(Handle, VPGGenerationOptionProperty.TemplateGitUrl.getValue(), result);
        return result.getValue().getWideString(0);
    }

    public void setTemplateGitUrl(String value) {
        Pointer valuePtr = new Memory(Native.WCHAR_SIZE * (value.length() + 1));
        valuePtr.setWideString(0, value);
        PointerByReference valueReference = new PointerByReference();
        valueReference.setValue(valuePtr);
        VPGDllFunctions.Instance.WriteString(Handle, VPGGenerationOptionProperty.TemplateGitUrl.getValue(), valueReference);
    }

    public String getTemplateWorkspace() {
        PointerByReference result = new PointerByReference();
        VPGDllFunctions.Instance.ReadString(Handle, VPGGenerationOptionProperty.TemplateWorkspace.getValue(), result);
        return result.getValue().getWideString(0);
    }

    public void setTemplateWorkspace(String value) {
        Pointer valuePtr = new Memory(Native.WCHAR_SIZE * (value.length() + 1));
        valuePtr.setWideString(0, value);
        PointerByReference valueReference = new PointerByReference();
        valueReference.setValue(valuePtr);
        VPGDllFunctions.Instance.WriteString(Handle, VPGGenerationOptionProperty.TemplateWorkspace.getValue(), valueReference);
    }

    public String getProjectPrefix() {
        PointerByReference result = new PointerByReference();
        VPGDllFunctions.Instance.ReadString(Handle, VPGGenerationOptionProperty.ProjectPrefix.getValue(), result);
        return result.getValue().getWideString(0);
    }

    public void setProjectPrefix(String value) {
        Pointer valuePtr = new Memory(Native.WCHAR_SIZE * (value.length() + 1));
        valuePtr.setWideString(0, value);
        PointerByReference valueReference = new PointerByReference();
        valueReference.setValue(valuePtr);
        VPGDllFunctions.Instance.WriteString(Handle, VPGGenerationOptionProperty.ProjectPrefix.getValue(), valueReference);
    }

    public String getProjectName() {
        PointerByReference result = new PointerByReference();
        VPGDllFunctions.Instance.ReadString(Handle, VPGGenerationOptionProperty.ProjectName.getValue(), result);
        return result.getValue().getWideString(0);
    }

    public void setProjectName(String value) {
        Pointer valuePtr = new Memory(Native.WCHAR_SIZE * (value.length() + 1));
        valuePtr.setWideString(0, value);
        PointerByReference valueReference = new PointerByReference();
        valueReference.setValue(valuePtr);
        VPGDllFunctions.Instance.WriteString(Handle, VPGGenerationOptionProperty.ProjectName.getValue(), valueReference);
    }

    public String getProjectNameDll() {
        PointerByReference result = new PointerByReference();
        VPGDllFunctions.Instance.ReadString(Handle, VPGGenerationOptionProperty.ProjectNameDll.getValue(), result);
        return result.getValue().getWideString(0);
    }

    public void setProjectNameDll(String value) {
        Pointer valuePtr = new Memory(Native.WCHAR_SIZE * (value.length() + 1));
        valuePtr.setWideString(0, value);
        PointerByReference valueReference = new PointerByReference();
        valueReference.setValue(valuePtr);
        VPGDllFunctions.Instance.WriteString(Handle, VPGGenerationOptionProperty.ProjectNameDll.getValue(), valueReference);
    }

    public String getProjectNameExe() {
        PointerByReference result = new PointerByReference();
        VPGDllFunctions.Instance.ReadString(Handle, VPGGenerationOptionProperty.ProjectNameExe.getValue(), result);
        return result.getValue().getWideString(0);
    }

    public void setProjectNameExe(String value) {
        Pointer valuePtr = new Memory(Native.WCHAR_SIZE * (value.length() + 1));
        valuePtr.setWideString(0, value);
        PointerByReference valueReference = new PointerByReference();
        valueReference.setValue(valuePtr);
        VPGDllFunctions.Instance.WriteString(Handle, VPGGenerationOptionProperty.ProjectNameExe.getValue(), valueReference);
    }

    public boolean getIsGit() {
        return VPGDllFunctions.Instance.ReadBool(Handle, VPGGenerationOptionProperty.IsGit.getValue());
    }

    public void setIsGit(boolean value) {
        VPGDllFunctions.Instance.WriteBool(Handle, VPGGenerationOptionProperty.IsGit.getValue(), value);
    }

    public boolean getIsResultThrowException() {
        return VPGDllFunctions.Instance.ReadBool(Handle, VPGGenerationOptionProperty.IsResultThrowException.getValue());
    }

    public void setIsResultThrowException(boolean value) {
        VPGDllFunctions.Instance.WriteBool(Handle, VPGGenerationOptionProperty.IsResultThrowException.getValue(), value);
    }

    public boolean getIsExcludeUnittest() {
        return VPGDllFunctions.Instance.ReadBool(Handle, VPGGenerationOptionProperty.IsExcludeUnittest.getValue());
    }

    public void setIsExcludeUnittest(boolean value) {
        VPGDllFunctions.Instance.WriteBool(Handle, VPGGenerationOptionProperty.IsExcludeUnittest.getValue(), value);
    }

    public boolean getIsExcludeVCCUnitTest() {
        return VPGDllFunctions.Instance.ReadBool(Handle, VPGGenerationOptionProperty.IsExcludeVCCUnitTest.getValue());
    }

    public void setIsExcludeVCCUnitTest(boolean value) {
        VPGDllFunctions.Instance.WriteBool(Handle, VPGGenerationOptionProperty.IsExcludeVCCUnitTest.getValue(), value);
    }

    public String getTypeWorkspace() {
        PointerByReference result = new PointerByReference();
        VPGDllFunctions.Instance.ReadString(Handle, VPGGenerationOptionProperty.TypeWorkspace.getValue(), result);
        return result.getValue().getWideString(0);
    }

    public void setTypeWorkspace(String value) {
        Pointer valuePtr = new Memory(Native.WCHAR_SIZE * (value.length() + 1));
        valuePtr.setWideString(0, value);
        PointerByReference valueReference = new PointerByReference();
        valueReference.setValue(valuePtr);
        VPGDllFunctions.Instance.WriteString(Handle, VPGGenerationOptionProperty.TypeWorkspace.getValue(), valueReference);
    }

    public String getExceptionTypeDirectory() {
        PointerByReference result = new PointerByReference();
        VPGDllFunctions.Instance.ReadString(Handle, VPGGenerationOptionProperty.ExceptionTypeDirectory.getValue(), result);
        return result.getValue().getWideString(0);
    }

    public void setExceptionTypeDirectory(String value) {
        Pointer valuePtr = new Memory(Native.WCHAR_SIZE * (value.length() + 1));
        valuePtr.setWideString(0, value);
        PointerByReference valueReference = new PointerByReference();
        valueReference.setValue(valuePtr);
        VPGDllFunctions.Instance.WriteString(Handle, VPGGenerationOptionProperty.ExceptionTypeDirectory.getValue(), valueReference);
    }

    public String getObjectTypeDirectory() {
        PointerByReference result = new PointerByReference();
        VPGDllFunctions.Instance.ReadString(Handle, VPGGenerationOptionProperty.ObjectTypeDirectory.getValue(), result);
        return result.getValue().getWideString(0);
    }

    public void setObjectTypeDirectory(String value) {
        Pointer valuePtr = new Memory(Native.WCHAR_SIZE * (value.length() + 1));
        valuePtr.setWideString(0, value);
        PointerByReference valueReference = new PointerByReference();
        valueReference.setValue(valuePtr);
        VPGDllFunctions.Instance.WriteString(Handle, VPGGenerationOptionProperty.ObjectTypeDirectory.getValue(), valueReference);
    }

    public String getApplicationDirectoryHpp() {
        PointerByReference result = new PointerByReference();
        VPGDllFunctions.Instance.ReadString(Handle, VPGGenerationOptionProperty.ApplicationDirectoryHpp.getValue(), result);
        return result.getValue().getWideString(0);
    }

    public void setApplicationDirectoryHpp(String value) {
        Pointer valuePtr = new Memory(Native.WCHAR_SIZE * (value.length() + 1));
        valuePtr.setWideString(0, value);
        PointerByReference valueReference = new PointerByReference();
        valueReference.setValue(valuePtr);
        VPGDllFunctions.Instance.WriteString(Handle, VPGGenerationOptionProperty.ApplicationDirectoryHpp.getValue(), valueReference);
    }

    public String getApplicationDirectoryCpp() {
        PointerByReference result = new PointerByReference();
        VPGDllFunctions.Instance.ReadString(Handle, VPGGenerationOptionProperty.ApplicationDirectoryCpp.getValue(), result);
        return result.getValue().getWideString(0);
    }

    public void setApplicationDirectoryCpp(String value) {
        Pointer valuePtr = new Memory(Native.WCHAR_SIZE * (value.length() + 1));
        valuePtr.setWideString(0, value);
        PointerByReference valueReference = new PointerByReference();
        valueReference.setValue(valuePtr);
        VPGDllFunctions.Instance.WriteString(Handle, VPGGenerationOptionProperty.ApplicationDirectoryCpp.getValue(), valueReference);
    }

    public String getActionDirectoryHpp() {
        PointerByReference result = new PointerByReference();
        VPGDllFunctions.Instance.ReadString(Handle, VPGGenerationOptionProperty.ActionDirectoryHpp.getValue(), result);
        return result.getValue().getWideString(0);
    }

    public void setActionDirectoryHpp(String value) {
        Pointer valuePtr = new Memory(Native.WCHAR_SIZE * (value.length() + 1));
        valuePtr.setWideString(0, value);
        PointerByReference valueReference = new PointerByReference();
        valueReference.setValue(valuePtr);
        VPGDllFunctions.Instance.WriteString(Handle, VPGGenerationOptionProperty.ActionDirectoryHpp.getValue(), valueReference);
    }

    public String getActionDirectoryCpp() {
        PointerByReference result = new PointerByReference();
        VPGDllFunctions.Instance.ReadString(Handle, VPGGenerationOptionProperty.ActionDirectoryCpp.getValue(), result);
        return result.getValue().getWideString(0);
    }

    public void setActionDirectoryCpp(String value) {
        Pointer valuePtr = new Memory(Native.WCHAR_SIZE * (value.length() + 1));
        valuePtr.setWideString(0, value);
        PointerByReference valueReference = new PointerByReference();
        valueReference.setValue(valuePtr);
        VPGDllFunctions.Instance.WriteString(Handle, VPGGenerationOptionProperty.ActionDirectoryCpp.getValue(), valueReference);
    }

    public String getFormDirectoryHpp() {
        PointerByReference result = new PointerByReference();
        VPGDllFunctions.Instance.ReadString(Handle, VPGGenerationOptionProperty.FormDirectoryHpp.getValue(), result);
        return result.getValue().getWideString(0);
    }

    public void setFormDirectoryHpp(String value) {
        Pointer valuePtr = new Memory(Native.WCHAR_SIZE * (value.length() + 1));
        valuePtr.setWideString(0, value);
        PointerByReference valueReference = new PointerByReference();
        valueReference.setValue(valuePtr);
        VPGDllFunctions.Instance.WriteString(Handle, VPGGenerationOptionProperty.FormDirectoryHpp.getValue(), valueReference);
    }

    public String getFormDirectoryCpp() {
        PointerByReference result = new PointerByReference();
        VPGDllFunctions.Instance.ReadString(Handle, VPGGenerationOptionProperty.FormDirectoryCpp.getValue(), result);
        return result.getValue().getWideString(0);
    }

    public void setFormDirectoryCpp(String value) {
        Pointer valuePtr = new Memory(Native.WCHAR_SIZE * (value.length() + 1));
        valuePtr.setWideString(0, value);
        PointerByReference valueReference = new PointerByReference();
        valueReference.setValue(valuePtr);
        VPGDllFunctions.Instance.WriteString(Handle, VPGGenerationOptionProperty.FormDirectoryCpp.getValue(), valueReference);
    }

    public String getObjectDirectoryHpp() {
        PointerByReference result = new PointerByReference();
        VPGDllFunctions.Instance.ReadString(Handle, VPGGenerationOptionProperty.ObjectDirectoryHpp.getValue(), result);
        return result.getValue().getWideString(0);
    }

    public void setObjectDirectoryHpp(String value) {
        Pointer valuePtr = new Memory(Native.WCHAR_SIZE * (value.length() + 1));
        valuePtr.setWideString(0, value);
        PointerByReference valueReference = new PointerByReference();
        valueReference.setValue(valuePtr);
        VPGDllFunctions.Instance.WriteString(Handle, VPGGenerationOptionProperty.ObjectDirectoryHpp.getValue(), valueReference);
    }

    public String getObjectDirectoryCpp() {
        PointerByReference result = new PointerByReference();
        VPGDllFunctions.Instance.ReadString(Handle, VPGGenerationOptionProperty.ObjectDirectoryCpp.getValue(), result);
        return result.getValue().getWideString(0);
    }

    public void setObjectDirectoryCpp(String value) {
        Pointer valuePtr = new Memory(Native.WCHAR_SIZE * (value.length() + 1));
        valuePtr.setWideString(0, value);
        PointerByReference valueReference = new PointerByReference();
        valueReference.setValue(valuePtr);
        VPGDllFunctions.Instance.WriteString(Handle, VPGGenerationOptionProperty.ObjectDirectoryCpp.getValue(), valueReference);
    }

    public String getPropertyAccessorDirectoryHpp() {
        PointerByReference result = new PointerByReference();
        VPGDllFunctions.Instance.ReadString(Handle, VPGGenerationOptionProperty.PropertyAccessorDirectoryHpp.getValue(), result);
        return result.getValue().getWideString(0);
    }

    public void setPropertyAccessorDirectoryHpp(String value) {
        Pointer valuePtr = new Memory(Native.WCHAR_SIZE * (value.length() + 1));
        valuePtr.setWideString(0, value);
        PointerByReference valueReference = new PointerByReference();
        valueReference.setValue(valuePtr);
        VPGDllFunctions.Instance.WriteString(Handle, VPGGenerationOptionProperty.PropertyAccessorDirectoryHpp.getValue(), valueReference);
    }

    public String getPropertyAccessorDirectoryCpp() {
        PointerByReference result = new PointerByReference();
        VPGDllFunctions.Instance.ReadString(Handle, VPGGenerationOptionProperty.PropertyAccessorDirectoryCpp.getValue(), result);
        return result.getValue().getWideString(0);
    }

    public void setPropertyAccessorDirectoryCpp(String value) {
        Pointer valuePtr = new Memory(Native.WCHAR_SIZE * (value.length() + 1));
        valuePtr.setWideString(0, value);
        PointerByReference valueReference = new PointerByReference();
        valueReference.setValue(valuePtr);
        VPGDllFunctions.Instance.WriteString(Handle, VPGGenerationOptionProperty.PropertyAccessorDirectoryCpp.getValue(), valueReference);
    }

    public String getObjectFactoryDirectoryHpp() {
        PointerByReference result = new PointerByReference();
        VPGDllFunctions.Instance.ReadString(Handle, VPGGenerationOptionProperty.ObjectFactoryDirectoryHpp.getValue(), result);
        return result.getValue().getWideString(0);
    }

    public void setObjectFactoryDirectoryHpp(String value) {
        Pointer valuePtr = new Memory(Native.WCHAR_SIZE * (value.length() + 1));
        valuePtr.setWideString(0, value);
        PointerByReference valueReference = new PointerByReference();
        valueReference.setValue(valuePtr);
        VPGDllFunctions.Instance.WriteString(Handle, VPGGenerationOptionProperty.ObjectFactoryDirectoryHpp.getValue(), valueReference);
    }

    public String getObjectFactoryDirectoryCpp() {
        PointerByReference result = new PointerByReference();
        VPGDllFunctions.Instance.ReadString(Handle, VPGGenerationOptionProperty.ObjectFactoryDirectoryCpp.getValue(), result);
        return result.getValue().getWideString(0);
    }

    public void setObjectFactoryDirectoryCpp(String value) {
        Pointer valuePtr = new Memory(Native.WCHAR_SIZE * (value.length() + 1));
        valuePtr.setWideString(0, value);
        PointerByReference valueReference = new PointerByReference();
        valueReference.setValue(valuePtr);
        VPGDllFunctions.Instance.WriteString(Handle, VPGGenerationOptionProperty.ObjectFactoryDirectoryCpp.getValue(), valueReference);
    }

    public String getPropertyAccessorFactoryDirectoryHpp() {
        PointerByReference result = new PointerByReference();
        VPGDllFunctions.Instance.ReadString(Handle, VPGGenerationOptionProperty.PropertyAccessorFactoryDirectoryHpp.getValue(), result);
        return result.getValue().getWideString(0);
    }

    public void setPropertyAccessorFactoryDirectoryHpp(String value) {
        Pointer valuePtr = new Memory(Native.WCHAR_SIZE * (value.length() + 1));
        valuePtr.setWideString(0, value);
        PointerByReference valueReference = new PointerByReference();
        valueReference.setValue(valuePtr);
        VPGDllFunctions.Instance.WriteString(Handle, VPGGenerationOptionProperty.PropertyAccessorFactoryDirectoryHpp.getValue(), valueReference);
    }

    public String getPropertyAccessorFactoryDirectoryCpp() {
        PointerByReference result = new PointerByReference();
        VPGDllFunctions.Instance.ReadString(Handle, VPGGenerationOptionProperty.PropertyAccessorFactoryDirectoryCpp.getValue(), result);
        return result.getValue().getWideString(0);
    }

    public void setPropertyAccessorFactoryDirectoryCpp(String value) {
        Pointer valuePtr = new Memory(Native.WCHAR_SIZE * (value.length() + 1));
        valuePtr.setWideString(0, value);
        PointerByReference valueReference = new PointerByReference();
        valueReference.setValue(valuePtr);
        VPGDllFunctions.Instance.WriteString(Handle, VPGGenerationOptionProperty.PropertyAccessorFactoryDirectoryCpp.getValue(), valueReference);
    }

    public long getPluginsCount() {
        return VPGDllFunctions.Instance.GetCount(Handle, VPGGenerationOptionProperty.Plugins.getValue());
    }

    public String getPluginsAtIndex(long index) {
        PointerByReference result = new PointerByReference();
        VPGDllFunctions.Instance.ReadStringAtIndex(Handle, VPGGenerationOptionProperty.Plugins.getValue(), result, index);
        return result.getValue().getWideString(0);
    }

    public void setPluginsAtIndex(long index, String value) {
        Pointer valuePtr = new Memory(Native.WCHAR_SIZE * (value.length() + 1));
        valuePtr.setWideString(0, value);
        PointerByReference valueReference = new PointerByReference();
        valueReference.setValue(valuePtr);
        VPGDllFunctions.Instance.WriteStringAtIndex(Handle, VPGGenerationOptionProperty.Plugins.getValue(), valueReference, index);
    }

    public void insertPlugins(String value) {
        insertPluginsAtIndex(-1, value);
    }

    public void insertPluginsAtIndex(long index, String value) {
        Pointer valuePtr = new Memory(Native.WCHAR_SIZE * (value.length() + 1));
        valuePtr.setWideString(0, value);
        PointerByReference valueReference = new PointerByReference();
        valueReference.setValue(valuePtr);
        VPGDllFunctions.Instance.InsertStringAtIndex(Handle, VPGGenerationOptionProperty.Plugins.getValue(), valueReference, index);
    }

    public void removePluginsAtIndex(long index) {
        VPGDllFunctions.Instance.RemoveAtIndex(Handle, VPGGenerationOptionProperty.Plugins.getValue(), index);
    }

    public void clearPlugins() {
        VPGDllFunctions.Instance.Clear(Handle, VPGGenerationOptionProperty.Plugins.getValue());
    }

    public long getExportsCount() {
        return VPGDllFunctions.Instance.GetCount(Handle, VPGGenerationOptionProperty.Exports.getValue());
    }

    public VPGGenerationOptionExport getExportsAtIndex(long index) {
        return new VPGGenerationOptionExport(VPGDllFunctions.Instance.ReadObjectAtIndex(Handle, VPGGenerationOptionProperty.Exports.getValue(), index));
    }

    public void setExportsAtIndex(long index, VPGGenerationOptionExport value) {
        VPGDllFunctions.Instance.WriteObjectAtIndex(Handle, VPGGenerationOptionProperty.Exports.getValue(), value.Handle, index);
    }

    public VPGGenerationOptionExport addExports() {
        return addExportsAtIndex(-1);
    }

    public VPGGenerationOptionExport addExportsAtIndex(long index) {
        return new VPGGenerationOptionExport(VPGDllFunctions.Instance.AddObjectAtIndex(Handle, VPGGenerationOptionProperty.Exports.getValue(), VPGObjectType.GenerationOptionExport.getValue(), index));
    }

    public void insertExports(VPGGenerationOptionExport value) {
        insertExportsAtIndex(-1, value);
    }

    public void insertExportsAtIndex(long index, VPGGenerationOptionExport value) {
        VPGDllFunctions.Instance.InsertObjectAtIndex(Handle, VPGGenerationOptionProperty.Exports.getValue(), value.Handle, index);
    }

    public void removeExports(VPGGenerationOptionExport value) {
        VPGDllFunctions.Instance.RemoveObject(Handle, VPGGenerationOptionProperty.Exports.getValue(), value.Handle);
    }

    public void removeExportsAtIndex(long index) {
        VPGDllFunctions.Instance.RemoveAtIndex(Handle, VPGGenerationOptionProperty.Exports.getValue(), index);
    }

    public void clearExports() {
        VPGDllFunctions.Instance.Clear(Handle, VPGGenerationOptionProperty.Exports.getValue());
    }
    // </editor-fold>
}
