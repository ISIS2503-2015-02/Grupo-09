
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Dev/Grupo-09/conf/routes
// @DATE:Thu Oct 15 17:29:30 COT 2015

import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:182
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:182
    def at(file:String): Call = {
      implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
    }
  
  }

  // @LINE:80
  class ReverseTranviaVehController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:80
    def readAll(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "tranvias")
    }
  
    // @LINE:84
    def createTranvia(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "addTranvias")
    }
  
    // @LINE:87
    def putTranvia(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("PUT", _prefix + { _defaultPrefix } + "tranvias/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:82
    def readTranvia(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "tranvias/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:85
    def formTranvia(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "addTranvias")
    }
  
  }

  // @LINE:139
  class ReverseTrayectoController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:140
    def create(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "trayectos")
    }
  
    // @LINE:139
    def readAll(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "trayectos")
    }
  
  }

  // @LINE:145
  class ReverseEstacionController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:145
    def readAll(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "estaciones")
    }
  
    // @LINE:157
    def alquilarBicicleta(id:Long, id2:Long): Call = {
      import ReverseRouteContext.empty
      Call("DELETE", _prefix + { _defaultPrefix } + "estaciones/" + implicitly[PathBindable[Long]].unbind("id", id) + "/bicicletas/" + implicitly[PathBindable[Long]].unbind("id2", id2))
    }
  
    // @LINE:150
    def formEstacion(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "addEstaciones")
    }
  
    // @LINE:149
    def createEstacion(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "addEstaciones")
    }
  
    // @LINE:159
    def devolverBicicleta(id:Long, id2:Long): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "estaciones/" + implicitly[PathBindable[Long]].unbind("id", id) + "/bicicletas" + queryString(List(Some(implicitly[QueryStringBindable[Long]].unbind("id2", id2)))))
    }
  
    // @LINE:153
    def modificarEstacion(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("PUT", _prefix + { _defaultPrefix } + "estaciones/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:147
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

  // @LINE:109
  class ReverseVcubController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:109
    def readAll(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "vcubs")
    }
  
    // @LINE:117
    def modify(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("PUT", _prefix + { _defaultPrefix } + "vcubs/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:114
    def formVCub(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "addVCubs")
    }
  
    // @LINE:111
    def read(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "vcubs/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:113
    def createVcub(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "addVCubs")
    }
  
  }

  // @LINE:52
  class ReverseMoviBusController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:71
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
    def createMobiBus(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "addMobibuses")
    }
  
    // @LINE:69
    def readRevisionesMovibus(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "mobibuses/" + implicitly[PathBindable[Long]].unbind("id", id) + "/revisiones")
    }
  
    // @LINE:63
    def agregarDatosMovibus(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "mobibuses/" + implicitly[PathBindable[Long]].unbind("id", id) + "/datos")
    }
  
    // @LINE:65
    def readDatosMovibus(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "mobibuses/" + implicitly[PathBindable[Long]].unbind("id", id) + "/datos")
    }
  
    // @LINE:54
    def readMovibus(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "mobibuses/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:73
    def finalizarTrayectoMovibus(id:Long, id2:Long): Call = {
      import ReverseRouteContext.empty
      Call("PUT", _prefix + { _defaultPrefix } + "mobibuses/" + implicitly[PathBindable[Long]].unbind("id", id) + "/trayectos/" + implicitly[PathBindable[Long]].unbind("id2", id2))
    }
  
    // @LINE:67
    def agregarRevisionMovibus(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "mobibuses/" + implicitly[PathBindable[Long]].unbind("id", id) + "/revisiones")
    }
  
    // @LINE:57
    def formMobibus(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "addMobibuses")
    }
  
    // @LINE:60
    def putMovibus(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("PUT", _prefix + { _defaultPrefix } + "mobibuses/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:75
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

  // @LINE:178
  class ReverseMapController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:178
    def createMap(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "mapa")
    }
  
  }


}