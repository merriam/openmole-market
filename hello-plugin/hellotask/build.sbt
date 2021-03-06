name := "hellotask"

version := "1.0"

scalaVersion := "2.11.11"

osgiSettings

OsgiKeys.exportPackage := Seq("hellotask.*")

OsgiKeys.importPackage := Seq("*")

OsgiKeys.privatePackage := Seq("")

scalariformSettings

val openMOLEVersion = "7.0-SNAPSHOT"

libraryDependencies += "org.openmole" %% "org-openmole-core-dsl" % openMOLEVersion

libraryDependencies += "org.openmole" %% "org-openmole-plugin-task-scala" % openMOLEVersion


