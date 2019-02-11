
//region Versions
// This area is for versions that must be shared by both the buildSrc (for gradle plugins) as well
// as actual implementation in the projects.

val gradleVersion = "3.1.4"
val kotlinVersion = "1.3.21"

//endregion

repositories {
    jcenter()
    google()
}

plugins {
    `kotlin-dsl`
    id("de.fuerstenau.buildconfig") version "1.1.8"
}

buildConfig {
    packageName = "com.fitbit.gradle"
    clsName = "BuildConfig"
    version = "1.0"

    buildConfigField("String", "androidGradlePluginVersion", gradleVersion)
    buildConfigField("String", "kotlinVersion", kotlinVersion)
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib:$kotlinVersion")
    implementation("com.android.tools.build:gradle:$gradleVersion")
}
