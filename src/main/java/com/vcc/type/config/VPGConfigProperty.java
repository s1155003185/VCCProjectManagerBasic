package com.vcc.type.config;

import java.util.Objects;

public enum VPGConfigProperty {
    Version(0),
    ProjectType(1),
    ProjectPrefix(2),
    ProjectName(3),
    ProjectNameDll(4),
    ProjectNameExe(5),
    IsGit(6),
    Template(7),
    TemplateUrl(8),
    TemplateWorkspace(9),
    TemplateIsExcludeUnittest(10),
    TemplateIsExcludeVCCUnitTest(11),
    Behavior(12),
    BehaviorActionHistoryType(13),
    BehaviorIsActionResultThrowException(14),
    Input(15),
    InputTypeWorkspace(16),
    Output(17),
    OutputExceptionTypeDirectory(18),
    OutputObjectTypeDirectory(19),
    OutputApplicationDirectoryHpp(20),
    OutputApplicationDirectoryCpp(21),
    OutputActionDirectoryHpp(22),
    OutputActionDirectoryCpp(23),
    OutputFormDirectoryHpp(24),
    OutputFormDirectoryCpp(25),
    OutputObjectDirectoryHpp(26),
    OutputObjectDirectoryCpp(27),
    OutputPropertyAccessorDirectoryHpp(28),
    OutputPropertyAccessorDirectoryCpp(29),
    OutputObjectFactoryDirectoryHpp(30),
    OutputObjectFactoryDirectoryCpp(31),
    OutputPropertyAccessorFactoryDirectoryHpp(32),
    OutputPropertyAccessorFactoryDirectoryCpp(33),
    OutputUnittestActionDirectoryCpp(34),
    Plugins(35),
    Exports(36);

    public final Integer value;

    VPGConfigProperty(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    public static VPGConfigProperty parse(Integer value) {
        for (VPGConfigProperty type : values()) {
            if (Objects.equals(type.value, value)) {
                return type;
            }
        }
        throw new IllegalArgumentException("Invalid VPGConfigProperty value: " + value);
    }

}
