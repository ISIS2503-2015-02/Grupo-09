
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Dev/Grupo-09/conf/routes
// @DATE:Tue Nov 24 01:11:26 COT 2015

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
  // @LINE:80
  TranviaVehController_2: controllers.TranviaVehController,
  // @LINE:109
  VcubController_4: controllers.VcubController,
  // @LINE:139
  TrayectoController_1: controllers.TrayectoController,
  // @LINE:145
  EstacionController_7: controllers.EstacionController,
  // @LINE:178
  MapController_8: controllers.MapController,
  // @LINE:182
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
    // @LINE:80
    TranviaVehController_2: controllers.TranviaVehController,
    // @LINE:109
    VcubController_4: controllers.VcubController,
    // @LINE:139
    TrayectoController_1: controllers.TrayectoController,
    // @LINE:145
    EstacionController_7: controllers.EstacionController,
    // @LINE:178
    MapController_8: controllers.MapController,
    // @LINE:182
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
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addMobibuses""", """controllers.MoviBusController.createMobiBus()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addMobibuses""", """controllers.MoviBusController.formMobibus()"""),
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
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addTranvias""", """controllers.TranviaVehController.createTranvia()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addTranvias""", """controllers.TranviaVehController.formTranvia()"""),
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
  private[this] lazy val controllers_MoviBusController_createMobiBus15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addMobibuses")))
  )
  private[this] lazy val controllers_MoviBusController_createMobiBus15_invoker = createInvoker(
    MoviBusController_0.createMobiBus(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MoviBusController",
      "createMobiBus",
      Nil,
      "GET",
      """Registrar un nuevo mobibus""",
      this.prefix + """addMobibuses"""
    )
  )

  // @LINE:57
  private[this] lazy val controllers_MoviBusController_formMobibus16_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addMobibuses")))
  )
  private[this] lazy val controllers_MoviBusController_formMobibus16_invoker = createInvoker(
    MoviBusController_0.formMobibus(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MoviBusController",
      "formMobibus",
      Nil,
      "POST",
      """""",
      this.prefix + """addMobibuses"""
    )
  )

  // @LINE:60
  private[this] lazy val controllers_MoviBusController_putMovibus17_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("mobibuses/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_MoviBusController_putMovibus17_invoker = createInvoker(
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

  // @LINE:63
  private[this] lazy val controllers_MoviBusController_agregarDatosMovibus18_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("mobibuses/"), DynamicPart("id", """[^/]+""",true), StaticPart("/datos")))
  )
  private[this] lazy val controllers_MoviBusController_agregarDatosMovibus18_invoker = createInvoker(
    MoviBusController_0.agregarDatosMovibus(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MoviBusController",
      "agregarDatosMovibus",
      Seq(classOf[Long]),
      "POST",
      """Enviar los datos del mobibus (GPS, hora)""",
      this.prefix + """mobibuses/$id<[^/]+>/datos"""
    )
  )

  // @LINE:65
  private[this] lazy val controllers_MoviBusController_readDatosMovibus19_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("mobibuses/"), DynamicPart("id", """[^/]+""",true), StaticPart("/datos")))
  )
  private[this] lazy val controllers_MoviBusController_readDatosMovibus19_invoker = createInvoker(
    MoviBusController_0.readDatosMovibus(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MoviBusController",
      "readDatosMovibus",
      Seq(classOf[Long]),
      "GET",
      """Obtener los datos registrados del mobibus (a través del path param se podría indicar si traer sólo el último dato, los n últimos datos, o la hora específica de la que se quieren conocer los datos)  ** pueden ser mas rutas**""",
      this.prefix + """mobibuses/$id<[^/]+>/datos"""
    )
  )

  // @LINE:67
  private[this] lazy val controllers_MoviBusController_agregarRevisionMovibus20_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("mobibuses/"), DynamicPart("id", """[^/]+""",true), StaticPart("/revisiones")))
  )
  private[this] lazy val controllers_MoviBusController_agregarRevisionMovibus20_invoker = createInvoker(
    MoviBusController_0.agregarRevisionMovibus(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MoviBusController",
      "agregarRevisionMovibus",
      Seq(classOf[Long]),
      "POST",
      """Registrar una revisión tecnomecánica""",
      this.prefix + """mobibuses/$id<[^/]+>/revisiones"""
    )
  )

  // @LINE:69
  private[this] lazy val controllers_MoviBusController_readRevisionesMovibus21_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("mobibuses/"), DynamicPart("id", """[^/]+""",true), StaticPart("/revisiones")))
  )
  private[this] lazy val controllers_MoviBusController_readRevisionesMovibus21_invoker = createInvoker(
    MoviBusController_0.readRevisionesMovibus(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MoviBusController",
      "readRevisionesMovibus",
      Seq(classOf[Long]),
      "GET",
      """Obtener las revisiones tecnomecánicas del vehículo""",
      this.prefix + """mobibuses/$id<[^/]+>/revisiones"""
    )
  )

  // @LINE:71
  private[this] lazy val controllers_MoviBusController_agregarTrayectoMovibus22_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("mobibuses/"), DynamicPart("id", """[^/]+""",true), StaticPart("/trayectos")))
  )
  private[this] lazy val controllers_MoviBusController_agregarTrayectoMovibus22_invoker = createInvoker(
    MoviBusController_0.agregarTrayectoMovibus(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MoviBusController",
      "agregarTrayectoMovibus",
      Seq(classOf[Long]),
      "POST",
      """Registrar el inicio de un trayecto o ruta (con la hora, información del conductor y Ruta esperada)""",
      this.prefix + """mobibuses/$id<[^/]+>/trayectos"""
    )
  )

  // @LINE:73
  private[this] lazy val controllers_MoviBusController_finalizarTrayectoMovibus23_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("mobibuses/"), DynamicPart("id", """[^/]+""",true), StaticPart("/trayectos/"), DynamicPart("id2", """[^/]+""",true)))
  )
  private[this] lazy val controllers_MoviBusController_finalizarTrayectoMovibus23_invoker = createInvoker(
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

  // @LINE:75
  private[this] lazy val controllers_MoviBusController_readTrayectosMovibus24_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("mobibuses/"), DynamicPart("id", """[^/]+""",true), StaticPart("/trayectos/")))
  )
  private[this] lazy val controllers_MoviBusController_readTrayectosMovibus24_invoker = createInvoker(
    MoviBusController_0.readTrayectosMovibus(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MoviBusController",
      "readTrayectosMovibus",
      Seq(classOf[Long]),
      "GET",
      """Obtener los trayectos de un tranvía (Para obtener tiempos de conductores y percances""",
      this.prefix + """mobibuses/$id<[^/]+>/trayectos/"""
    )
  )

  // @LINE:80
  private[this] lazy val controllers_TranviaVehController_readAll25_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tranvias")))
  )
  private[this] lazy val controllers_TranviaVehController_readAll25_invoker = createInvoker(
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

  // @LINE:82
  private[this] lazy val controllers_TranviaVehController_readTranvia26_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tranvias/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_TranviaVehController_readTranvia26_invoker = createInvoker(
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

  // @LINE:84
  private[this] lazy val controllers_TranviaVehController_createTranvia27_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addTranvias")))
  )
  private[this] lazy val controllers_TranviaVehController_createTranvia27_invoker = createInvoker(
    TranviaVehController_2.createTranvia(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TranviaVehController",
      "createTranvia",
      Nil,
      "GET",
      """Registrar un nuevo tranvias""",
      this.prefix + """addTranvias"""
    )
  )

  // @LINE:85
  private[this] lazy val controllers_TranviaVehController_formTranvia28_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addTranvias")))
  )
  private[this] lazy val controllers_TranviaVehController_formTranvia28_invoker = createInvoker(
    TranviaVehController_2.formTranvia(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TranviaVehController",
      "formTranvia",
      Nil,
      "POST",
      """""",
      this.prefix + """addTranvias"""
    )
  )

  // @LINE:87
  private[this] lazy val controllers_TranviaVehController_putTranvia29_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tranvias/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_TranviaVehController_putTranvia29_invoker = createInvoker(
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

  // @LINE:109
  private[this] lazy val controllers_VcubController_readAll30_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("vcubs")))
  )
  private[this] lazy val controllers_VcubController_readAll30_invoker = createInvoker(
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

  // @LINE:111
  private[this] lazy val controllers_VcubController_read31_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("vcubs/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_VcubController_read31_invoker = createInvoker(
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

  // @LINE:113
  private[this] lazy val controllers_VcubController_createVcub32_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addVCubs")))
  )
  private[this] lazy val controllers_VcubController_createVcub32_invoker = createInvoker(
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

  // @LINE:114
  private[this] lazy val controllers_VcubController_formVCub33_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addVCubs")))
  )
  private[this] lazy val controllers_VcubController_formVCub33_invoker = createInvoker(
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

  // @LINE:117
  private[this] lazy val controllers_VcubController_modify34_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("vcubs/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_VcubController_modify34_invoker = createInvoker(
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

  // @LINE:139
  private[this] lazy val controllers_TrayectoController_readAll35_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("trayectos")))
  )
  private[this] lazy val controllers_TrayectoController_readAll35_invoker = createInvoker(
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

  // @LINE:140
  private[this] lazy val controllers_TrayectoController_create36_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("trayectos")))
  )
  private[this] lazy val controllers_TrayectoController_create36_invoker = createInvoker(
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

  // @LINE:145
  private[this] lazy val controllers_EstacionController_readAll37_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("estaciones")))
  )
  private[this] lazy val controllers_EstacionController_readAll37_invoker = createInvoker(
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

  // @LINE:147
  private[this] lazy val controllers_EstacionController_readVcubsEstacion38_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("estaciones/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_EstacionController_readVcubsEstacion38_invoker = createInvoker(
    EstacionController_7.readVcubsEstacion(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.EstacionController",
      "readVcubsEstacion",
      Seq(classOf[Long]),
      "GET",
      """Obtener los datos de una estación""",
      this.prefix + """estaciones/$id<[^/]+>"""
    )
  )

  // @LINE:149
  private[this] lazy val controllers_EstacionController_createEstacion39_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addEstaciones")))
  )
  private[this] lazy val controllers_EstacionController_createEstacion39_invoker = createInvoker(
    EstacionController_7.createEstacion(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.EstacionController",
      "createEstacion",
      Nil,
      "GET",
      """Registrar una nueva estación""",
      this.prefix + """addEstaciones"""
    )
  )

  // @LINE:150
  private[this] lazy val controllers_EstacionController_formEstacion40_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addEstaciones")))
  )
  private[this] lazy val controllers_EstacionController_formEstacion40_invoker = createInvoker(
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

  // @LINE:153
  private[this] lazy val controllers_EstacionController_modificarEstacion41_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("estaciones/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_EstacionController_modificarEstacion41_invoker = createInvoker(
    EstacionController_7.modificarEstacion(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.EstacionController",
      "modificarEstacion",
      Seq(classOf[Long]),
      "PUT",
      """Modificar datos de una estación""",
      this.prefix + """estaciones/$id<[^/]+>"""
    )
  )

  // @LINE:157
  private[this] lazy val controllers_EstacionController_alquilarBicicleta42_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("estaciones/"), DynamicPart("id", """[^/]+""",true), StaticPart("/bicicletas/"), DynamicPart("id2", """[^/]+""",true)))
  )
  private[this] lazy val controllers_EstacionController_alquilarBicicleta42_invoker = createInvoker(
    EstacionController_7.alquilarBicicleta(fakeValue[Long], fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.EstacionController",
      "alquilarBicicleta",
      Seq(classOf[Long], classOf[Long]),
      "DELETE",
      """Obtener las bicicletas que se encuentran en una estación
GET     /estaciones/:id/bicicletas   controllers.EstacionController.
Prestar una bicicleta en una estación""",
      this.prefix + """estaciones/$id<[^/]+>/bicicletas/$id2<[^/]+>"""
    )
  )

  // @LINE:159
  private[this] lazy val controllers_EstacionController_devolverBicicleta43_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("estaciones/"), DynamicPart("id", """[^/]+""",true), StaticPart("/bicicletas")))
  )
  private[this] lazy val controllers_EstacionController_devolverBicicleta43_invoker = createInvoker(
    EstacionController_7.devolverBicicleta(fakeValue[Long], fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.EstacionController",
      "devolverBicicleta",
      Seq(classOf[Long], classOf[Long]),
      "POST",
      """Entregar una bicicleta en una estación""",
      this.prefix + """estaciones/$id<[^/]+>/bicicletas"""
    )
  )

  // @LINE:178
  private[this] lazy val controllers_MapController_createMap44_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("mapa")))
  )
  private[this] lazy val controllers_MapController_createMap44_invoker = createInvoker(
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

  // @LINE:182
  private[this] lazy val controllers_Assets_at45_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_at45_invoker = createInvoker(
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
    case controllers_MoviBusController_createMobiBus15_route(params) =>
      call { 
        controllers_MoviBusController_createMobiBus15_invoker.call(MoviBusController_0.createMobiBus())
      }
  
    // @LINE:57
    case controllers_MoviBusController_formMobibus16_route(params) =>
      call { 
        controllers_MoviBusController_formMobibus16_invoker.call(MoviBusController_0.formMobibus())
      }
  
    // @LINE:60
    case controllers_MoviBusController_putMovibus17_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_MoviBusController_putMovibus17_invoker.call(MoviBusController_0.putMovibus(id))
      }
  
    // @LINE:63
    case controllers_MoviBusController_agregarDatosMovibus18_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_MoviBusController_agregarDatosMovibus18_invoker.call(MoviBusController_0.agregarDatosMovibus(id))
      }
  
    // @LINE:65
    case controllers_MoviBusController_readDatosMovibus19_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_MoviBusController_readDatosMovibus19_invoker.call(MoviBusController_0.readDatosMovibus(id))
      }
  
    // @LINE:67
    case controllers_MoviBusController_agregarRevisionMovibus20_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_MoviBusController_agregarRevisionMovibus20_invoker.call(MoviBusController_0.agregarRevisionMovibus(id))
      }
  
    // @LINE:69
    case controllers_MoviBusController_readRevisionesMovibus21_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_MoviBusController_readRevisionesMovibus21_invoker.call(MoviBusController_0.readRevisionesMovibus(id))
      }
  
    // @LINE:71
    case controllers_MoviBusController_agregarTrayectoMovibus22_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_MoviBusController_agregarTrayectoMovibus22_invoker.call(MoviBusController_0.agregarTrayectoMovibus(id))
      }
  
    // @LINE:73
    case controllers_MoviBusController_finalizarTrayectoMovibus23_route(params) =>
      call(params.fromPath[Long]("id", None), params.fromPath[Long]("id2", None)) { (id, id2) =>
        controllers_MoviBusController_finalizarTrayectoMovibus23_invoker.call(MoviBusController_0.finalizarTrayectoMovibus(id, id2))
      }
  
    // @LINE:75
    case controllers_MoviBusController_readTrayectosMovibus24_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_MoviBusController_readTrayectosMovibus24_invoker.call(MoviBusController_0.readTrayectosMovibus(id))
      }
  
    // @LINE:80
    case controllers_TranviaVehController_readAll25_route(params) =>
      call { 
        controllers_TranviaVehController_readAll25_invoker.call(TranviaVehController_2.readAll())
      }
  
    // @LINE:82
    case controllers_TranviaVehController_readTranvia26_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_TranviaVehController_readTranvia26_invoker.call(TranviaVehController_2.readTranvia(id))
      }
  
    // @LINE:84
    case controllers_TranviaVehController_createTranvia27_route(params) =>
      call { 
        controllers_TranviaVehController_createTranvia27_invoker.call(TranviaVehController_2.createTranvia())
      }
  
    // @LINE:85
    case controllers_TranviaVehController_formTranvia28_route(params) =>
      call { 
        controllers_TranviaVehController_formTranvia28_invoker.call(TranviaVehController_2.formTranvia())
      }
  
    // @LINE:87
    case controllers_TranviaVehController_putTranvia29_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_TranviaVehController_putTranvia29_invoker.call(TranviaVehController_2.putTranvia(id))
      }
  
    // @LINE:109
    case controllers_VcubController_readAll30_route(params) =>
      call { 
        controllers_VcubController_readAll30_invoker.call(VcubController_4.readAll())
      }
  
    // @LINE:111
    case controllers_VcubController_read31_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_VcubController_read31_invoker.call(VcubController_4.read(id))
      }
  
    // @LINE:113
    case controllers_VcubController_createVcub32_route(params) =>
      call { 
        controllers_VcubController_createVcub32_invoker.call(VcubController_4.createVcub())
      }
  
    // @LINE:114
    case controllers_VcubController_formVCub33_route(params) =>
      call { 
        controllers_VcubController_formVCub33_invoker.call(VcubController_4.formVCub())
      }
  
    // @LINE:117
    case controllers_VcubController_modify34_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_VcubController_modify34_invoker.call(VcubController_4.modify(id))
      }
  
    // @LINE:139
    case controllers_TrayectoController_readAll35_route(params) =>
      call { 
        controllers_TrayectoController_readAll35_invoker.call(TrayectoController_1.readAll())
      }
  
    // @LINE:140
    case controllers_TrayectoController_create36_route(params) =>
      call { 
        controllers_TrayectoController_create36_invoker.call(TrayectoController_1.create())
      }
  
    // @LINE:145
    case controllers_EstacionController_readAll37_route(params) =>
      call { 
        controllers_EstacionController_readAll37_invoker.call(EstacionController_7.readAll())
      }
  
    // @LINE:147
    case controllers_EstacionController_readVcubsEstacion38_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_EstacionController_readVcubsEstacion38_invoker.call(EstacionController_7.readVcubsEstacion(id))
      }
  
    // @LINE:149
    case controllers_EstacionController_createEstacion39_route(params) =>
      call { 
        controllers_EstacionController_createEstacion39_invoker.call(EstacionController_7.createEstacion())
      }
  
    // @LINE:150
    case controllers_EstacionController_formEstacion40_route(params) =>
      call { 
        controllers_EstacionController_formEstacion40_invoker.call(EstacionController_7.formEstacion())
      }
  
    // @LINE:153
    case controllers_EstacionController_modificarEstacion41_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_EstacionController_modificarEstacion41_invoker.call(EstacionController_7.modificarEstacion(id))
      }
  
    // @LINE:157
    case controllers_EstacionController_alquilarBicicleta42_route(params) =>
      call(params.fromPath[Long]("id", None), params.fromPath[Long]("id2", None)) { (id, id2) =>
        controllers_EstacionController_alquilarBicicleta42_invoker.call(EstacionController_7.alquilarBicicleta(id, id2))
      }
  
    // @LINE:159
    case controllers_EstacionController_devolverBicicleta43_route(params) =>
      call(params.fromPath[Long]("id", None), params.fromQuery[Long]("id2", None)) { (id, id2) =>
        controllers_EstacionController_devolverBicicleta43_invoker.call(EstacionController_7.devolverBicicleta(id, id2))
      }
  
    // @LINE:178
    case controllers_MapController_createMap44_route(params) =>
      call { 
        controllers_MapController_createMap44_invoker.call(MapController_8.createMap())
      }
  
    // @LINE:182
    case controllers_Assets_at45_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at45_invoker.call(Assets_6.at(path, file))
      }
  }
}