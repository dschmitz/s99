// *****************************************************************************
// Projects
// *****************************************************************************

lazy val s99 =
  project
    .in(file("."))
    .enablePlugins(AutomateHeaderPlugin, GitVersioning, GitBranchPrompt)
    .settings(settings)
    .settings(
      libraryDependencies ++= Seq(
        library.scalaCheck % Test,
        library.scalaTest  % Test
      )
    )

// *****************************************************************************
// Library dependencies
// *****************************************************************************

lazy val library =
  new {

    object Version {
      val scala      = "2.12.4"
      val scalaCheck = "1.13.5"
      val scalaTest  = "3.0.4"
    }
    val scalaCheck = "org.scalacheck" %% "scalacheck" % Version.scalaCheck
    val scalaTest  = "org.scalatest"  %% "scalatest"  % Version.scalaTest
  }

// *****************************************************************************
// Settings
// *****************************************************************************

lazy val settings =
  commonSettings ++
    gitSettings ++
    scalafmtSettings ++
    headerSettings ++
    scoverageSettings ++
    wartRemoverSettings

lazy val commonSettings =
  Seq(
    // scalaVersion from .travis.yml via sbt-travisci
    scalaVersion     := library.Version.scala,
    organization     := "io.uport",
    organizationName := "David Schmitz",
    startYear        := Some(2017),
    licenses += ("Apache 2.0", url("http://www.apache.org/licenses/LICENSE-2.0")),
    mappings.in(Compile, packageBin) += baseDirectory.in(ThisBuild).value / "LICENSE" -> "LICENSE",
    scalacOptions ++= Seq(
      "-unchecked",
      "-deprecation",
      "-language:_",
      "-target:jvm-1.8",
      "-encoding",
      "UTF-8",
      "-feature",
      "-Ywarn-dead-code",
      "-Ywarn-numeric-widen",
      "-Ywarn-value-discard",
      "-Ywarn-unused"
    ),
    unmanagedSourceDirectories.in(Compile) := Seq(scalaSource.in(Compile).value),
    unmanagedSourceDirectories.in(Test)    := Seq(scalaSource.in(Test).value)
  )

lazy val gitSettings =
  Seq(
    git.useGitDescribe := true
  )

lazy val scalafmtSettings =
  Seq(
    scalafmtOnCompile         := true,
    scalafmtOnCompile.in(Sbt) := true,
    scalafmtVersion           := "1.3.0"
  )

import de.heikoseeberger.sbtheader.License._
lazy val headerSettings = Seq(
  headerLicense := Some(ALv2("2017", "David Schmitz"))
)

lazy val scoverageSettings = Seq(
  coverageEnabled       := true,
  coverageMinimum       := 60,
  coverageFailOnMinimum := false
)

lazy val wartRemoverSettings = Seq(
  wartremoverWarnings in (Compile, compile) ++= Warts.unsafe
  //  wartremoverErrors in (Compile, compile) ++= Warts.allBut(Wart.Any, Wart.StringPlusAny),
  //  wartremoverExcluded ++= (sourceManaged ** "*.scala").value.get
)
