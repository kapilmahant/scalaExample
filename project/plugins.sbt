

// *** Measure code coverage of unit tests
addSbtPlugin("org.scoverage" % "sbt-scoverage" % "1.3.3")


// *** To create a rpm using sbt-native-packager 
addSbtPlugin("com.typesafe.sbt" % "sbt-native-packager" % "1.0.5")


// *** Measure scala style
addSbtPlugin("org.scalastyle" %% "scalastyle-sbt-plugin" % "0.8.0")

// *** Push results to sonar
addSbtPlugin("com.aol.sbt" % "sbt-sonarrunner-plugin" % "1.0.4")


// *** Get git info for versioning 
addSbtPlugin("com.typesafe.sbt" % "sbt-git" % "0.8.5")

