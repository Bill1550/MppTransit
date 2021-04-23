pluginManagement {
    repositories {
        google()
        jcenter()
        gradlePluginPortal()
        mavenCentral()
    }
    
}
rootProject.name = "MppTransit"


include(":androidApp")
include(":shared")
include(":jvmApp")

