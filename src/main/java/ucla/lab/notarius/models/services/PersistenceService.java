/*
Hanuman Sánchez CI: 28.316.086
Anthony Moreno CI: 28.204.620
Angel Goyo CI: 29.737.583
Miller Arias CI: 29.561.941
Luis Ochoa CI: 29.778.672
*/
package ucla.lab.notarius.models.services;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
//importando modelos

import ucla.lab.notarius.utils.NotariusConfig;


/**
 * @authors: Hanuman Sanchez - 28.316.086 - ING. INFORMATICA Anthony Moreno - -
 */
public class PersistenceService {
    private EntityManagerFactory emf = null;
    public final DecanatoService decanato;
    public final CarreraService carrera;
    public final MateriaService materia;
    public final SeccionService seccion;
    public final CalificacionService calificacion;
    public final EstudianteService estudiante;
    public final ProfesorService profesor;
    public final UsuarioService usuario;

    // inicio la db - instancia de los services para manipular la db.
    public PersistenceService() {
        // mapeando la config para crear la persistence unit
        Map<String, String> persistenceMap = new HashMap<String, String>();
        NotariusConfig notariusConfig = new NotariusConfig();
        persistenceMap.put("javax.persistence.jdbc.url", notariusConfig.getPostgresUrl());
        persistenceMap.put("javax.persistence.jdbc.user", notariusConfig.getPostgresUsername());
        persistenceMap.put("javax.persistence.jdbc.password", notariusConfig.getPostgresPassword());
        persistenceMap.put("javax.persistence.jdbc.driver", notariusConfig.getPostgresDriver());
        persistenceMap.put("javax.persistence.schema-generation.database.action", notariusConfig.getPostgresSchemaGenerationDatabaseAction());

        this.emf = Persistence.createEntityManagerFactory("notariusPU", persistenceMap);

        // crear controlador decanato
        this.decanato = new DecanatoService(this.emf);
        // crear controlador carrera
        this.carrera = new CarreraService(this.emf);
        // crear controlador materia
        this.materia = new MateriaService(this.emf);
        // crear controlador seccion
        this.seccion = new SeccionService(this.emf);
        // crear controlador calificaciones
        this.calificacion = new CalificacionService(this.emf);
        // crear controlador estudiante
        this.estudiante = new EstudianteService(this.emf);
        // crear controlador profesor
        this.profesor = new ProfesorService(this.emf);
        // crear controlador usuario
        this.usuario = new UsuarioService(this.emf);

    }
   
}
