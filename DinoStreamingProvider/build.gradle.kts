plugins {
    id("com.lagradost.cloudstream3.gradle")
    kotlin("android")
}

version = 1

cloudstream {
    language = "it"
    apiVersion = 4
    description = "Movies and Shows from DinoStreaming"
    authors = listOf("doGior")
    status = 1
    tvTypes = listOf("Movie", "TvSeries")
    requiresResources = false
    iconUrl = "https://dinostreaming.it/favicon.ico"
}

dependencies {
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.10.1")
}
