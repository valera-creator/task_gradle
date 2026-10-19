plugins {
    id("org.jetbrains.kotlin.jvm") version "1.9.22"
    application
}

repositories {
    mavenCentral()
    maven {
        url = uri("../../mvn-repo")
    }
}

dependencies {
    implementation("com.practicalunittesting:money-library:1.0")
    implementation(project(":greeter-library"))
}

application {
    mainClass = "money.app.App"
}