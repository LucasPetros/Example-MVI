apply {
    from("$rootDir/base-module.gradle")
}

plugins {
    id("com.android.library")
    kotlin("android")
}

android {
    namespace = "com.lucas.petros.ui"
}