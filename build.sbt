name := "blog-scala-native"

organization := "com.github.binxio"

version := "1.0.0-SNAPSHOT"

scalaVersion := "2.11.12"

libraryDependencies += "org.scalaz" %%% "scalaz-core" % "7.2.27"
libraryDependencies += "com.softwaremill.sttp" %%% "core" % "1.5.0"
libraryDependencies += "org.rogach" %%% "scallop" % "3.1.5"
libraryDependencies += "com.chuusai" %%% "shapeless" % "2.3.3"
libraryDependencies += "org.scala-native" %%% "test-interface" % "0.3.8"
libraryDependencies += "io.crashbox" %%% "spray-json" % "1.3.4-1" // https://github.com/crashbox-ci/spray-json
libraryDependencies += "xyz.driver" %% "spray-json-derivation" % "0.7.0" // https://github.com/driver-oss/spray-json-derivation
libraryDependencies += "org.scalactic" %%% "scalactic" % "3.2.0-SNAP10"
libraryDependencies += "org.scalatest" %%% "scalatest" % "3.2.0-SNAP10" % "test"

enablePlugins(ScalaNativePlugin)

// Set to false or remove if you want to show stubs as linking errors
nativeLinkStubs := true
