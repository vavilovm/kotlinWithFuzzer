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
    compile("commons-cli:commons-cli:1.4")
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
    implementation(intellijDep())
    implementation(intellijCoreDep()) { includeJars("intellij-core") }
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
    implementation(project(":idea:idea-frontend-independent"))
    implementation(project(":idea"))
    implementation(project(":plugins:parcelize:parcelize-compiler"))
    implementation(project(":plugins:parcelize:parcelize-ide"))
    implementation(project(":plugins:parcelize:parcelize-runtime"))
    implementation(project(":kotlin-parcelize-compiler"))

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

    //tmp
    compile(kotlinStdlib("jdk8"))
    compileOnly(project(":kotlin-reflect-api"))
    compile(project(":core:descriptors"))
    compile(project(":core:descriptors.jvm"))
    compile(project(":compiler:backend"))
    compile(project(":compiler:frontend"))
    compile(project(":compiler:frontend.common"))
    compile(project(":compiler:frontend.java"))
    compile(project(":compiler:ir.backend.common")) // TODO: fix import (workaround for jps build)
    compile(project(":js:js.frontend"))
    compile(project(":js:js.serializer"))
    compile(project(":compiler:light-classes"))
    compile(project(":compiler:util"))
    compile(project(":kotlin-build-common"))
    compile(project(":daemon-common"))
    compile(project(":daemon-common-new"))
    compile(projectRuntimeJar(":kotlin-daemon-client"))
    compile(project(":compiler:plugin-api"))
    compile(project(":idea:jvm-debugger:jvm-debugger-util"))
    compile(project(":idea:jvm-debugger:jvm-debugger-core"))
    compile(project(":idea:jvm-debugger:jvm-debugger-evaluation"))
    compile(project(":idea:jvm-debugger:jvm-debugger-sequence"))
    compile(project(":idea:jvm-debugger:jvm-debugger-coroutine"))
    compile(project(":j2k"))
    compile(project(":idea:idea-j2k"))
    compile(project(":idea:formatter"))
    compile(project(":compiler:fir:fir2ir"))
    compile(project(":compiler:fir:resolve"))
    compile(project(":compiler:fir:checkers"))
    compile(project(":compiler:fir:java"))
    compile(project(":compiler:fir:jvm"))
    compile(project(":idea:idea-core"))
    compile(project(":idea:idea-frontend-independent"))
    compile(project(":idea:ide-common"))
    compile(project(":idea:idea-jps-common"))
    compile(project(":idea:kotlin-gradle-tooling"))
    compile(project(":idea:line-indent-provider"))
    compile(project(":plugins:uast-kotlin"))
    compile(project(":plugins:uast-kotlin-idea"))
    compile(project(":kotlin-script-util")) { isTransitive = false }
    compile(project(":kotlin-scripting-intellij"))
    compile(project(":compiler:backend.jvm")) // Do not delete, for Pill
    compile(project(":compiler:backend.jvm:backend.jvm.entrypoint"))

    compile(commonDep("org.jetbrains.kotlinx", "kotlinx-coroutines-core")) { isTransitive = false }

    compileOnly(project(":kotlin-daemon-client"))

    compileOnly(intellijDep())

    compileOnly(intellijPluginDep("java"))
    compileOnly(intellijPluginDep("java"))
    runtime(intellijPluginDep("java"))

    implementation(commonDep("org.jetbrains.intellij.deps.completion", "completion-ranking-kotlin"))
    Ide.IJ {
        implementation(intellijPluginDep("stats-collector"))
    }

    compileOnly(commonDep("org.jetbrains", "markdown"))
    compileOnly(commonDep("com.google.code.findbugs", "jsr305"))
    compileOnly(intellijPluginDep("IntelliLang"))
    compileOnly(intellijPluginDep("copyright"))
    compileOnly(intellijPluginDep("properties"))
    compileOnly(intellijPluginDep("java-i18n"))
    compileOnly(intellijPluginDep("gradle"))


    compileOnly(toolsJar())
    compileOnly(project(":kotlin-reflect-api")) // TODO: fix import (workaround for jps build)
    compile(project(":kotlin-test:kotlin-test-junit"))
    compile(projectTests(":compiler:tests-common"))
    compile(projectTests(":idea:idea-test-framework")) { isTransitive = false }
    compile(project(":idea:idea-jvm")) { isTransitive = false }
    compile(project(":idea:idea-gradle")) { isTransitive = false }
    compile(project(":idea:idea-maven")) { isTransitive = false }
    compile(project(":idea:idea-native")) { isTransitive = false }
    compile(project(":idea:idea-gradle-native")) { isTransitive = false }
    compile(commonDep("junit:junit"))
    compileOnly(intellijPluginDep("coverage"))

    runtimeOnly(toolsJar())
    runtime(commonDep("org.jetbrains", "markdown"))
    runtime(project(":plugins:kapt3-idea")) { isTransitive = false }
    runtime(project(":kotlin-reflect"))
    runtime(project(":kotlin-preloader"))

    compile(project(":kotlin-sam-with-receiver-compiler-plugin")) { isTransitive = false }

    runtime(project(":plugins:android-extensions-compiler"))
    runtimeOnly(project(":kotlin-android-extensions-runtime")) // TODO: fix import (workaround for jps build)
    runtime(project(":plugins:android-extensions-ide")) { isTransitive = false }
    runtime(project(":allopen-ide-plugin")) { isTransitive = false }
    runtime(project(":kotlin-allopen-compiler-plugin"))
    runtime(project(":noarg-ide-plugin")) { isTransitive = false }
    runtime(project(":kotlin-noarg-compiler-plugin"))
    runtime(project(":plugins:annotation-based-compiler-plugins-ide-support")) { isTransitive = false }
    runtime(project(":plugins:parcelize:parcelize-compiler"))
    runtime(project(":plugins:parcelize:parcelize-ide")) { isTransitive = false }
    runtime(project(":kotlin-scripting-idea")) { isTransitive = false }
    runtime(project(":kotlin-scripting-compiler-impl"))
    runtime(project(":sam-with-receiver-ide-plugin")) { isTransitive = false }
    runtime(project(":kotlinx-serialization-compiler-plugin"))
    runtime(project(":kotlinx-serialization-ide-plugin")) { isTransitive = false }
    runtime(project(":idea:idea-android")) { isTransitive = false }
    runtime(project(":plugins:lint")) { isTransitive = false }
    runtime(project(":plugins:uast-kotlin"))
    runtime(project(":nj2k:nj2k-services")) { isTransitive = false }

    (rootProject.extra["compilerModules"] as Array<String>).forEach {
        runtime(project(it))
    }

    compile(intellijPluginDep("IntelliLang"))
    compile(intellijPluginDep("copyright"))
    compile(intellijPluginDep("properties"))
    compile(intellijPluginDep("java-i18n"))
    compile(intellijPluginDep("junit"))

    compileOnly(intellijDep())
    compileOnly(commonDep("com.google.code.findbugs", "jsr305"))
    compileOnly(intellijPluginDep("gradle"))
    compileOnly(intellijPluginDep("Groovy"))


    runtime(intellijPluginDep("junit"))
    runtime(intellijPluginDep("gradle"))
    runtime(intellijPluginDep("Groovy"))
    runtime(intellijPluginDep("coverage"))
    runtime(intellijPluginDep("android"))
    runtime(intellijPluginDep("smali"))
    runtime(intellijPluginDep("testng"))

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

tasks.register<Wrapper>("wrapper") {
    gradleVersion = "6.8.3"
}


tasks.register<Copy>("copyResources") {
    from("../core/builtins/build/serialize/kotlin/")
    into("build/resources/main/kotlin")
}