package com.vcc.type.generation;

import java.util.Objects;

public enum VPGGenerationOptionExportProperty {
    Interface(0),
    Workspace(1),
    IsExportExternalLib(2),
    ExportDirectoryDll(3),
    ExportDirectoryExe(4),
    DllBridgeDirectory(5),
    ObjectDirectory(6),
    TypeDirectory(7);

    public final Integer value;

    VPGGenerationOptionExportProperty(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    public static VPGGenerationOptionExportProperty parse(Integer value) {
        for (VPGGenerationOptionExportProperty type : values()) {
            if (Objects.equals(type.value, value)) {
                return type;
            }
        }
        throw new IllegalArgumentException("Invalid VPGGenerationOptionExportProperty value: " + value);
    }

}
