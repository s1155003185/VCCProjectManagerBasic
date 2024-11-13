package com.vcc.type.git;

import java.util.Objects;

public enum VPGGitLogProperty {
    ColumnIndex(0),
    HashID(1),
    AbbreviatedHashID(2),
    TreeHashID(3),
    AbbreviatedTreeHashID(4),
    ParentHashIDs(5),
    AbbreviatedParentHashIDs(6),
    IsHead(7),
    Branches(8),
    Tags(9),
    Author(10),
    AuthorEmail(11),
    AuthorDate(12),
    AuthorDateStr(13),
    Committer(14),
    CommitterEmail(15),
    CommitDate(16),
    CommitDateStr(17),
    Title(18),
    Message(19),
    FullMessage(20);

    public final Integer value;

    VPGGitLogProperty(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    public static VPGGitLogProperty parse(Integer value) {
        for (VPGGitLogProperty type : values()) {
            if (Objects.equals(type.value, value)) {
                return type;
            }
        }
        throw new IllegalArgumentException("Invalid VPGGitLogProperty value: " + value);
    }

}
