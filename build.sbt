ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.8"

wartremoverErrors += ContribWart.Apply

scalacOptions += "-Xfatal-warnings"

lazy val root = (project in file("."))
  .settings(
    name := "umireon-wartremover-contrib-intellij-idea"
  )
