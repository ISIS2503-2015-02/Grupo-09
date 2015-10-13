
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Dev/Grupo-09/conf/routes
// @DATE:Tue Oct 13 10:18:34 COT 2015

import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:172
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:172
    def at(file:String): Call = {
      implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
    }
  
  }

  // @LINE:78
  class ReverseTranviaVehController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:80
    def readTranvia(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "tranvias/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:82
    def create(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "tranvias")
    }
  
    // @LINE:78
    def readAll(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "tranvias")
    }
  
    // @LINE:84
    def putTranvia(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("PUT", _prefix + { _defaultPrefix } + "tranvias/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
  }

  // @LINE:131
  class ReverseTrayectoController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:132
    def create(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "trayectos")
    }
  
    // @LINE:131
    def readAll(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "trayectos")
    }
  
  }

  // @LINE:137
  class ReverseEstacionController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:137
    def readAll(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "estaciones")
    }
  
    // @LINE:147
    def alquilarBicicleta(id:Long, id2:Long): Call = {
      import ReverseRouteContext.empty
      Call("DELETE", _prefix + { _defaultPrefix } + "estaciones/" + implicitly[PathBindable[Long]].unbind("id", id) + "/bicicletas/" + implicitly[PathBindable[Long]].unbind("id2", id2))
    }
  
    // @LINE:141
    def create(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "estaciones")
    }
  
    // @LINE:149
    def devolverBicicleta(id:Long, id2:Long): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "estaciones/" + implicitly[PathBindable[Long]].unbind("id", id) + "/bicicletas" + queryString(List(Some(implicitly[QueryStringBindable[Long]].unbind("id2", id2)))))
    }
  
    // @LINE:143
    def modificarEstacion(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("PUT", _prefix + { _defaultPrefix } + "estaciones/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:139
    def readVcubsEstacion(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "estaciones/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
  }

  // @LINE:31
  class ReverseUserController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:31
    def readAll(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "usuarios")
    }
  
    // @LINE:36
    def formUser(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "addUsuarios")
    }
  
    // @LINE:39
    def modify(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("PUT", _prefix + { _defaultPrefix } + "usuarios/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:41
    def consultarReservasUsuario(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "usuarios/" + implicitly[PathBindable[Long]].unbind("id", id) + "/reservas")
    }
  
    // @LINE:35
    def createUser(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "addUsuarios")
    }
  
    // @LINE:33
    def read(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "usuarios/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:47
    def eliminarReservaCliente(id:Long, id2:Long): Call = {
      import ReverseRouteContext.empty
      Call("DELETE", _prefix + { _defaultPrefix } + "usuarios/" + implicitly[PathBindable[Long]].unbind("id", id) + "/reservas/" + implicitly[PathBindable[Long]].unbind("id2", id2))
    }
  
    // @LINE:43
    def crearReseva(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "usuarios/" + implicitly[PathBindable[Long]].unbind("id", id) + "/reservas")
    }
  
    // @LINE:45
    def modificarReservaCliente(id:Long, id2:Long): Call = {
      import ReverseRouteContext.empty
      Call("PUT", _prefix + { _defaultPrefix } + "usuarios/" + implicitly[PathBindable[Long]].unbind("id", id) + "/reservas/" + implicitly[PathBindable[Long]].unbind("id2", id2))
    }
  
  }

  // @LINE:6
  class ReverseApplication(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def index(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix)
    }
  
  }

  // @LINE:106
  class ReverseVcubController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:112
    def modify(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("PUT", _prefix + { _defaultPrefix } + "vcubs/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:110
    def create(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "vcubs")
    }
  
    // @LINE:106
    def readAll(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "vcubs")
    }
  
    // @LINE:108
    def read(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "vcubs/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
  }

  // @LINE:52
  class ReverseMoviBusController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:69
    def agregarTrayectoMovibus(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "mobibuses/" + implicitly[PathBindable[Long]].unbind("id", id) + "/trayectos")
    }
  
    // @LINE:52
    def readAll(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "mobibuses")
    }
  
    // @LINE:56
    def create(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "mobibuses")
    }
  
    // @LINE:67
    def readRevisionesMovibus(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "mobibuses/" + implicitly[PathBindable[Long]].unbind("id", id) + "/revisiones")
    }
  
    // @LINE:61
    def agregarDatosMovibus(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "mobibuses/" + implicitly[PathBindable[Long]].unbind("id", id) + "/datos")
    }
  
    // @LINE:63
    def readDatosMovibus(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "mobibuses/" + implicitly[PathBindable[Long]].unbind("id", id) + "/datos")
    }
  
    // @LINE:54
    def readMovibus(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "mobibuses/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:71
    def finalizarTrayectoMovibus(id:Long, id2:Long): Call = {
      import ReverseRouteContext.empty
      Call("PUT", _prefix + { _defaultPrefix } + "mobibuses/" + implicitly[PathBindable[Long]].unbind("id", id) + "/trayectos/" + implicitly[PathBindable[Long]].unbind("id2", id2))
    }
  
    // @LINE:65
    def agregarRevisionMovibus(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "mobibuses/" + implicitly[PathBindable[Long]].unbind("id", id) + "/revisiones")
    }
  
    // @LINE:58
    def putMovibus(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("PUT", _prefix + { _defaultPrefix } + "mobibuses/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:73
    def readTrayectosMovibus(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "mobibuses/" + implicitly[PathBindable[Long]].unbind("id", id) + "/trayectos/")
    }
  
  }

  // @LINE:23
  class ReverseDriverController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:26
    def formDriver(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "addConductores")
    }
  
    // @LINE:23
    def read(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "conductor")
    }
  
    // @LINE:25
    def createDriver(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "addConductores")
    }
  
  }

  // @LINE:168
  class ReverseMapController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:168
    def createMap(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "mapa")
    }
  
  }


}