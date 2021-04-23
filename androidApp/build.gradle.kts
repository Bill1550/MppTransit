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
    compileSdkVersion(Versions.Android.compileSdk)
    defaultConfig {
        applicationId = "com.loneoaktech.apps.androidApp"
        minSdkVersion(Versions.Android.minSdk)
        targetSdkVersion(Versions.Android.targetSdk)
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
    compileOptions {
//        incremental = true
        sourceCompatibility = Options.javaVersion
        targetCompatibility = Options.javaVersion
    }

    kotlinOptions {
        jvmTarget = Options.javaVersion.toString()
//        freeCompilerArgs = Options.freeCompilerArgs
    }

}