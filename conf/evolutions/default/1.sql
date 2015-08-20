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

create table estacion (
  id_estacion               varchar(255) not null,
  nombre_estacion           varchar(255),
  ubicacion                 varchar(255),
  vcubs_capacity            integer,
  constraint pk_estacion primary key (id_estacion))
;

create table reserva (
  id_reserva                varchar(255) not null,
  hora_reserva              timestamp,
  hora_creacion             timestamp,
  costo                     double,
  estado                    varchar(255),
  constraint pk_reserva primary key (id_reserva))
;

create table tranvia (
  id_tranvia                varchar(255) not null,
  linea                     integer,
  estado                    varchar(255),
  constraint ck_tranvia_linea check (linea in (0,1,2)),
  constraint pk_tranvia primary key (id_tranvia))
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

create table vehiculo (
  id_vehiculo               varchar(255) not null,
  modelo                    varchar(255),
  fecha_compra              timestamp,
  estado                    integer,
  tipo_vehiculo             varchar(255),
  kilom_desde_ultima_reparacion double,
  constraint pk_vehiculo primary key (id_vehiculo))
;




# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists datos;

drop table if exists driver;

drop table if exists estacion;

drop table if exists reserva;

drop table if exists tranvia;

drop table if exists trayecto;

drop table if exists user;

drop table if exists vehiculo;

SET REFERENTIAL_INTEGRITY TRUE;

