addSbtPlugin("ch.epfl.scala" % "sbt-release-early" % "2.0.1+3-5257935d")
addSbtPlugin("com.typesafe.sbt" % "sbt-git" % "0.9.3")
addSbtPlugin("net.virtual-void" % "sbt-dependency-graph" % "0.9.0")
libraryDependencies += "org.scala-sbt" %% "scripted-plugin" % sbtVersion.value
