sbt-increment
=============

sbt-increment is a sbt plugin inspired by [sbt task to increment project version](http://stackoverflow.com/q/23681713/1305344) on StackOverflow that's *"an SBT task to increment a project's version"*.

Setup
-----

### Using Published Plugin

For sbt 0.13 add sbt-increment as a dependency in `project/increment.sbt`:

```scala
addSbtPlugin("pl.japila" % "sbt-increment" % "0.0.1-SNAPSHOT")
```

Usage
-----

### Applying the plugin to a project (Adding the `increment` task)

First, make sure that you've added the plugin to your build (either the published
builds or source from Git).

Put `increment.sbt` at the root directory:

```scala
incrementSettings
```

