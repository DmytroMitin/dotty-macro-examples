import mill._, scalalib._

trait DottyModule extends ScalaModule {
  def scalaVersion = "3.0.0-M2"
}

object abstractTypeclassBody extends DottyModule
object accessMembersByName extends DottyModule
object defaultParamsInference extends DottyModule
object macroTypeclassDerivation extends DottyModule
object fullClassName extends DottyModule
object isMemberOfSealedTraitHierarchy extends DottyModule

object test extends Module {
  def all = List(
    abstractTypeclassBody,
    accessMembersByName,
    defaultParamsInference,
    macroTypeclassDerivation,
    fullClassName,
    isMemberOfSealedTraitHierarchy,
  )

  def run = T {
    T.sequence(all.map(_.run()))
  }
}
