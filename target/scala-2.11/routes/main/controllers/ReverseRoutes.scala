
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/gusal/OneDrive/Universidad/Arquisoft/TBC/TBC3/conf/routes
// @DATE:Wed Sep 16 23:02:01 COT 2015

import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:163
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:163
    def at(file:String): Call = {
      implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
    }
  
  }

  // @LINE:75
  class ReverseTranviaVehController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:77
    def readTranvia(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "tranvias/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:79
    def create(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "tranvias")
    }
  
    // @LINE:75
    def readAll(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "tranvias")
    }
  
    // @LINE:81
    def putTranvia(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("PUT", _prefix + { _defaultPrefix } + "tranvias/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
  }

  // @LINE:128
  class ReverseTrayectoController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:129
    def create(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "trayectos")
    }
  
    // @LINE:128
    def readAll(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "trayectos")
    }
  
  }

  // @LINE:134
  class ReverseEstacionController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:134
    def readAll(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "estaciones")
    }
  
    // @LINE:144
    def alquilarBicicleta(id:Long, id2:Long): Call = {
      import ReverseRouteContext.empty
      Call("DELETE", _prefix + { _defaultPrefix } + "estaciones/" + implicitly[PathBindable[Long]].unbind("id", id) + "/bicicletas/" + implicitly[PathBindable[Long]].unbind("id2", id2))
    }
  
    // @LINE:138
    def create(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "estaciones")
    }
  
    // @LINE:146
    def devolverBicicleta(id:Long, id2:Long): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "estaciones/" + implicitly[PathBindable[Long]].unbind("id", id) + "/bicicletas" + queryString(List(Some(implicitly[QueryStringBindable[Long]].unbind("id2", id2)))))
    }
  
    // @LINE:140
    def modificarEstacion(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("PUT", _prefix + { _defaultPrefix } + "estaciones/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:136
    def readVcubsEstacion(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "estaciones/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
  }

  // @LINE:30
  class ReverseUserController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:30
    def readAll(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "usuarios")
    }
  
    // @LINE:36
    def modify(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("PUT", _prefix + { _defaultPrefix } + "usuarios/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:38
    def consultarReservasUsuario(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "usuarios/" + implicitly[PathBindable[Long]].unbind("id", id) + "/reservas")
    }
  
    // @LINE:34
    def create(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "usuarios")
    }
  
    // @LINE:32
    def read(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "usuarios/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:44
    def eliminarReservaCliente(id:Long, id2:Long): Call = {
      import ReverseRouteContext.empty
      Call("DELETE", _prefix + { _defaultPrefix } + "usuarios/" + implicitly[PathBindable[Long]].unbind("id", id) + "/reservas/" + implicitly[PathBindable[Long]].unbind("id2", id2))
    }
  
    // @LINE:40
    def crearReseva(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "usuarios/" + implicitly[PathBindable[Long]].unbind("id", id) + "/reservas")
    }
  
    // @LINE:42
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

  // @LINE:103
  class ReverseVcubController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:109
    def modify(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("PUT", _prefix + { _defaultPrefix } + "vcubs/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:107
    def create(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "vcubs")
    }
  
    // @LINE:103
    def readAll(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "vcubs")
    }
  
    // @LINE:105
    def read(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "vcubs/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
  }

  // @LINE:49
  class ReverseMoviBusController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:66
    def agregarTrayectoMovibus(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "mobibuses/" + implicitly[PathBindable[Long]].unbind("id", id) + "/trayectos")
    }
  
    // @LINE:49
    def readAll(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "mobibuses")
    }
  
    // @LINE:53
    def create(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "mobibuses")
    }
  
    // @LINE:64
    def readRevisionesMovibus(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "mobibuses/" + implicitly[PathBindable[Long]].unbind("id", id) + "/revisiones")
    }
  
    // @LINE:58
    def agregarDatosMovibus(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "mobibuses/" + implicitly[PathBindable[Long]].unbind("id", id) + "/datos")
    }
  
    // @LINE:60
    def readDatosMovibus(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "mobibuses/" + implicitly[PathBindable[Long]].unbind("id", id) + "/datos")
    }
  
    // @LINE:51
    def readMovibus(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "mobibuses/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:68
    def finalizarTrayectoMovibus(id:Long, id2:Long): Call = {
      import ReverseRouteContext.empty
      Call("PUT", _prefix + { _defaultPrefix } + "mobibuses/" + implicitly[PathBindable[Long]].unbind("id", id) + "/trayectos/" + implicitly[PathBindable[Long]].unbind("id2", id2))
    }
  
    // @LINE:62
    def agregarRevisionMovibus(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "mobibuses/" + implicitly[PathBindable[Long]].unbind("id", id) + "/revisiones")
    }
  
    // @LINE:55
    def putMovibus(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("PUT", _prefix + { _defaultPrefix } + "mobibuses/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:70
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

  
    // @LINE:25
    def create(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "conductor")
    }
  
    // @LINE:23
    def read(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "conductor")
    }
  
  }


}