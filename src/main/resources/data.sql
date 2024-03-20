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

INSERT INTO Carrera (ID, nombre, descripcion, decanato_id) VALUES
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

INSERT INTO Usuario 
  (id, administrador, profesor, estudiante, nombres, apellidos, cedula, nombreusuario, clave, edad, genero, promedio, periodo_id, semestre, carrera_id)
  VALUES
    (1, TRUE, FALSE, FALSE, 'Luis', 'Colmenarez', '1234567890', 'luiscol', 'luiscol', 20, 'M', NULL, NULL, NULL, 1 ),
    (2, FALSE, TRUE, FALSE, 'Ana', 'Garcia', '9876543210', 'anagarcia', 'anagarcia', 35, 'F', NULL, NULL, NULL, 3),
    (3, FALSE, FALSE, TRUE, 'Pedro', 'Gonzalez', '0123456789', 'pedrogonz', 'pedrogonz', 18, 'M', 3.8, NULL, NULL, 6),
    (4, TRUE, FALSE, FALSE, 'Maria', 'Rodriguez', '5432198760', 'mariarod', 'mariarod', 40, 'F', NULL, NULL, NULL, 7),
    (5, FALSE, FALSE, TRUE, 'David', 'Hernandez', '1112223334', 'davidher', 'davidher', 22, 'M', NULL, NULL, NULL, 4),
    (6, FALSE, FALSE, TRUE, 'Richard', 'Prono', '433498492', 'richar', 'richar', 40, 'M', NULL, NULL, NULL, 10),
    (7, FALSE, FALSE, TRUE, 'Loro', 'Hernandez', '98789732', 'lorocal', 'lorocal', 10, 'M', NULL, NULL, NULL, 5),
    (8, FALSE, FALSE, TRUE, 'Sanches', 'Sanches', '979489023', 'sanches', 'sanches', 18, 'M', NULL, NULL, NULL, 2)
;

insert into periodoacademico (id, codigo, fechacierre, fechainicio, fechatopeinclusion, fechatopeprimerparcial, fechatoperetiro, fechatopesegundoparcial, fechatopetercerparcial) values 
(1, '2024-I', '2024-07-01', '2024-01-01', '2024-01-10', '2024-01-30', '2024-02-01', '2024-02-28', '2024-03-30'),  (2, '2024-II', '2025-04-10', '2024-10-10', '2024-10-30', '2024-11-20', '2024-11-30', '2025-01-28', '2025-03-11');
