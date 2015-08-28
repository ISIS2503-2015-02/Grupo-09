
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/template/Desktop/Experimento 1/Grupo-09/conf/routes
// @DATE:Fri Aug 28 18:14:47 COT 2015


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
