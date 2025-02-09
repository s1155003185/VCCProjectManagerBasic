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
    ActionDirectoryHpp(16),
    ActionDirectoryCpp(17),
    FormDirectoryHpp(18),
    FormDirectoryCpp(19),
    ObjectDirectoryHpp(20),
    ObjectDirectoryCpp(21),
    PropertyAccessorDirectoryHpp(22),
    PropertyAccessorDirectoryCpp(23),
    ObjectFactoryDirectoryHpp(24),
    ObjectFactoryDirectoryCpp(25),
    PropertyAccessorFactoryDirectoryHpp(26),
    PropertyAccessorFactoryDirectoryCpp(27),
    Plugins(28),
    Exports(29);

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
