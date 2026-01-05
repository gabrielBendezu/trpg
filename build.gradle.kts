plugins {
    kotlin("jvm") version "2.2.21" apply false
    kotlin("android") version "2.1.0" apply false
    kotlin("plugin.compose") version "2.1.0" apply false
    id("com.android.application") version "8.2.0" apply false
}

allprojects {
    group = "io.github.gabrielbendezu"
    version = "1.0-SNAPSHOT"

    repositories {
        google()
        mavenCentral()
    }
}