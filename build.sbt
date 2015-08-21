name := """arqui-g9"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava, PlayEbean)

scalaVersion := "2.11.6"

libraryDependencies ++= {Seq(
  javaJdbc,
  cache,
  javaWs,
  jdbc
)}

//val appDependencies = {Seq(
//  "mysql" % "mysql-connector-java" % "5.1.18"
//)}

resolvers += Resolver.url("Typesafe Ivy releases", url("https://repo.typesafe.com/typesafe/ivy-releases"))(Resolver.ivyStylePatterns)


// Play provides two styles of routers, one expects its actions to be injected, the
// other, legacy style, accesses its actions statically.
routesGenerator := InjectedRoutesGenerator


fork in run := true

fork in run := true



fork in run := true
