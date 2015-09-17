
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Dev/Grupo-09/conf/routes
// @DATE:Wed Sep 16 21:15:05 COT 2015

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
  Application_8: controllers.Application,
  // @LINE:23
  DriverController_5: controllers.DriverController,
  // @LINE:30
  UserController_3: controllers.UserController,
  // @LINE:49
  MoviBusController_0: controllers.MoviBusController,
  // @LINE:75
  TranviaVehController_2: controllers.TranviaVehController,
  // @LINE:103
  VcubController_4: controllers.VcubController,
  // @LINE:128
  TrayectoController_1: controllers.TrayectoController,
  // @LINE:134
  EstacionController_7: controllers.EstacionController,
  // @LINE:163
  Assets_6: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    Application_8: controllers.Application,
    // @LINE:23
    DriverController_5: controllers.DriverController,
    // @LINE:30
    UserController_3: controllers.UserController,
    // @LINE:49
    MoviBusController_0: controllers.MoviBusController,
    // @LINE:75
    TranviaVehController_2: controllers.TranviaVehController,
    // @LINE:103
    VcubController_4: controllers.VcubController,
    // @LINE:128
    TrayectoController_1: controllers.TrayectoController,
    // @LINE:134
    EstacionController_7: controllers.EstacionController,
    // @LINE:163
    Assets_6: controllers.Assets
  ) = this(errorHandler, Application_8, DriverController_5, UserController_3, MoviBusController_0, TranviaVehController_2, VcubController_4, TrayectoController_1, EstacionController_7, Assets_6, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Application_8, DriverController_5, UserController_3, MoviBusController_0, TranviaVehController_2, VcubController_4, TrayectoController_1, EstacionController_7, Assets_6, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.Application.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """conductor""", """controllers.DriverController.read()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """conductor""", """controllers.DriverController.create()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """usuarios""", """controllers.UserController.readAll()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """usuarios/$id<[^/]+>""", """controllers.UserController.read(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """usuarios""", """controllers.UserController.create()"""),
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
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """vcubs""", """controllers.VcubController.create()"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """vcubs/$id<[^/]+>""", """controllers.VcubController.modify(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """trayectos""", """controllers.TrayectoController.readAll()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """trayectos""", """controllers.TrayectoController.create()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """estaciones""", """controllers.EstacionController.readAll()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """estaciones/$id<[^/]+>""", """controllers.EstacionController.readVcubsEstacion(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """estaciones""", """controllers.EstacionController.create()"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """estaciones/$id<[^/]+>""", """controllers.EstacionController.modificarEstacion(id:Long)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """estaciones/$id<[^/]+>/bicicletas/$id2<[^/]+>""", """controllers.EstacionController.alquilarBicicleta(id:Long, id2:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """estaciones/$id<[^/]+>/bicicletas""", """controllers.EstacionController.devolverBicicleta(id:Long, id2:Long)"""),
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
    Application_8.index(),
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
  private[this] lazy val controllers_DriverController_create2_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("conductor")))
  )
  private[this] lazy val controllers_DriverController_create2_invoker = createInvoker(
    DriverController_5.create(),
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

  // @LINE:30
  private[this] lazy val controllers_UserController_readAll3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("usuarios")))
  )
  private[this] lazy val controllers_UserController_readAll3_invoker = createInvoker(
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

  // @LINE:32
  private[this] lazy val controllers_UserController_read4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("usuarios/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_UserController_read4_invoker = createInvoker(
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

  // @LINE:34
  private[this] lazy val controllers_UserController_create5_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("usuarios")))
  )
  private[this] lazy val controllers_UserController_create5_invoker = createInvoker(
    UserController_3.create(),
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

  // @LINE:36
  private[this] lazy val controllers_UserController_modify6_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("usuarios/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_UserController_modify6_invoker = createInvoker(
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

  // @LINE:38
  private[this] lazy val controllers_UserController_consultarReservasUsuario7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("usuarios/"), DynamicPart("id", """[^/]+""",true), StaticPart("/reservas")))
  )
  private[this] lazy val controllers_UserController_consultarReservasUsuario7_invoker = createInvoker(
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

  // @LINE:40
  private[this] lazy val controllers_UserController_crearReseva8_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("usuarios/"), DynamicPart("id", """[^/]+""",true), StaticPart("/reservas")))
  )
  private[this] lazy val controllers_UserController_crearReseva8_invoker = createInvoker(
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

  // @LINE:42
  private[this] lazy val controllers_UserController_modificarReservaCliente9_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("usuarios/"), DynamicPart("id", """[^/]+""",true), StaticPart("/reservas/"), DynamicPart("id2", """[^/]+""",true)))
  )
  private[this] lazy val controllers_UserController_modificarReservaCliente9_invoker = createInvoker(
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

  // @LINE:44
  private[this] lazy val controllers_UserController_eliminarReservaCliente10_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("usuarios/"), DynamicPart("id", """[^/]+""",true), StaticPart("/reservas/"), DynamicPart("id2", """[^/]+""",true)))
  )
  private[this] lazy val controllers_UserController_eliminarReservaCliente10_invoker = createInvoker(
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

  // @LINE:49
  private[this] lazy val controllers_MoviBusController_readAll11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("mobibuses")))
  )
  private[this] lazy val controllers_MoviBusController_readAll11_invoker = createInvoker(
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

  // @LINE:51
  private[this] lazy val controllers_MoviBusController_readMovibus12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("mobibuses/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_MoviBusController_readMovibus12_invoker = createInvoker(
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

  // @LINE:53
  private[this] lazy val controllers_MoviBusController_create13_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("mobibuses")))
  )
  private[this] lazy val controllers_MoviBusController_create13_invoker = createInvoker(
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

  // @LINE:55
  private[this] lazy val controllers_MoviBusController_putMovibus14_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("mobibuses/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_MoviBusController_putMovibus14_invoker = createInvoker(
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

  // @LINE:58
  private[this] lazy val controllers_MoviBusController_agregarDatosMovibus15_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("mobibuses/"), DynamicPart("id", """[^/]+""",true), StaticPart("/datos")))
  )
  private[this] lazy val controllers_MoviBusController_agregarDatosMovibus15_invoker = createInvoker(
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

  // @LINE:60
  private[this] lazy val controllers_MoviBusController_readDatosMovibus16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("mobibuses/"), DynamicPart("id", """[^/]+""",true), StaticPart("/datos")))
  )
  private[this] lazy val controllers_MoviBusController_readDatosMovibus16_invoker = createInvoker(
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

  // @LINE:62
  private[this] lazy val controllers_MoviBusController_agregarRevisionMovibus17_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("mobibuses/"), DynamicPart("id", """[^/]+""",true), StaticPart("/revisiones")))
  )
  private[this] lazy val controllers_MoviBusController_agregarRevisionMovibus17_invoker = createInvoker(
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

  // @LINE:64
  private[this] lazy val controllers_MoviBusController_readRevisionesMovibus18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("mobibuses/"), DynamicPart("id", """[^/]+""",true), StaticPart("/revisiones")))
  )
  private[this] lazy val controllers_MoviBusController_readRevisionesMovibus18_invoker = createInvoker(
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

  // @LINE:66
  private[this] lazy val controllers_MoviBusController_agregarTrayectoMovibus19_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("mobibuses/"), DynamicPart("id", """[^/]+""",true), StaticPart("/trayectos")))
  )
  private[this] lazy val controllers_MoviBusController_agregarTrayectoMovibus19_invoker = createInvoker(
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

  // @LINE:68
  private[this] lazy val controllers_MoviBusController_finalizarTrayectoMovibus20_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("mobibuses/"), DynamicPart("id", """[^/]+""",true), StaticPart("/trayectos/"), DynamicPart("id2", """[^/]+""",true)))
  )
  private[this] lazy val controllers_MoviBusController_finalizarTrayectoMovibus20_invoker = createInvoker(
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

  // @LINE:70
  private[this] lazy val controllers_MoviBusController_readTrayectosMovibus21_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("mobibuses/"), DynamicPart("id", """[^/]+""",true), StaticPart("/trayectos/")))
  )
  private[this] lazy val controllers_MoviBusController_readTrayectosMovibus21_invoker = createInvoker(
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

  // @LINE:75
  private[this] lazy val controllers_TranviaVehController_readAll22_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tranvias")))
  )
  private[this] lazy val controllers_TranviaVehController_readAll22_invoker = createInvoker(
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

  // @LINE:77
  private[this] lazy val controllers_TranviaVehController_readTranvia23_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tranvias/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_TranviaVehController_readTranvia23_invoker = createInvoker(
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

  // @LINE:79
  private[this] lazy val controllers_TranviaVehController_create24_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tranvias")))
  )
  private[this] lazy val controllers_TranviaVehController_create24_invoker = createInvoker(
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

  // @LINE:81
  private[this] lazy val controllers_TranviaVehController_putTranvia25_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tranvias/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_TranviaVehController_putTranvia25_invoker = createInvoker(
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

  // @LINE:103
  private[this] lazy val controllers_VcubController_readAll26_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("vcubs")))
  )
  private[this] lazy val controllers_VcubController_readAll26_invoker = createInvoker(
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

  // @LINE:105
  private[this] lazy val controllers_VcubController_read27_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("vcubs/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_VcubController_read27_invoker = createInvoker(
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

  // @LINE:107
  private[this] lazy val controllers_VcubController_create28_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("vcubs")))
  )
  private[this] lazy val controllers_VcubController_create28_invoker = createInvoker(
    VcubController_4.create(),
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
  private[this] lazy val controllers_VcubController_modify29_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("vcubs/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_VcubController_modify29_invoker = createInvoker(
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

  // @LINE:128
  private[this] lazy val controllers_TrayectoController_readAll30_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("trayectos")))
  )
  private[this] lazy val controllers_TrayectoController_readAll30_invoker = createInvoker(
    TrayectoController_1.readAll(),
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
  private[this] lazy val controllers_TrayectoController_create31_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("trayectos")))
  )
  private[this] lazy val controllers_TrayectoController_create31_invoker = createInvoker(
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

  // @LINE:134
  private[this] lazy val controllers_EstacionController_readAll32_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("estaciones")))
  )
  private[this] lazy val controllers_EstacionController_readAll32_invoker = createInvoker(
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

  // @LINE:136
  private[this] lazy val controllers_EstacionController_readVcubsEstacion33_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("estaciones/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_EstacionController_readVcubsEstacion33_invoker = createInvoker(
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

  // @LINE:138
  private[this] lazy val controllers_EstacionController_create34_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("estaciones")))
  )
  private[this] lazy val controllers_EstacionController_create34_invoker = createInvoker(
    EstacionController_7.create(),
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
  private[this] lazy val controllers_EstacionController_modificarEstacion35_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("estaciones/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_EstacionController_modificarEstacion35_invoker = createInvoker(
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

  // @LINE:144
  private[this] lazy val controllers_EstacionController_alquilarBicicleta36_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("estaciones/"), DynamicPart("id", """[^/]+""",true), StaticPart("/bicicletas/"), DynamicPart("id2", """[^/]+""",true)))
  )
  private[this] lazy val controllers_EstacionController_alquilarBicicleta36_invoker = createInvoker(
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

  // @LINE:146
  private[this] lazy val controllers_EstacionController_devolverBicicleta37_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("estaciones/"), DynamicPart("id", """[^/]+""",true), StaticPart("/bicicletas")))
  )
  private[this] lazy val controllers_EstacionController_devolverBicicleta37_invoker = createInvoker(
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

  // @LINE:163
  private[this] lazy val controllers_Assets_at38_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_at38_invoker = createInvoker(
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
        controllers_Application_index0_invoker.call(Application_8.index())
      }
  
    // @LINE:23
    case controllers_DriverController_read1_route(params) =>
      call { 
        controllers_DriverController_read1_invoker.call(DriverController_5.read())
      }
  
    // @LINE:25
    case controllers_DriverController_create2_route(params) =>
      call { 
        controllers_DriverController_create2_invoker.call(DriverController_5.create())
      }
  
    // @LINE:30
    case controllers_UserController_readAll3_route(params) =>
      call { 
        controllers_UserController_readAll3_invoker.call(UserController_3.readAll())
      }
  
    // @LINE:32
    case controllers_UserController_read4_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_UserController_read4_invoker.call(UserController_3.read(id))
      }
  
    // @LINE:34
    case controllers_UserController_create5_route(params) =>
      call { 
        controllers_UserController_create5_invoker.call(UserController_3.create())
      }
  
    // @LINE:36
    case controllers_UserController_modify6_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_UserController_modify6_invoker.call(UserController_3.modify(id))
      }
  
    // @LINE:38
    case controllers_UserController_consultarReservasUsuario7_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_UserController_consultarReservasUsuario7_invoker.call(UserController_3.consultarReservasUsuario(id))
      }
  
    // @LINE:40
    case controllers_UserController_crearReseva8_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_UserController_crearReseva8_invoker.call(UserController_3.crearReseva(id))
      }
  
    // @LINE:42
    case controllers_UserController_modificarReservaCliente9_route(params) =>
      call(params.fromPath[Long]("id", None), params.fromPath[Long]("id2", None)) { (id, id2) =>
        controllers_UserController_modificarReservaCliente9_invoker.call(UserController_3.modificarReservaCliente(id, id2))
      }
  
    // @LINE:44
    case controllers_UserController_eliminarReservaCliente10_route(params) =>
      call(params.fromPath[Long]("id", None), params.fromPath[Long]("id2", None)) { (id, id2) =>
        controllers_UserController_eliminarReservaCliente10_invoker.call(UserController_3.eliminarReservaCliente(id, id2))
      }
  
    // @LINE:49
    case controllers_MoviBusController_readAll11_route(params) =>
      call { 
        controllers_MoviBusController_readAll11_invoker.call(MoviBusController_0.readAll())
      }
  
    // @LINE:51
    case controllers_MoviBusController_readMovibus12_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_MoviBusController_readMovibus12_invoker.call(MoviBusController_0.readMovibus(id))
      }
  
    // @LINE:53
    case controllers_MoviBusController_create13_route(params) =>
      call { 
        controllers_MoviBusController_create13_invoker.call(MoviBusController_0.create())
      }
  
    // @LINE:55
    case controllers_MoviBusController_putMovibus14_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_MoviBusController_putMovibus14_invoker.call(MoviBusController_0.putMovibus(id))
      }
  
    // @LINE:58
    case controllers_MoviBusController_agregarDatosMovibus15_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_MoviBusController_agregarDatosMovibus15_invoker.call(MoviBusController_0.agregarDatosMovibus(id))
      }
  
    // @LINE:60
    case controllers_MoviBusController_readDatosMovibus16_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_MoviBusController_readDatosMovibus16_invoker.call(MoviBusController_0.readDatosMovibus(id))
      }
  
    // @LINE:62
    case controllers_MoviBusController_agregarRevisionMovibus17_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_MoviBusController_agregarRevisionMovibus17_invoker.call(MoviBusController_0.agregarRevisionMovibus(id))
      }
  
    // @LINE:64
    case controllers_MoviBusController_readRevisionesMovibus18_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_MoviBusController_readRevisionesMovibus18_invoker.call(MoviBusController_0.readRevisionesMovibus(id))
      }
  
    // @LINE:66
    case controllers_MoviBusController_agregarTrayectoMovibus19_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_MoviBusController_agregarTrayectoMovibus19_invoker.call(MoviBusController_0.agregarTrayectoMovibus(id))
      }
  
    // @LINE:68
    case controllers_MoviBusController_finalizarTrayectoMovibus20_route(params) =>
      call(params.fromPath[Long]("id", None), params.fromPath[Long]("id2", None)) { (id, id2) =>
        controllers_MoviBusController_finalizarTrayectoMovibus20_invoker.call(MoviBusController_0.finalizarTrayectoMovibus(id, id2))
      }
  
    // @LINE:70
    case controllers_MoviBusController_readTrayectosMovibus21_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_MoviBusController_readTrayectosMovibus21_invoker.call(MoviBusController_0.readTrayectosMovibus(id))
      }
  
    // @LINE:75
    case controllers_TranviaVehController_readAll22_route(params) =>
      call { 
        controllers_TranviaVehController_readAll22_invoker.call(TranviaVehController_2.readAll())
      }
  
    // @LINE:77
    case controllers_TranviaVehController_readTranvia23_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_TranviaVehController_readTranvia23_invoker.call(TranviaVehController_2.readTranvia(id))
      }
  
    // @LINE:79
    case controllers_TranviaVehController_create24_route(params) =>
      call { 
        controllers_TranviaVehController_create24_invoker.call(TranviaVehController_2.create())
      }
  
    // @LINE:81
    case controllers_TranviaVehController_putTranvia25_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_TranviaVehController_putTranvia25_invoker.call(TranviaVehController_2.putTranvia(id))
      }
  
    // @LINE:103
    case controllers_VcubController_readAll26_route(params) =>
      call { 
        controllers_VcubController_readAll26_invoker.call(VcubController_4.readAll())
      }
  
    // @LINE:105
    case controllers_VcubController_read27_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_VcubController_read27_invoker.call(VcubController_4.read(id))
      }
  
    // @LINE:107
    case controllers_VcubController_create28_route(params) =>
      call { 
        controllers_VcubController_create28_invoker.call(VcubController_4.create())
      }
  
    // @LINE:109
    case controllers_VcubController_modify29_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_VcubController_modify29_invoker.call(VcubController_4.modify(id))
      }
  
    // @LINE:128
    case controllers_TrayectoController_readAll30_route(params) =>
      call { 
        controllers_TrayectoController_readAll30_invoker.call(TrayectoController_1.readAll())
      }
  
    // @LINE:129
    case controllers_TrayectoController_create31_route(params) =>
      call { 
        controllers_TrayectoController_create31_invoker.call(TrayectoController_1.create())
      }
  
    // @LINE:134
    case controllers_EstacionController_readAll32_route(params) =>
      call { 
        controllers_EstacionController_readAll32_invoker.call(EstacionController_7.readAll())
      }
  
    // @LINE:136
    case controllers_EstacionController_readVcubsEstacion33_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_EstacionController_readVcubsEstacion33_invoker.call(EstacionController_7.readVcubsEstacion(id))
      }
  
    // @LINE:138
    case controllers_EstacionController_create34_route(params) =>
      call { 
        controllers_EstacionController_create34_invoker.call(EstacionController_7.create())
      }
  
    // @LINE:140
    case controllers_EstacionController_modificarEstacion35_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_EstacionController_modificarEstacion35_invoker.call(EstacionController_7.modificarEstacion(id))
      }
  
    // @LINE:144
    case controllers_EstacionController_alquilarBicicleta36_route(params) =>
      call(params.fromPath[Long]("id", None), params.fromPath[Long]("id2", None)) { (id, id2) =>
        controllers_EstacionController_alquilarBicicleta36_invoker.call(EstacionController_7.alquilarBicicleta(id, id2))
      }
  
    // @LINE:146
    case controllers_EstacionController_devolverBicicleta37_route(params) =>
      call(params.fromPath[Long]("id", None), params.fromQuery[Long]("id2", None)) { (id, id2) =>
        controllers_EstacionController_devolverBicicleta37_invoker.call(EstacionController_7.devolverBicicleta(id, id2))
      }
  
    // @LINE:163
    case controllers_Assets_at38_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at38_invoker.call(Assets_6.at(path, file))
      }
  }
}