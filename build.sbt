import Dependencies._

ThisBuild / scalaVersion     := "2.13.3"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "com.example"
ThisBuild / organizationName := "example"

lazy val base = (project in file("."))
  .settings(
    name := "sbt-mdoc-base",
    libraryDependencies += scalaTest % Test
  )

lazy val docs = (project in file("docs"))
  .settings(
    mdocVariables := Map(
      "VERSION" -> version.value
    ),
    mdocIn  := file("memos"),
    mdocOut := file("docs/src/main")
  )
  .dependsOn(base)
  .enablePlugins(MdocPlugin)

// See https://www.scala-sbt.org/1.x/docs/Using-Sonatype.html for instructions on how to publish to Sonatype.
