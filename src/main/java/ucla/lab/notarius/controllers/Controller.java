/*
Hanuman Sánchez CI: 28.316.086
Anthony Moreno CI: 28.204.620
Angel Goyo CI: 29.737.583
Miller Arias CI: 29.561.941
Luis Ochoa CI: 29.778.672
*/
package ucla.lab.notarius.controllers;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
//importando modelos

import ucla.lab.notarius.utils.ConfigManager;
import ucla.lab.notarius.utils.NotariusConfig;


/**
 * @authors: Hanuman Sanchez - 28.316.086 - ING. INFORMATICA Anthony Moreno - -
 */
public class Controller {
    private EntityManagerFactory emf = null;
    public final DecanatoController decanato;
    public final CarreraController carrera;
    public final MateriaController materia;
    public final SeccionController seccion;
    public final CalificacionController calificacion;
    public final EstudianteController estudiante;
    public final ProfesorController profesor;
    public final UsuarioController usuario;

    // inicio la db - instancia de los services para manipular la db.
    public Controller() {
        // mapeando la config para crear la persistence unit
        Map<String, String> persistenceMap = new HashMap<String, String>();
        ConfigManager cm = new ConfigManager();
        NotariusConfig notariusConfig = cm.getNotariusConfig();
        persistenceMap.put("javax.persistence.jdbc.url", notariusConfig.getPostgresUrl());
        persistenceMap.put("javax.persistence.jdbc.user", notariusConfig.getPostgresUsername());
        persistenceMap.put("javax.persistence.jdbc.password", notariusConfig.getpostgresPassword());
        persistenceMap.put("javax.persistence.jdbc.driver", "org.postgresql.Driver");

        this.emf = Persistence.createEntityManagerFactory("notariusPU", persistenceMap);

        // crear controlador decanato
        this.decanato = new DecanatoController(this.emf);
        // crear controlador carrera
        this.carrera = new CarreraController(this.emf);
        // crear controlador materia
        this.materia = new MateriaController(this.emf);
        // crear controlador seccion
        this.seccion = new SeccionController(this.emf);
        // crear controlador calificaciones
        this.calificacion = new CalificacionController(this.emf);
        // crear controlador estudiante
        this.estudiante = new EstudianteController(this.emf);
        // crear controlador profesor
        this.profesor = new ProfesorController(this.emf);
        // crear controlador usuario
        this.usuario = new UsuarioController(this.emf);

    }
   
}
