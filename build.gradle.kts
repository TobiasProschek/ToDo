plugins {
    kotlin("jvm") version "2.0.20"
    kotlin("plugin.serialization") version "1.9.22"

}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    runtimeOnly("ch.qos.logback:logback-classic:1.5.16")
    testImplementation(kotlin("test"))
    implementation("com.google.code.gson:gson:2.10.1")
    implementation("io.github.microutils:kotlin-logging:3.0.5") }

tasks.test {
    useJUnitPlatform()
}