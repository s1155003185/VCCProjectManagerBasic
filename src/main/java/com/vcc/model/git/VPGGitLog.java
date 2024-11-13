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

    public long getColumnIndex() {
        return VPGDllFunctions.Instance.ReadLong(Handle, VPGGitLogProperty.ColumnIndex.getValue(), -1);
    }

    public void setColumnIndex(long value) {
        VPGDllFunctions.Instance.WriteLong(Handle, VPGGitLogProperty.ColumnIndex.getValue(), value, -1);
    }

    public String getHashID() {
        PointerByReference result = new PointerByReference();
        VPGDllFunctions.Instance.ReadString(Handle, VPGGitLogProperty.HashID.getValue(), result, -1);
        return result.getValue().getWideString(0);
    }

    public void setHashID(String value) {
        Pointer valuePtr = new Memory(Native.WCHAR_SIZE * (value.length() + 1));
        valuePtr.setWideString(0, value);
        PointerByReference valueReference = new PointerByReference();
        valueReference.setValue(valuePtr);
        VPGDllFunctions.Instance.WriteString(Handle, VPGGitLogProperty.HashID.getValue(), valueReference, -1);
    }

    public String getAbbreviatedHashID() {
        PointerByReference result = new PointerByReference();
        VPGDllFunctions.Instance.ReadString(Handle, VPGGitLogProperty.AbbreviatedHashID.getValue(), result, -1);
        return result.getValue().getWideString(0);
    }

    public void setAbbreviatedHashID(String value) {
        Pointer valuePtr = new Memory(Native.WCHAR_SIZE * (value.length() + 1));
        valuePtr.setWideString(0, value);
        PointerByReference valueReference = new PointerByReference();
        valueReference.setValue(valuePtr);
        VPGDllFunctions.Instance.WriteString(Handle, VPGGitLogProperty.AbbreviatedHashID.getValue(), valueReference, -1);
    }

    public String getTreeHashID() {
        PointerByReference result = new PointerByReference();
        VPGDllFunctions.Instance.ReadString(Handle, VPGGitLogProperty.TreeHashID.getValue(), result, -1);
        return result.getValue().getWideString(0);
    }

    public void setTreeHashID(String value) {
        Pointer valuePtr = new Memory(Native.WCHAR_SIZE * (value.length() + 1));
        valuePtr.setWideString(0, value);
        PointerByReference valueReference = new PointerByReference();
        valueReference.setValue(valuePtr);
        VPGDllFunctions.Instance.WriteString(Handle, VPGGitLogProperty.TreeHashID.getValue(), valueReference, -1);
    }

    public String getAbbreviatedTreeHashID() {
        PointerByReference result = new PointerByReference();
        VPGDllFunctions.Instance.ReadString(Handle, VPGGitLogProperty.AbbreviatedTreeHashID.getValue(), result, -1);
        return result.getValue().getWideString(0);
    }

    public void setAbbreviatedTreeHashID(String value) {
        Pointer valuePtr = new Memory(Native.WCHAR_SIZE * (value.length() + 1));
        valuePtr.setWideString(0, value);
        PointerByReference valueReference = new PointerByReference();
        valueReference.setValue(valuePtr);
        VPGDllFunctions.Instance.WriteString(Handle, VPGGitLogProperty.AbbreviatedTreeHashID.getValue(), valueReference, -1);
    }

    public long getParentHashIDsCount() {
        return VPGDllFunctions.Instance.GetContainerCount(Handle, VPGGitLogProperty.ParentHashIDs.getValue());
    }

    public String getParentHashIDsAt(long index) {
        PointerByReference result = new PointerByReference();
        VPGDllFunctions.Instance.ReadString(Handle, VPGGitLogProperty.ParentHashIDs.getValue(), result, index);
        return result.getValue().getWideString(0);
    }

    public void setParentHashIDsAt(long index, String value) {
        Pointer valuePtr = new Memory(Native.WCHAR_SIZE * (value.length() + 1));
        valuePtr.setWideString(0, value);
        PointerByReference valueReference = new PointerByReference();
        valueReference.setValue(valuePtr);
        VPGDllFunctions.Instance.WriteString(Handle, VPGGitLogProperty.ParentHashIDs.getValue(), valueReference, index);
    }

    public void insertParentHashIDs(String value) {
        insertParentHashIDsAt(-1, value);
    }

    public void insertParentHashIDsAt(long index, String value) {
        Pointer valuePtr = new Memory(Native.WCHAR_SIZE * (value.length() + 1));
        valuePtr.setWideString(0, value);
        PointerByReference valueReference = new PointerByReference();
        valueReference.setValue(valuePtr);
        VPGDllFunctions.Instance.InsertString(Handle, VPGGitLogProperty.ParentHashIDs.getValue(), valueReference, index);
    }

    public void removeParentHashIDsAt(long index) {
        VPGDllFunctions.Instance.RemoveContainerElement(Handle, VPGGitLogProperty.ParentHashIDs.getValue(), index);
    }

    public void clearParentHashIDs() {
        VPGDllFunctions.Instance.ClearContainer(Handle, VPGGitLogProperty.ParentHashIDs.getValue());
    }

    public long getAbbreviatedParentHashIDsCount() {
        return VPGDllFunctions.Instance.GetContainerCount(Handle, VPGGitLogProperty.AbbreviatedParentHashIDs.getValue());
    }

    public String getAbbreviatedParentHashIDsAt(long index) {
        PointerByReference result = new PointerByReference();
        VPGDllFunctions.Instance.ReadString(Handle, VPGGitLogProperty.AbbreviatedParentHashIDs.getValue(), result, index);
        return result.getValue().getWideString(0);
    }

    public void setAbbreviatedParentHashIDsAt(long index, String value) {
        Pointer valuePtr = new Memory(Native.WCHAR_SIZE * (value.length() + 1));
        valuePtr.setWideString(0, value);
        PointerByReference valueReference = new PointerByReference();
        valueReference.setValue(valuePtr);
        VPGDllFunctions.Instance.WriteString(Handle, VPGGitLogProperty.AbbreviatedParentHashIDs.getValue(), valueReference, index);
    }

    public void insertAbbreviatedParentHashIDs(String value) {
        insertAbbreviatedParentHashIDsAt(-1, value);
    }

    public void insertAbbreviatedParentHashIDsAt(long index, String value) {
        Pointer valuePtr = new Memory(Native.WCHAR_SIZE * (value.length() + 1));
        valuePtr.setWideString(0, value);
        PointerByReference valueReference = new PointerByReference();
        valueReference.setValue(valuePtr);
        VPGDllFunctions.Instance.InsertString(Handle, VPGGitLogProperty.AbbreviatedParentHashIDs.getValue(), valueReference, index);
    }

    public void removeAbbreviatedParentHashIDsAt(long index) {
        VPGDllFunctions.Instance.RemoveContainerElement(Handle, VPGGitLogProperty.AbbreviatedParentHashIDs.getValue(), index);
    }

    public void clearAbbreviatedParentHashIDs() {
        VPGDllFunctions.Instance.ClearContainer(Handle, VPGGitLogProperty.AbbreviatedParentHashIDs.getValue());
    }

    public boolean getIsHead() {
        return VPGDllFunctions.Instance.ReadBool(Handle, VPGGitLogProperty.IsHead.getValue(), -1);
    }

    public void setIsHead(boolean value) {
        VPGDllFunctions.Instance.WriteBool(Handle, VPGGitLogProperty.IsHead.getValue(), value, -1);
    }

    public long getBranchesCount() {
        return VPGDllFunctions.Instance.GetContainerCount(Handle, VPGGitLogProperty.Branches.getValue());
    }

    public String getBranchesAt(long index) {
        PointerByReference result = new PointerByReference();
        VPGDllFunctions.Instance.ReadString(Handle, VPGGitLogProperty.Branches.getValue(), result, index);
        return result.getValue().getWideString(0);
    }

    public void setBranchesAt(long index, String value) {
        Pointer valuePtr = new Memory(Native.WCHAR_SIZE * (value.length() + 1));
        valuePtr.setWideString(0, value);
        PointerByReference valueReference = new PointerByReference();
        valueReference.setValue(valuePtr);
        VPGDllFunctions.Instance.WriteString(Handle, VPGGitLogProperty.Branches.getValue(), valueReference, index);
    }

    public void insertBranches(String value) {
        insertBranchesAt(-1, value);
    }

    public void insertBranchesAt(long index, String value) {
        Pointer valuePtr = new Memory(Native.WCHAR_SIZE * (value.length() + 1));
        valuePtr.setWideString(0, value);
        PointerByReference valueReference = new PointerByReference();
        valueReference.setValue(valuePtr);
        VPGDllFunctions.Instance.InsertString(Handle, VPGGitLogProperty.Branches.getValue(), valueReference, index);
    }

    public void removeBranchesAt(long index) {
        VPGDllFunctions.Instance.RemoveContainerElement(Handle, VPGGitLogProperty.Branches.getValue(), index);
    }

    public void clearBranches() {
        VPGDllFunctions.Instance.ClearContainer(Handle, VPGGitLogProperty.Branches.getValue());
    }

    public long getTagsCount() {
        return VPGDllFunctions.Instance.GetContainerCount(Handle, VPGGitLogProperty.Tags.getValue());
    }

    public String getTagsAt(long index) {
        PointerByReference result = new PointerByReference();
        VPGDllFunctions.Instance.ReadString(Handle, VPGGitLogProperty.Tags.getValue(), result, index);
        return result.getValue().getWideString(0);
    }

    public void setTagsAt(long index, String value) {
        Pointer valuePtr = new Memory(Native.WCHAR_SIZE * (value.length() + 1));
        valuePtr.setWideString(0, value);
        PointerByReference valueReference = new PointerByReference();
        valueReference.setValue(valuePtr);
        VPGDllFunctions.Instance.WriteString(Handle, VPGGitLogProperty.Tags.getValue(), valueReference, index);
    }

    public void insertTags(String value) {
        insertTagsAt(-1, value);
    }

    public void insertTagsAt(long index, String value) {
        Pointer valuePtr = new Memory(Native.WCHAR_SIZE * (value.length() + 1));
        valuePtr.setWideString(0, value);
        PointerByReference valueReference = new PointerByReference();
        valueReference.setValue(valuePtr);
        VPGDllFunctions.Instance.InsertString(Handle, VPGGitLogProperty.Tags.getValue(), valueReference, index);
    }

    public void removeTagsAt(long index) {
        VPGDllFunctions.Instance.RemoveContainerElement(Handle, VPGGitLogProperty.Tags.getValue(), index);
    }

    public void clearTags() {
        VPGDllFunctions.Instance.ClearContainer(Handle, VPGGitLogProperty.Tags.getValue());
    }

    public String getAuthor() {
        PointerByReference result = new PointerByReference();
        VPGDllFunctions.Instance.ReadString(Handle, VPGGitLogProperty.Author.getValue(), result, -1);
        return result.getValue().getWideString(0);
    }

    public void setAuthor(String value) {
        Pointer valuePtr = new Memory(Native.WCHAR_SIZE * (value.length() + 1));
        valuePtr.setWideString(0, value);
        PointerByReference valueReference = new PointerByReference();
        valueReference.setValue(valuePtr);
        VPGDllFunctions.Instance.WriteString(Handle, VPGGitLogProperty.Author.getValue(), valueReference, -1);
    }

    public String getAuthorEmail() {
        PointerByReference result = new PointerByReference();
        VPGDllFunctions.Instance.ReadString(Handle, VPGGitLogProperty.AuthorEmail.getValue(), result, -1);
        return result.getValue().getWideString(0);
    }

    public void setAuthorEmail(String value) {
        Pointer valuePtr = new Memory(Native.WCHAR_SIZE * (value.length() + 1));
        valuePtr.setWideString(0, value);
        PointerByReference valueReference = new PointerByReference();
        valueReference.setValue(valuePtr);
        VPGDllFunctions.Instance.WriteString(Handle, VPGGitLogProperty.AuthorEmail.getValue(), valueReference, -1);
    }

    public long getAuthorDate() {
        return VPGDllFunctions.Instance.ReadLong(Handle, VPGGitLogProperty.AuthorDate.getValue(), -1);
    }

    public void setAuthorDate(long value) {
        VPGDllFunctions.Instance.WriteLong(Handle, VPGGitLogProperty.AuthorDate.getValue(), value, -1);
    }

    public String getAuthorDateStr() {
        PointerByReference result = new PointerByReference();
        VPGDllFunctions.Instance.ReadString(Handle, VPGGitLogProperty.AuthorDateStr.getValue(), result, -1);
        return result.getValue().getWideString(0);
    }

    public void setAuthorDateStr(String value) {
        Pointer valuePtr = new Memory(Native.WCHAR_SIZE * (value.length() + 1));
        valuePtr.setWideString(0, value);
        PointerByReference valueReference = new PointerByReference();
        valueReference.setValue(valuePtr);
        VPGDllFunctions.Instance.WriteString(Handle, VPGGitLogProperty.AuthorDateStr.getValue(), valueReference, -1);
    }

    public String getCommitter() {
        PointerByReference result = new PointerByReference();
        VPGDllFunctions.Instance.ReadString(Handle, VPGGitLogProperty.Committer.getValue(), result, -1);
        return result.getValue().getWideString(0);
    }

    public void setCommitter(String value) {
        Pointer valuePtr = new Memory(Native.WCHAR_SIZE * (value.length() + 1));
        valuePtr.setWideString(0, value);
        PointerByReference valueReference = new PointerByReference();
        valueReference.setValue(valuePtr);
        VPGDllFunctions.Instance.WriteString(Handle, VPGGitLogProperty.Committer.getValue(), valueReference, -1);
    }

    public String getCommitterEmail() {
        PointerByReference result = new PointerByReference();
        VPGDllFunctions.Instance.ReadString(Handle, VPGGitLogProperty.CommitterEmail.getValue(), result, -1);
        return result.getValue().getWideString(0);
    }

    public void setCommitterEmail(String value) {
        Pointer valuePtr = new Memory(Native.WCHAR_SIZE * (value.length() + 1));
        valuePtr.setWideString(0, value);
        PointerByReference valueReference = new PointerByReference();
        valueReference.setValue(valuePtr);
        VPGDllFunctions.Instance.WriteString(Handle, VPGGitLogProperty.CommitterEmail.getValue(), valueReference, -1);
    }

    public long getCommitDate() {
        return VPGDllFunctions.Instance.ReadLong(Handle, VPGGitLogProperty.CommitDate.getValue(), -1);
    }

    public void setCommitDate(long value) {
        VPGDllFunctions.Instance.WriteLong(Handle, VPGGitLogProperty.CommitDate.getValue(), value, -1);
    }

    public String getCommitDateStr() {
        PointerByReference result = new PointerByReference();
        VPGDllFunctions.Instance.ReadString(Handle, VPGGitLogProperty.CommitDateStr.getValue(), result, -1);
        return result.getValue().getWideString(0);
    }

    public void setCommitDateStr(String value) {
        Pointer valuePtr = new Memory(Native.WCHAR_SIZE * (value.length() + 1));
        valuePtr.setWideString(0, value);
        PointerByReference valueReference = new PointerByReference();
        valueReference.setValue(valuePtr);
        VPGDllFunctions.Instance.WriteString(Handle, VPGGitLogProperty.CommitDateStr.getValue(), valueReference, -1);
    }

    public String getTitle() {
        PointerByReference result = new PointerByReference();
        VPGDllFunctions.Instance.ReadString(Handle, VPGGitLogProperty.Title.getValue(), result, -1);
        return result.getValue().getWideString(0);
    }

    public void setTitle(String value) {
        Pointer valuePtr = new Memory(Native.WCHAR_SIZE * (value.length() + 1));
        valuePtr.setWideString(0, value);
        PointerByReference valueReference = new PointerByReference();
        valueReference.setValue(valuePtr);
        VPGDllFunctions.Instance.WriteString(Handle, VPGGitLogProperty.Title.getValue(), valueReference, -1);
    }

    public String getMessage() {
        PointerByReference result = new PointerByReference();
        VPGDllFunctions.Instance.ReadString(Handle, VPGGitLogProperty.Message.getValue(), result, -1);
        return result.getValue().getWideString(0);
    }

    public void setMessage(String value) {
        Pointer valuePtr = new Memory(Native.WCHAR_SIZE * (value.length() + 1));
        valuePtr.setWideString(0, value);
        PointerByReference valueReference = new PointerByReference();
        valueReference.setValue(valuePtr);
        VPGDllFunctions.Instance.WriteString(Handle, VPGGitLogProperty.Message.getValue(), valueReference, -1);
    }

    public String getFullMessage() {
        PointerByReference result = new PointerByReference();
        VPGDllFunctions.Instance.ReadString(Handle, VPGGitLogProperty.FullMessage.getValue(), result, -1);
        return result.getValue().getWideString(0);
    }

    public void setFullMessage(String value) {
        Pointer valuePtr = new Memory(Native.WCHAR_SIZE * (value.length() + 1));
        valuePtr.setWideString(0, value);
        PointerByReference valueReference = new PointerByReference();
        valueReference.setValue(valuePtr);
        VPGDllFunctions.Instance.WriteString(Handle, VPGGitLogProperty.FullMessage.getValue(), valueReference, -1);
    }
}
