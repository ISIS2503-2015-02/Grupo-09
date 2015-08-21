
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/ryogi/Arquisoft/Grupo-09/conf/routes
// @DATE:Fri Aug 21 10:17:01 COT 2015


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
