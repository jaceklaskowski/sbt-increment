package sbtincrement

import sbt._
import Keys._

object Plugin extends sbt.Plugin {
  lazy val incrementMajor = taskKey[String]("Increments version at major position")
  lazy val incrementMinor = taskKey[String]("Increments version at minor position")
  lazy val incrementPatch = taskKey[String]("Increments version at patch position")

  lazy val baseIncrementSettings: Seq[Def.Setting[_]] = Seq(
    incrementMajor := "1.0.0",
    incrementMinor := "0.1.0",
    incrementPatch := "0.0.1"
  )

  lazy val incrementSettings: Seq[Def.Setting[_]] = baseIncrementSettings
}
