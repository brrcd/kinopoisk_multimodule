plugins {
    id("com.android.application").version("7.4.0").apply(false)
    id("com.android.library").version("7.4.0").apply(false)
    id("com.google.gms.google-services").version("4.3.14").apply(false)
    kotlin("android").version("1.8.0").apply(false)
    kotlin("plugin.serialization").version("1.8.0").apply(false)
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}