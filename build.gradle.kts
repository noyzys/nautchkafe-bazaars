plugins {
    java
}

group = "dev.nautchkafe.bazaars"
version = "0.0.1-SNAPSHOT"

allprojects {
    repositories {
        mavenCentral()
    }

    tasks.withType<JavaCompile> {
        targetCompatibility = JavaVersion.VERSION_11.toString()
        sourceCompatibility = JavaVersion.VERSION_11.toString()
    }
}

subprojects {
    // -> apply plugin block
    apply(plugin = "java")
    apply(plugin = "maven-publish")
}

dependencies {
    // bukkit stuff

    // fp stuff
    implementation("io.vavr:vavr:0.10.3")

    // wlz stuff
}

// task registry [clean, global]