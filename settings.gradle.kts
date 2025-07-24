pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
   plugins {
    alias(libs.plugins.`android-gradle-plugin`)
    alias(libs.plugins.`kotlin-android`)
    alias(libs.plugins.`kotlin-compose`)
    alias(libs.plugins.`kotlin-kapt`)
}
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }

    // register the TOML for dependencies
    versionCatalogs {
        create("libs") {
            from(files("gradle/libs.versions.toml"))
        }
    }
}

rootProject.name = "btst"
include(":app")
