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
