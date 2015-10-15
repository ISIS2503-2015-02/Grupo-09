
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/template/Documents/TBC2/SCALA/conf/routes
// @DATE:Thu Oct 15 12:52:27 COT 2015


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
