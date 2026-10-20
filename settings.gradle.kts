pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "1.0.0"
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "SSU-Mobile Programming 2026-2"
include(":mp03:mp0301")
include(":mp03:mp0302")
include(":mp03:mp0303")
include(":mp03:mp0304")
include(":mp03:mp0305")
include(":mp03:mp0306")
include(":mp04:mp0401")
include(":mp04:mp0402")
include(":mp04:mp0403")
include(":mp04:mp0404")
include(":mp05:mp0501")
include(":mp05:mp0502")
include(":mp05:mp0503")
include(":mp05:mp0504")
include(":mp05:mp0505")
