import Dependencies._

ThisBuild / scalaVersion     := "$scala_version$"
ThisBuild / version          := "$version$"
ThisBuild / organization     := "com.$organizacion$"
ThisBuild / organizationName := "$organizacion$"

lazy val root = (project in file("."))
  .settings(
    name := "$name$",
    libraryDependencies += scalaTest % Test
  )

// See https://www.scala-sbt.org/1.x/docs/Using-Sonatype.html for instructions on how to publish to Sonatype.
