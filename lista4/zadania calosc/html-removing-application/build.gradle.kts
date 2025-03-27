plugins {
    id("java")
    id("application")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    implementation(project(":html-remover"))
}

application {
    mainClass.set("pl.edu.pwr.app.Application")
}

tasks.test {
    useJUnitPlatform()
}