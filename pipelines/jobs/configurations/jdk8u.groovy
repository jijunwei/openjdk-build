targetConfigurations = [
        "x64Mac"        : [
                "hotspot",
                "openj9"
        ],
        "x64Linux"      : [
                "hotspot",
                "openj9",
                "corretto",
                "dragonwell"
        ],
        "x32Windows"    : [
                "hotspot",
                "openj9"
        ],
        "x64Windows"    : [
                "hotspot",
                "openj9"
        ],
        "x64WindowsXL"  : [
                "openj9"
        ],
        "ppc64Aix"      : [
                "hotspot",
                "openj9"
        ],
        "ppc64leLinux"  : [
                "hotspot",
                "openj9"
        ],
        "s390xLinux"    : [
                "hotspot",
                "openj9"
        ],
        "aarch64Linux"  : [
                "hotspot",
                "openj9"
        ],
        "arm32Linux"  : [
                "hotspot"
        ],
        "sparcv9Solaris": [
                "hotspot"
        ],
        "x64Solaris": [
                "hotspot"
        ],
        "x64LinuxXL"       : [
                "openj9"
        ],
        "s390xLinuxXL"       : [
                "openj9"
        ],
        "ppc64leLinuxXL"       : [
                "openj9"
        ],
        "x64MacXL"      : [
                "openj9"
        ]
]

// 17:05
triggerSchedule="TZ=UTC\n05 17 * * *"

return this
