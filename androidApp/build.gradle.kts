plugins {
    id("com.android.application")
    kotlin("android")
    kotlin( "plugin.serialization" ) version (Versions.Kotlin.main)
    id( "kotlin-parcelize" )
}

group = "com.loneoaktech.apps"
version = "1.0-SNAPSHOT"

dependencies {
    implementation(project(":shared"))
    implementation("com.google.android.material:material:1.2.1")
    implementation("androidx.appcompat:appcompat:1.2.0")
    implementation("androidx.constraintlayout:constraintlayout:2.0.2")

    testImplementation(kotlin("test-junit"))
    testImplementation("junit:junit:4.13.1")
}

android {
    compileSdkVersion(29)
    defaultConfig {
        applicationId = "com.loneoaktech.apps.androidApp"
        minSdkVersion(24)
        targetSdkVersion(29)
        versionCode = 1
        versionName = "1.0"
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
    buildFeatures {
        viewBinding = true
    }
}