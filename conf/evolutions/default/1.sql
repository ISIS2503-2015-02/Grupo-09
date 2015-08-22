# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table datos (
  id_datos                  varchar(255) not null,
  gps_altitud               varchar(255),
  gps_latitud               varchar(255),
  hora_medicion             timestamp,
  sensor_choque             boolean,
  sensor_termico            double,
  boton_panico              boolean,
  kilometraje               double,
  constraint pk_datos primary key (id_datos))
;

create table driver (
  id_conductor              varchar(255) not null,
  full_name                 varchar(255),
  document_number           varchar(255),
  home_phone                bigint,
  mobile_phone              bigint,
  address                   varchar(255),
  constraint pk_driver primary key (id_conductor))
;

create table emergencia (
  emergency_id              varchar(255) not null,
  emergency_type            integer,
  emergency_date            varchar(255),
  comments                  varchar(255),
  place                     varchar(255),
  emergency_level           varchar(255),
  estado                    integer,
  constraint pk_emergencia primary key (emergency_id))
;

create table estacion (
  id_estacion               varchar(255) not null,
  nombre_estacion           varchar(255),
  ubicacion                 varchar(255),
  vcubs_capacity            integer,
  constraint pk_estacion primary key (id_estacion))
;

create table movi_bus_vehiculo (
  id_vehiculo               varchar(255) not null,
  modelo                    varchar(255),
  fecha_compra              timestamp,
  estado                    integer,
  tipo_vehiculo             varchar(255),
  kilom_desde_ultima_reparacion double,
  constraint pk_movi_bus_vehiculo primary key (id_vehiculo))
;

create table reserva (
  id_reserva                varchar(255) not null,
  hora_reserva              timestamp,
  hora_creacion             timestamp,
  costo                     double,
  estado                    varchar(255),
  constraint pk_reserva primary key (id_reserva))
;

create table revision_mecanica (
  id                        varchar(255) not null,
  fecha_revision            timestamp,
  costo_revision            double,
  kilometraje               double,
  constraint pk_revision_mecanica primary key (id))
;

create table tranvia (
  id_tranvia                varchar(255) not null,
  linea                     integer,
  estado                    varchar(255),
  constraint ck_tranvia_linea check (linea in (0,1,2)),
  constraint pk_tranvia primary key (id_tranvia))
;

create table tranvia_vehiculo (
  id_vehiculo               varchar(255) not null,
  modelo                    varchar(255),
  fecha_compra              timestamp,
  estado                    integer,
  tipo_vehiculo             varchar(255),
  kilom_desde_ultima_reparacion double,
  constraint pk_tranvia_vehiculo primary key (id_vehiculo))
;

create table trayecto (
  id_trayecto               varchar(255) not null,
  ruta                      varchar(255),
  hora_inicio               timestamp,
  hora_fin                  timestamp,
  incidentes                integer,
  estado                    integer,
  duracion                  double,
  constraint pk_trayecto primary key (id_trayecto))
;

create table user (
  user_id                   varchar(255) not null,
  full_name                 varchar(255),
  document                  varchar(255),
  address                   varchar(255),
  phone_number              bigint,
  cellphone                 bigint,
  email                     varchar(255),
  constraint pk_user primary key (user_id))
;

create table vcub (
  id_vcub                   varchar(255) not null,
  estado                    varchar(255),
  constraint pk_vcub primary key (id_vcub))
;

create sequence datos_seq;

create sequence driver_seq;

create sequence emergencia_seq;

create sequence estacion_seq;

create sequence movi_bus_vehiculo_seq;

create sequence reserva_seq;

create sequence revision_mecanica_seq;

create sequence tranvia_seq;

create sequence tranvia_vehiculo_seq;

create sequence trayecto_seq;

create sequence user_seq;




# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists datos;

drop table if exists driver;

drop table if exists emergencia;

drop table if exists estacion;

drop table if exists movi_bus_vehiculo;

drop table if exists reserva;

drop table if exists revision_mecanica;

drop table if exists tranvia;

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

drop sequence if exists tranvia_seq;

drop sequence if exists tranvia_vehiculo_seq;

drop sequence if exists trayecto_seq;

drop sequence if exists user_seq;

