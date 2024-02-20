plugins {
    `java-library`
    `maven-publish`
}

group = "net.faceless"
version = "1.0"
description = "Simple Library"

repositories {
    maven {
        url = uri("https://repo.papermc.io/repository/maven-public/")
    }
    mavenCentral()
    mavenLocal()
}

dependencies {
    compileOnly("io.papermc.paper:paper-api:1.20.4-R0.1-SNAPSHOT")
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            from(components["java"])
        }
    }
}

