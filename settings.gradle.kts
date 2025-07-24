pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }

    
    }

    plugins {
        alias(libs.plugins.androidGradlePlugin)
        alias(libs.plugins.kotlinAndroid)
        alias(libs.plugins.kotlinCompose)
        alias(libs.plugins.kotlinKapt)
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
