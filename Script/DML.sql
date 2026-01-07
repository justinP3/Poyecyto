-- database: D:\workspace\Clases de la U\EXOBOT\DataBase/EXOBOT.sqlite
/*
AUTOR : Justin Pincay]
Script: Insercion de datos
 */
INSERT INTO
    JpCatalogoTipo (Nombre, Descripcion)
VALUES
    ('Tipo Persona', 'tipos sol, meca,...'),
    ('Sexo', 'mas, fem,...'),
    ('EstadoCivil', 'sol, viud, cas,...');

INSERT INTO
    JpCatalogo (IdJpCatalogoTipo, Nombre, Descripcion)
VALUES
    (1, 'Soldado', 'tipos de perso del ejercito'),
    (1, 'Mecanico', 'tipos de perso del ejercito'),
    (1, 'Experto Ing', 'tipos de perso del ejercito'),
    (1, 'Experto Esp', 'tipos de perso del ejercito'),
    --
    (2, 'Masculino', 'tipos de sexualidad'),
    (2, 'Femenino', 'tipos de sexualidad'),
    (2, 'Hibrido', 'tipos de sexualidad'),
    (2, 'Asexual', 'tipos de sexualidad'),
    --
    (3, 'Soltero', 'tipos de estados C'),
    (3, 'Casado', 'tipos de estados C'),
    (3, 'Divorsiado', 'tipos de estados C'),
    (3, 'Viudo', 'tipos de estados C');

INSERT INTO
    JpIABot (Nombre, Observacion)
VALUES
    ("IA-Ruso", "Inteligencia artificial");

INSERT INTO
    JpExoBot (IdJpIABot, Nombre, Serie)
VALUES
    (1, "exobot1", "SerieE1"),
    (1, "exobot2", "SerieE2");

INSERT INTO
    JpPersona (
        IdCatalogoTipoPersona,
        IdCatalogoSexo,
        IdCatalogoEstadoCivil,
        Cedula,
        Nombre,
        Apellido
    )
VALUES
    (1, 5, 9, "111", "Juan", "Putin"),
    (2, 5, 10, "222", "Jhon", "Putin"),
    (3, 5, 11, "333", "Justin", "Putin"),
    (4, 5, 12, "444", "Pepe", "Putin"),
    (1, 6, 9, "555", "Laura", "Putin"),
    (2, 6, 10, "666", "Brita", "Putin"),
    (3, 6, 11, "777", "Maraia", "Putin"),
    (4, 6, 12, "888", "Sofia", "Putin");