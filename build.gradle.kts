plugins {
    `java-library`
    `maven-publish`
}

group = "net.faceless"
version = "1.0"
description = "Simple Library"

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
    toolchain.languageVersion.set(JavaLanguageVersion.of(17))
}

repositories {
    mavenCentral()
    maven {
        url = uri("https://repo.papermc.io/repository/maven-public/")
    }
    maven {
        url = uri("https://jitpack.io")
    }
}

dependencies {
    compileOnly("io.papermc.paper:paper-api:1.20.4-R0.1-SNAPSHOT")
}

tasks.withType(JavaCompile::class.java) {
    options.encoding = "UTF-8"
}

publishing {
    publications {
        create<MavenPublication>("maven") { from(components["java"]) }
    }
}