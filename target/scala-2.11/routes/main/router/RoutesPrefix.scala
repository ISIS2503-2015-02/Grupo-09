
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Usuario/Desktop/Arquisoft/Experimento 1/conf/routes
// @DATE:Sun Aug 30 22:55:35 COT 2015


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
