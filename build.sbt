name := "psycho-poker"

version := "1.0"

organization := "br.com.devamil"

scalaVersion := "2.10.2"

libraryDependencies ++= Seq(
    "org.specs2" %% "specs2" % "2.2.2" % "test"
)

EclipseKeys.withSource := true
