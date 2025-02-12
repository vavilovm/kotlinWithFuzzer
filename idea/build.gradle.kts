import org.apache.tools.ant.filters.ReplaceTokens

plugins {
    kotlin("jvm")
    id("jps-compatible")
}

val kotlinVersion: String by rootProject.extra

sourceSets {
    "main" {
        projectDefault()
        java.srcDirs(
            "idea-completion/src",
            "idea-live-templates/src",
            "idea-repl/src"
        )
        resources.srcDirs(
            "idea-completion/resources",
            "idea-live-templates/resources",
            "idea-repl/resources",
            "resources-en"
        )
        if (kotlinBuildProperties.useFirIdeaPlugin) {
            resources.srcDir("resources-fir")
        } else {
            resources.srcDir("resources-descriptors")
        }
    }
    "test" {
        projectDefault()
        java.srcDirs(
            "idea-completion/tests",
            "idea-live-templates/tests"
        )
    }
}

dependencies {
    testRuntime(intellijDep())
    testRuntime(intellijRuntimeAnnotations())

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
    testCompileOnly(intellijPluginDep("java"))
    testRuntime(intellijPluginDep("java"))

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

    testCompileOnly(toolsJar())
    testCompileOnly(project(":kotlin-reflect-api")) // TODO: fix import (workaround for jps build)
    testCompile(project(":kotlin-test:kotlin-test-junit"))
    testCompile(projectTests(":compiler:tests-common"))
    testCompile(projectTests(":idea:idea-test-framework")) { isTransitive = false }
    testImplementation(projectTests(":idea:idea-frontend-independent")) { isTransitive = false }
    testCompile(project(":idea:idea-jvm")) { isTransitive = false }
    testCompile(project(":idea:idea-gradle")) { isTransitive = false }
    testCompile(project(":idea:idea-maven")) { isTransitive = false }
    testCompile(project(":idea:idea-native")) { isTransitive = false }
    testCompile(project(":idea:idea-gradle-native")) { isTransitive = false }
    testCompile(commonDep("junit:junit"))
    testCompileOnly(intellijPluginDep("coverage"))

    testRuntimeOnly(toolsJar())
    testRuntime(commonDep("org.jetbrains", "markdown"))
    testRuntime(project(":plugins:kapt3-idea")) { isTransitive = false }
    testRuntime(project(":kotlin-reflect"))
    testRuntime(project(":kotlin-preloader"))

    testCompile(project(":kotlin-sam-with-receiver-compiler-plugin")) { isTransitive = false }

    testRuntime(project(":plugins:android-extensions-compiler"))
    testRuntimeOnly(project(":kotlin-android-extensions-runtime")) // TODO: fix import (workaround for jps build)
    testRuntime(project(":plugins:android-extensions-ide")) { isTransitive = false }
    testRuntime(project(":allopen-ide-plugin")) { isTransitive = false }
    testRuntime(project(":kotlin-allopen-compiler-plugin"))
    testRuntime(project(":noarg-ide-plugin")) { isTransitive = false }
    testRuntime(project(":kotlin-noarg-compiler-plugin"))
    testRuntime(project(":plugins:annotation-based-compiler-plugins-ide-support")) { isTransitive = false }
    testRuntime(project(":plugins:parcelize:parcelize-compiler"))
    testRuntime(project(":plugins:parcelize:parcelize-ide")) { isTransitive = false }
    testRuntime(project(":kotlin-scripting-idea")) { isTransitive = false }
    testRuntime(project(":kotlin-scripting-compiler-impl"))
    testRuntime(project(":sam-with-receiver-ide-plugin")) { isTransitive = false }
    testRuntime(project(":kotlinx-serialization-compiler-plugin"))
    testRuntime(project(":kotlinx-serialization-ide-plugin")) { isTransitive = false }
    testRuntime(project(":idea:idea-android")) { isTransitive = false }
    testRuntime(project(":plugins:lint")) { isTransitive = false }
    testRuntime(project(":plugins:uast-kotlin"))
    testRuntime(project(":nj2k:nj2k-services")) { isTransitive = false }

    (rootProject.extra["compilerModules"] as Array<String>).forEach {
        testRuntime(project(it))
    }

    testCompile(intellijPluginDep("IntelliLang"))
    testCompile(intellijPluginDep("copyright"))
    testCompile(intellijPluginDep("properties"))
    testCompile(intellijPluginDep("java-i18n"))
    testCompile(intellijPluginDep("junit"))

    testCompileOnly(intellijDep())
    testCompileOnly(commonDep("com.google.code.findbugs", "jsr305"))
    testCompileOnly(intellijPluginDep("gradle"))
    testCompileOnly(intellijPluginDep("Groovy"))

    if (Ide.IJ()) {
        testCompileOnly(intellijPluginDep("maven"))
        testRuntime(intellijPluginDep("maven"))

        if (Ide.IJ201.orHigher()) {
            testRuntime(intellijPluginDep("repository-search"))
        }
    }

    testRuntime(intellijPluginDep("junit"))
    testRuntime(intellijPluginDep("gradle"))
    testRuntime(intellijPluginDep("Groovy"))
    testRuntime(intellijPluginDep("coverage"))
    testRuntime(intellijPluginDep("android"))
    testRuntime(intellijPluginDep("smali"))
    testRuntime(intellijPluginDep("testng"))

    if (kotlinBuildProperties.useFirIdeaPlugin) {
        testRuntime(project(":idea:idea-fir"))
    }

    if (Ide.AS36.orHigher()) {
        testRuntime(intellijPluginDep("android-layoutlib"))
        testRuntime(intellijPluginDep("git4idea"))
        testRuntime(intellijPluginDep("google-cloud-tools-core-as"))
        testRuntime(intellijPluginDep("google-login-as"))
    }

    if (Ide.AS41.orHigher()) {
        testRuntime(intellijPluginDep("platform-images"))
    }



    //BBF
    testCompile("commons-cli:commons-cli:1.4")
    testImplementation("net.sourceforge.argparse4j:argparse4j:0.8.1")
    testImplementation(kotlin("stdlib-jdk8"))
    testImplementation("org.apache.commons:commons-exec:1.3")

    testImplementation("io.github.java-diff-utils:java-diff-utils:4.5")
    testImplementation("org.bitbucket.cowwoc:diff-match-patch:1.1")

    //AbiComparator
    testImplementation("org.jsoup:jsoup:1.13.1")
    //testImplementation "org.ow2.asm:asm-debug-all:$asm_debug_version"
    testImplementation("org.ow2.asm:asm:8.0.1")
    testImplementation("org.ow2.asm:asm-commons:8.0.1")
    testImplementation("org.apache.commons:commons-text:1.8")
    testImplementation("org.jetbrains.kotlinx:kotlinx-metadata-jvm:0.1.0")
    testImplementation("io.github.java-diff-utils:java-diff-utils:4.5")

    //Antlr4
    testImplementation("org.antlr:antlr4-runtime:4.8-1")
    testImplementation("org.antlr:antlr4:4.8-1")

    //Kootstrap
    testImplementation("org.apache.maven:maven-model-builder:3.3.9")
    testImplementation("org.apache.maven:maven-aether-provider:3.3.3")
    testImplementation("org.eclipse.aether:aether-api:1.1.0")
    testImplementation("org.eclipse.aether:aether-util:1.1.0")
    testImplementation("org.eclipse.aether:aether-impl:1.1.0")
    testImplementation("org.eclipse.aether:aether-connector-basic:1.1.0")
    testImplementation("org.eclipse.aether:aether-transport-file:1.1.0")
    testImplementation("org.eclipse.aether:aether-transport-http:1.1.0")
    testImplementation("org.eclipse.aether:aether-transport-wagon:1.1.0")
    testImplementation("org.apache.maven:maven-aether-provider:3.3.3")
}

tasks.named<Copy>("processResources") {
    val currentIde = IdeVersionConfigurator.currentIde
    val pluginPatchNumber = findProperty("pluginPatchNumber") as String? ?: "1"
    val defaultPluginVersion = "$kotlinVersion-${currentIde.displayVersion}-$pluginPatchNumber"
    val pluginVersion = findProperty("pluginVersion") as String? ?: defaultPluginVersion

    inputs.property("pluginVersion", pluginVersion)

    filesMatching("META-INF/plugin.xml") {
        filter<ReplaceTokens>("tokens" to mapOf("snapshot" to pluginVersion))
    }

    from(provider { project(":compiler:cli-common").mainSourceSet.resources }) {
        include("META-INF/extensions/compiler.xml")
    }
}

projectTest(parallel = true) {
    dependsOn(":dist")
    workingDir = rootDir
}

configureFormInstrumentation()

testsJar()
