name := """arqui-g9"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava, PlayEbean)

scalaVersion := "2.11.6"

libraryDependencies ++= {Seq(
  javaJdbc,
  evolutions,
  cache,
  javaWs,
  jdbc,
  javaJpa,
  "org.hibernate" % "hibernate-entitymanager" % "4.3.9.Final", // replace by your jpa implementation
  "be.objectify" %% "deadbolt-java" % "2.4.3"
)}

//val appDependencies = {Seq(
//  "mysql" % "mysql-connector-java" % "5.1.18"
//)}

resolvers += Resolver.url("Typesafe Ivy releases", url("https://repo.typesafe.com/typesafe/ivy-releases"))(Resolver.ivyStylePatterns)
resolvers += Resolver.url("Objectify Play Repository", url("http://deadbolt.ws/releases/"))(Resolver.ivyStylePatterns)
resolvers += Resolver.sonatypeRepo("snapshots")


// Play provides two styles of routers, one expects its actions to be injected, the
// other, legacy style, accesses its actions statically.
routesGenerator := InjectedRoutesGenerator


fork in run := true
offline:=true
