lazy val root = (project in file(".")).settings(
  name := "HelloMetals",
  version := "0.1",
  scalaVersion := "2.13.4",
  //  ScalaTest
  libraryDependencies ++= Seq("org.scalatest" %% "scalatest" % "3.1.1" % Test)
)
