INSERT INTO Decanato (ID, nombre, ubicacion, rector) VALUES
(1, 'Decanato de Ciencias y Tecnología', 'Barquisimeto', 'Dr. Juan Pérez'),
(2, 'Decanato de Ciencias Humanas', 'Cabudare', 'Dra. María González'),
(3, 'Decanato de Artes', 'Coco e Mono', 'Dr. Pedro Rodríguez'),
(4, 'Decanato de Ingeniería', 'La Piedad', 'Dra. Ana López'),
(5, 'Decanato de Medicina', 'Av Vargas', 'Dr. Carlos García'),
(6, 'Decanato de Educación', 'Obelisco', 'Dra. Beatriz Moreno'),
(7, 'Decanato de Derecho', 'Las Mercedes', 'Dr. Miguel Santos'),
(8, 'Decanato de Economía', 'Barquisimeto', 'Dr. Rafael Delgado'),
(9, 'Decanato de Ciencias Sociales', 'La Miel', 'Dra. Diana Fernández'),
(10, 'Decanato de Comunicación Social', 'Cubiro', 'Dr. Eduardo Gómez');

INSERT INTO Carrera (ID, nombre, descripcion, idDecanato) VALUES
(1, 'Ingeniería Informática', 'Carrera que se encarga del estudio y desarrollo de sistemas informáticos.', 1),
(2, 'Medicina', 'Carrera que se encarga del estudio y tratamiento de enfermedades.', 2),
(3, 'Derecho', 'Carrera que se encarga del estudio del sistema jurídico y su aplicación.', 3),
(4, 'Administración de Empresas', 'Carrera que se encarga del estudio y gestión de las empresas.', 4),
(5, 'Psicología', 'Carrera que se encarga del estudio de la mente y el comportamiento humano.', 5),
(6, 'Arquitectura', 'Carrera que se encarga del diseño y construcción de edificios.', 6),
(7, 'Educación', 'Carrera que se encarga del estudio y la práctica de la enseñanza.', 7),
(8, 'Comunicación Social', 'Carrera que se encarga del estudio y la práctica de la comunicación.', 8),
(9, 'Artes', 'Carrera que se encarga del estudio y la práctica de las artes.', 9),
(10, 'Ingeniería Civil', 'Carrera que se encarga del estudio y construcción de obras civiles.', 1);

INSERT INTO Calificacion (UsuarioID, SeccionID, primera_nota, segunda_nota, tercera_nota, nota_final, status) VALUES
(123, 5, 16, 14, 18, 16, 'Aprobado'),
(456, 5, 12, 9, 11, 10.5, 'Reprobado'),
(789, 2, 19, 18, 17, 18, 'Aprobado'),
(321, 5, 11, 13, 10, 11.5, 'Reprobado'), 
(654, 2, 17, 16, 19, 17.5, 'Aprobado');

INSERT INTO Materia (ID, nombre, descripcion, semestre, carreraNombre) VALUES
(1, 'Matemáticas', 'Ciencia que estudia los números, las estructuras, el cambio y las relaciones.', 1, 'Ingeniería Informática'),
(2, 'Física', 'Ciencia que estudia las leyes que gobiernan el universo.', 2, 'Ingeniería Informática'),
(3, 'Química', 'Ciencia que estudia la composición, estructura y propiedades de la materia.', 3, 'Ingeniería Informática'),
(4, 'Biología', 'Ciencia que estudia los seres vivos.', 4, 'Biología'),
(5, 'Historia', 'Ciencia que estudia el pasado y sus acontecimientos.', 5, 'Historia'),
(6, 'Filosofía', 'Ciencia que estudia el conocimiento, la verdad, la ética y la realidad.', 6, 'Filosofía'),
(7, 'Literatura', 'Arte que utiliza el lenguaje para crear historias.', 7, 'Literatura'),
(8, 'Artes Plásticas', 'Arte que utiliza la forma y el color para crear obras de arte.', 8, 'Artes Plásticas'),
(9, 'Música', 'Arte que utiliza el sonido para crear obras de arte.', 9, 'Música'),
(10, 'Informática', 'Ciencia que estudia el tratamiento automático de la información.', 10, 'Ingeniería Informática');


INSERT INTO PeriodoAcademico (ID, fecha_inicio, fecha_cierre, semana, codigo, fecha_limite_inclusion, fecha_limite_retiro, fecha_tope_primer_parcial, fecha_tope_segundo_parcial, fecha_tope_tercer_parcial) VALUES
(1, '2023-09-01', '2023-12-31', 1, 'PA-2023-2024', '2023-09-15', '2023-10-07', '2023-10-25', '2023-11-22', '2023-12-13'),
(2, '2024-01-01', '2024-06-30', 1, 'PA-2024-2025', '2024-01-15', '2024-01-28', '2024-02-25', '2024-03-22', '2024-04-13'),
(3, '2024-09-01', '2024-12-31', 1, 'PA-2024-2025', '2024-09-15', '2024-09-28', '2024-10-25', '2024-11-22', '2024-12-13'),

INSERT INTO Seccion (numero, DecanatoID, MateriaID, ProfesorID, CarreraID, SemestreID, PeriodoAcademicoID, nombre, descripcion, cupo_maximo) VALUES
(1, 1, 1, 1, 1, 1, 1, 'Sección 1', 'Descripción de la sección 1', 50),
(2, 2, 1, 1, 1, 1, 1, 'Sección 2', 'Descripción de la sección 2', 50),
(3, 1, 2, 1, 1, 1, 1, 'Sección 3', 'Descripción de la sección 3', 50),
(4, 1, 1, 2, 1, 1, 1, 'Sección 4', 'Descripción de la sección 4', 50),
(5, 1, 1, 1, 2, 1, 1, 'Sección 5', 'Descripción de la sección 5', 50),
(6, 1, 1, 1, 1, 2, 1, 'Sección 6', 'Descripción de la sección 6', 50),
(7, 1, 1, 1, 1, 1, 2, 'Sección 7', 'Descripción de la sección 7', 50),
(8, 1, 1, 1, 1, 1, 1, 'Sección 8', 'Descripción de la sección 8', 50),
(9, 1, 1, 1, 1, 1, 1, 'Sección 9', 'Descripción de la sección 9', 50),
(10, 1, 1, 1, 1, 1, 1, 'Sección 10', 'Descripción de la sección 10', 50);

INSERT INTO Inscripcion (ID, PeriodoAcademico, Carrera, Decanato, Semestre, UsuarioID) VALUES
(1, 1, 1, 1, 1, 1),
(2, 2, 2, 2, 2, 2),
(3, 1, 3, 3, 3, 3),
(4, 2, 1, 1, 1, 1),
(5, 1, 2, 2, 2, 2),
(6, 2, 3, 3, 3, 3),
(7, 1, 1, 2, 2, 2),
(8, 2, 2, 1, 1, 1),
(9, 1, 3, 2, 2, 2),
(10, 2, 1, 3, 3, 3);