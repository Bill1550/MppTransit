import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm")
    kotlin( "plugin.serialization" ) version (Versions.Kotlin.main)
    application
}

group = "com.loneoaktech.apps"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation( project(":shared") )
    implementation( "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.Kotlin.coroutines}" )
    testImplementation(kotlin("test-junit"))
}

tasks.test {
    useJUnit()
}

tasks.withType<KotlinCompile>() {
    kotlinOptions.jvmTarget = "1.8"
}

application {
    mainClassName = "MainKt"
}