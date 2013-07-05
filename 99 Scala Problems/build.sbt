name := "scala_99"

version := "1.0"

scalaVersion := "2.9.2"

libraryDependencies ++= Seq(
    "org.scalatest" %% "scalatest" % "1.9.1" % "test",
    "junit" % "junit" % "4.11" % "test"
) 

scalacOptions ++= Seq("-unchecked", "-deprecation")