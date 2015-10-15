
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Dev/Grupo-09/conf/routes
// @DATE:Wed Oct 14 10:38:15 COT 2015

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
  // @LINE:23
  DriverController_5: controllers.DriverController,
  // @LINE:31
  UserController_3: controllers.UserController,
  // @LINE:52
  MoviBusController_0: controllers.MoviBusController,
  // @LINE:78
  TranviaVehController_2: controllers.TranviaVehController,
  // @LINE:106
  VcubController_4: controllers.VcubController,
  // @LINE:136
  TrayectoController_1: controllers.TrayectoController,
  // @LINE:142
  EstacionController_7: controllers.EstacionController,
  // @LINE:175
  MapController_8: controllers.MapController,
  // @LINE:179
  Assets_6: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    Application_9: controllers.Application,
    // @LINE:23
    DriverController_5: controllers.DriverController,
    // @LINE:31
    UserController_3: controllers.UserController,
    // @LINE:52
    MoviBusController_0: controllers.MoviBusController,
    // @LINE:78
    TranviaVehController_2: controllers.TranviaVehController,
    // @LINE:106
    VcubController_4: controllers.VcubController,
    // @LINE:136
    TrayectoController_1: controllers.TrayectoController,
    // @LINE:142
    EstacionController_7: controllers.EstacionController,
    // @LINE:175
    MapController_8: controllers.MapController,
    // @LINE:179
    Assets_6: controllers.Assets
  ) = this(errorHandler, Application_9, DriverController_5, UserController_3, MoviBusController_0, TranviaVehController_2, VcubController_4, TrayectoController_1, EstacionController_7, MapController_8, Assets_6, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Application_9, DriverController_5, UserController_3, MoviBusController_0, TranviaVehController_2, VcubController_4, TrayectoController_1, EstacionController_7, MapController_8, Assets_6, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.Application.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """conductor""", """controllers.DriverController.read()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addConductores""", """controllers.DriverController.createDriver()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addConductores""", """controllers.DriverController.formDriver()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """usuarios""", """controllers.UserController.readAll()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """usuarios/$id<[^/]+>""", """controllers.UserController.read(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addUsuarios""", """controllers.UserController.createUser()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addUsuarios""", """controllers.UserController.formUser()"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """usuarios/$id<[^/]+>""", """controllers.UserController.modify(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """usuarios/$id<[^/]+>/reservas""", """controllers.UserController.consultarReservasUsuario(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """usuarios/$id<[^/]+>/reservas""", """controllers.UserController.crearReseva(id:Long)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """usuarios/$id<[^/]+>/reservas/$id2<[^/]+>""", """controllers.UserController.modificarReservaCliente(id:Long, id2:Long)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """usuarios/$id<[^/]+>/reservas/$id2<[^/]+>""", """controllers.UserController.eliminarReservaCliente(id:Long, id2:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """mobibuses""", """controllers.MoviBusController.readAll()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """mobibuses/$id<[^/]+>""", """controllers.MoviBusController.readMovibus(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """mobibuses""", """controllers.MoviBusController.create()"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """mobibuses/$id<[^/]+>""", """controllers.MoviBusController.putMovibus(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """mobibuses/$id<[^/]+>/datos""", """controllers.MoviBusController.agregarDatosMovibus(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """mobibuses/$id<[^/]+>/datos""", """controllers.MoviBusController.readDatosMovibus(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """mobibuses/$id<[^/]+>/revisiones""", """controllers.MoviBusController.agregarRevisionMovibus(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """mobibuses/$id<[^/]+>/revisiones""", """controllers.MoviBusController.readRevisionesMovibus(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """mobibuses/$id<[^/]+>/trayectos""", """controllers.MoviBusController.agregarTrayectoMovibus(id:Long)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """mobibuses/$id<[^/]+>/trayectos/$id2<[^/]+>""", """controllers.MoviBusController.finalizarTrayectoMovibus(id:Long, id2:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """mobibuses/$id<[^/]+>/trayectos/""", """controllers.MoviBusController.readTrayectosMovibus(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tranvias""", """controllers.TranviaVehController.readAll()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tranvias/$id<[^/]+>""", """controllers.TranviaVehController.readTranvia(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tranvias""", """controllers.TranviaVehController.create()"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tranvias/$id<[^/]+>""", """controllers.TranviaVehController.putTranvia(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """vcubs""", """controllers.VcubController.readAll()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """vcubs/$id<[^/]+>""", """controllers.VcubController.read(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addVCubs""", """controllers.VcubController.createVcub()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addVCubs""", """controllers.VcubController.formVCub()"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """vcubs/$id<[^/]+>""", """controllers.VcubController.modify(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """trayectos""", """controllers.TrayectoController.readAll()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """trayectos""", """controllers.TrayectoController.create()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """estaciones""", """controllers.EstacionController.readAll()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """estaciones/$id<[^/]+>""", """controllers.EstacionController.readVcubsEstacion(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addEstaciones""", """controllers.EstacionController.createEstacion()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addEstaciones""", """controllers.EstacionController.formEstacion()"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """estaciones/$id<[^/]+>""", """controllers.EstacionController.modificarEstacion(id:Long)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """estaciones/$id<[^/]+>/bicicletas/$id2<[^/]+>""", """controllers.EstacionController.alquilarBicicleta(id:Long, id2:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """estaciones/$id<[^/]+>/bicicletas""", """controllers.EstacionController.devolverBicicleta(id:Long, id2:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """mapa""", """controllers.MapController.createMap()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""", """controllers.Assets.at(path:String = "/public", file:String)"""),
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

  // @LINE:23
  private[this] lazy val controllers_DriverController_read1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("conductor")))
  )
  private[this] lazy val controllers_DriverController_read1_invoker = createInvoker(
    DriverController_5.read(),
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

  // @LINE:25
  private[this] lazy val controllers_DriverController_createDriver2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addConductores")))
  )
  private[this] lazy val controllers_DriverController_createDriver2_invoker = createInvoker(
    DriverController_5.createDriver(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DriverController",
      "createDriver",
      Nil,
      "GET",
      """Crear nuevo conductor""",
      this.prefix + """addConductores"""
    )
  )

  // @LINE:26
  private[this] lazy val controllers_DriverController_formDriver3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addConductores")))
  )
  private[this] lazy val controllers_DriverController_formDriver3_invoker = createInvoker(
    DriverController_5.formDriver(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DriverController",
      "formDriver",
      Nil,
      "POST",
      """""",
      this.prefix + """addConductores"""
    )
  )

  // @LINE:31
  private[this] lazy val controllers_UserController_readAll4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("usuarios")))
  )
  private[this] lazy val controllers_UserController_readAll4_invoker = createInvoker(
    UserController_3.readAll(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "readAll",
      Nil,
      "GET",
      """#########################################  USUARIOS ################
Obtener todos los usuarios""",
      this.prefix + """usuarios"""
    )
  )

  // @LINE:33
  private[this] lazy val controllers_UserController_read5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("usuarios/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_UserController_read5_invoker = createInvoker(
    UserController_3.read(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "read",
      Seq(classOf[Long]),
      "GET",
      """Obtener los datos de un usuario""",
      this.prefix + """usuarios/$id<[^/]+>"""
    )
  )

  // @LINE:35
  private[this] lazy val controllers_UserController_createUser6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addUsuarios")))
  )
  private[this] lazy val controllers_UserController_createUser6_invoker = createInvoker(
    UserController_3.createUser(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "createUser",
      Nil,
      "GET",
      """Registrar un nuevo usuario""",
      this.prefix + """addUsuarios"""
    )
  )

  // @LINE:36
  private[this] lazy val controllers_UserController_formUser7_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addUsuarios")))
  )
  private[this] lazy val controllers_UserController_formUser7_invoker = createInvoker(
    UserController_3.formUser(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "formUser",
      Nil,
      "POST",
      """""",
      this.prefix + """addUsuarios"""
    )
  )

  // @LINE:39
  private[this] lazy val controllers_UserController_modify8_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("usuarios/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_UserController_modify8_invoker = createInvoker(
    UserController_3.modify(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "modify",
      Seq(classOf[Long]),
      "PUT",
      """Modificar datos de un usuario""",
      this.prefix + """usuarios/$id<[^/]+>"""
    )
  )

  // @LINE:41
  private[this] lazy val controllers_UserController_consultarReservasUsuario9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("usuarios/"), DynamicPart("id", """[^/]+""",true), StaticPart("/reservas")))
  )
  private[this] lazy val controllers_UserController_consultarReservasUsuario9_invoker = createInvoker(
    UserController_3.consultarReservasUsuario(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "consultarReservasUsuario",
      Seq(classOf[Long]),
      "GET",
      """Obtener reservas de un usuario""",
      this.prefix + """usuarios/$id<[^/]+>/reservas"""
    )
  )

  // @LINE:43
  private[this] lazy val controllers_UserController_crearReseva10_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("usuarios/"), DynamicPart("id", """[^/]+""",true), StaticPart("/reservas")))
  )
  private[this] lazy val controllers_UserController_crearReseva10_invoker = createInvoker(
    UserController_3.crearReseva(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "crearReseva",
      Seq(classOf[Long]),
      "POST",
      """Crear una reserva""",
      this.prefix + """usuarios/$id<[^/]+>/reservas"""
    )
  )

  // @LINE:45
  private[this] lazy val controllers_UserController_modificarReservaCliente11_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("usuarios/"), DynamicPart("id", """[^/]+""",true), StaticPart("/reservas/"), DynamicPart("id2", """[^/]+""",true)))
  )
  private[this] lazy val controllers_UserController_modificarReservaCliente11_invoker = createInvoker(
    UserController_3.modificarReservaCliente(fakeValue[Long], fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "modificarReservaCliente",
      Seq(classOf[Long], classOf[Long]),
      "PUT",
      """Modificar una reserva""",
      this.prefix + """usuarios/$id<[^/]+>/reservas/$id2<[^/]+>"""
    )
  )

  // @LINE:47
  private[this] lazy val controllers_UserController_eliminarReservaCliente12_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("usuarios/"), DynamicPart("id", """[^/]+""",true), StaticPart("/reservas/"), DynamicPart("id2", """[^/]+""",true)))
  )
  private[this] lazy val controllers_UserController_eliminarReservaCliente12_invoker = createInvoker(
    UserController_3.eliminarReservaCliente(fakeValue[Long], fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "eliminarReservaCliente",
      Seq(classOf[Long], classOf[Long]),
      "DELETE",
      """Eliminar una reserva""",
      this.prefix + """usuarios/$id<[^/]+>/reservas/$id2<[^/]+>"""
    )
  )

  // @LINE:52
  private[this] lazy val controllers_MoviBusController_readAll13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("mobibuses")))
  )
  private[this] lazy val controllers_MoviBusController_readAll13_invoker = createInvoker(
    MoviBusController_0.readAll(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MoviBusController",
      "readAll",
      Nil,
      "GET",
      """#######################################   MOBIBUSES  ############################################
Obtener todos los mobibuses del sistema""",
      this.prefix + """mobibuses"""
    )
  )

  // @LINE:54
  private[this] lazy val controllers_MoviBusController_readMovibus14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("mobibuses/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_MoviBusController_readMovibus14_invoker = createInvoker(
    MoviBusController_0.readMovibus(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MoviBusController",
      "readMovibus",
      Seq(classOf[Long]),
      "GET",
      """Obtener los datos de un mobibus""",
      this.prefix + """mobibuses/$id<[^/]+>"""
    )
  )

  // @LINE:56
  private[this] lazy val controllers_MoviBusController_create15_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("mobibuses")))
  )
  private[this] lazy val controllers_MoviBusController_create15_invoker = createInvoker(
    MoviBusController_0.create(),
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

  // @LINE:58
  private[this] lazy val controllers_MoviBusController_putMovibus16_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("mobibuses/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_MoviBusController_putMovibus16_invoker = createInvoker(
    MoviBusController_0.putMovibus(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MoviBusController",
      "putMovibus",
      Seq(classOf[Long]),
      "PUT",
      """Modificar datos de un mobibus""",
      this.prefix + """mobibuses/$id<[^/]+>"""
    )
  )

  // @LINE:61
  private[this] lazy val controllers_MoviBusController_agregarDatosMovibus17_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("mobibuses/"), DynamicPart("id", """[^/]+""",true), StaticPart("/datos")))
  )
  private[this] lazy val controllers_MoviBusController_agregarDatosMovibus17_invoker = createInvoker(
    MoviBusController_0.agregarDatosMovibus(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MoviBusController",
      "agregarDatosMovibus",
      Seq(classOf[Long]),
      "POST",
      """Enviar los datos del mobibus (GPS, hora�)""",
      this.prefix + """mobibuses/$id<[^/]+>/datos"""
    )
  )

  // @LINE:63
  private[this] lazy val controllers_MoviBusController_readDatosMovibus18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("mobibuses/"), DynamicPart("id", """[^/]+""",true), StaticPart("/datos")))
  )
  private[this] lazy val controllers_MoviBusController_readDatosMovibus18_invoker = createInvoker(
    MoviBusController_0.readDatosMovibus(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MoviBusController",
      "readDatosMovibus",
      Seq(classOf[Long]),
      "GET",
      """Obtener los datos registrados del mobibus (a trav�s del path param se podr�a indicar si traer s�lo el �ltimo dato, los n �ltimos datos, o la hora espec�fica de la que se quieren conocer los datos)  ** pueden ser mas rutas**""",
      this.prefix + """mobibuses/$id<[^/]+>/datos"""
    )
  )

  // @LINE:65
  private[this] lazy val controllers_MoviBusController_agregarRevisionMovibus19_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("mobibuses/"), DynamicPart("id", """[^/]+""",true), StaticPart("/revisiones")))
  )
  private[this] lazy val controllers_MoviBusController_agregarRevisionMovibus19_invoker = createInvoker(
    MoviBusController_0.agregarRevisionMovibus(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MoviBusController",
      "agregarRevisionMovibus",
      Seq(classOf[Long]),
      "POST",
      """Registrar una revisi�n tecnomec�nica""",
      this.prefix + """mobibuses/$id<[^/]+>/revisiones"""
    )
  )

  // @LINE:67
  private[this] lazy val controllers_MoviBusController_readRevisionesMovibus20_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("mobibuses/"), DynamicPart("id", """[^/]+""",true), StaticPart("/revisiones")))
  )
  private[this] lazy val controllers_MoviBusController_readRevisionesMovibus20_invoker = createInvoker(
    MoviBusController_0.readRevisionesMovibus(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MoviBusController",
      "readRevisionesMovibus",
      Seq(classOf[Long]),
      "GET",
      """Obtener las revisiones tecnomec�nicas del veh�culo""",
      this.prefix + """mobibuses/$id<[^/]+>/revisiones"""
    )
  )

  // @LINE:69
  private[this] lazy val controllers_MoviBusController_agregarTrayectoMovibus21_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("mobibuses/"), DynamicPart("id", """[^/]+""",true), StaticPart("/trayectos")))
  )
  private[this] lazy val controllers_MoviBusController_agregarTrayectoMovibus21_invoker = createInvoker(
    MoviBusController_0.agregarTrayectoMovibus(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MoviBusController",
      "agregarTrayectoMovibus",
      Seq(classOf[Long]),
      "POST",
      """Registrar el inicio de un trayecto o ruta (con la hora, informaci�n del conductor y Ruta esperada)""",
      this.prefix + """mobibuses/$id<[^/]+>/trayectos"""
    )
  )

  // @LINE:71
  private[this] lazy val controllers_MoviBusController_finalizarTrayectoMovibus22_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("mobibuses/"), DynamicPart("id", """[^/]+""",true), StaticPart("/trayectos/"), DynamicPart("id2", """[^/]+""",true)))
  )
  private[this] lazy val controllers_MoviBusController_finalizarTrayectoMovibus22_invoker = createInvoker(
    MoviBusController_0.finalizarTrayectoMovibus(fakeValue[Long], fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MoviBusController",
      "finalizarTrayectoMovibus",
      Seq(classOf[Long], classOf[Long]),
      "PUT",
      """Modificar el registro para poner la hora final del trayecto""",
      this.prefix + """mobibuses/$id<[^/]+>/trayectos/$id2<[^/]+>"""
    )
  )

  // @LINE:73
  private[this] lazy val controllers_MoviBusController_readTrayectosMovibus23_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("mobibuses/"), DynamicPart("id", """[^/]+""",true), StaticPart("/trayectos/")))
  )
  private[this] lazy val controllers_MoviBusController_readTrayectosMovibus23_invoker = createInvoker(
    MoviBusController_0.readTrayectosMovibus(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MoviBusController",
      "readTrayectosMovibus",
      Seq(classOf[Long]),
      "GET",
      """Obtener los trayectos de un tranv�a (Para obtener tiempos de conductores y percances""",
      this.prefix + """mobibuses/$id<[^/]+>/trayectos/"""
    )
  )

  // @LINE:78
  private[this] lazy val controllers_TranviaVehController_readAll24_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tranvias")))
  )
  private[this] lazy val controllers_TranviaVehController_readAll24_invoker = createInvoker(
    TranviaVehController_2.readAll(),
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

  // @LINE:80
  private[this] lazy val controllers_TranviaVehController_readTranvia25_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tranvias/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_TranviaVehController_readTranvia25_invoker = createInvoker(
    TranviaVehController_2.readTranvia(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TranviaVehController",
      "readTranvia",
      Seq(classOf[Long]),
      "GET",
      """Obtener los datos de un tranvia""",
      this.prefix + """tranvias/$id<[^/]+>"""
    )
  )

  // @LINE:82
  private[this] lazy val controllers_TranviaVehController_create26_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tranvias")))
  )
  private[this] lazy val controllers_TranviaVehController_create26_invoker = createInvoker(
    TranviaVehController_2.create(),
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

  // @LINE:84
  private[this] lazy val controllers_TranviaVehController_putTranvia27_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tranvias/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_TranviaVehController_putTranvia27_invoker = createInvoker(
    TranviaVehController_2.putTranvia(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TranviaVehController",
      "putTranvia",
      Seq(classOf[Long]),
      "PUT",
      """Modificar datos de un tranvias""",
      this.prefix + """tranvias/$id<[^/]+>"""
    )
  )

  // @LINE:106
  private[this] lazy val controllers_VcubController_readAll28_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("vcubs")))
  )
  private[this] lazy val controllers_VcubController_readAll28_invoker = createInvoker(
    VcubController_4.readAll(),
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

  // @LINE:108
  private[this] lazy val controllers_VcubController_read29_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("vcubs/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_VcubController_read29_invoker = createInvoker(
    VcubController_4.read(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.VcubController",
      "read",
      Seq(classOf[Long]),
      "GET",
      """Obtener los datos de un vcubs""",
      this.prefix + """vcubs/$id<[^/]+>"""
    )
  )

  // @LINE:110
  private[this] lazy val controllers_VcubController_createVcub30_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addVCubs")))
  )
  private[this] lazy val controllers_VcubController_createVcub30_invoker = createInvoker(
    VcubController_4.createVcub(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.VcubController",
      "createVcub",
      Nil,
      "GET",
      """Registrar un nuevo vcubs""",
      this.prefix + """addVCubs"""
    )
  )

  // @LINE:111
  private[this] lazy val controllers_VcubController_formVCub31_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addVCubs")))
  )
  private[this] lazy val controllers_VcubController_formVCub31_invoker = createInvoker(
    VcubController_4.formVCub(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.VcubController",
      "formVCub",
      Nil,
      "POST",
      """""",
      this.prefix + """addVCubs"""
    )
  )

  // @LINE:114
  private[this] lazy val controllers_VcubController_modify32_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("vcubs/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_VcubController_modify32_invoker = createInvoker(
    VcubController_4.modify(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.VcubController",
      "modify",
      Seq(classOf[Long]),
      "PUT",
      """Modificar datos de un vcubs""",
      this.prefix + """vcubs/$id<[^/]+>"""
    )
  )

  // @LINE:136
  private[this] lazy val controllers_TrayectoController_readAll33_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("trayectos")))
  )
  private[this] lazy val controllers_TrayectoController_readAll33_invoker = createInvoker(
    TrayectoController_1.readAll(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TrayectoController",
      "readAll",
      Nil,
      "GET",
      """""",
      this.prefix + """trayectos"""
    )
  )

  // @LINE:137
  private[this] lazy val controllers_TrayectoController_create34_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("trayectos")))
  )
  private[this] lazy val controllers_TrayectoController_create34_invoker = createInvoker(
    TrayectoController_1.create(),
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

  // @LINE:142
  private[this] lazy val controllers_EstacionController_readAll35_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("estaciones")))
  )
  private[this] lazy val controllers_EstacionController_readAll35_invoker = createInvoker(
    EstacionController_7.readAll(),
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

  // @LINE:144
  private[this] lazy val controllers_EstacionController_readVcubsEstacion36_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("estaciones/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_EstacionController_readVcubsEstacion36_invoker = createInvoker(
    EstacionController_7.readVcubsEstacion(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.EstacionController",
      "readVcubsEstacion",
      Seq(classOf[Long]),
      "GET",
      """Obtener los datos de una estaci�n""",
      this.prefix + """estaciones/$id<[^/]+>"""
    )
  )

  // @LINE:146
  private[this] lazy val controllers_EstacionController_createEstacion37_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addEstaciones")))
  )
  private[this] lazy val controllers_EstacionController_createEstacion37_invoker = createInvoker(
    EstacionController_7.createEstacion(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.EstacionController",
      "createEstacion",
      Nil,
      "GET",
      """Registrar una nueva estaci�n""",
      this.prefix + """addEstaciones"""
    )
  )

  // @LINE:147
  private[this] lazy val controllers_EstacionController_formEstacion38_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addEstaciones")))
  )
  private[this] lazy val controllers_EstacionController_formEstacion38_invoker = createInvoker(
    EstacionController_7.formEstacion(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.EstacionController",
      "formEstacion",
      Nil,
      "POST",
      """""",
      this.prefix + """addEstaciones"""
    )
  )

  // @LINE:150
  private[this] lazy val controllers_EstacionController_modificarEstacion39_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("estaciones/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_EstacionController_modificarEstacion39_invoker = createInvoker(
    EstacionController_7.modificarEstacion(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.EstacionController",
      "modificarEstacion",
      Seq(classOf[Long]),
      "PUT",
      """Modificar datos de una estaci�n""",
      this.prefix + """estaciones/$id<[^/]+>"""
    )
  )

  // @LINE:154
  private[this] lazy val controllers_EstacionController_alquilarBicicleta40_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("estaciones/"), DynamicPart("id", """[^/]+""",true), StaticPart("/bicicletas/"), DynamicPart("id2", """[^/]+""",true)))
  )
  private[this] lazy val controllers_EstacionController_alquilarBicicleta40_invoker = createInvoker(
    EstacionController_7.alquilarBicicleta(fakeValue[Long], fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.EstacionController",
      "alquilarBicicleta",
      Seq(classOf[Long], classOf[Long]),
      "DELETE",
      """Obtener las bicicletas que se encuentran en una estaci�n
GET     /estaciones/:id/bicicletas   controllers.EstacionController.
Prestar una bicicleta en una estaci�n""",
      this.prefix + """estaciones/$id<[^/]+>/bicicletas/$id2<[^/]+>"""
    )
  )

  // @LINE:156
  private[this] lazy val controllers_EstacionController_devolverBicicleta41_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("estaciones/"), DynamicPart("id", """[^/]+""",true), StaticPart("/bicicletas")))
  )
  private[this] lazy val controllers_EstacionController_devolverBicicleta41_invoker = createInvoker(
    EstacionController_7.devolverBicicleta(fakeValue[Long], fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.EstacionController",
      "devolverBicicleta",
      Seq(classOf[Long], classOf[Long]),
      "POST",
      """Entregar una bicicleta en una estaci�n""",
      this.prefix + """estaciones/$id<[^/]+>/bicicletas"""
    )
  )

  // @LINE:175
  private[this] lazy val controllers_MapController_createMap42_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("mapa")))
  )
  private[this] lazy val controllers_MapController_createMap42_invoker = createInvoker(
    MapController_8.createMap(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MapController",
      "createMap",
      Nil,
      "GET",
      """=========================================================================================================
Mapa
=========================================================================================================
Dibuja el mapa con los mobibuses actuales""",
      this.prefix + """mapa"""
    )
  )

  // @LINE:179
  private[this] lazy val controllers_Assets_at43_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_at43_invoker = createInvoker(
    Assets_6.at(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      """POST /vehiculos/{id}/trayectos agregarTrayecto
 Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/$file<.+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_Application_index0_route(params) =>
      call { 
        controllers_Application_index0_invoker.call(Application_9.index())
      }
  
    // @LINE:23
    case controllers_DriverController_read1_route(params) =>
      call { 
        controllers_DriverController_read1_invoker.call(DriverController_5.read())
      }
  
    // @LINE:25
    case controllers_DriverController_createDriver2_route(params) =>
      call { 
        controllers_DriverController_createDriver2_invoker.call(DriverController_5.createDriver())
      }
  
    // @LINE:26
    case controllers_DriverController_formDriver3_route(params) =>
      call { 
        controllers_DriverController_formDriver3_invoker.call(DriverController_5.formDriver())
      }
  
    // @LINE:31
    case controllers_UserController_readAll4_route(params) =>
      call { 
        controllers_UserController_readAll4_invoker.call(UserController_3.readAll())
      }
  
    // @LINE:33
    case controllers_UserController_read5_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_UserController_read5_invoker.call(UserController_3.read(id))
      }
  
    // @LINE:35
    case controllers_UserController_createUser6_route(params) =>
      call { 
        controllers_UserController_createUser6_invoker.call(UserController_3.createUser())
      }
  
    // @LINE:36
    case controllers_UserController_formUser7_route(params) =>
      call { 
        controllers_UserController_formUser7_invoker.call(UserController_3.formUser())
      }
  
    // @LINE:39
    case controllers_UserController_modify8_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_UserController_modify8_invoker.call(UserController_3.modify(id))
      }
  
    // @LINE:41
    case controllers_UserController_consultarReservasUsuario9_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_UserController_consultarReservasUsuario9_invoker.call(UserController_3.consultarReservasUsuario(id))
      }
  
    // @LINE:43
    case controllers_UserController_crearReseva10_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_UserController_crearReseva10_invoker.call(UserController_3.crearReseva(id))
      }
  
    // @LINE:45
    case controllers_UserController_modificarReservaCliente11_route(params) =>
      call(params.fromPath[Long]("id", None), params.fromPath[Long]("id2", None)) { (id, id2) =>
        controllers_UserController_modificarReservaCliente11_invoker.call(UserController_3.modificarReservaCliente(id, id2))
      }
  
    // @LINE:47
    case controllers_UserController_eliminarReservaCliente12_route(params) =>
      call(params.fromPath[Long]("id", None), params.fromPath[Long]("id2", None)) { (id, id2) =>
        controllers_UserController_eliminarReservaCliente12_invoker.call(UserController_3.eliminarReservaCliente(id, id2))
      }
  
    // @LINE:52
    case controllers_MoviBusController_readAll13_route(params) =>
      call { 
        controllers_MoviBusController_readAll13_invoker.call(MoviBusController_0.readAll())
      }
  
    // @LINE:54
    case controllers_MoviBusController_readMovibus14_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_MoviBusController_readMovibus14_invoker.call(MoviBusController_0.readMovibus(id))
      }
  
    // @LINE:56
    case controllers_MoviBusController_create15_route(params) =>
      call { 
        controllers_MoviBusController_create15_invoker.call(MoviBusController_0.create())
      }
  
    // @LINE:58
    case controllers_MoviBusController_putMovibus16_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_MoviBusController_putMovibus16_invoker.call(MoviBusController_0.putMovibus(id))
      }
  
    // @LINE:61
    case controllers_MoviBusController_agregarDatosMovibus17_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_MoviBusController_agregarDatosMovibus17_invoker.call(MoviBusController_0.agregarDatosMovibus(id))
      }
  
    // @LINE:63
    case controllers_MoviBusController_readDatosMovibus18_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_MoviBusController_readDatosMovibus18_invoker.call(MoviBusController_0.readDatosMovibus(id))
      }
  
    // @LINE:65
    case controllers_MoviBusController_agregarRevisionMovibus19_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_MoviBusController_agregarRevisionMovibus19_invoker.call(MoviBusController_0.agregarRevisionMovibus(id))
      }
  
    // @LINE:67
    case controllers_MoviBusController_readRevisionesMovibus20_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_MoviBusController_readRevisionesMovibus20_invoker.call(MoviBusController_0.readRevisionesMovibus(id))
      }
  
    // @LINE:69
    case controllers_MoviBusController_agregarTrayectoMovibus21_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_MoviBusController_agregarTrayectoMovibus21_invoker.call(MoviBusController_0.agregarTrayectoMovibus(id))
      }
  
    // @LINE:71
    case controllers_MoviBusController_finalizarTrayectoMovibus22_route(params) =>
      call(params.fromPath[Long]("id", None), params.fromPath[Long]("id2", None)) { (id, id2) =>
        controllers_MoviBusController_finalizarTrayectoMovibus22_invoker.call(MoviBusController_0.finalizarTrayectoMovibus(id, id2))
      }
  
    // @LINE:73
    case controllers_MoviBusController_readTrayectosMovibus23_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_MoviBusController_readTrayectosMovibus23_invoker.call(MoviBusController_0.readTrayectosMovibus(id))
      }
  
    // @LINE:78
    case controllers_TranviaVehController_readAll24_route(params) =>
      call { 
        controllers_TranviaVehController_readAll24_invoker.call(TranviaVehController_2.readAll())
      }
  
    // @LINE:80
    case controllers_TranviaVehController_readTranvia25_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_TranviaVehController_readTranvia25_invoker.call(TranviaVehController_2.readTranvia(id))
      }
  
    // @LINE:82
    case controllers_TranviaVehController_create26_route(params) =>
      call { 
        controllers_TranviaVehController_create26_invoker.call(TranviaVehController_2.create())
      }
  
    // @LINE:84
    case controllers_TranviaVehController_putTranvia27_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_TranviaVehController_putTranvia27_invoker.call(TranviaVehController_2.putTranvia(id))
      }
  
    // @LINE:106
    case controllers_VcubController_readAll28_route(params) =>
      call { 
        controllers_VcubController_readAll28_invoker.call(VcubController_4.readAll())
      }
  
    // @LINE:108
    case controllers_VcubController_read29_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_VcubController_read29_invoker.call(VcubController_4.read(id))
      }
  
    // @LINE:110
    case controllers_VcubController_createVcub30_route(params) =>
      call { 
        controllers_VcubController_createVcub30_invoker.call(VcubController_4.createVcub())
      }
  
    // @LINE:111
    case controllers_VcubController_formVCub31_route(params) =>
      call { 
        controllers_VcubController_formVCub31_invoker.call(VcubController_4.formVCub())
      }
  
    // @LINE:114
    case controllers_VcubController_modify32_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_VcubController_modify32_invoker.call(VcubController_4.modify(id))
      }
  
    // @LINE:136
    case controllers_TrayectoController_readAll33_route(params) =>
      call { 
        controllers_TrayectoController_readAll33_invoker.call(TrayectoController_1.readAll())
      }
  
    // @LINE:137
    case controllers_TrayectoController_create34_route(params) =>
      call { 
        controllers_TrayectoController_create34_invoker.call(TrayectoController_1.create())
      }
  
    // @LINE:142
    case controllers_EstacionController_readAll35_route(params) =>
      call { 
        controllers_EstacionController_readAll35_invoker.call(EstacionController_7.readAll())
      }
  
    // @LINE:144
    case controllers_EstacionController_readVcubsEstacion36_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_EstacionController_readVcubsEstacion36_invoker.call(EstacionController_7.readVcubsEstacion(id))
      }
  
    // @LINE:146
    case controllers_EstacionController_createEstacion37_route(params) =>
      call { 
        controllers_EstacionController_createEstacion37_invoker.call(EstacionController_7.createEstacion())
      }
  
    // @LINE:147
    case controllers_EstacionController_formEstacion38_route(params) =>
      call { 
        controllers_EstacionController_formEstacion38_invoker.call(EstacionController_7.formEstacion())
      }
  
    // @LINE:150
    case controllers_EstacionController_modificarEstacion39_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_EstacionController_modificarEstacion39_invoker.call(EstacionController_7.modificarEstacion(id))
      }
  
    // @LINE:154
    case controllers_EstacionController_alquilarBicicleta40_route(params) =>
      call(params.fromPath[Long]("id", None), params.fromPath[Long]("id2", None)) { (id, id2) =>
        controllers_EstacionController_alquilarBicicleta40_invoker.call(EstacionController_7.alquilarBicicleta(id, id2))
      }
  
    // @LINE:156
    case controllers_EstacionController_devolverBicicleta41_route(params) =>
      call(params.fromPath[Long]("id", None), params.fromQuery[Long]("id2", None)) { (id, id2) =>
        controllers_EstacionController_devolverBicicleta41_invoker.call(EstacionController_7.devolverBicicleta(id, id2))
      }
  
    // @LINE:175
    case controllers_MapController_createMap42_route(params) =>
      call { 
        controllers_MapController_createMap42_invoker.call(MapController_8.createMap())
      }
  
    // @LINE:179
    case controllers_Assets_at43_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at43_invoker.call(Assets_6.at(path, file))
      }
  }
}