
// @GENERATOR:play-routes-compiler
// @SOURCE:G:/OneDrive/Universidad/Arquisoft/Grupo-09/conf/routes
// @DATE:Sat Aug 22 00:11:46 COT 2015


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
