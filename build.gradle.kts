val koin_version: String by project
val telegram_bot_version: String by project

plugins {
    kotlin("jvm") version "2.0.20"
}

group = "game.bot"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven("https://jitpack.io")
}

dependencies {
    implementation("io.insert-koin:koin-core:$koin_version")
    implementation("io.github.kotlin-telegram-bot.kotlin-telegram-bot:telegram:$telegram_bot_version")
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(20)
}
