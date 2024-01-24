apply {
    from("$rootDir/base-module.gradle")
}
plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    kotlin("kapt")
}

android {
    namespace = "com.lucas.petros.home"
}

dependencies {
    implementation(project(Modules.ui))
    implementation(project(Modules.core))
}