
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Dev/Grupo-09/conf/routes
// @DATE:Thu Oct 15 17:29:30 COT 2015

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:182
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:182
    def at: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.at",
      """
        function(file) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
        }
      """
    )
  
  }

  // @LINE:80
  class ReverseTranviaVehController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:80
    def readAll: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TranviaVehController.readAll",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "tranvias"})
        }
      """
    )
  
    // @LINE:84
    def createTranvia: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TranviaVehController.createTranvia",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addTranvias"})
        }
      """
    )
  
    // @LINE:87
    def putTranvia: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TranviaVehController.putTranvia",
      """
        function(id) {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "tranvias/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
        }
      """
    )
  
    // @LINE:82
    def readTranvia: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TranviaVehController.readTranvia",
      """
        function(id) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "tranvias/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
        }
      """
    )
  
    // @LINE:85
    def formTranvia: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TranviaVehController.formTranvia",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addTranvias"})
        }
      """
    )
  
  }

  // @LINE:139
  class ReverseTrayectoController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:140
    def create: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TrayectoController.create",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "trayectos"})
        }
      """
    )
  
    // @LINE:139
    def readAll: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TrayectoController.readAll",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "trayectos"})
        }
      """
    )
  
  }

  // @LINE:145
  class ReverseEstacionController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:145
    def readAll: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.EstacionController.readAll",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "estaciones"})
        }
      """
    )
  
    // @LINE:157
    def alquilarBicicleta: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.EstacionController.alquilarBicicleta",
      """
        function(id,id2) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "estaciones/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/bicicletas/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id2", id2)})
        }
      """
    )
  
    // @LINE:150
    def formEstacion: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.EstacionController.formEstacion",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addEstaciones"})
        }
      """
    )
  
    // @LINE:149
    def createEstacion: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.EstacionController.createEstacion",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addEstaciones"})
        }
      """
    )
  
    // @LINE:159
    def devolverBicicleta: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.EstacionController.devolverBicicleta",
      """
        function(id,id2) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "estaciones/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/bicicletas" + _qS([(""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("id2", id2)])})
        }
      """
    )
  
    // @LINE:153
    def modificarEstacion: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.EstacionController.modificarEstacion",
      """
        function(id) {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "estaciones/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
        }
      """
    )
  
    // @LINE:147
    def readVcubsEstacion: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.EstacionController.readVcubsEstacion",
      """
        function(id) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "estaciones/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
        }
      """
    )
  
  }

  // @LINE:31
  class ReverseUserController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:31
    def readAll: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.readAll",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "usuarios"})
        }
      """
    )
  
    // @LINE:36
    def formUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.formUser",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addUsuarios"})
        }
      """
    )
  
    // @LINE:39
    def modify: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.modify",
      """
        function(id) {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "usuarios/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
        }
      """
    )
  
    // @LINE:41
    def consultarReservasUsuario: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.consultarReservasUsuario",
      """
        function(id) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "usuarios/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/reservas"})
        }
      """
    )
  
    // @LINE:35
    def createUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.createUser",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addUsuarios"})
        }
      """
    )
  
    // @LINE:33
    def read: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.read",
      """
        function(id) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "usuarios/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
        }
      """
    )
  
    // @LINE:47
    def eliminarReservaCliente: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.eliminarReservaCliente",
      """
        function(id,id2) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "usuarios/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/reservas/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id2", id2)})
        }
      """
    )
  
    // @LINE:43
    def crearReseva: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.crearReseva",
      """
        function(id) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "usuarios/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/reservas"})
        }
      """
    )
  
    // @LINE:45
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

  // @LINE:109
  class ReverseVcubController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:109
    def readAll: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.VcubController.readAll",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "vcubs"})
        }
      """
    )
  
    // @LINE:117
    def modify: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.VcubController.modify",
      """
        function(id) {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "vcubs/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
        }
      """
    )
  
    // @LINE:114
    def formVCub: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.VcubController.formVCub",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addVCubs"})
        }
      """
    )
  
    // @LINE:111
    def read: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.VcubController.read",
      """
        function(id) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "vcubs/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
        }
      """
    )
  
    // @LINE:113
    def createVcub: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.VcubController.createVcub",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addVCubs"})
        }
      """
    )
  
  }

  // @LINE:52
  class ReverseMoviBusController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:71
    def agregarTrayectoMovibus: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MoviBusController.agregarTrayectoMovibus",
      """
        function(id) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "mobibuses/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/trayectos"})
        }
      """
    )
  
    // @LINE:52
    def readAll: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MoviBusController.readAll",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "mobibuses"})
        }
      """
    )
  
    // @LINE:56
    def createMobiBus: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MoviBusController.createMobiBus",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addMobibuses"})
        }
      """
    )
  
    // @LINE:69
    def readRevisionesMovibus: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MoviBusController.readRevisionesMovibus",
      """
        function(id) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "mobibuses/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/revisiones"})
        }
      """
    )
  
    // @LINE:63
    def agregarDatosMovibus: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MoviBusController.agregarDatosMovibus",
      """
        function(id) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "mobibuses/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/datos"})
        }
      """
    )
  
    // @LINE:65
    def readDatosMovibus: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MoviBusController.readDatosMovibus",
      """
        function(id) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "mobibuses/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/datos"})
        }
      """
    )
  
    // @LINE:54
    def readMovibus: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MoviBusController.readMovibus",
      """
        function(id) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "mobibuses/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
        }
      """
    )
  
    // @LINE:73
    def finalizarTrayectoMovibus: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MoviBusController.finalizarTrayectoMovibus",
      """
        function(id,id2) {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "mobibuses/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/trayectos/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id2", id2)})
        }
      """
    )
  
    // @LINE:67
    def agregarRevisionMovibus: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MoviBusController.agregarRevisionMovibus",
      """
        function(id) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "mobibuses/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/revisiones"})
        }
      """
    )
  
    // @LINE:57
    def formMobibus: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MoviBusController.formMobibus",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addMobibuses"})
        }
      """
    )
  
    // @LINE:60
    def putMovibus: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MoviBusController.putMovibus",
      """
        function(id) {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "mobibuses/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
        }
      """
    )
  
    // @LINE:75
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

  
    // @LINE:26
    def formDriver: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DriverController.formDriver",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addConductores"})
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
  
    // @LINE:25
    def createDriver: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DriverController.createDriver",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addConductores"})
        }
      """
    )
  
  }

  // @LINE:178
  class ReverseMapController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:178
    def createMap: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MapController.createMap",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "mapa"})
        }
      """
    )
  
  }


}