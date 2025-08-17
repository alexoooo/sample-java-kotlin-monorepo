plugins {
    kotlin("jvm") version "2.0.20"
}

group = "io.github.alexoooo.sample.monorepo.proj"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    mavenLocal()
}

dependencies {
    testImplementation(kotlin("test"))
    implementation("io.github.alexoooo.sample.monorepo.lib", "java-library", "1.0-SNAPSHOT")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(21)
}