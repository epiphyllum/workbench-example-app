// Turn this project into a Scala.js project by importing these settings
import scala.scalajs.sbtplugin.ScalaJSPlugin._
import ScalaJSKeys._
import com.lihaoyi.workbench.Plugin._

scalaJSSettings

workbenchSettings

name := "Example"

version := "0.1-SNAPSHOT"

libraryDependencies ++= Seq(
  "org.scala-lang.modules.scalajs" %% "scalajs-dom" % "0.3",
  "com.scalatags" % "scalatags_2.10" % "0.2.4-JS",
  "com.scalarx" % "scalarx_2.10" % "0.2.3-JS"
)

bootSnippet := "ScalaJSExample().main()"

updateBrowsers <<= updateBrowsers.triggeredBy(ScalaJSKeys.packageJS in Compile)
