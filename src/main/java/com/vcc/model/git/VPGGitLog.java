package com.vcc.model.git;

import com.sun.jna.Memory;
import com.sun.jna.Native;
import com.sun.jna.Pointer;
import com.sun.jna.ptr.PointerByReference;
import com.vcc.VPGDllFunctions;
import com.vcc.type.git.VPGGitLogProperty;

public class VPGGitLog {

    public Pointer Handle = null;

    public VPGGitLog(Pointer handle) {
        this.Handle = handle;
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Properties">
    public long getColumnIndex() {
        return VPGDllFunctions.Instance.readLong(Handle, VPGGitLogProperty.ColumnIndex.getValue());
    }

    public void setColumnIndex(long value) {
        VPGDllFunctions.Instance.writeLong(Handle, VPGGitLogProperty.ColumnIndex.getValue(), value);
    }

    public String getHashID() {
        PointerByReference result = new PointerByReference();
        VPGDllFunctions.Instance.readString(Handle, VPGGitLogProperty.HashID.getValue(), result);
        return result.getValue().getWideString(0);
    }

    public void setHashID(String value) {
        Pointer valuePtr = new Memory(Native.WCHAR_SIZE * (value.length() + 1));
        valuePtr.setWideString(0, value);
        PointerByReference valueReference = new PointerByReference();
        valueReference.setValue(valuePtr);
        VPGDllFunctions.Instance.writeString(Handle, VPGGitLogProperty.HashID.getValue(), valueReference);
    }

    public String getAbbreviatedHashID() {
        PointerByReference result = new PointerByReference();
        VPGDllFunctions.Instance.readString(Handle, VPGGitLogProperty.AbbreviatedHashID.getValue(), result);
        return result.getValue().getWideString(0);
    }

    public void setAbbreviatedHashID(String value) {
        Pointer valuePtr = new Memory(Native.WCHAR_SIZE * (value.length() + 1));
        valuePtr.setWideString(0, value);
        PointerByReference valueReference = new PointerByReference();
        valueReference.setValue(valuePtr);
        VPGDllFunctions.Instance.writeString(Handle, VPGGitLogProperty.AbbreviatedHashID.getValue(), valueReference);
    }

    public String getTreeHashID() {
        PointerByReference result = new PointerByReference();
        VPGDllFunctions.Instance.readString(Handle, VPGGitLogProperty.TreeHashID.getValue(), result);
        return result.getValue().getWideString(0);
    }

    public void setTreeHashID(String value) {
        Pointer valuePtr = new Memory(Native.WCHAR_SIZE * (value.length() + 1));
        valuePtr.setWideString(0, value);
        PointerByReference valueReference = new PointerByReference();
        valueReference.setValue(valuePtr);
        VPGDllFunctions.Instance.writeString(Handle, VPGGitLogProperty.TreeHashID.getValue(), valueReference);
    }

    public String getAbbreviatedTreeHashID() {
        PointerByReference result = new PointerByReference();
        VPGDllFunctions.Instance.readString(Handle, VPGGitLogProperty.AbbreviatedTreeHashID.getValue(), result);
        return result.getValue().getWideString(0);
    }

    public void setAbbreviatedTreeHashID(String value) {
        Pointer valuePtr = new Memory(Native.WCHAR_SIZE * (value.length() + 1));
        valuePtr.setWideString(0, value);
        PointerByReference valueReference = new PointerByReference();
        valueReference.setValue(valuePtr);
        VPGDllFunctions.Instance.writeString(Handle, VPGGitLogProperty.AbbreviatedTreeHashID.getValue(), valueReference);
    }

    public long getParentHashIDsCount() {
        return VPGDllFunctions.Instance.getCount(Handle, VPGGitLogProperty.ParentHashIDs.getValue());
    }

    public String getParentHashIDsAtIndex(long index) {
        PointerByReference result = new PointerByReference();
        VPGDllFunctions.Instance.readStringAtIndex(Handle, VPGGitLogProperty.ParentHashIDs.getValue(), result, index);
        return result.getValue().getWideString(0);
    }

    public void setParentHashIDsAtIndex(long index, String value) {
        Pointer valuePtr = new Memory(Native.WCHAR_SIZE * (value.length() + 1));
        valuePtr.setWideString(0, value);
        PointerByReference valueReference = new PointerByReference();
        valueReference.setValue(valuePtr);
        VPGDllFunctions.Instance.writeStringAtIndex(Handle, VPGGitLogProperty.ParentHashIDs.getValue(), valueReference, index);
    }

    public void insertParentHashIDs(String value) {
        insertParentHashIDsAtIndex(-1, value);
    }

    public void insertParentHashIDsAtIndex(long index, String value) {
        Pointer valuePtr = new Memory(Native.WCHAR_SIZE * (value.length() + 1));
        valuePtr.setWideString(0, value);
        PointerByReference valueReference = new PointerByReference();
        valueReference.setValue(valuePtr);
        VPGDllFunctions.Instance.insertStringAtIndex(Handle, VPGGitLogProperty.ParentHashIDs.getValue(), valueReference, index);
    }

    public void removeParentHashIDsAtIndex(long index) {
        VPGDllFunctions.Instance.removeAtIndex(Handle, VPGGitLogProperty.ParentHashIDs.getValue(), index);
    }

    public void clearParentHashIDs() {
        VPGDllFunctions.Instance.clear(Handle, VPGGitLogProperty.ParentHashIDs.getValue());
    }

    public long getAbbreviatedParentHashIDsCount() {
        return VPGDllFunctions.Instance.getCount(Handle, VPGGitLogProperty.AbbreviatedParentHashIDs.getValue());
    }

    public String getAbbreviatedParentHashIDsAtIndex(long index) {
        PointerByReference result = new PointerByReference();
        VPGDllFunctions.Instance.readStringAtIndex(Handle, VPGGitLogProperty.AbbreviatedParentHashIDs.getValue(), result, index);
        return result.getValue().getWideString(0);
    }

    public void setAbbreviatedParentHashIDsAtIndex(long index, String value) {
        Pointer valuePtr = new Memory(Native.WCHAR_SIZE * (value.length() + 1));
        valuePtr.setWideString(0, value);
        PointerByReference valueReference = new PointerByReference();
        valueReference.setValue(valuePtr);
        VPGDllFunctions.Instance.writeStringAtIndex(Handle, VPGGitLogProperty.AbbreviatedParentHashIDs.getValue(), valueReference, index);
    }

    public void insertAbbreviatedParentHashIDs(String value) {
        insertAbbreviatedParentHashIDsAtIndex(-1, value);
    }

    public void insertAbbreviatedParentHashIDsAtIndex(long index, String value) {
        Pointer valuePtr = new Memory(Native.WCHAR_SIZE * (value.length() + 1));
        valuePtr.setWideString(0, value);
        PointerByReference valueReference = new PointerByReference();
        valueReference.setValue(valuePtr);
        VPGDllFunctions.Instance.insertStringAtIndex(Handle, VPGGitLogProperty.AbbreviatedParentHashIDs.getValue(), valueReference, index);
    }

    public void removeAbbreviatedParentHashIDsAtIndex(long index) {
        VPGDllFunctions.Instance.removeAtIndex(Handle, VPGGitLogProperty.AbbreviatedParentHashIDs.getValue(), index);
    }

    public void clearAbbreviatedParentHashIDs() {
        VPGDllFunctions.Instance.clear(Handle, VPGGitLogProperty.AbbreviatedParentHashIDs.getValue());
    }

    public boolean getIsHead() {
        return VPGDllFunctions.Instance.readBool(Handle, VPGGitLogProperty.IsHead.getValue());
    }

    public void setIsHead(boolean value) {
        VPGDllFunctions.Instance.writeBool(Handle, VPGGitLogProperty.IsHead.getValue(), value);
    }

    public long getBranchesCount() {
        return VPGDllFunctions.Instance.getCount(Handle, VPGGitLogProperty.Branches.getValue());
    }

    public String getBranchesAtIndex(long index) {
        PointerByReference result = new PointerByReference();
        VPGDllFunctions.Instance.readStringAtIndex(Handle, VPGGitLogProperty.Branches.getValue(), result, index);
        return result.getValue().getWideString(0);
    }

    public void setBranchesAtIndex(long index, String value) {
        Pointer valuePtr = new Memory(Native.WCHAR_SIZE * (value.length() + 1));
        valuePtr.setWideString(0, value);
        PointerByReference valueReference = new PointerByReference();
        valueReference.setValue(valuePtr);
        VPGDllFunctions.Instance.writeStringAtIndex(Handle, VPGGitLogProperty.Branches.getValue(), valueReference, index);
    }

    public void insertBranches(String value) {
        insertBranchesAtIndex(-1, value);
    }

    public void insertBranchesAtIndex(long index, String value) {
        Pointer valuePtr = new Memory(Native.WCHAR_SIZE * (value.length() + 1));
        valuePtr.setWideString(0, value);
        PointerByReference valueReference = new PointerByReference();
        valueReference.setValue(valuePtr);
        VPGDllFunctions.Instance.insertStringAtIndex(Handle, VPGGitLogProperty.Branches.getValue(), valueReference, index);
    }

    public void removeBranchesAtIndex(long index) {
        VPGDllFunctions.Instance.removeAtIndex(Handle, VPGGitLogProperty.Branches.getValue(), index);
    }

    public void clearBranches() {
        VPGDllFunctions.Instance.clear(Handle, VPGGitLogProperty.Branches.getValue());
    }

    public long getTagsCount() {
        return VPGDllFunctions.Instance.getCount(Handle, VPGGitLogProperty.Tags.getValue());
    }

    public String getTagsAtIndex(long index) {
        PointerByReference result = new PointerByReference();
        VPGDllFunctions.Instance.readStringAtIndex(Handle, VPGGitLogProperty.Tags.getValue(), result, index);
        return result.getValue().getWideString(0);
    }

    public void setTagsAtIndex(long index, String value) {
        Pointer valuePtr = new Memory(Native.WCHAR_SIZE * (value.length() + 1));
        valuePtr.setWideString(0, value);
        PointerByReference valueReference = new PointerByReference();
        valueReference.setValue(valuePtr);
        VPGDllFunctions.Instance.writeStringAtIndex(Handle, VPGGitLogProperty.Tags.getValue(), valueReference, index);
    }

    public void insertTags(String value) {
        insertTagsAtIndex(-1, value);
    }

    public void insertTagsAtIndex(long index, String value) {
        Pointer valuePtr = new Memory(Native.WCHAR_SIZE * (value.length() + 1));
        valuePtr.setWideString(0, value);
        PointerByReference valueReference = new PointerByReference();
        valueReference.setValue(valuePtr);
        VPGDllFunctions.Instance.insertStringAtIndex(Handle, VPGGitLogProperty.Tags.getValue(), valueReference, index);
    }

    public void removeTagsAtIndex(long index) {
        VPGDllFunctions.Instance.removeAtIndex(Handle, VPGGitLogProperty.Tags.getValue(), index);
    }

    public void clearTags() {
        VPGDllFunctions.Instance.clear(Handle, VPGGitLogProperty.Tags.getValue());
    }

    public String getAuthor() {
        PointerByReference result = new PointerByReference();
        VPGDllFunctions.Instance.readString(Handle, VPGGitLogProperty.Author.getValue(), result);
        return result.getValue().getWideString(0);
    }

    public void setAuthor(String value) {
        Pointer valuePtr = new Memory(Native.WCHAR_SIZE * (value.length() + 1));
        valuePtr.setWideString(0, value);
        PointerByReference valueReference = new PointerByReference();
        valueReference.setValue(valuePtr);
        VPGDllFunctions.Instance.writeString(Handle, VPGGitLogProperty.Author.getValue(), valueReference);
    }

    public String getAuthorEmail() {
        PointerByReference result = new PointerByReference();
        VPGDllFunctions.Instance.readString(Handle, VPGGitLogProperty.AuthorEmail.getValue(), result);
        return result.getValue().getWideString(0);
    }

    public void setAuthorEmail(String value) {
        Pointer valuePtr = new Memory(Native.WCHAR_SIZE * (value.length() + 1));
        valuePtr.setWideString(0, value);
        PointerByReference valueReference = new PointerByReference();
        valueReference.setValue(valuePtr);
        VPGDllFunctions.Instance.writeString(Handle, VPGGitLogProperty.AuthorEmail.getValue(), valueReference);
    }

    public long getAuthorDate() {
        return VPGDllFunctions.Instance.readLong(Handle, VPGGitLogProperty.AuthorDate.getValue());
    }

    public void setAuthorDate(long value) {
        VPGDllFunctions.Instance.writeLong(Handle, VPGGitLogProperty.AuthorDate.getValue(), value);
    }

    public String getAuthorDateStr() {
        PointerByReference result = new PointerByReference();
        VPGDllFunctions.Instance.readString(Handle, VPGGitLogProperty.AuthorDateStr.getValue(), result);
        return result.getValue().getWideString(0);
    }

    public void setAuthorDateStr(String value) {
        Pointer valuePtr = new Memory(Native.WCHAR_SIZE * (value.length() + 1));
        valuePtr.setWideString(0, value);
        PointerByReference valueReference = new PointerByReference();
        valueReference.setValue(valuePtr);
        VPGDllFunctions.Instance.writeString(Handle, VPGGitLogProperty.AuthorDateStr.getValue(), valueReference);
    }

    public String getCommitter() {
        PointerByReference result = new PointerByReference();
        VPGDllFunctions.Instance.readString(Handle, VPGGitLogProperty.Committer.getValue(), result);
        return result.getValue().getWideString(0);
    }

    public void setCommitter(String value) {
        Pointer valuePtr = new Memory(Native.WCHAR_SIZE * (value.length() + 1));
        valuePtr.setWideString(0, value);
        PointerByReference valueReference = new PointerByReference();
        valueReference.setValue(valuePtr);
        VPGDllFunctions.Instance.writeString(Handle, VPGGitLogProperty.Committer.getValue(), valueReference);
    }

    public String getCommitterEmail() {
        PointerByReference result = new PointerByReference();
        VPGDllFunctions.Instance.readString(Handle, VPGGitLogProperty.CommitterEmail.getValue(), result);
        return result.getValue().getWideString(0);
    }

    public void setCommitterEmail(String value) {
        Pointer valuePtr = new Memory(Native.WCHAR_SIZE * (value.length() + 1));
        valuePtr.setWideString(0, value);
        PointerByReference valueReference = new PointerByReference();
        valueReference.setValue(valuePtr);
        VPGDllFunctions.Instance.writeString(Handle, VPGGitLogProperty.CommitterEmail.getValue(), valueReference);
    }

    public long getCommitDate() {
        return VPGDllFunctions.Instance.readLong(Handle, VPGGitLogProperty.CommitDate.getValue());
    }

    public void setCommitDate(long value) {
        VPGDllFunctions.Instance.writeLong(Handle, VPGGitLogProperty.CommitDate.getValue(), value);
    }

    public String getCommitDateStr() {
        PointerByReference result = new PointerByReference();
        VPGDllFunctions.Instance.readString(Handle, VPGGitLogProperty.CommitDateStr.getValue(), result);
        return result.getValue().getWideString(0);
    }

    public void setCommitDateStr(String value) {
        Pointer valuePtr = new Memory(Native.WCHAR_SIZE * (value.length() + 1));
        valuePtr.setWideString(0, value);
        PointerByReference valueReference = new PointerByReference();
        valueReference.setValue(valuePtr);
        VPGDllFunctions.Instance.writeString(Handle, VPGGitLogProperty.CommitDateStr.getValue(), valueReference);
    }

    public String getTitle() {
        PointerByReference result = new PointerByReference();
        VPGDllFunctions.Instance.readString(Handle, VPGGitLogProperty.Title.getValue(), result);
        return result.getValue().getWideString(0);
    }

    public void setTitle(String value) {
        Pointer valuePtr = new Memory(Native.WCHAR_SIZE * (value.length() + 1));
        valuePtr.setWideString(0, value);
        PointerByReference valueReference = new PointerByReference();
        valueReference.setValue(valuePtr);
        VPGDllFunctions.Instance.writeString(Handle, VPGGitLogProperty.Title.getValue(), valueReference);
    }

    public String getMessage() {
        PointerByReference result = new PointerByReference();
        VPGDllFunctions.Instance.readString(Handle, VPGGitLogProperty.Message.getValue(), result);
        return result.getValue().getWideString(0);
    }

    public void setMessage(String value) {
        Pointer valuePtr = new Memory(Native.WCHAR_SIZE * (value.length() + 1));
        valuePtr.setWideString(0, value);
        PointerByReference valueReference = new PointerByReference();
        valueReference.setValue(valuePtr);
        VPGDllFunctions.Instance.writeString(Handle, VPGGitLogProperty.Message.getValue(), valueReference);
    }

    public String getFullMessage() {
        PointerByReference result = new PointerByReference();
        VPGDllFunctions.Instance.readString(Handle, VPGGitLogProperty.FullMessage.getValue(), result);
        return result.getValue().getWideString(0);
    }

    public void setFullMessage(String value) {
        Pointer valuePtr = new Memory(Native.WCHAR_SIZE * (value.length() + 1));
        valuePtr.setWideString(0, value);
        PointerByReference valueReference = new PointerByReference();
        valueReference.setValue(valuePtr);
        VPGDllFunctions.Instance.writeString(Handle, VPGGitLogProperty.FullMessage.getValue(), valueReference);
    }
    // </editor-fold>
}
