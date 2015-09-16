
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/ryogi/Arquisoft/Grupo-09/conf/routes
// @DATE:Wed Sep 16 08:17:26 COT 2015

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:162
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:162
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[Asset]].javascriptUnbind + """)("file", file)})
        }
      """
    )
  
  }

  // @LINE:74
  class ReverseTranviaVehController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:76
    def readTranvia: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TranviaVehController.readTranvia",
      """
        function(id) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "tranvias/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
        }
      """
    )
  
    // @LINE:78
    def create: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TranviaVehController.create",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "tranvias"})
        }
      """
    )
  
    // @LINE:74
    def readAll: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TranviaVehController.readAll",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "tranvias"})
        }
      """
    )
  
    // @LINE:80
    def putTranvia: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TranviaVehController.putTranvia",
      """
        function(id) {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "tranvias/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
        }
      """
    )
  
  }

  // @LINE:127
  class ReverseTrayectoController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:128
    def create: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TrayectoController.create",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "trayectos"})
        }
      """
    )
  
    // @LINE:127
    def readAll: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TrayectoController.readAll",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "trayectos"})
        }
      """
    )
  
  }

  // @LINE:133
  class ReverseEstacionController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:133
    def readAll: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.EstacionController.readAll",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "estaciones"})
        }
      """
    )
  
    // @LINE:143
    def alquilarBicicleta: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.EstacionController.alquilarBicicleta",
      """
        function(id,id2) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "estaciones/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/bicicletas/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id2", id2)})
        }
      """
    )
  
    // @LINE:137
    def create: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.EstacionController.create",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "estaciones"})
        }
      """
    )
  
    // @LINE:145
    def devolverBicicleta: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.EstacionController.devolverBicicleta",
      """
        function(id,id2) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "estaciones/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/bicicletas" + _qS([(""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("id2", id2)])})
        }
      """
    )
  
    // @LINE:139
    def modificarEstacion: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.EstacionController.modificarEstacion",
      """
        function(id) {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "estaciones/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
        }
      """
    )
  
    // @LINE:135
    def readVcubsEstacion: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.EstacionController.readVcubsEstacion",
      """
        function(id) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "estaciones/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
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
  
    // @LINE:35
    def modify: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.modify",
      """
        function(id) {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "usuarios/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
        }
      """
    )
  
    // @LINE:37
    def consultarReservasUsuario: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.consultarReservasUsuario",
      """
        function(id) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "usuarios/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/reservas"})
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
  
    // @LINE:31
    def read: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.read",
      """
        function(id) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "usuarios/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
        }
      """
    )
  
    // @LINE:43
    def eliminarReservaCliente: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.eliminarReservaCliente",
      """
        function(id,id2) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "usuarios/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/reservas/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id2", id2)})
        }
      """
    )
  
    // @LINE:39
    def crearReseva: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.crearReseva",
      """
        function(id) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "usuarios/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/reservas"})
        }
      """
    )
  
    // @LINE:41
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

  // @LINE:102
  class ReverseVcubController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:108
    def modify: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.VcubController.modify",
      """
        function(id) {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "vcubs/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
        }
      """
    )
  
    // @LINE:106
    def create: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.VcubController.create",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "vcubs"})
        }
      """
    )
  
    // @LINE:102
    def readAll: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.VcubController.readAll",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "vcubs"})
        }
      """
    )
  
    // @LINE:104
    def read: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.VcubController.read",
      """
        function(id) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "vcubs/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
        }
      """
    )
  
  }

  // @LINE:48
  class ReverseMoviBusController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:65
    def agregarTrayectoMovibus: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MoviBusController.agregarTrayectoMovibus",
      """
        function(id) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "mobibuses/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/trayectos"})
        }
      """
    )
  
    // @LINE:48
    def readAll: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MoviBusController.readAll",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "mobibuses"})
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
  
    // @LINE:63
    def readRevisionesMovibus: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MoviBusController.readRevisionesMovibus",
      """
        function(id) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "mobibuses/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/revisiones"})
        }
      """
    )
  
    // @LINE:57
    def agregarDatosMovibus: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MoviBusController.agregarDatosMovibus",
      """
        function(id) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "mobibuses/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/datos"})
        }
      """
    )
  
    // @LINE:59
    def readDatosMovibus: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MoviBusController.readDatosMovibus",
      """
        function(id) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "mobibuses/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/datos"})
        }
      """
    )
  
    // @LINE:50
    def readMovibus: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MoviBusController.readMovibus",
      """
        function(id) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "mobibuses/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
        }
      """
    )
  
    // @LINE:67
    def finalizarTrayectoMovibus: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MoviBusController.finalizarTrayectoMovibus",
      """
        function(id,id2) {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "mobibuses/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/trayectos/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id2", id2)})
        }
      """
    )
  
    // @LINE:61
    def agregarRevisionMovibus: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MoviBusController.agregarRevisionMovibus",
      """
        function(id) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "mobibuses/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/revisiones"})
        }
      """
    )
  
    // @LINE:54
    def putMovibus: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MoviBusController.putMovibus",
      """
        function(id) {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "mobibuses/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
        }
      """
    )
  
    // @LINE:69
    def readTrayectosMovibus: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MoviBusController.readTrayectosMovibus",
      """
        function(id) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "mobibuses/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/trayectos/"})
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