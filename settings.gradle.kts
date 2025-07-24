pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
    // Itt NE használj alias-t!
    // Ha nagyon szükséges, így adj meg plugint:
    // plugins {
    //     id("com.android.application") version "8.4.0"
    //     id("org.jetbrains.kotlin.android") version "2.0.21"
    //     id("org.jetbrains.kotlin.plugin.compose") version "2.0.0"
    //     id("org.jetbrains.kotlin.kapt") version "2.0.21"
    // }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
    versionCatalogs {
        create("libs") {
            from(files("gradle/libs.versions.toml"))
        }
    }
}

rootProject.name = "btst"
include(":app")
