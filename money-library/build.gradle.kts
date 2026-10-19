plugins {
    java
    `maven-publish`
}

dependencies {
    implementation("com.google.guava:guava:33.7.2-jre")

    testImplementation("org.assertj:assertj-core:3.27.7")

    testImplementation("org.junit.jupiter:junit-jupiter:5.10.0")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")

}

// публикация
publishing {
    publications {
        create<MavenPublication>("maven") {
            groupId = "com.practicalunittesting"
            artifactId = "money-library"
            version = "1.0"

            from(components["java"])
        }
    }
    repositories {
        maven {
            url = uri("../mvn-repo")
        }
    }
}

repositories {
    mavenCentral()
}


tasks.test {
    useJUnitPlatform()
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
    }
}