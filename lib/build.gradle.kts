plugins {
    kotlin("jvm") version "1.9.22"
}

dependencies {
    // JUnit
    testImplementation(platform("org.junit:junit-bom:5.10.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testImplementation("org.junit.platform:junit-platform-suite-engine")
    testRuntimeOnly("org.junit.platform:junit-platform-suite-engine")
    // Cucumber
    testImplementation("io.cucumber:cucumber-java:7.15.0")
    testImplementation("io.cucumber:cucumber-junit-platform-engine:7.15.0")
}

tasks.named<Test>("test") {
    useJUnitPlatform()
    distribution {
        enabled.set(true)
        remoteExecutionPreferred.set(true)
        maxLocalExecutors.set(1)
        maxRemoteExecutors.set(2)
    }
}
