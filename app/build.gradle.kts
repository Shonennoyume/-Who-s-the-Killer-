
plugins {
    id("com.android.application")
}

android {
    namespace = "com.whosthekiller.game"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.whosthekiller.game"
        minSdk = 23
        targetSdk = 28
        versionCode = 3
        versionName = "0.3.0"
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
}
