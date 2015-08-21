
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/ryogi/Arquisoft/Grupo-09/conf/routes
// @DATE:Fri Aug 21 10:25:02 COT 2015

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:169
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:169
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[Asset]].javascriptUnbind + """)("file", file)})
        }
      """
    )
  
  }

  // @LINE:75
  class ReverseTranviaVehController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:81
    def putTranvia: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TranviaVehController.putTranvia",
      """
        function(id) {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "tranvias/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("id", encodeURIComponent(id))})
        }
      """
    )
  
    // @LINE:79
    def create: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TranviaVehController.create",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "tranvias"})
        }
      """
    )
  
    // @LINE:75
    def readAll: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TranviaVehController.readAll",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "tranvias"})
        }
      """
    )
  
    // @LINE:77
    def readTranvia: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TranviaVehController.readTranvia",
      """
        function(id) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "tranvias/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("id", encodeURIComponent(id))})
        }
      """
    )
  
  }

  // @LINE:128
  class ReverseTrayectoController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:129
    def create: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TrayectoController.create",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "trayectos"})
        }
      """
    )
  
    // @LINE:128
    def readAll: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TrayectoController.readAll",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "trayectos"})
        }
      """
    )
  
  }

  // @LINE:151
  class ReverseVehiculoController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:151
    def readAll: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.VehiculoController.readAll",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "vehiculos"})
        }
      """
    )
  
    // @LINE:159
    def readDatosVehiculo: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.VehiculoController.readDatosVehiculo",
      """
        function(id) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "vehiculos/{id}/datos" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("id", id)])})
        }
      """
    )
  
    // @LINE:157
    def agregarDatosVehiculo: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.VehiculoController.agregarDatosVehiculo",
      """
        function(id) {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "vehiculos/{id}" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("id", id)])})
        }
      """
    )
  
    // @LINE:153
    def create: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.VehiculoController.create",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "vehiculos"})
        }
      """
    )
  
    // @LINE:155
    def readVehiculoID: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.VehiculoController.readVehiculoID",
      """
        function(id) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "vehiculos/{id}" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("id", id)])})
        }
      """
    )
  
  }

  // @LINE:134
  class ReverseEstacionController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:134
    def readAll: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.EstacionController.readAll",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "estaciones"})
        }
      """
    )
  
    // @LINE:144
    def alquilarBicicleta: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.EstacionController.alquilarBicicleta",
      """
        function(id,id2) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "estaciones/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("id", encodeURIComponent(id)) + "/bicicletas/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("id2", encodeURIComponent(id2))})
        }
      """
    )
  
    // @LINE:138
    def create: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.EstacionController.create",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "estaciones"})
        }
      """
    )
  
    // @LINE:146
    def devolverBicicleta: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.EstacionController.devolverBicicleta",
      """
        function(id,id2) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "estaciones/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("id", encodeURIComponent(id)) + "/bicicletas" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("id2", id2)])})
        }
      """
    )
  
    // @LINE:140
    def modificarEstacion: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.EstacionController.modificarEstacion",
      """
        function(id) {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "estaciones/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("id", encodeURIComponent(id))})
        }
      """
    )
  
    // @LINE:136
    def readVcubsEstacion: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.EstacionController.readVcubsEstacion",
      """
        function(id) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "estaciones/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("id", encodeURIComponent(id))})
        }
      """
    )
  
  }

  // @LINE:29
  class ReverseUserController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:29
    def readAll: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.readAll",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "usuarios"})
        }
      """
    )
  
    // @LINE:41
    def modificarReservaCliente: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.modificarReservaCliente",
      """
        function(id,id2) {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "usuarios/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("id", encodeURIComponent(id)) + "/reservas/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("id2", encodeURIComponent(id2))})
        }
      """
    )
  
    // @LINE:35
    def modify: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.modify",
      """
        function(id) {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "usuarios/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("id", encodeURIComponent(id))})
        }
      """
    )
  
    // @LINE:31
    def read: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.read",
      """
        function(id) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "usuarios/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("id", encodeURIComponent(id))})
        }
      """
    )
  
    // @LINE:33
    def create: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.create",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "usuarios"})
        }
      """
    )
  
    // @LINE:37
    def consultarReservasUsuario: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.consultarReservasUsuario",
      """
        function(id) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "usuarios/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("id", encodeURIComponent(id)) + "/reservas"})
        }
      """
    )
  
    // @LINE:39
    def crearReseva: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.crearReseva",
      """
        function(id) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "usuarios/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("id", encodeURIComponent(id)) + "/reservas"})
        }
      """
    )
  
    // @LINE:43
    def eliminarReservaCliente: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.eliminarReservaCliente",
      """
        function(id,id2) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "usuarios/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("id", encodeURIComponent(id)) + "/reservas/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("id2", encodeURIComponent(id2))})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseApplication(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }

  // @LINE:103
  class ReverseVcubController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:109
    def modify: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.VcubController.modify",
      """
        function(id) {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "vcubs/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("id", encodeURIComponent(id))})
        }
      """
    )
  
    // @LINE:105
    def read: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.VcubController.read",
      """
        function(id) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "vcubs/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("id", encodeURIComponent(id))})
        }
      """
    )
  
    // @LINE:107
    def create: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.VcubController.create",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "vcubs"})
        }
      """
    )
  
    // @LINE:103
    def readAll: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.VcubController.readAll",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "vcubs"})
        }
      """
    )
  
  }

  // @LINE:48
  class ReverseMoviBusController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:54
    def putMovibus: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MoviBusController.putMovibus",
      """
        function(id) {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "mobibuses/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("id", encodeURIComponent(id))})
        }
      """
    )
  
    // @LINE:50
    def readMovibus: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MoviBusController.readMovibus",
      """
        function(id) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "mobibuses/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("id", encodeURIComponent(id))})
        }
      """
    )
  
    // @LINE:52
    def create: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MoviBusController.create",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "mobibuses"})
        }
      """
    )
  
    // @LINE:48
    def read: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MoviBusController.read",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "mobibuses"})
        }
      """
    )
  
  }

  // @LINE:22
  class ReverseDriverController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:24
    def create: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DriverController.create",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "conductor"})
        }
      """
    )
  
    // @LINE:22
    def read: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DriverController.read",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "conductor"})
        }
      """
    )
  
  }


}