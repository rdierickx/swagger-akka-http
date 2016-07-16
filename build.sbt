organization := "com.github.swagger-akka-http"

name := "swagger-akka-http"

scalaVersion := "2.11.8"

checksums in update := Nil

EclipseKeys.withSource := true

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-http-experimental" % "2.4.8", 
  "com.typesafe.akka" %% "akka-http-spray-json-experimental" % "2.4.8",
  "com.typesafe.akka" %% "akka-http-testkit" % "2.4.8" % "test",
  "io.swagger" %% "swagger-scala-module" % "1.0.2",
  "io.swagger" % "swagger-core" % "1.5.9",
  "io.swagger" % "swagger-annotations" % "1.5.9",
  "io.swagger" % "swagger-models" % "1.5.9",
  "io.swagger" % "swagger-jaxrs" % "1.5.9",
  "org.scalatest" %% "scalatest" % "2.2.6" % "test",
  "org.json4s" %% "json4s-jackson" % "3.2.11" % "test",
  "joda-time" % "joda-time" % "2.8" % "test",
  "org.joda" % "joda-convert" % "1.7" % "test",
  "org.slf4j" % "slf4j-simple" % "1.7.7" % "test"
)

testOptions in Test += Tests.Argument("-oD")

parallelExecution in Test := false
logBuffered := false

publishMavenStyle := true

publishTo := {
  val nexus = "https://oss.sonatype.org/"
  if (isSnapshot.value)
    Some("snapshots" at nexus + "content/repositories/snapshots")
  else
    Some("releases"  at nexus + "service/local/staging/deploy/maven2")
}

publishArtifact in Test := false

pomIncludeRepository := { _ => false }

parallelExecution in Test := false

homepage := Some(url("https://github.com/swagger-akka-http/swagger-akka-http"))

licenses := Seq("The Apache Software License, Version 2.0" -> url("http://www.apache.org/licenses/LICENSE-2.0.txt"))

releasePublishArtifactsAction := PgpKeys.publishSigned.value

pomExtra := (
  <scm>
    <url>git@github.com:swagger-akka-http/swagger-akka-http.git</url>
    <connection>scm:git:git@github.com:swagger-akka-http/swagger-akka-http.git</connection>
  </scm>
  <developers>
    <developer>
      <id>mhamrah</id>
      <name>Michael Hamrah</name>
      <url>http://michaelhamrah.com</url>
    </developer>
    <developer>
      <id>efuquen</id>
      <name>Edwin Fuquen</name>
      <url>http://parascal.com</url>
    </developer>
    <developer>
      <id>rliebman</id>
      <name>Roberto Liebman</name>
      <url>https://github.com/rleibman</url>
    </developer>
    <developer>
      <id>pjfanning</id>
      <name>PJ Fanning</name>
      <url>https://github.com/pjfanning</url>
    </developer>
  </developers>)