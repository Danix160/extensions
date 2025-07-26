// build.gradle.kts
version = 1

plugins {
    id("cloudstream.plugin") version "1.0.0"
}

cloudstream {
    language.set("it")
    apiVersion.set(4)
    pluginClass.set("com.dinostreaming.DinoStreaming")
    description.set("Movies and Shows from DinoStreaming")
    authors.set(listOf("doGior"))
    tvTypes.set(listOf("Movie", "TvSeries"))
    status.set(1)
    iconUrl.set("https://dinostreaming.it/favicon.ico")
}
