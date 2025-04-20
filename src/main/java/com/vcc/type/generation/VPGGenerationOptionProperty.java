package com.vcc.type.generation;

import java.util.Objects;

public enum VPGGenerationOptionProperty {
    Version(0),
    ProjectType(1),
    TemplateGitUrl(2),
    TemplateWorkspace(3),
    ProjectPrefix(4),
    ProjectName(5),
    ProjectNameDll(6),
    ProjectNameExe(7),
    IsGit(8),
    IsResultThrowException(9),
    IsExcludeUnittest(10),
    IsExcludeVCCUnitTest(11),
    TypeWorkspace(12),
    ExceptionTypeDirectory(13),
    ObjectTypeDirectory(14),
    ApplicationDirectoryHpp(15),
    ApplicationDirectoryCpp(16),
    ActionDirectoryHpp(17),
    ActionDirectoryCpp(18),
    FormDirectoryHpp(19),
    FormDirectoryCpp(20),
    ObjectDirectoryHpp(21),
    ObjectDirectoryCpp(22),
    PropertyAccessorDirectoryHpp(23),
    PropertyAccessorDirectoryCpp(24),
    ObjectFactoryDirectoryHpp(25),
    ObjectFactoryDirectoryCpp(26),
    PropertyAccessorFactoryDirectoryHpp(27),
    PropertyAccessorFactoryDirectoryCpp(28),
    Plugins(29),
    Exports(30);

    public final Integer value;

    VPGGenerationOptionProperty(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    public static VPGGenerationOptionProperty parse(Integer value) {
        for (VPGGenerationOptionProperty type : values()) {
            if (Objects.equals(type.value, value)) {
                return type;
            }
        }
        throw new IllegalArgumentException("Invalid VPGGenerationOptionProperty value: " + value);
    }

}
