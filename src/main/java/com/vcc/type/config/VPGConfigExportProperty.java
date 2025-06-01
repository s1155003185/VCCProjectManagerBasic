package com.vcc.type.config;

import java.util.Objects;

public enum VPGConfigExportProperty {
    Interface(0),
    Workspace(1),
    IsExportExternalLib(2),
    ExportDirectoryDll(3),
    ExportDirectoryExe(4),
    DllBridgeDirectory(5),
    FormDirectory(6),
    ObjectDirectory(7),
    TypeDirectory(8);

    public final Integer value;

    VPGConfigExportProperty(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    public static VPGConfigExportProperty parse(Integer value) {
        for (VPGConfigExportProperty type : values()) {
            if (Objects.equals(type.value, value)) {
                return type;
            }
        }
        throw new IllegalArgumentException("Invalid VPGConfigExportProperty value: " + value);
    }

}
