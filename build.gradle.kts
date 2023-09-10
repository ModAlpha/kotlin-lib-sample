plugins {
    kotlin("jvm") version "1.9.0"
    `maven-publish`
}

group = "com.mod"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(8)
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            groupId = "com.mod"
            artifactId = "lib-sample"
            version = "1.0.0"

            from(components["java"])
        }
    }
}