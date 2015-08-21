
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/ryogi/Arquisoft/Grupo-09/conf/routes
// @DATE:Thu Aug 20 20:30:01 COT 2015

import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:169
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:169
    def versioned(file:Asset): Call = {
      implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:75
  class ReverseTranviaVehController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:81
    def putTranvia(id:String): Call = {
      import ReverseRouteContext.empty
      Call("PUT", _prefix + { _defaultPrefix } + "tranvias/" + implicitly[PathBindable[String]].unbind("id", dynamicString(id)))
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
  
    // @LINE:77
    def readTranvia(id:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "tranvias/" + implicitly[PathBindable[String]].unbind("id", dynamicString(id)))
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

  // @LINE:151
  class ReverseVehiculoController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:151
    def readAll(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "vehiculos")
    }
  
    // @LINE:159
    def readDatosVehiculo(id:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "vehiculos/{id}/datos" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("id", id)))))
    }
  
    // @LINE:157
    def agregarDatosVehiculo(id:String): Call = {
      import ReverseRouteContext.empty
      Call("PUT", _prefix + { _defaultPrefix } + "vehiculos/{id}" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("id", id)))))
    }
  
    // @LINE:153
    def create(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "vehiculos")
    }
  
    // @LINE:155
    def readVehiculoID(id:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "vehiculos/{id}" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("id", id)))))
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
    def alquilarBicicleta(id:String, id2:String): Call = {
      import ReverseRouteContext.empty
      Call("DELETE", _prefix + { _defaultPrefix } + "estaciones/" + implicitly[PathBindable[String]].unbind("id", dynamicString(id)) + "/bicicletas/" + implicitly[PathBindable[String]].unbind("id2", dynamicString(id2)))
    }
  
    // @LINE:138
    def create(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "estaciones")
    }
  
    // @LINE:146
    def devolverBicicleta(id:String, id2:String): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "estaciones/" + implicitly[PathBindable[String]].unbind("id", dynamicString(id)) + "/bicicletas" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("id2", id2)))))
    }
  
    // @LINE:140
    def modificarEstacion(id:String): Call = {
      import ReverseRouteContext.empty
      Call("PUT", _prefix + { _defaultPrefix } + "estaciones/" + implicitly[PathBindable[String]].unbind("id", dynamicString(id)))
    }
  
    // @LINE:136
    def readVcubsEstacion(id:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "estaciones/" + implicitly[PathBindable[String]].unbind("id", dynamicString(id)))
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
  
    // @LINE:41
    def modificarReservaCliente(id:String, id2:String): Call = {
      import ReverseRouteContext.empty
      Call("PUT", _prefix + { _defaultPrefix } + "usuarios/" + implicitly[PathBindable[String]].unbind("id", dynamicString(id)) + "/reservas/" + implicitly[PathBindable[String]].unbind("id2", dynamicString(id2)))
    }
  
    // @LINE:35
    def modify(id:String): Call = {
      import ReverseRouteContext.empty
      Call("PUT", _prefix + { _defaultPrefix } + "usuarios/" + implicitly[PathBindable[String]].unbind("id", dynamicString(id)))
    }
  
    // @LINE:31
    def read(id:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "usuarios/" + implicitly[PathBindable[String]].unbind("id", dynamicString(id)))
    }
  
    // @LINE:33
    def create(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "usuarios")
    }
  
    // @LINE:37
    def consultarReservasUsuario(id:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "usuarios/" + implicitly[PathBindable[String]].unbind("id", dynamicString(id)) + "/reservas")
    }
  
    // @LINE:39
    def crearReseva(id:String): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "usuarios/" + implicitly[PathBindable[String]].unbind("id", dynamicString(id)) + "/reservas")
    }
  
    // @LINE:43
    def eliminarReservaCliente(id:String, id2:String): Call = {
      import ReverseRouteContext.empty
      Call("DELETE", _prefix + { _defaultPrefix } + "usuarios/" + implicitly[PathBindable[String]].unbind("id", dynamicString(id)) + "/reservas/" + implicitly[PathBindable[String]].unbind("id2", dynamicString(id2)))
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
    def modify(id:String): Call = {
      import ReverseRouteContext.empty
      Call("PUT", _prefix + { _defaultPrefix } + "vcubs/" + implicitly[PathBindable[String]].unbind("id", dynamicString(id)))
    }
  
    // @LINE:105
    def read(id:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "vcubs/" + implicitly[PathBindable[String]].unbind("id", dynamicString(id)))
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
  
  }

  // @LINE:48
  class ReverseMoviBusController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:54
    def putMovibus(id:String): Call = {
      import ReverseRouteContext.empty
      Call("PUT", _prefix + { _defaultPrefix } + "mobibuses/" + implicitly[PathBindable[String]].unbind("id", dynamicString(id)))
    }
  
    // @LINE:50
    def readMovibus(id:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "mobibuses/" + implicitly[PathBindable[String]].unbind("id", dynamicString(id)))
    }
  
    // @LINE:52
    def create(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "mobibuses")
    }
  
    // @LINE:48
    def read(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "mobibuses")
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