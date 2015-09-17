# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table datos (
  id_datos                  bigint not null,
  gps_altitud               varchar(255),
  gps_latitud               varchar(255),
  hora_medicion             timestamp,
  sensor_choque             boolean,
  sensor_termico            double,
  boton_panico              boolean,
  kilometraje               double,
  idVehiculo               bigint,
  constraint pk_datos primary key (id_datos))
;

create table driver (
  id_conductor              bigint not null,
  full_name                 varchar(255),
  document_number           varchar(255),
  home_phone                bigint,
  mobile_phone              bigint,
  address                   varchar(255),
  constraint pk_driver primary key (id_conductor))
;

create table emergencia (
  id_emergencia             varchar(255) not null,
  emergency_type            integer,
  emergency_date            timestamp,
  comments                  varchar(255),
  place                     varchar(255),
  emergency_level           varchar(255),
  estado                    integer,
  idVehiculo               bigint,
  constraint pk_emergencia primary key (id_emergencia))
;

create table estacion (
  idEstacion               bigint not null,
  nombre_estacion           varchar(255),
  ubicacion                 varchar(255),
  vcubs_capacity            integer,
  constraint pk_estacion primary key (idEstacion))
;

create table movi_bus_vehiculo (
  idVehiculo               bigint not null,
  modelo                    varchar(255),
  fechaCompra              timestamp,
  estado                    integer,
  tipoVehiculo             integer,
  id_revision               bigint,
  id_datos                  bigint,
  id_emergencia             varchar(255),
  id_trayecto               bigint,
  constraint uq_movi_bus_vehiculo_id_revision unique (id_revision),
  constraint uq_movi_bus_vehiculo_id_datos unique (id_datos),
  constraint uq_movi_bus_vehiculo_id_emergenc unique (id_emergencia),
  constraint uq_movi_bus_vehiculo_id_trayecto unique (id_trayecto),
  constraint pk_movi_bus_vehiculo primary key (idVehiculo))
;

create table reserva (
  id_reserva                bigint not null,
  hora_reserva              timestamp,
  hora_creacion             timestamp,
  costo                     double,
  estado                    varchar(255),
  id_movibus_reservado      bigint,
  idCliente                bigint,
  constraint pk_reserva primary key (id_reserva))
;

create table revision_mecanica (
  id_revision               bigint not null,
  fecha_revision            timestamp,
  costo_revision            double,
  kilometraje               double,
  idVehiculo               bigint,
  constraint pk_revision_mecanica primary key (id_revision))
;

create table tranvia_vehiculo (
  idVehiculo               bigint not null,
  modelo                    varchar(255),
  fechaCompra              timestamp,
  estado                    integer,
  tipoVehiculo             integer,
  id_revision               bigint,
  id_datos                  bigint,
  id_emergencia             varchar(255),
  id_trayecto               bigint,
  constraint uq_tranvia_vehiculo_id_revision unique (id_revision),
  constraint uq_tranvia_vehiculo_id_datos unique (id_datos),
  constraint uq_tranvia_vehiculo_id_emergenci unique (id_emergencia),
  constraint uq_tranvia_vehiculo_id_trayecto unique (id_trayecto),
  constraint pk_tranvia_vehiculo primary key (idVehiculo))
;

create table trayecto (
  id_trayecto               bigint not null,
  ruta                      varchar(255),
  hora_inicio               timestamp,
  hora_fin                  timestamp,
  incidentes                integer,
  estado                    integer,
  id_conductor              bigint,
  idVehiculo               bigint,
  constraint pk_trayecto primary key (id_trayecto))
;

create table user (
  id_usuario                bigint not null,
  full_name                 varchar(255),
  document                  varchar(255),
  address                   varchar(255),
  phone_number              bigint,
  cellphone                 bigint,
  email                     varchar(255),
  id_vcub_alquilada         bigint,
  id_ultima_reserva         bigint,
  constraint pk_user primary key (id_usuario))
;

create table vcub (
  id_vcub                   bigint auto_increment not null,
  estado                    varchar(255),
  idEstacion               bigint,
  idCliente                bigint,
  constraint pk_vcub primary key (id_vcub))
;

create sequence datos_seq;

create sequence driver_seq;

create sequence emergencia_seq;

create sequence estacion_seq;

create sequence movi_bus_vehiculo_seq;

create sequence reserva_seq;

create sequence revision_mecanica_seq;

create sequence tranvia_vehiculo_seq;

create sequence trayecto_seq;

create sequence user_seq;

alter table movi_bus_vehiculo add constraint fk_movi_bus_vehiculo_ultimaRev_1 foreign key (id_revision) references revision_mecanica (id_revision) on delete restrict on update restrict;
create index ix_movi_bus_vehiculo_ultimaRev_1 on movi_bus_vehiculo (id_revision);
alter table movi_bus_vehiculo add constraint fk_movi_bus_vehiculo_ultimosDa_2 foreign key (id_datos) references datos (id_datos) on delete restrict on update restrict;
create index ix_movi_bus_vehiculo_ultimosDa_2 on movi_bus_vehiculo (id_datos);
alter table movi_bus_vehiculo add constraint fk_movi_bus_vehiculo_ultimaEme_3 foreign key (id_emergencia) references emergencia (id_emergencia) on delete restrict on update restrict;
create index ix_movi_bus_vehiculo_ultimaEme_3 on movi_bus_vehiculo (id_emergencia);
alter table movi_bus_vehiculo add constraint fk_movi_bus_vehiculo_ultimoTra_4 foreign key (id_trayecto) references trayecto (id_trayecto) on delete restrict on update restrict;
create index ix_movi_bus_vehiculo_ultimoTra_4 on movi_bus_vehiculo (id_trayecto);
alter table tranvia_vehiculo add constraint fk_tranvia_vehiculo_ultimaRevi_5 foreign key (id_revision) references revision_mecanica (id_revision) on delete restrict on update restrict;
create index ix_tranvia_vehiculo_ultimaRevi_5 on tranvia_vehiculo (id_revision);
alter table tranvia_vehiculo add constraint fk_tranvia_vehiculo_ultimosDat_6 foreign key (id_datos) references datos (id_datos) on delete restrict on update restrict;
create index ix_tranvia_vehiculo_ultimosDat_6 on tranvia_vehiculo (id_datos);
alter table tranvia_vehiculo add constraint fk_tranvia_vehiculo_ultimaEmer_7 foreign key (id_emergencia) references emergencia (id_emergencia) on delete restrict on update restrict;
create index ix_tranvia_vehiculo_ultimaEmer_7 on tranvia_vehiculo (id_emergencia);
alter table tranvia_vehiculo add constraint fk_tranvia_vehiculo_ultimoTray_8 foreign key (id_trayecto) references trayecto (id_trayecto) on delete restrict on update restrict;
create index ix_tranvia_vehiculo_ultimoTray_8 on tranvia_vehiculo (id_trayecto);



# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists datos;

drop table if exists driver;

drop table if exists emergencia;

drop table if exists estacion;

drop table if exists movi_bus_vehiculo;

drop table if exists reserva;

drop table if exists revision_mecanica;

drop table if exists tranvia_vehiculo;

drop table if exists trayecto;

drop table if exists user;

drop table if exists vcub;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists datos_seq;

drop sequence if exists driver_seq;

drop sequence if exists emergencia_seq;

drop sequence if exists estacion_seq;

drop sequence if exists movi_bus_vehiculo_seq;

drop sequence if exists reserva_seq;

drop sequence if exists revision_mecanica_seq;

drop sequence if exists tranvia_vehiculo_seq;

drop sequence if exists trayecto_seq;

drop sequence if exists user_seq;

