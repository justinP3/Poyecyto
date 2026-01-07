-- database: D:\workspace\Clases de la U\EXOBOT\DataBase/EXOBOT.sqlite
/*AUTOR : Justin Pincay*/
DROP TABLE IF EXISTS JpExoBot;

DROP TABLE IF EXISTS JpPersona;

DROP TABLE IF EXISTS JpCatalogo;

DROP TABLE IF EXISTS JpCatalogoTipo;

DROP TABLE IF EXISTS JpIABot;

CREATE TABLE
    JpCatalogoTipo (
        IdJpCatalogoTipo INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,
        Nombre VARCHAR(10) NOT NULL,
        Descripcion VARCHAR(90),
        Estado VARCHAR(1) NOT NULL DEFAULT ('A'),
        FechaCreacion DATETIME DEFAULT (datetime ('now', 'localtime')),
        FechaModifica DATETIME
    );

CREATE TABLE
    JpCatalogo (
        IdJpCatalogo INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,
        IdJpCatalogoTipo INTEGER NOT NULL REFERENCES JpCatalogoTipo (IdJpCatalogoTipo),
        Nombre VARCHAR(10) NOT NULL,
        Descripcion VARCHAR(90),
        Estado VARCHAR(1) NOT NULL DEFAULT ('A'),
        FechaCreacion DATETIME DEFAULT (datetime ('now', 'localtime')),
        FechaModifica DATETIME
    );

CREATE TABLE
    JpIABot (
        IdJpIABot INTEGER PRIMARY KEY AUTOINCREMENT,
        Nombre TEXT NOT NULL UNIQUE,
        Observacion TEXT,
        FechaCrea DATETIME DEFAULT CURRENT_TIMESTAMP
    );

CREATE TABLE
    JpExoBot (
        IdExoBot INTEGER PRIMARY KEY AUTOINCREMENT,
        IdJpIABot INTEGER NOT NULL,
        Nombre TEXT NOT NULL,
        Serie TEXT NOT NULL,
        CONSTRAINT fk_IABot FOREIGN KEY (IdJpIABot) REFERENCES JpIABot (IdJpIABot)
    );

CREATE TABLE
    JpPersona (
        IdJpPersona INTEGER PRIMARY KEY AUTOINCREMENT,
        IdCatalogoTipoPersona INTEGER NOT NULL REFERENCES JpCatalogo (IdJpCatalogo),
        IdCatalogoSexo INTEGER NOT NULL REFERENCES JpCatalogo (IdJpCatalogo),
        IdCatalogoEstadoCivil INTEGER NOT NULL REFERENCES JpCatalogo (IdJpCatalogo),
        Cedula VARCHAR(10) NOT NULL UNIQUE,
        Nombre VARCHAR(50) NOT NULL,
        Apellido VARCHAR(50) NOT NULL,
        FechaCreacion DATETIME DEFAULT (datetime ('now', 'localtime')),
        FechaModifica DATETIME
    );