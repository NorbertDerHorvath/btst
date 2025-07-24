plugins {
    alias(libs.plugins.androidGradlePlugin)
    alias(libs.plugins.kotlinAndroid)
    alias(libs.plugins.kotlinCompose)
    alias(libs.plugins.kotlinKapt)
}

android {
    namespace   = "com.boktransporte.btst"
    compileSdk  = 36

    defaultConfig {
        applicationId = "com.boktransporte.btst"
        minSdk        = 24
        targetSdk     = 36
        versionCode   = 1
        versionName   = "1.0"
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    buildFeatures {
        compose = true
    }

    composeOptions {
        kotlinCompilerExtensionVersion = libs.versions["compose-compiler"].get()
    }
}

kotlin {
    jvmToolchain(17)
}

dependencies {
    implementation(libs.androidx.room.runtime)
    implementation(libs.androidx.room.ktx)
    kapt         (libs.androidx.room.compiler)

    implementation(libs.androidx.lifecycle.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(libs.androidx.compose.ui)
    implementation(libs.androidx.compose.material)
}
