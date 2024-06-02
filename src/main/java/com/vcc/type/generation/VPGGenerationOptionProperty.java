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
    ActionTypeDirectory(12),
    ExceptionTypeDirectory(13),
    ManagerTypeDirectory(14),
    ObjectTypeDirectory(15),
    ObjectDirectoryHpp(16),
    ObjectDirectoryCpp(17),
    PropertyAccessorDirectoryHpp(18),
    PropertyAccessorDirectoryCpp(19),
    ObjectFactoryDirectoryHpp(20),
    ObjectFactoryDirectoryCpp(21),
    PropertyAccessorFactoryDirectoryHpp(22),
    PropertyAccessorFactoryDirectoryCpp(23),
    Plugins(24),
    Exports(25);

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
