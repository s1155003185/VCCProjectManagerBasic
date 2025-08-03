package com.vcc.model.generation;

import com.sun.jna.Memory;
import com.sun.jna.Native;
import com.sun.jna.Pointer;
import com.sun.jna.ptr.PointerByReference;
import com.vcc.VPGDllFunctions;
import com.vcc.type.VPGObjectType;
import com.vcc.type.enumtype.VPGEnumClassType;
import com.vcc.type.generation.VPGEnumClassProperty;
import java.util.HashSet;
import java.util.Set;

public class VPGEnumClass {

    public Pointer Handle = null;

    public VPGEnumClass(Pointer handle) {
        this.Handle = handle;
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Properties">
    public VPGEnumClassType getType() {
        return VPGEnumClassType.parse((int)VPGDllFunctions.Instance.ReadLong(Handle, VPGEnumClassProperty.Type.getValue()));
    }

    public void setType(VPGEnumClassType value) {
        VPGDllFunctions.Instance.WriteLong(Handle, VPGEnumClassProperty.Type.getValue(), value.getValue());
    }

    public String getName() {
        PointerByReference result = new PointerByReference();
        VPGDllFunctions.Instance.ReadString(Handle, VPGEnumClassProperty.Name.getValue(), result);
        return result.getValue().getWideString(0);
    }

    public void setName(String value) {
        Pointer valuePtr = new Memory(Native.WCHAR_SIZE * (value.length() + 1));
        valuePtr.setWideString(0, value);
        PointerByReference valueReference = new PointerByReference();
        valueReference.setValue(valuePtr);
        VPGDllFunctions.Instance.WriteString(Handle, VPGEnumClassProperty.Name.getValue(), valueReference);
    }

    public String getCommand() {
        PointerByReference result = new PointerByReference();
        VPGDllFunctions.Instance.ReadString(Handle, VPGEnumClassProperty.Command.getValue(), result);
        return result.getValue().getWideString(0);
    }

    public void setCommand(String value) {
        Pointer valuePtr = new Memory(Native.WCHAR_SIZE * (value.length() + 1));
        valuePtr.setWideString(0, value);
        PointerByReference valueReference = new PointerByReference();
        valueReference.setValue(valuePtr);
        VPGDllFunctions.Instance.WriteString(Handle, VPGEnumClassProperty.Command.getValue(), valueReference);
    }

    public long getPropertiesCount() {
        return VPGDllFunctions.Instance.GetCount(Handle, VPGEnumClassProperty.Properties.getValue());
    }

    public VPGEnumClassAttribute getPropertiesAtIndex(long index) {
        return new VPGEnumClassAttribute(VPGDllFunctions.Instance.ReadObjectAtIndex(Handle, VPGEnumClassProperty.Properties.getValue(), index));
    }

    public void setPropertiesAtIndex(long index, VPGEnumClassAttribute value) {
        VPGDllFunctions.Instance.WriteObjectAtIndex(Handle, VPGEnumClassProperty.Properties.getValue(), value.Handle, index);
    }

    public VPGEnumClassAttribute addProperties() {
        return addPropertiesAtIndex(-1);
    }

    public VPGEnumClassAttribute addPropertiesAtIndex(long index) {
        return new VPGEnumClassAttribute(VPGDllFunctions.Instance.AddObjectAtIndex(Handle, VPGEnumClassProperty.Properties.getValue(), VPGObjectType.EnumClassAttribute.getValue(), index));
    }

    public void insertProperties(VPGEnumClassAttribute value) {
        insertPropertiesAtIndex(-1, value);
    }

    public void insertPropertiesAtIndex(long index, VPGEnumClassAttribute value) {
        VPGDllFunctions.Instance.InsertObjectAtIndex(Handle, VPGEnumClassProperty.Properties.getValue(), value.Handle, index);
    }

    public void removeProperties(VPGEnumClassAttribute value) {
        VPGDllFunctions.Instance.RemoveObject(Handle, VPGEnumClassProperty.Properties.getValue(), value.Handle);
    }

    public void removePropertiesAtIndex(long index) {
        VPGDllFunctions.Instance.RemoveAtIndex(Handle, VPGEnumClassProperty.Properties.getValue(), index);
    }

    public void clearProperties() {
        VPGDllFunctions.Instance.Clear(Handle, VPGEnumClassProperty.Properties.getValue());
    }

    public long getIncludeSystemFilesCount() {
        return VPGDllFunctions.Instance.GetCount(Handle, VPGEnumClassProperty.IncludeSystemFiles.getValue());
    }

    public String getIncludeSystemFilesAtIndex(long index) {
        PointerByReference result = new PointerByReference();
        VPGDllFunctions.Instance.ReadStringAtIndex(Handle, VPGEnumClassProperty.IncludeSystemFiles.getValue(), result, index);
        return result.getValue().getWideString(0);
    }

    public void setIncludeSystemFilesAtIndex(long index, String value) {
        Pointer valuePtr = new Memory(Native.WCHAR_SIZE * (value.length() + 1));
        valuePtr.setWideString(0, value);
        PointerByReference valueReference = new PointerByReference();
        valueReference.setValue(valuePtr);
        VPGDllFunctions.Instance.WriteStringAtIndex(Handle, VPGEnumClassProperty.IncludeSystemFiles.getValue(), valueReference, index);
    }

    public void insertIncludeSystemFiles(String value) {
        insertIncludeSystemFilesAtIndex(-1, value);
    }

    public void insertIncludeSystemFilesAtIndex(long index, String value) {
        Pointer valuePtr = new Memory(Native.WCHAR_SIZE * (value.length() + 1));
        valuePtr.setWideString(0, value);
        PointerByReference valueReference = new PointerByReference();
        valueReference.setValue(valuePtr);
        VPGDllFunctions.Instance.InsertStringAtIndex(Handle, VPGEnumClassProperty.IncludeSystemFiles.getValue(), valueReference, index);
    }

    public void removeIncludeSystemFilesAtIndex(long index) {
        VPGDllFunctions.Instance.RemoveAtIndex(Handle, VPGEnumClassProperty.IncludeSystemFiles.getValue(), index);
    }

    public void clearIncludeSystemFiles() {
        VPGDllFunctions.Instance.Clear(Handle, VPGEnumClassProperty.IncludeSystemFiles.getValue());
    }

    public long getIncludeCustomFilesCount() {
        return VPGDllFunctions.Instance.GetCount(Handle, VPGEnumClassProperty.IncludeCustomFiles.getValue());
    }

    public String getIncludeCustomFilesAtIndex(long index) {
        PointerByReference result = new PointerByReference();
        VPGDllFunctions.Instance.ReadStringAtIndex(Handle, VPGEnumClassProperty.IncludeCustomFiles.getValue(), result, index);
        return result.getValue().getWideString(0);
    }

    public void setIncludeCustomFilesAtIndex(long index, String value) {
        Pointer valuePtr = new Memory(Native.WCHAR_SIZE * (value.length() + 1));
        valuePtr.setWideString(0, value);
        PointerByReference valueReference = new PointerByReference();
        valueReference.setValue(valuePtr);
        VPGDllFunctions.Instance.WriteStringAtIndex(Handle, VPGEnumClassProperty.IncludeCustomFiles.getValue(), valueReference, index);
    }

    public void insertIncludeCustomFiles(String value) {
        insertIncludeCustomFilesAtIndex(-1, value);
    }

    public void insertIncludeCustomFilesAtIndex(long index, String value) {
        Pointer valuePtr = new Memory(Native.WCHAR_SIZE * (value.length() + 1));
        valuePtr.setWideString(0, value);
        PointerByReference valueReference = new PointerByReference();
        valueReference.setValue(valuePtr);
        VPGDllFunctions.Instance.InsertStringAtIndex(Handle, VPGEnumClassProperty.IncludeCustomFiles.getValue(), valueReference, index);
    }

    public void removeIncludeCustomFilesAtIndex(long index) {
        VPGDllFunctions.Instance.RemoveAtIndex(Handle, VPGEnumClassProperty.IncludeCustomFiles.getValue(), index);
    }

    public void clearIncludeCustomFiles() {
        VPGDllFunctions.Instance.Clear(Handle, VPGEnumClassProperty.IncludeCustomFiles.getValue());
    }

    public long getPrivatePropertiesCount() {
        return VPGDllFunctions.Instance.GetCount(Handle, VPGEnumClassProperty.PrivateProperties.getValue());
    }

    public String getPrivatePropertiesAtKey(String key) {
        Pointer keyPtr = new Memory(Native.WCHAR_SIZE * (key.length() + 1));
        keyPtr.setWideString(0, key);
        PointerByReference result = new PointerByReference();
        VPGDllFunctions.Instance.ReadStringAtKey(Handle, VPGEnumClassProperty.PrivateProperties.getValue(), result, keyPtr);
        return result.getValue().getWideString(0);
    }

    public void setPrivatePropertiesAtKey(String key, String value) {
        Pointer keyPtr = new Memory(Native.WCHAR_SIZE * (key.length() + 1));
        keyPtr.setWideString(0, key);
        Pointer valuePtr = new Memory(Native.WCHAR_SIZE * (value.length() + 1));
        valuePtr.setWideString(0, value);
        PointerByReference valueReference = new PointerByReference();
        valueReference.setValue(valuePtr);
        VPGDllFunctions.Instance.WriteStringAtKey(Handle, VPGEnumClassProperty.PrivateProperties.getValue(), valueReference, keyPtr);
    }

    public Set<String> getPrivatePropertiesKeys() {
        Set<String> result = new HashSet<>();
        Pointer ptrs = VPGDllFunctions.Instance.GetMapKeys(Handle, VPGEnumClassProperty.PrivateProperties.getValue());
        long total = getPrivatePropertiesCount();
        for (var ptr : ptrs.getPointerArray(0)) {
            if (ptr == null) {
                break;
            }
            result.add(ptr.getWideString(0));
            if (result.size() >= total) {
                break;
            }
        }
        return result;
    }

    public boolean isPrivatePropertiesContainKey(String key) {
        Pointer keyPtr = new Memory(Native.WCHAR_SIZE * (key.length() + 1));
        keyPtr.setWideString(0, key);
        return VPGDllFunctions.Instance.IsContainKey(Handle, VPGEnumClassProperty.PrivateProperties.getValue(), keyPtr);
    }

    public void removePrivatePropertiesAtKey(String key) {
        Pointer keyPtr = new Memory(Native.WCHAR_SIZE * (key.length() + 1));
        keyPtr.setWideString(0, key);
        VPGDllFunctions.Instance.RemoveAtKey(Handle, VPGEnumClassProperty.PrivateProperties.getValue(), keyPtr);
    }

    public void clearPrivateProperties() {
        VPGDllFunctions.Instance.Clear(Handle, VPGEnumClassProperty.PrivateProperties.getValue());
    }

    public long getProtectedPropertiesCount() {
        return VPGDllFunctions.Instance.GetCount(Handle, VPGEnumClassProperty.ProtectedProperties.getValue());
    }

    public String getProtectedPropertiesAtKey(String key) {
        Pointer keyPtr = new Memory(Native.WCHAR_SIZE * (key.length() + 1));
        keyPtr.setWideString(0, key);
        PointerByReference result = new PointerByReference();
        VPGDllFunctions.Instance.ReadStringAtKey(Handle, VPGEnumClassProperty.ProtectedProperties.getValue(), result, keyPtr);
        return result.getValue().getWideString(0);
    }

    public void setProtectedPropertiesAtKey(String key, String value) {
        Pointer keyPtr = new Memory(Native.WCHAR_SIZE * (key.length() + 1));
        keyPtr.setWideString(0, key);
        Pointer valuePtr = new Memory(Native.WCHAR_SIZE * (value.length() + 1));
        valuePtr.setWideString(0, value);
        PointerByReference valueReference = new PointerByReference();
        valueReference.setValue(valuePtr);
        VPGDllFunctions.Instance.WriteStringAtKey(Handle, VPGEnumClassProperty.ProtectedProperties.getValue(), valueReference, keyPtr);
    }

    public Set<String> getProtectedPropertiesKeys() {
        Set<String> result = new HashSet<>();
        Pointer ptrs = VPGDllFunctions.Instance.GetMapKeys(Handle, VPGEnumClassProperty.ProtectedProperties.getValue());
        long total = getProtectedPropertiesCount();
        for (var ptr : ptrs.getPointerArray(0)) {
            if (ptr == null) {
                break;
            }
            result.add(ptr.getWideString(0));
            if (result.size() >= total) {
                break;
            }
        }
        return result;
    }

    public boolean isProtectedPropertiesContainKey(String key) {
        Pointer keyPtr = new Memory(Native.WCHAR_SIZE * (key.length() + 1));
        keyPtr.setWideString(0, key);
        return VPGDllFunctions.Instance.IsContainKey(Handle, VPGEnumClassProperty.ProtectedProperties.getValue(), keyPtr);
    }

    public void removeProtectedPropertiesAtKey(String key) {
        Pointer keyPtr = new Memory(Native.WCHAR_SIZE * (key.length() + 1));
        keyPtr.setWideString(0, key);
        VPGDllFunctions.Instance.RemoveAtKey(Handle, VPGEnumClassProperty.ProtectedProperties.getValue(), keyPtr);
    }

    public void clearProtectedProperties() {
        VPGDllFunctions.Instance.Clear(Handle, VPGEnumClassProperty.ProtectedProperties.getValue());
    }

    public boolean getIsLogConfigIndependent() {
        return VPGDllFunctions.Instance.ReadBool(Handle, VPGEnumClassProperty.IsLogConfigIndependent.getValue());
    }

    public void setIsLogConfigIndependent(boolean value) {
        VPGDllFunctions.Instance.WriteBool(Handle, VPGEnumClassProperty.IsLogConfigIndependent.getValue(), value);
    }

    public boolean getIsActionManagerIndependent() {
        return VPGDllFunctions.Instance.ReadBool(Handle, VPGEnumClassProperty.IsActionManagerIndependent.getValue());
    }

    public void setIsActionManagerIndependent(boolean value) {
        VPGDllFunctions.Instance.WriteBool(Handle, VPGEnumClassProperty.IsActionManagerIndependent.getValue(), value);
    }

    public boolean getIsThreadManagerIndependent() {
        return VPGDllFunctions.Instance.ReadBool(Handle, VPGEnumClassProperty.IsThreadManagerIndependent.getValue());
    }

    public void setIsThreadManagerIndependent(boolean value) {
        VPGDllFunctions.Instance.WriteBool(Handle, VPGEnumClassProperty.IsThreadManagerIndependent.getValue(), value);
    }

    public boolean getIsJson() {
        return VPGDllFunctions.Instance.ReadBool(Handle, VPGEnumClassProperty.IsJson.getValue());
    }

    public void setIsJson(boolean value) {
        VPGDllFunctions.Instance.WriteBool(Handle, VPGEnumClassProperty.IsJson.getValue(), value);
    }

    public long getJsonAttributesCount() {
        return VPGDllFunctions.Instance.GetCount(Handle, VPGEnumClassProperty.JsonAttributes.getValue());
    }

    public String getJsonAttributesAtKey(String key) {
        Pointer keyPtr = new Memory(Native.WCHAR_SIZE * (key.length() + 1));
        keyPtr.setWideString(0, key);
        PointerByReference result = new PointerByReference();
        VPGDllFunctions.Instance.ReadStringAtKey(Handle, VPGEnumClassProperty.JsonAttributes.getValue(), result, keyPtr);
        return result.getValue().getWideString(0);
    }

    public void setJsonAttributesAtKey(String key, String value) {
        Pointer keyPtr = new Memory(Native.WCHAR_SIZE * (key.length() + 1));
        keyPtr.setWideString(0, key);
        Pointer valuePtr = new Memory(Native.WCHAR_SIZE * (value.length() + 1));
        valuePtr.setWideString(0, value);
        PointerByReference valueReference = new PointerByReference();
        valueReference.setValue(valuePtr);
        VPGDllFunctions.Instance.WriteStringAtKey(Handle, VPGEnumClassProperty.JsonAttributes.getValue(), valueReference, keyPtr);
    }

    public Set<String> getJsonAttributesKeys() {
        Set<String> result = new HashSet<>();
        Pointer ptrs = VPGDllFunctions.Instance.GetMapKeys(Handle, VPGEnumClassProperty.JsonAttributes.getValue());
        long total = getJsonAttributesCount();
        for (var ptr : ptrs.getPointerArray(0)) {
            if (ptr == null) {
                break;
            }
            result.add(ptr.getWideString(0));
            if (result.size() >= total) {
                break;
            }
        }
        return result;
    }

    public boolean isJsonAttributesContainKey(String key) {
        Pointer keyPtr = new Memory(Native.WCHAR_SIZE * (key.length() + 1));
        keyPtr.setWideString(0, key);
        return VPGDllFunctions.Instance.IsContainKey(Handle, VPGEnumClassProperty.JsonAttributes.getValue(), keyPtr);
    }

    public void removeJsonAttributesAtKey(String key) {
        Pointer keyPtr = new Memory(Native.WCHAR_SIZE * (key.length() + 1));
        keyPtr.setWideString(0, key);
        VPGDllFunctions.Instance.RemoveAtKey(Handle, VPGEnumClassProperty.JsonAttributes.getValue(), keyPtr);
    }

    public void clearJsonAttributes() {
        VPGDllFunctions.Instance.Clear(Handle, VPGEnumClassProperty.JsonAttributes.getValue());
    }

    public String getInheritClass() {
        PointerByReference result = new PointerByReference();
        VPGDllFunctions.Instance.ReadString(Handle, VPGEnumClassProperty.InheritClass.getValue(), result);
        return result.getValue().getWideString(0);
    }

    public void setInheritClass(String value) {
        Pointer valuePtr = new Memory(Native.WCHAR_SIZE * (value.length() + 1));
        valuePtr.setWideString(0, value);
        PointerByReference valueReference = new PointerByReference();
        valueReference.setValue(valuePtr);
        VPGDllFunctions.Instance.WriteString(Handle, VPGEnumClassProperty.InheritClass.getValue(), valueReference);
    }

    public long getInheritClassAttributesCount() {
        return VPGDllFunctions.Instance.GetCount(Handle, VPGEnumClassProperty.InheritClassAttributes.getValue());
    }

    public String getInheritClassAttributesAtKey(String key) {
        Pointer keyPtr = new Memory(Native.WCHAR_SIZE * (key.length() + 1));
        keyPtr.setWideString(0, key);
        PointerByReference result = new PointerByReference();
        VPGDllFunctions.Instance.ReadStringAtKey(Handle, VPGEnumClassProperty.InheritClassAttributes.getValue(), result, keyPtr);
        return result.getValue().getWideString(0);
    }

    public void setInheritClassAttributesAtKey(String key, String value) {
        Pointer keyPtr = new Memory(Native.WCHAR_SIZE * (key.length() + 1));
        keyPtr.setWideString(0, key);
        Pointer valuePtr = new Memory(Native.WCHAR_SIZE * (value.length() + 1));
        valuePtr.setWideString(0, value);
        PointerByReference valueReference = new PointerByReference();
        valueReference.setValue(valuePtr);
        VPGDllFunctions.Instance.WriteStringAtKey(Handle, VPGEnumClassProperty.InheritClassAttributes.getValue(), valueReference, keyPtr);
    }

    public Set<String> getInheritClassAttributesKeys() {
        Set<String> result = new HashSet<>();
        Pointer ptrs = VPGDllFunctions.Instance.GetMapKeys(Handle, VPGEnumClassProperty.InheritClassAttributes.getValue());
        long total = getInheritClassAttributesCount();
        for (var ptr : ptrs.getPointerArray(0)) {
            if (ptr == null) {
                break;
            }
            result.add(ptr.getWideString(0));
            if (result.size() >= total) {
                break;
            }
        }
        return result;
    }

    public boolean isInheritClassAttributesContainKey(String key) {
        Pointer keyPtr = new Memory(Native.WCHAR_SIZE * (key.length() + 1));
        keyPtr.setWideString(0, key);
        return VPGDllFunctions.Instance.IsContainKey(Handle, VPGEnumClassProperty.InheritClassAttributes.getValue(), keyPtr);
    }

    public void removeInheritClassAttributesAtKey(String key) {
        Pointer keyPtr = new Memory(Native.WCHAR_SIZE * (key.length() + 1));
        keyPtr.setWideString(0, key);
        VPGDllFunctions.Instance.RemoveAtKey(Handle, VPGEnumClassProperty.InheritClassAttributes.getValue(), keyPtr);
    }

    public void clearInheritClassAttributes() {
        VPGDllFunctions.Instance.Clear(Handle, VPGEnumClassProperty.InheritClassAttributes.getValue());
    }
    // </editor-fold>
}
