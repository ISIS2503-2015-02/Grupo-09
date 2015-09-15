
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/template/Desktop/Experimento 1/Grupo-09/conf/routes
// @DATE:Tue Sep 15 10:38:48 COT 2015


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
