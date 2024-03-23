-- [Estudiantes por carrera]
-- Con inscripcion
SELECT 
    u.nombres, 
    u.apellidos, 
    c.nombre AS carrera
FROM public.usuario u
JOIN public.inscripcion i ON u.id = i.estudiante_id
JOIN public.carrera c ON i.carrera_id = c.id
WHERE u.estudiante = true;

-- Sin inscripcion
SELECT 
    u.nombres, 
    u.apellidos, 
    c.nombre AS carrera
FROM public.usuario u
JOIN public.carrera c ON u.carrera_id = c.id
WHERE u.estudiante = TRUE ORDER  BY carrera desc;

-- [Estudiantes con materias reprobadas]
SELECT u.id
	  ,u.nombres
	  ,u.apellidos
	  ,u.cedula
	  ,m.nombre
FROM usuario u 
	JOIN calificacion c ON c.estudiante_id = u.id
	JOIN materia m ON c.materia_id = m.id
WHERE u.estudiante = TRUE
	AND c.status = 'reprobado'
;

-- Estudiantes por genero en carrera y decanato

SELECT 
		u.id,
		u.nombres, 
		u.cedula,
		u.genero,
		c.nombre, 
		d.nombre
FROM usuario u
	JOIN carrera c 
		ON c.id = u.carrera_id
	JOIN decanato d 
		ON d.id = c.decanato_id
WHERE u.estudiante = TRUE
ORDER BY d.nombre
		,c.nombre
		,u.genero
;

-- Mejores 20 promedios por decanato
SELECT rnk.*
FROM (
	SELECT c.nombre AS carrera
		  ,u.nombres AS nombre
		  ,u.apellidos AS apellido
		  ,u.cedula AS cedula
		  ,u.id
		  ,u.promedio 
		  ,d.nombre 
		  ,RANK() OVER (ORDER BY u.promedio DESC) AS ranking
	FROM usuario u
		JOIN carrera c
			ON u.carrera_id = c.id
		JOIN decanato d ON d.id = c.decanato_id
	WHERE u.estudiante = true
	ORDER BY u.promedio DESC
			,ranking desc
) rnk
LIMIT 20;

-- [Estudiantes con materias retiradas]
SELECT u.id
	  ,u.nombres
	  ,u.apellidos
	  ,u.cedula
	  ,m.nombre
FROM usuario u 
	JOIN calificacion c ON c.estudiante_id = u.id
	JOIN materia m ON c.materia_id = m.id
WHERE u.estudiante = TRUE
	AND c.status = 'retirada'
;
-- Estudiantes con promedio > 16 por seccion y por carrera

SELECT u.nombres,
	c.nombre
FROM usuario u 
JOIN carrera c ON c.id = u.carrera_id 


		
;

SELECT * 
FROM usuario 
;


