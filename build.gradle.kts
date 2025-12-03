plugins {
    id("java")
    id("antlr")
    id("application")
}

group = "org.yyubin"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    antlr("org.antlr:antlr4:4.13.1")
    implementation("org.antlr:antlr4-runtime:4.13.1")

    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.generateGrammarSource {
    maxHeapSize = "64m"
    arguments = arguments + listOf("-visitor", "-long-messages", "-package", "org.yyubin.lpdl.parser")
    outputDirectory = file("src/main/java/org/yyubin/lpdl/parser")
}

tasks.test {
    useJUnitPlatform()
}

application {
    mainClass.set("org.yyubin.lpdl.Main")
}