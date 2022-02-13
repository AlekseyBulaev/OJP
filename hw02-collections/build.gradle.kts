plugins {
    java
}

group = rootProject.group
version = rootProject.version
val guavaVersion: String by project

repositories {
    mavenCentral()
}

dependencies {
    implementation("com.google.guava:guava:$guavaVersion")

    // https://mvnrepository.com/artifact/org.assertj/assertj-core
    testImplementation("org.assertj:assertj-core:3.22.0")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.6.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}