package org.jetbrains.kotlin.bbf.reduktor.parser

import com.intellij.lang.java.JavaLanguage
import com.intellij.mock.MockProject
import com.intellij.openapi.extensions.ExtensionPoint
import com.intellij.openapi.extensions.Extensions
import com.intellij.openapi.project.Project
import com.intellij.openapi.util.Disposer
import com.intellij.pom.PomModel
import com.intellij.pom.PomTransaction
import com.intellij.pom.core.impl.PomModelImpl
import com.intellij.pom.tree.TreeAspect
import com.intellij.psi.PsiFile
import com.intellij.psi.PsiFileFactory
import com.intellij.psi.impl.source.tree.TreeCopyHandler
import org.jetbrains.kotlin.bbf.bugfinder.executor.CompilerArgs
import org.jetbrains.kotlin.bbf.bugfinder.mutator.transformations.Factory
import org.jetbrains.kotlin.bbf.kootstrap.FooBarCompiler.setupMyCfg
import org.jetbrains.kotlin.bbf.kootstrap.FooBarCompiler.setupMyEnv
import org.jetbrains.kotlin.bbf.kootstrap.util.opt
import org.jetbrains.kotlin.bbf.kootstrap.util.targetRoots
import org.jetbrains.kotlin.cli.jvm.compiler.EnvironmentConfigFiles
import org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment
import org.jetbrains.kotlin.config.CommonConfigurationKeys
import org.jetbrains.kotlin.config.CompilerConfiguration
import org.jetbrains.kotlin.js.analyze.TopDownAnalyzerFacadeForJS
import org.jetbrains.kotlin.js.config.JSConfigurationKeys
import org.jetbrains.kotlin.js.config.JsConfig
import org.jetbrains.kotlin.psi.KtFile
import org.jetbrains.kotlin.psi.KtPsiFactory
import org.jetbrains.kotlin.resolve.BindingContext
import org.jetbrains.kotlin.resolve.CompilerEnvironment
import java.io.File


@Suppress("DEPRECATION")
class PSICreator(var projectDir: String) {

    fun getPSI(): List<KtFile> {
        val new_args = arrayOf("-t", projectDir)

        val cmd = opt.parse(new_args)
        cfg = setupMyCfg(cmd)
        env = setupMyEnv(cfg)


        if (!Extensions.getRootArea().hasExtensionPoint(TreeCopyHandler.EP_NAME.name)) {
            Extensions.getRootArea().registerExtensionPoint(
                TreeCopyHandler.EP_NAME.name,
                TreeCopyHandler::class.java.canonicalName,
                ExtensionPoint.Kind.INTERFACE
            )
        }

        val ktFiles = env.getSourceFiles().map {
            val f = KtPsiFactory(it).createFile(it.virtualFile.path, it.text)
            f.originalFile = it
            f
        }

        targetFiles = ktFiles.filter { f ->
            cmd.targetRoots.any { root ->
                f.originalFile.virtualFile.path.contains(root)
            }
        }
        //ctx = FooBarCompiler.analyzeBunchOfSources(env, targetFiles, cfg)!!
        return targetFiles
    }

    fun setupMyEnv(cfg: CompilerConfiguration): KotlinCoreEnvironment {

        val disposable = Disposer.newDisposable()
        //Use for windows
        //System.setProperty("idea.io.use.fallback", "true")
        val env = KotlinCoreEnvironment.createForProduction(
            disposable,
            cfg,
            EnvironmentConfigFiles.JVM_CONFIG_FILES
        )
        val project = env.project as MockProject
        project.registerService(
            TreeAspect::class.java,
            TreeAspect()
        )

        class MyPomModelImpl(env: KotlinCoreEnvironment) : PomModelImpl(env.project) {
            override fun runTransaction(pt: PomTransaction) = pt.run()
        }


        val pomModel = MyPomModelImpl(env)

        project.registerService(
            PomModel::class.java,
            pomModel
        )
        return env
    }


    fun getJavaFiles(projectDir: String): List<PsiFile> {
        findAndCreateJavaFiles(projectDir)
        return javaFiles
    }

    private fun findAndCreateJavaFiles(projectDir: String) {
        val folder = File(projectDir)
        for (entry in folder.listFiles()) {
            if (entry.isDirectory) {
                findAndCreateJavaFiles(entry.absolutePath)
            } else if (entry.name.endsWith(".java")) {
                val javaFile =
                    PsiFileFactory.getInstance(env.project).createFileFromText(JavaLanguage.INSTANCE, entry.readText())
                javaFiles.add(javaFile)
            }
        }
    }

    fun getPsiForJava(text: String, proj: Project = Factory.file.project) =
        PsiFileFactory.getInstance(proj).createFileFromText(JavaLanguage.INSTANCE, text)

    fun reinit(projectDir: String): List<KtFile> {
        this.projectDir = projectDir
        val new_args = arrayOf("-t", projectDir)
        val cmd = opt.parse(new_args)

        env = setupMyEnv(cfg)
        if (!Extensions.getRootArea().hasExtensionPoint(TreeCopyHandler.EP_NAME.name)) {
            Extensions.getRootArea().registerExtensionPoint(
                TreeCopyHandler.EP_NAME.name,
                TreeCopyHandler::class.java.canonicalName,
                ExtensionPoint.Kind.INTERFACE
            )
        }

        val ktFiles = env.getSourceFiles().map {
            val f = KtPsiFactory(it).createFile(it.virtualFile.path, it.text)
            f.originalFile = it
            f
        }

        targetFiles = ktFiles.filter { f ->
            cmd.targetRoots.any { root ->
                f.originalFile.virtualFile.path.startsWith(root)
            }
        }

        return targetFiles
    }

    fun getPSIForText(text: String, generateCtx: Boolean = true): KtFile {
        //Save to tmp
        val path = "./bbfgradle/tmp/tmp.kt"
        File(path).writeText(text)
        return getPSIForFile(path, generateCtx)
    }

    fun getPsiForTextWithName(text: String, fileName: String, generateCtx: Boolean = true): KtFile {
        val path = "tmp/$fileName"
        File(path).writeText(text)
        return getPSIForFile(path, generateCtx)
    }

    fun getPSIForFile(path: String, generateCtx: Boolean = true): KtFile {
        val newArgs = arrayOf("-t", path)

        val cmd = opt.parse(newArgs)

        cfg = setupMyCfg(cmd)
        env = setupMyEnv(cfg)

        if (!Extensions.getRootArea().hasExtensionPoint(TreeCopyHandler.EP_NAME.name)) {
            Extensions.getRootArea().registerExtensionPoint(
                TreeCopyHandler.EP_NAME.name,
                TreeCopyHandler::class.java.canonicalName,
                ExtensionPoint.Kind.INTERFACE
            )
        }

        targetFiles = env.getSourceFiles().map {
            val f = KtPsiFactory(it).createFile(it.virtualFile.path, it.text)
            f.originalFile = it
            f
        }

        val file = targetFiles.first()

        if (generateCtx) {
            try {
                val configuration = env.configuration.copy()

                configuration.put(JSConfigurationKeys.LIBRARIES, JsConfig.JS_STDLIB)
                configuration.put(CommonConfigurationKeys.MODULE_NAME, "sample")

                configuration.put(
                    JSConfigurationKeys.LIBRARIES, listOf(
                        CompilerArgs.getStdLibPath("kotlin-stdlib-js"),
                        //CompilerArgs.getStdLibPath("kotlin-test-js"),
                        CompilerArgs.getStdLibPath("kotlin-test"),
                        CompilerArgs.getStdLibPath("kotlin-test-common"),
                        CompilerArgs.getStdLibPath("kotlin-test-annotations-common"),
                        CompilerArgs.getStdLibPath("kotlin-test-junit"),
                        CompilerArgs.getStdLibPath("kotlin-reflect")
                    )
                )
                val tmpCtx =
                    TopDownAnalyzerFacadeForJS.analyzeFiles(listOf(file), JsConfig(env.project, configuration, CompilerEnvironment)).bindingContext
                ctx = tmpCtx
            } catch (e: Throwable) {
                ctx = null
                return targetFiles.first()
            }
        }
        return targetFiles.first()
    }

    companion object {
        fun analyze(psiFile: PsiFile): BindingContext? {
            try {
                val cmd = opt.parse(arrayOf())

                val cfg = setupMyCfg(cmd)
                val env = setupMyEnv(cfg)
                val configuration = env.configuration.copy()

                configuration.put(JSConfigurationKeys.LIBRARIES, JsConfig.JS_STDLIB)
                configuration.put(CommonConfigurationKeys.MODULE_NAME, "root")

                configuration.put(
                    JSConfigurationKeys.LIBRARIES, listOf(
                        CompilerArgs.getStdLibPath("kotlin-stdlib-js"),
                        //CompilerArgs.getStdLibPath("kotlin-test-js"),
                        CompilerArgs.getStdLibPath("kotlin-test"),
                        CompilerArgs.getStdLibPath("kotlin-test-common"),
                        CompilerArgs.getStdLibPath("kotlin-test-annotations-common"),
                        CompilerArgs.getStdLibPath("kotlin-test-junit"),
                        CompilerArgs.getStdLibPath("kotlin-reflect")
                    )
                )
//                val sourcesOnly = TopDownAnalyzerFacadeForJVM.newModuleSearchScope(psiFile.project, listOf(psiFile as KtFile))
//                return TopDownAnalyzerFacadeForJVM.analyzeFilesWithJavaIntegration(
//                    psiFile.project,
//                    listOf(psiFile as KtFile),
//                    NoScopeRecordCliBindingTrace(),
//                    env.configuration,
//                    env::createPackagePartProvider
//                    //{ scope -> JvmPackagePartProvider(LANGUAGE_FEATURE_SETTINGS, scope) }
//                ).bindingContext
                return TopDownAnalyzerFacadeForJS.analyzeFiles(
                    (listOf(psiFile as KtFile)),
                    JsConfig(env.project, configuration, CompilerEnvironment)
                ).bindingContext
            } catch (e: Exception) {
                println(e)
                return null
            }
        }
    }

    var targetFiles: List<KtFile> = listOf()
    private var javaFiles = mutableListOf<PsiFile>()
    private lateinit var cfg: CompilerConfiguration
    private lateinit var env: KotlinCoreEnvironment
    var ctx: BindingContext? = null
}