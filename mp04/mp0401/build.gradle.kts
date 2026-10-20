plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.b6star.mp0401"
    compileSdk { version = release(37) }
    defaultConfig {
        applicationId = "com.b6star.mp0401"
        minSdk = 26
        targetSdk = 37
        versionCode = 1
        versionName = "1.0"
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}

dependencies {
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.constraintlayout)
}
