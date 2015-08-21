name := """arqui-g9"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava, PlayEbean)

scalaVersion := "2.11.6"

libraryDependencies ++= {
val typesafeConfigVersion = "1.2.1"
Seq(
  javaJdbc,
  cache,
  javaWs,
  "com.typesafe" % "config" % typesafeConfigVersion
)}


resolvers += Resolver.url("Typesafe Ivy releases", url("https://repo.typesafe.com/typesafe/ivy-releases"))(Resolver.ivyStylePatterns)


// Play provides two styles of routers, one expects its actions to be injected, the
// other, legacy style, accesses its actions statically.
routesGenerator := InjectedRoutesGenerator


fork in run := true

fork in run := true



fork in run := true
