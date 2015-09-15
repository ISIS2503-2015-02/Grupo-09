
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/template/Desktop/Experimento 1/Grupo-09/conf/routes
// @DATE:Tue Sep 15 10:38:48 COT 2015

import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:162
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:162
    def versioned(file:Asset): Call = {
      implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:74
  class ReverseTranviaVehController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:76
    def readTranvia(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "tranvias/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:78
    def create(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "tranvias")
    }
  
    // @LINE:74
    def readAll(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "tranvias")
    }
  
    // @LINE:80
    def putTranvia(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("PUT", _prefix + { _defaultPrefix } + "tranvias/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
  }

  // @LINE:127
  class ReverseTrayectoController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:128
    def create(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "trayectos")
    }
  
    // @LINE:127
    def readAll(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "trayectos")
    }
  
  }

  // @LINE:133
  class ReverseEstacionController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:133
    def readAll(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "estaciones")
    }
  
    // @LINE:143
    def alquilarBicicleta(id:Long, id2:Long): Call = {
      import ReverseRouteContext.empty
      Call("DELETE", _prefix + { _defaultPrefix } + "estaciones/" + implicitly[PathBindable[Long]].unbind("id", id) + "/bicicletas/" + implicitly[PathBindable[Long]].unbind("id2", id2))
    }
  
    // @LINE:137
    def create(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "estaciones")
    }
  
    // @LINE:145
    def devolverBicicleta(id:Long, id2:Long): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "estaciones/" + implicitly[PathBindable[Long]].unbind("id", id) + "/bicicletas" + queryString(List(Some(implicitly[QueryStringBindable[Long]].unbind("id2", id2)))))
    }
  
    // @LINE:139
    def modificarEstacion(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("PUT", _prefix + { _defaultPrefix } + "estaciones/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:135
    def readVcubsEstacion(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "estaciones/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
  }

  // @LINE:29
  class ReverseUserController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:29
    def readAll(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "usuarios")
    }
  
    // @LINE:35
    def modify(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("PUT", _prefix + { _defaultPrefix } + "usuarios/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:37
    def consultarReservasUsuario(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "usuarios/" + implicitly[PathBindable[Long]].unbind("id", id) + "/reservas")
    }
  
    // @LINE:33
    def create(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "usuarios")
    }
  
    // @LINE:31
    def read(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "usuarios/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:43
    def eliminarReservaCliente(id:Long, id2:Long): Call = {
      import ReverseRouteContext.empty
      Call("DELETE", _prefix + { _defaultPrefix } + "usuarios/" + implicitly[PathBindable[Long]].unbind("id", id) + "/reservas/" + implicitly[PathBindable[Long]].unbind("id2", id2))
    }
  
    // @LINE:39
    def crearReseva(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "usuarios/" + implicitly[PathBindable[Long]].unbind("id", id) + "/reservas")
    }
  
    // @LINE:41
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

  // @LINE:102
  class ReverseVcubController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:108
    def modify(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("PUT", _prefix + { _defaultPrefix } + "vcubs/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:106
    def create(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "vcubs")
    }
  
    // @LINE:102
    def readAll(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "vcubs")
    }
  
    // @LINE:104
    def read(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "vcubs/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
  }

  // @LINE:48
  class ReverseMoviBusController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:65
    def agregarTrayectoMovibus(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "mobibuses/" + implicitly[PathBindable[Long]].unbind("id", id) + "/trayectos")
    }
  
    // @LINE:48
    def readAll(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "mobibuses")
    }
  
    // @LINE:52
    def create(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "mobibuses")
    }
  
    // @LINE:63
    def readRevisionesMovibus(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "mobibuses/" + implicitly[PathBindable[Long]].unbind("id", id) + "/revisiones")
    }
  
    // @LINE:57
    def agregarDatosMovibus(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "mobibuses/" + implicitly[PathBindable[Long]].unbind("id", id) + "/datos")
    }
  
    // @LINE:59
    def readDatosMovibus(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "mobibuses/" + implicitly[PathBindable[Long]].unbind("id", id) + "/datos")
    }
  
    // @LINE:50
    def readMovibus(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "mobibuses/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:67
    def finalizarTrayectoMovibus(id:Long, id2:Long): Call = {
      import ReverseRouteContext.empty
      Call("PUT", _prefix + { _defaultPrefix } + "mobibuses/" + implicitly[PathBindable[Long]].unbind("id", id) + "/trayectos/" + implicitly[PathBindable[Long]].unbind("id2", id2))
    }
  
    // @LINE:61
    def agregarRevisionMovibus(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "mobibuses/" + implicitly[PathBindable[Long]].unbind("id", id) + "/revisiones")
    }
  
    // @LINE:54
    def putMovibus(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("PUT", _prefix + { _defaultPrefix } + "mobibuses/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:69
    def readTrayectosMovibus(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "mobibuses/" + implicitly[PathBindable[Long]].unbind("id", id) + "/trayectos/")
    }
  
  }

  // @LINE:22
  class ReverseDriverController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:24
    def create(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "conductor")
    }
  
    // @LINE:22
    def read(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "conductor")
    }
  
  }


}