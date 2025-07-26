version = 1

cloudstream {
    // Descrizione del provider
    description = "Movies and Shows from DinoStreaming"
    authors = listOf("doGior")

    /**
     * Status:
     * 0: Down | 1: Ok | 2: Slow | 3: Beta only
     */
    status = 1

    tvTypes = listOf("Movie", "TvSeries")
    requiresResources = false
    language = "it"

    iconUrl = "https://dinostreaming.it/favicon.ico"
}

dependencies {
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.10.1")
}
