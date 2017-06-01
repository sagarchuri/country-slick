
name := "country-slick"

version := "1.0"

scalaVersion := "2.12.2"


libraryDependencies ++= List(
  "com.typesafe.slick" %% "slick" % "3.2.0",
  "org.slf4j" % "slf4j-nop" % "1.6.4",
  "com.h2database" % "h2" % "1.3.175",
  "org.scalatest" %% "scalatest" % "3.0.1" % "test",
  "com.typesafe.slick" %% "slick-codegen" % "3.2.0"

)

    