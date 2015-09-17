
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Dev/Grupo-09/conf/routes
// @DATE:Wed Sep 16 21:15:05 COT 2015


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
