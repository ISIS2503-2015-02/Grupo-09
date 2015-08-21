
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/ryogi/Arquisoft/Grupo-09/conf/routes
// @DATE:Fri Aug 21 17:41:53 COT 2015

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  Application_9: controllers.Application,
  // @LINE:22
  DriverController_6: controllers.DriverController,
  // @LINE:29
  UserController_4: controllers.UserController,
  // @LINE:48
  MoviBusController_1: controllers.MoviBusController,
  // @LINE:75
  TranviaVehController_3: controllers.TranviaVehController,
  // @LINE:103
  VcubController_5: controllers.VcubController,
  // @LINE:128
  TrayectoController_2: controllers.TrayectoController,
  // @LINE:134
  EstacionController_8: controllers.EstacionController,
  // @LINE:151
  VehiculoController_0: controllers.VehiculoController,
  // @LINE:169
  Assets_7: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    Application_9: controllers.Application,
    // @LINE:22
    DriverController_6: controllers.DriverController,
    // @LINE:29
    UserController_4: controllers.UserController,
    // @LINE:48
    MoviBusController_1: controllers.MoviBusController,
    // @LINE:75
    TranviaVehController_3: controllers.TranviaVehController,
    // @LINE:103
    VcubController_5: controllers.VcubController,
    // @LINE:128
    TrayectoController_2: controllers.TrayectoController,
    // @LINE:134
    EstacionController_8: controllers.EstacionController,
    // @LINE:151
    VehiculoController_0: controllers.VehiculoController,
    // @LINE:169
    Assets_7: controllers.Assets
  ) = this(errorHandler, Application_9, DriverController_6, UserController_4, MoviBusController_1, TranviaVehController_3, VcubController_5, TrayectoController_2, EstacionController_8, VehiculoController_0, Assets_7, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Application_9, DriverController_6, UserController_4, MoviBusController_1, TranviaVehController_3, VcubController_5, TrayectoController_2, EstacionController_8, VehiculoController_0, Assets_7, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.Application.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """conductor""", """controllers.DriverController.read()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """conductor""", """controllers.DriverController.create()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """usuarios""", """controllers.UserController.readAll()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """usuarios/$id<[^/]+>""", """controllers.UserController.read(id:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """usuarios""", """controllers.UserController.create()"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """usuarios/$id<[^/]+>""", """controllers.UserController.modify(id:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """usuarios/$id<[^/]+>/reservas""", """controllers.UserController.consultarReservasUsuario(id:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """usuarios/$id<[^/]+>/reservas""", """controllers.UserController.crearReseva(id:String)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """usuarios/$id<[^/]+>/reservas/$id2<[^/]+>""", """controllers.UserController.modificarReservaCliente(id:String, id2:String)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """usuarios/$id<[^/]+>/reservas/$id2<[^/]+>""", """controllers.UserController.eliminarReservaCliente(id:String, id2:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """mobibuses""", """controllers.MoviBusController.read()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """mobibuses/$id<[^/]+>""", """controllers.MoviBusController.readMovibus(id:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """mobibuses""", """controllers.MoviBusController.create()"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """mobibuses/$id<[^/]+>""", """controllers.MoviBusController.putMovibus(id:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tranvias""", """controllers.TranviaVehController.readAll()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tranvias/$id<[^/]+>""", """controllers.TranviaVehController.readTranvia(id:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tranvias""", """controllers.TranviaVehController.create()"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tranvias/$id<[^/]+>""", """controllers.TranviaVehController.putTranvia(id:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """vcubs""", """controllers.VcubController.readAll()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """vcubs/$id<[^/]+>""", """controllers.VcubController.read(id:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """vcubs""", """controllers.VcubController.create()"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """vcubs/$id<[^/]+>""", """controllers.VcubController.modify(id:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """trayectos""", """controllers.TrayectoController.readAll()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """trayectos""", """controllers.TrayectoController.create()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """estaciones""", """controllers.EstacionController.readAll()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """estaciones/$id<[^/]+>""", """controllers.EstacionController.readVcubsEstacion(id:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """estaciones""", """controllers.EstacionController.create()"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """estaciones/$id<[^/]+>""", """controllers.EstacionController.modificarEstacion(id:String)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """estaciones/$id<[^/]+>/bicicletas/$id2<[^/]+>""", """controllers.EstacionController.alquilarBicicleta(id:String, id2:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """estaciones/$id<[^/]+>/bicicletas""", """controllers.EstacionController.devolverBicicleta(id:String, id2:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """vehiculos""", """controllers.VehiculoController.readAll()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """vehiculos""", """controllers.VehiculoController.create()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """vehiculos/{id}""", """controllers.VehiculoController.readVehiculoID(id:String)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """vehiculos/{id}""", """controllers.VehiculoController.agregarDatosVehiculo(id:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """vehiculos/{id}/datos""", """controllers.VehiculoController.readDatosVehiculo(id:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_Application_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_Application_index0_invoker = createInvoker(
    Application_9.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "index",
      Nil,
      "GET",
      """ Home page""",
      this.prefix + """"""
    )
  )

  // @LINE:22
  private[this] lazy val controllers_DriverController_read1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("conductor")))
  )
  private[this] lazy val controllers_DriverController_read1_invoker = createInvoker(
    DriverController_6.read(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DriverController",
      "read",
      Nil,
      "GET",
      """######################################################## CONDUCTORES #######################################
Obtener todos los conductores""",
      this.prefix + """conductor"""
    )
  )

  // @LINE:24
  private[this] lazy val controllers_DriverController_create2_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("conductor")))
  )
  private[this] lazy val controllers_DriverController_create2_invoker = createInvoker(
    DriverController_6.create(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DriverController",
      "create",
      Nil,
      "POST",
      """Crear nuevo conductor""",
      this.prefix + """conductor"""
    )
  )

  // @LINE:29
  private[this] lazy val controllers_UserController_readAll3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("usuarios")))
  )
  private[this] lazy val controllers_UserController_readAll3_invoker = createInvoker(
    UserController_4.readAll(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "readAll",
      Nil,
      "GET",
      """######################################################################  USUARIOS ################
Obtener todos los usuarios""",
      this.prefix + """usuarios"""
    )
  )

  // @LINE:31
  private[this] lazy val controllers_UserController_read4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("usuarios/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_UserController_read4_invoker = createInvoker(
    UserController_4.read(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "read",
      Seq(classOf[String]),
      "GET",
      """Obtener los datos de un usuario""",
      this.prefix + """usuarios/$id<[^/]+>"""
    )
  )

  // @LINE:33
  private[this] lazy val controllers_UserController_create5_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("usuarios")))
  )
  private[this] lazy val controllers_UserController_create5_invoker = createInvoker(
    UserController_4.create(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "create",
      Nil,
      "POST",
      """Registrar un nuevo usuario""",
      this.prefix + """usuarios"""
    )
  )

  // @LINE:35
  private[this] lazy val controllers_UserController_modify6_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("usuarios/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_UserController_modify6_invoker = createInvoker(
    UserController_4.modify(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "modify",
      Seq(classOf[String]),
      "PUT",
      """Modificar datos de un usuario""",
      this.prefix + """usuarios/$id<[^/]+>"""
    )
  )

  // @LINE:37
  private[this] lazy val controllers_UserController_consultarReservasUsuario7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("usuarios/"), DynamicPart("id", """[^/]+""",true), StaticPart("/reservas")))
  )
  private[this] lazy val controllers_UserController_consultarReservasUsuario7_invoker = createInvoker(
    UserController_4.consultarReservasUsuario(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "consultarReservasUsuario",
      Seq(classOf[String]),
      "GET",
      """Obtener reservas de un usuario""",
      this.prefix + """usuarios/$id<[^/]+>/reservas"""
    )
  )

  // @LINE:39
  private[this] lazy val controllers_UserController_crearReseva8_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("usuarios/"), DynamicPart("id", """[^/]+""",true), StaticPart("/reservas")))
  )
  private[this] lazy val controllers_UserController_crearReseva8_invoker = createInvoker(
    UserController_4.crearReseva(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "crearReseva",
      Seq(classOf[String]),
      "POST",
      """Crear una reserva""",
      this.prefix + """usuarios/$id<[^/]+>/reservas"""
    )
  )

  // @LINE:41
  private[this] lazy val controllers_UserController_modificarReservaCliente9_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("usuarios/"), DynamicPart("id", """[^/]+""",true), StaticPart("/reservas/"), DynamicPart("id2", """[^/]+""",true)))
  )
  private[this] lazy val controllers_UserController_modificarReservaCliente9_invoker = createInvoker(
    UserController_4.modificarReservaCliente(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "modificarReservaCliente",
      Seq(classOf[String], classOf[String]),
      "PUT",
      """Modificar una reserva""",
      this.prefix + """usuarios/$id<[^/]+>/reservas/$id2<[^/]+>"""
    )
  )

  // @LINE:43
  private[this] lazy val controllers_UserController_eliminarReservaCliente10_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("usuarios/"), DynamicPart("id", """[^/]+""",true), StaticPart("/reservas/"), DynamicPart("id2", """[^/]+""",true)))
  )
  private[this] lazy val controllers_UserController_eliminarReservaCliente10_invoker = createInvoker(
    UserController_4.eliminarReservaCliente(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "eliminarReservaCliente",
      Seq(classOf[String], classOf[String]),
      "DELETE",
      """Eliminar una reserva""",
      this.prefix + """usuarios/$id<[^/]+>/reservas/$id2<[^/]+>"""
    )
  )

  // @LINE:48
  private[this] lazy val controllers_MoviBusController_read11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("mobibuses")))
  )
  private[this] lazy val controllers_MoviBusController_read11_invoker = createInvoker(
    MoviBusController_1.read(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MoviBusController",
      "read",
      Nil,
      "GET",
      """###############################################################   MOBIBUSES  ############################################
Obtener todos los mobibuses del sistema""",
      this.prefix + """mobibuses"""
    )
  )

  // @LINE:50
  private[this] lazy val controllers_MoviBusController_readMovibus12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("mobibuses/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_MoviBusController_readMovibus12_invoker = createInvoker(
    MoviBusController_1.readMovibus(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MoviBusController",
      "readMovibus",
      Seq(classOf[String]),
      "GET",
      """Obtener los datos de un mobibus""",
      this.prefix + """mobibuses/$id<[^/]+>"""
    )
  )

  // @LINE:52
  private[this] lazy val controllers_MoviBusController_create13_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("mobibuses")))
  )
  private[this] lazy val controllers_MoviBusController_create13_invoker = createInvoker(
    MoviBusController_1.create(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MoviBusController",
      "create",
      Nil,
      "POST",
      """Registrar un nuevo mobibus""",
      this.prefix + """mobibuses"""
    )
  )

  // @LINE:54
  private[this] lazy val controllers_MoviBusController_putMovibus14_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("mobibuses/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_MoviBusController_putMovibus14_invoker = createInvoker(
    MoviBusController_1.putMovibus(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MoviBusController",
      "putMovibus",
      Seq(classOf[String]),
      "PUT",
      """Modificar datos de un mobibus""",
      this.prefix + """mobibuses/$id<[^/]+>"""
    )
  )

  // @LINE:75
  private[this] lazy val controllers_TranviaVehController_readAll15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tranvias")))
  )
  private[this] lazy val controllers_TranviaVehController_readAll15_invoker = createInvoker(
    TranviaVehController_3.readAll(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TranviaVehController",
      "readAll",
      Nil,
      "GET",
      """####################################################################  TRANVIAS  #######################
Obtener todos los tranvias del sistema""",
      this.prefix + """tranvias"""
    )
  )

  // @LINE:77
  private[this] lazy val controllers_TranviaVehController_readTranvia16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tranvias/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_TranviaVehController_readTranvia16_invoker = createInvoker(
    TranviaVehController_3.readTranvia(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TranviaVehController",
      "readTranvia",
      Seq(classOf[String]),
      "GET",
      """Obtener los datos de un tranvia""",
      this.prefix + """tranvias/$id<[^/]+>"""
    )
  )

  // @LINE:79
  private[this] lazy val controllers_TranviaVehController_create17_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tranvias")))
  )
  private[this] lazy val controllers_TranviaVehController_create17_invoker = createInvoker(
    TranviaVehController_3.create(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TranviaVehController",
      "create",
      Nil,
      "POST",
      """Registrar un nuevo tranvias""",
      this.prefix + """tranvias"""
    )
  )

  // @LINE:81
  private[this] lazy val controllers_TranviaVehController_putTranvia18_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tranvias/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_TranviaVehController_putTranvia18_invoker = createInvoker(
    TranviaVehController_3.putTranvia(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TranviaVehController",
      "putTranvia",
      Seq(classOf[String]),
      "PUT",
      """Modificar datos de un tranvias""",
      this.prefix + """tranvias/$id<[^/]+>"""
    )
  )

  // @LINE:103
  private[this] lazy val controllers_VcubController_readAll19_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("vcubs")))
  )
  private[this] lazy val controllers_VcubController_readAll19_invoker = createInvoker(
    VcubController_5.readAll(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.VcubController",
      "readAll",
      Nil,
      "GET",
      """########################################################  VCUBS #######################################
Obtener todos los vcubs del sistema""",
      this.prefix + """vcubs"""
    )
  )

  // @LINE:105
  private[this] lazy val controllers_VcubController_read20_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("vcubs/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_VcubController_read20_invoker = createInvoker(
    VcubController_5.read(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.VcubController",
      "read",
      Seq(classOf[String]),
      "GET",
      """Obtener los datos de un vcubs""",
      this.prefix + """vcubs/$id<[^/]+>"""
    )
  )

  // @LINE:107
  private[this] lazy val controllers_VcubController_create21_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("vcubs")))
  )
  private[this] lazy val controllers_VcubController_create21_invoker = createInvoker(
    VcubController_5.create(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.VcubController",
      "create",
      Nil,
      "POST",
      """Registrar un nuevo vcubs""",
      this.prefix + """vcubs"""
    )
  )

  // @LINE:109
  private[this] lazy val controllers_VcubController_modify22_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("vcubs/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_VcubController_modify22_invoker = createInvoker(
    VcubController_5.modify(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.VcubController",
      "modify",
      Seq(classOf[String]),
      "PUT",
      """Modificar datos de un vcubs""",
      this.prefix + """vcubs/$id<[^/]+>"""
    )
  )

  // @LINE:128
  private[this] lazy val controllers_TrayectoController_readAll23_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("trayectos")))
  )
  private[this] lazy val controllers_TrayectoController_readAll23_invoker = createInvoker(
    TrayectoController_2.readAll(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TrayectoController",
      "readAll",
      Nil,
      "GET",
      """TRAYECTOS""",
      this.prefix + """trayectos"""
    )
  )

  // @LINE:129
  private[this] lazy val controllers_TrayectoController_create24_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("trayectos")))
  )
  private[this] lazy val controllers_TrayectoController_create24_invoker = createInvoker(
    TrayectoController_2.create(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TrayectoController",
      "create",
      Nil,
      "POST",
      """""",
      this.prefix + """trayectos"""
    )
  )

  // @LINE:134
  private[this] lazy val controllers_EstacionController_readAll25_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("estaciones")))
  )
  private[this] lazy val controllers_EstacionController_readAll25_invoker = createInvoker(
    EstacionController_8.readAll(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.EstacionController",
      "readAll",
      Nil,
      "GET",
      """################################################################## ESTACIONES #############################################################
Obtener todas las estaciones del sistema""",
      this.prefix + """estaciones"""
    )
  )

  // @LINE:136
  private[this] lazy val controllers_EstacionController_readVcubsEstacion26_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("estaciones/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_EstacionController_readVcubsEstacion26_invoker = createInvoker(
    EstacionController_8.readVcubsEstacion(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.EstacionController",
      "readVcubsEstacion",
      Seq(classOf[String]),
      "GET",
      """Obtener los datos de una estaci�n""",
      this.prefix + """estaciones/$id<[^/]+>"""
    )
  )

  // @LINE:138
  private[this] lazy val controllers_EstacionController_create27_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("estaciones")))
  )
  private[this] lazy val controllers_EstacionController_create27_invoker = createInvoker(
    EstacionController_8.create(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.EstacionController",
      "create",
      Nil,
      "POST",
      """Registrar una nueva estaci�n""",
      this.prefix + """estaciones"""
    )
  )

  // @LINE:140
  private[this] lazy val controllers_EstacionController_modificarEstacion28_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("estaciones/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_EstacionController_modificarEstacion28_invoker = createInvoker(
    EstacionController_8.modificarEstacion(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.EstacionController",
      "modificarEstacion",
      Seq(classOf[String]),
      "PUT",
      """Modificar datos de una estaci�n""",
      this.prefix + """estaciones/$id<[^/]+>"""
    )
  )

  // @LINE:144
  private[this] lazy val controllers_EstacionController_alquilarBicicleta29_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("estaciones/"), DynamicPart("id", """[^/]+""",true), StaticPart("/bicicletas/"), DynamicPart("id2", """[^/]+""",true)))
  )
  private[this] lazy val controllers_EstacionController_alquilarBicicleta29_invoker = createInvoker(
    EstacionController_8.alquilarBicicleta(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.EstacionController",
      "alquilarBicicleta",
      Seq(classOf[String], classOf[String]),
      "DELETE",
      """Obtener las bicicletas que se encuentran en una estaci�n
GET     /estaciones/:id/bicicletas   controllers.EstacionController.
Prestar una bicicleta en una estaci�n""",
      this.prefix + """estaciones/$id<[^/]+>/bicicletas/$id2<[^/]+>"""
    )
  )

  // @LINE:146
  private[this] lazy val controllers_EstacionController_devolverBicicleta30_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("estaciones/"), DynamicPart("id", """[^/]+""",true), StaticPart("/bicicletas")))
  )
  private[this] lazy val controllers_EstacionController_devolverBicicleta30_invoker = createInvoker(
    EstacionController_8.devolverBicicleta(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.EstacionController",
      "devolverBicicleta",
      Seq(classOf[String], classOf[String]),
      "POST",
      """Entregar una bicicleta en una estaci�n""",
      this.prefix + """estaciones/$id<[^/]+>/bicicletas"""
    )
  )

  // @LINE:151
  private[this] lazy val controllers_VehiculoController_readAll31_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("vehiculos")))
  )
  private[this] lazy val controllers_VehiculoController_readAll31_invoker = createInvoker(
    VehiculoController_0.readAll(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.VehiculoController",
      "readAll",
      Nil,
      "GET",
      """""",
      this.prefix + """vehiculos"""
    )
  )

  // @LINE:153
  private[this] lazy val controllers_VehiculoController_create32_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("vehiculos")))
  )
  private[this] lazy val controllers_VehiculoController_create32_invoker = createInvoker(
    VehiculoController_0.create(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.VehiculoController",
      "create",
      Nil,
      "POST",
      """""",
      this.prefix + """vehiculos"""
    )
  )

  // @LINE:155
  private[this] lazy val controllers_VehiculoController_readVehiculoID33_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("vehiculos/{id}")))
  )
  private[this] lazy val controllers_VehiculoController_readVehiculoID33_invoker = createInvoker(
    VehiculoController_0.readVehiculoID(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.VehiculoController",
      "readVehiculoID",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """vehiculos/{id}"""
    )
  )

  // @LINE:157
  private[this] lazy val controllers_VehiculoController_agregarDatosVehiculo34_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("vehiculos/{id}")))
  )
  private[this] lazy val controllers_VehiculoController_agregarDatosVehiculo34_invoker = createInvoker(
    VehiculoController_0.agregarDatosVehiculo(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.VehiculoController",
      "agregarDatosVehiculo",
      Seq(classOf[String]),
      "PUT",
      """""",
      this.prefix + """vehiculos/{id}"""
    )
  )

  // @LINE:159
  private[this] lazy val controllers_VehiculoController_readDatosVehiculo35_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("vehiculos/{id}/datos")))
  )
  private[this] lazy val controllers_VehiculoController_readDatosVehiculo35_invoker = createInvoker(
    VehiculoController_0.readDatosVehiculo(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.VehiculoController",
      "readDatosVehiculo",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """vehiculos/{id}/datos"""
    )
  )

  // @LINE:169
  private[this] lazy val controllers_Assets_versioned36_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned36_invoker = createInvoker(
    Assets_7.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/$file<.+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_Application_index0_route(params) =>
      call { 
        controllers_Application_index0_invoker.call(Application_9.index())
      }
  
    // @LINE:22
    case controllers_DriverController_read1_route(params) =>
      call { 
        controllers_DriverController_read1_invoker.call(DriverController_6.read())
      }
  
    // @LINE:24
    case controllers_DriverController_create2_route(params) =>
      call { 
        controllers_DriverController_create2_invoker.call(DriverController_6.create())
      }
  
    // @LINE:29
    case controllers_UserController_readAll3_route(params) =>
      call { 
        controllers_UserController_readAll3_invoker.call(UserController_4.readAll())
      }
  
    // @LINE:31
    case controllers_UserController_read4_route(params) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_UserController_read4_invoker.call(UserController_4.read(id))
      }
  
    // @LINE:33
    case controllers_UserController_create5_route(params) =>
      call { 
        controllers_UserController_create5_invoker.call(UserController_4.create())
      }
  
    // @LINE:35
    case controllers_UserController_modify6_route(params) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_UserController_modify6_invoker.call(UserController_4.modify(id))
      }
  
    // @LINE:37
    case controllers_UserController_consultarReservasUsuario7_route(params) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_UserController_consultarReservasUsuario7_invoker.call(UserController_4.consultarReservasUsuario(id))
      }
  
    // @LINE:39
    case controllers_UserController_crearReseva8_route(params) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_UserController_crearReseva8_invoker.call(UserController_4.crearReseva(id))
      }
  
    // @LINE:41
    case controllers_UserController_modificarReservaCliente9_route(params) =>
      call(params.fromPath[String]("id", None), params.fromPath[String]("id2", None)) { (id, id2) =>
        controllers_UserController_modificarReservaCliente9_invoker.call(UserController_4.modificarReservaCliente(id, id2))
      }
  
    // @LINE:43
    case controllers_UserController_eliminarReservaCliente10_route(params) =>
      call(params.fromPath[String]("id", None), params.fromPath[String]("id2", None)) { (id, id2) =>
        controllers_UserController_eliminarReservaCliente10_invoker.call(UserController_4.eliminarReservaCliente(id, id2))
      }
  
    // @LINE:48
    case controllers_MoviBusController_read11_route(params) =>
      call { 
        controllers_MoviBusController_read11_invoker.call(MoviBusController_1.read())
      }
  
    // @LINE:50
    case controllers_MoviBusController_readMovibus12_route(params) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_MoviBusController_readMovibus12_invoker.call(MoviBusController_1.readMovibus(id))
      }
  
    // @LINE:52
    case controllers_MoviBusController_create13_route(params) =>
      call { 
        controllers_MoviBusController_create13_invoker.call(MoviBusController_1.create())
      }
  
    // @LINE:54
    case controllers_MoviBusController_putMovibus14_route(params) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_MoviBusController_putMovibus14_invoker.call(MoviBusController_1.putMovibus(id))
      }
  
    // @LINE:75
    case controllers_TranviaVehController_readAll15_route(params) =>
      call { 
        controllers_TranviaVehController_readAll15_invoker.call(TranviaVehController_3.readAll())
      }
  
    // @LINE:77
    case controllers_TranviaVehController_readTranvia16_route(params) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_TranviaVehController_readTranvia16_invoker.call(TranviaVehController_3.readTranvia(id))
      }
  
    // @LINE:79
    case controllers_TranviaVehController_create17_route(params) =>
      call { 
        controllers_TranviaVehController_create17_invoker.call(TranviaVehController_3.create())
      }
  
    // @LINE:81
    case controllers_TranviaVehController_putTranvia18_route(params) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_TranviaVehController_putTranvia18_invoker.call(TranviaVehController_3.putTranvia(id))
      }
  
    // @LINE:103
    case controllers_VcubController_readAll19_route(params) =>
      call { 
        controllers_VcubController_readAll19_invoker.call(VcubController_5.readAll())
      }
  
    // @LINE:105
    case controllers_VcubController_read20_route(params) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_VcubController_read20_invoker.call(VcubController_5.read(id))
      }
  
    // @LINE:107
    case controllers_VcubController_create21_route(params) =>
      call { 
        controllers_VcubController_create21_invoker.call(VcubController_5.create())
      }
  
    // @LINE:109
    case controllers_VcubController_modify22_route(params) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_VcubController_modify22_invoker.call(VcubController_5.modify(id))
      }
  
    // @LINE:128
    case controllers_TrayectoController_readAll23_route(params) =>
      call { 
        controllers_TrayectoController_readAll23_invoker.call(TrayectoController_2.readAll())
      }
  
    // @LINE:129
    case controllers_TrayectoController_create24_route(params) =>
      call { 
        controllers_TrayectoController_create24_invoker.call(TrayectoController_2.create())
      }
  
    // @LINE:134
    case controllers_EstacionController_readAll25_route(params) =>
      call { 
        controllers_EstacionController_readAll25_invoker.call(EstacionController_8.readAll())
      }
  
    // @LINE:136
    case controllers_EstacionController_readVcubsEstacion26_route(params) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_EstacionController_readVcubsEstacion26_invoker.call(EstacionController_8.readVcubsEstacion(id))
      }
  
    // @LINE:138
    case controllers_EstacionController_create27_route(params) =>
      call { 
        controllers_EstacionController_create27_invoker.call(EstacionController_8.create())
      }
  
    // @LINE:140
    case controllers_EstacionController_modificarEstacion28_route(params) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_EstacionController_modificarEstacion28_invoker.call(EstacionController_8.modificarEstacion(id))
      }
  
    // @LINE:144
    case controllers_EstacionController_alquilarBicicleta29_route(params) =>
      call(params.fromPath[String]("id", None), params.fromPath[String]("id2", None)) { (id, id2) =>
        controllers_EstacionController_alquilarBicicleta29_invoker.call(EstacionController_8.alquilarBicicleta(id, id2))
      }
  
    // @LINE:146
    case controllers_EstacionController_devolverBicicleta30_route(params) =>
      call(params.fromPath[String]("id", None), params.fromQuery[String]("id2", None)) { (id, id2) =>
        controllers_EstacionController_devolverBicicleta30_invoker.call(EstacionController_8.devolverBicicleta(id, id2))
      }
  
    // @LINE:151
    case controllers_VehiculoController_readAll31_route(params) =>
      call { 
        controllers_VehiculoController_readAll31_invoker.call(VehiculoController_0.readAll())
      }
  
    // @LINE:153
    case controllers_VehiculoController_create32_route(params) =>
      call { 
        controllers_VehiculoController_create32_invoker.call(VehiculoController_0.create())
      }
  
    // @LINE:155
    case controllers_VehiculoController_readVehiculoID33_route(params) =>
      call(params.fromQuery[String]("id", None)) { (id) =>
        controllers_VehiculoController_readVehiculoID33_invoker.call(VehiculoController_0.readVehiculoID(id))
      }
  
    // @LINE:157
    case controllers_VehiculoController_agregarDatosVehiculo34_route(params) =>
      call(params.fromQuery[String]("id", None)) { (id) =>
        controllers_VehiculoController_agregarDatosVehiculo34_invoker.call(VehiculoController_0.agregarDatosVehiculo(id))
      }
  
    // @LINE:159
    case controllers_VehiculoController_readDatosVehiculo35_route(params) =>
      call(params.fromQuery[String]("id", None)) { (id) =>
        controllers_VehiculoController_readDatosVehiculo35_invoker.call(VehiculoController_0.readDatosVehiculo(id))
      }
  
    // @LINE:169
    case controllers_Assets_versioned36_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned36_invoker.call(Assets_7.versioned(path, file))
      }
  }
}