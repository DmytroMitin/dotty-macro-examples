import mill._, scalalib._

trait DottyModule extends ScalaModule {
  def scalaVersion = "0.25.0-bin-20200518-b5eded6-NIGHTLY"
}

object abstractTypeclassBody extends DottyModule
object accessMembersByName extends DottyModule
object defaultParamsInference extends DottyModule
object macroTypeclassDerivation extends DottyModule

object test extends Module {
  def all = List(
    abstractTypeclassBody,
    accessMembersByName,
    defaultParamsInference,
    macroTypeclassDerivation,
  )

  def run = T {
    T.sequence(all.map(_.run()))
  }
}
