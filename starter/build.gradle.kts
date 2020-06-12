plugins {
    id("org.springframework.boot") version "2.3.1.RELEASE"
}

dependencies {
    implementation(project(":module"))
}

tasks {
    jar {
        enabled = true
    }
    bootJar {
        archiveClassifier.set("boot")
    }
}