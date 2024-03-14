package ucla.lab.notarius.models;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import ucla.lab.notarius.models.Carrera;
import ucla.lab.notarius.models.Decanato;
import ucla.lab.notarius.models.Estudiante;
import ucla.lab.notarius.models.PeriodoAcademico;
import ucla.lab.notarius.models.Seccion;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-03-13T23:22:45", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Inscripcion.class)
public class Inscripcion_ { 

    public static volatile SingularAttribute<Inscripcion, Estudiante> estudiante;
    public static volatile SingularAttribute<Inscripcion, PeriodoAcademico> periodo;
    public static volatile SingularAttribute<Inscripcion, Decanato> decanato;
    public static volatile SingularAttribute<Inscripcion, Integer> id;
    public static volatile SingularAttribute<Inscripcion, Carrera> carrera;
    public static volatile SingularAttribute<Inscripcion, Integer> semestre;
    public static volatile ListAttribute<Inscripcion, Seccion> secciones;

}