
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Dev/Grupo-09/conf/routes
// @DATE:Wed Sep 16 21:15:05 COT 2015

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:163
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:163
    def at: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.at",
      """
        function(file) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
        }
      """
    )
  
  }

  // @LINE:75
  class ReverseTranviaVehController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:77
    def readTranvia: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TranviaVehController.readTranvia",
      """
        function(id) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "tranvias/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
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
  
    // @LINE:81
    def putTranvia: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TranviaVehController.putTranvia",
      """
        function(id) {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "tranvias/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
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
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "estaciones/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/bicicletas/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id2", id2)})
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
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "estaciones/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/bicicletas" + _qS([(""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("id2", id2)])})
        }
      """
    )
  
    // @LINE:140
    def modificarEstacion: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.EstacionController.modificarEstacion",
      """
        function(id) {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "estaciones/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
        }
      """
    )
  
    // @LINE:136
    def readVcubsEstacion: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.EstacionController.readVcubsEstacion",
      """
        function(id) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "estaciones/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
        }
      """
    )
  
  }

  // @LINE:30
  class ReverseUserController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:30
    def readAll: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.readAll",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "usuarios"})
        }
      """
    )
  
    // @LINE:36
    def modify: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.modify",
      """
        function(id) {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "usuarios/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
        }
      """
    )
  
    // @LINE:38
    def consultarReservasUsuario: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.consultarReservasUsuario",
      """
        function(id) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "usuarios/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/reservas"})
        }
      """
    )
  
    // @LINE:34
    def create: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.create",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "usuarios"})
        }
      """
    )
  
    // @LINE:32
    def read: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.read",
      """
        function(id) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "usuarios/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
        }
      """
    )
  
    // @LINE:44
    def eliminarReservaCliente: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.eliminarReservaCliente",
      """
        function(id,id2) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "usuarios/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/reservas/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id2", id2)})
        }
      """
    )
  
    // @LINE:40
    def crearReseva: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.crearReseva",
      """
        function(id) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "usuarios/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/reservas"})
        }
      """
    )
  
    // @LINE:42
    def modificarReservaCliente: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.modificarReservaCliente",
      """
        function(id,id2) {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "usuarios/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/reservas/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id2", id2)})
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
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "vcubs/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
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
  
    // @LINE:105
    def read: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.VcubController.read",
      """
        function(id) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "vcubs/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
        }
      """
    )
  
  }

  // @LINE:49
  class ReverseMoviBusController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:66
    def agregarTrayectoMovibus: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MoviBusController.agregarTrayectoMovibus",
      """
        function(id) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "mobibuses/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/trayectos"})
        }
      """
    )
  
    // @LINE:49
    def readAll: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MoviBusController.readAll",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "mobibuses"})
        }
      """
    )
  
    // @LINE:53
    def create: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MoviBusController.create",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "mobibuses"})
        }
      """
    )
  
    // @LINE:64
    def readRevisionesMovibus: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MoviBusController.readRevisionesMovibus",
      """
        function(id) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "mobibuses/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/revisiones"})
        }
      """
    )
  
    // @LINE:58
    def agregarDatosMovibus: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MoviBusController.agregarDatosMovibus",
      """
        function(id) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "mobibuses/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/datos"})
        }
      """
    )
  
    // @LINE:60
    def readDatosMovibus: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MoviBusController.readDatosMovibus",
      """
        function(id) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "mobibuses/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/datos"})
        }
      """
    )
  
    // @LINE:51
    def readMovibus: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MoviBusController.readMovibus",
      """
        function(id) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "mobibuses/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
        }
      """
    )
  
    // @LINE:68
    def finalizarTrayectoMovibus: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MoviBusController.finalizarTrayectoMovibus",
      """
        function(id,id2) {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "mobibuses/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/trayectos/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id2", id2)})
        }
      """
    )
  
    // @LINE:62
    def agregarRevisionMovibus: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MoviBusController.agregarRevisionMovibus",
      """
        function(id) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "mobibuses/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/revisiones"})
        }
      """
    )
  
    // @LINE:55
    def putMovibus: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MoviBusController.putMovibus",
      """
        function(id) {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "mobibuses/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
        }
      """
    )
  
    // @LINE:70
    def readTrayectosMovibus: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MoviBusController.readTrayectosMovibus",
      """
        function(id) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "mobibuses/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/trayectos/"})
        }
      """
    )
  
  }

  // @LINE:23
  class ReverseDriverController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:25
    def create: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DriverController.create",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "conductor"})
        }
      """
    )
  
    // @LINE:23
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