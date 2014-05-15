package sbtincrement

import sbt._
import Keys._

object Plugin extends sbt.Plugin {
  lazy val incrementVersionPatch = taskKey[String]("Increments version at patch position")

  lazy val baseIncrementSettings: Seq[Def.Setting[_]] = Seq(
    incrementVersionPatch := "1.2.3"
  )

  lazy val incrementSettings: Seq[Def.Setting[_]] = baseIncrementSettings
}
