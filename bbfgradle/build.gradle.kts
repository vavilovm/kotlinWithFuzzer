import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm")
    id("jps-compatible")
    base
}

val kotlinVersion: String by rootProject.extra
val intellij by configurations.creating
val intellijVersion = rootProject.extra["versions.intellijSdk"] as String


sourceSets {
    "main" {
        projectDefault()
    }
}

dependencies {
    implementation("commons-cli:commons-cli:1.4")
    implementation("net.sourceforge.argparse4j:argparse4j:0.8.1")
    implementation(kotlin("stdlib-jdk8"))
    implementation("org.apache.commons:commons-exec:1.3")

    implementation("io.github.java-diff-utils:java-diff-utils:4.5")
    implementation("org.bitbucket.cowwoc:diff-match-patch:1.1")

    //AbiComparator
    implementation("org.jsoup:jsoup:1.13.1")
    //implementation "org.ow2.asm:asm-debug-all:$asm_debug_version"
    implementation("org.ow2.asm:asm:8.0.1")
    implementation("org.ow2.asm:asm-commons:8.0.1")
    implementation("org.apache.commons:commons-text:1.8")
    implementation("org.jetbrains.kotlinx:kotlinx-metadata-jvm:0.1.0")
    implementation("io.github.java-diff-utils:java-diff-utils:4.5")

    //Antlr4
    implementation("org.antlr:antlr4-runtime:4.8-1")
    implementation("org.antlr:antlr4:4.8-1")

    //Kootstrap
    implementation("org.apache.maven:maven-model-builder:3.3.9")
    implementation("org.apache.maven:maven-aether-provider:3.3.3")
    implementation("org.eclipse.aether:aether-api:1.1.0")
    implementation("org.eclipse.aether:aether-util:1.1.0")
    implementation("org.eclipse.aether:aether-impl:1.1.0")
    implementation("org.eclipse.aether:aether-connector-basic:1.1.0")
    implementation("org.eclipse.aether:aether-transport-file:1.1.0")
    implementation("org.eclipse.aether:aether-transport-http:1.1.0")
    implementation("org.eclipse.aether:aether-transport-wagon:1.1.0")
    implementation("org.apache.maven:maven-aether-provider:3.3.3")

    //Kotlin deps
    implementation(intellijCoreDep()) { includeJars("intellij-core") }
    implementation(intellijDep())
    implementation(project(":compiler:psi"))
    implementation(project(":compiler:cli-common"))
    implementation(project(":compiler:cli-js"))
    implementation(project(":compiler:util"))
    implementation(project(":compiler:frontend"))
    implementation(project(":compiler:fir:raw-fir:light-tree2fir"))
    implementation(project(":kotlin-reflect"))
    implementation(project(":kotlin-reflect-api"))
    implementation(project(":core:descriptors"))
    implementation(project(":core:descriptors.jvm"))
    implementation(project(":core:descriptors.runtime"))
    //Stdlib
    implementation(project(":kotlin-stdlib"))
    implementation(project(":kotlin-stdlib-common"))
//    implementation(project(":kotlin-stdlib-js"))
    implementation(project(":kotlin-stdlib-jdk7"))
    implementation(project(":kotlin-stdlib-jdk8"))
    implementation(project(":kotlin-test"))
    implementation(project(":kotlin-test:kotlin-test-annotations-common"))
    implementation(project(":kotlin-test:kotlin-test-common"))
    implementation(project(":kotlin-test:kotlin-test-jvm"))
    implementation(project(":kotlin-test:kotlin-test-junit"))
    implementation(project(":kotlin-test:kotlin-test-junit5"))
    implementation(project(":kotlin-test:kotlin-test-testng"))
//    implementation(project(":kotlin-test:kotlin-test-js"))
    implementation(project(":kotlin-reflect"))
}

repositories {
    mavenCentral()
}

val compileKotlin: KotlinCompile by tasks
compileKotlin.finalizedBy("copyResources")
compileKotlin.kotlinOptions {
    jvmTarget = "1.8"
}

val compileTestKotlin: KotlinCompile by tasks
compileTestKotlin.kotlinOptions {
    jvmTarget = "1.8"
}

tasks.register<Copy>("copyResources") {
    from("../core/builtins/build/serialize/kotlin/")
    into("build/resources/main/kotlin")
}