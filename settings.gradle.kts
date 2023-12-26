plugins {
    id("com.gradle.enterprise") version "3.16.1"
    id("com.gradle.common-custom-user-data-gradle-plugin") version "1.12.1"
}

val isCI = !System.getenv("CI").isNullOrEmpty() // adjust to your CI provider

gradleEnterprise {
    server = "https://ge.solutions-team.gradle.com" // adjust to your GE server
    allowUntrustedServer = false // ensure a trusted certificate is configured

    buildScan {
        capture { isTaskInputFiles = true }
        isUploadInBackground = !isCI
        publishAlways()
    }
}

dependencyResolutionManagement {
    repositories {
        mavenCentral()
    }
}

rootProject.name = "cucumber-companion-plugin-example"

include("lib")
