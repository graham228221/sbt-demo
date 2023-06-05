ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.10"

val libraryDeps = Seq("org.scalatest" %% "scalatest" % "3.2.7" % Test)

lazy val root = (project in file("."))
  .settings(
    name := "sbt-demo",
    libraryDependencies ++= libraryDeps
  ).dependsOn(api % "test->test;compile->compile")

lazy val api = (project in file("hello-api"))
  .settings(
    name := "sbt-demo",
    libraryDependencies ++= libraryDeps
  )
