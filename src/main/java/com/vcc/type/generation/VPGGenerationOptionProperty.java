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
    IsExcludeUnittest(9),
    IsExcludeVCCUnitTest(10),
    TypeWorkspace(11),
    ExceptionTypeDirectory(12),
    ObjectTypeDirectory(13),
    ApplicationDirectoryHpp(14),
    ApplicationDirectoryCpp(15),
    FormDirectoryHpp(16),
    FormDirectoryCpp(17),
    ObjectDirectoryHpp(18),
    ObjectDirectoryCpp(19),
    PropertyAccessorDirectoryHpp(20),
    PropertyAccessorDirectoryCpp(21),
    ObjectFactoryDirectoryHpp(22),
    ObjectFactoryDirectoryCpp(23),
    PropertyAccessorFactoryDirectoryHpp(24),
    PropertyAccessorFactoryDirectoryCpp(25),
    Plugins(26),
    Exports(27);

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
