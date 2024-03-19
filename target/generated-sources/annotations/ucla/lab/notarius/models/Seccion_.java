package ucla.lab.notarius.models;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import ucla.lab.notarius.models.Calificacion;
import ucla.lab.notarius.models.Carrera;
import ucla.lab.notarius.models.Decanato;
import ucla.lab.notarius.models.Materia;
import ucla.lab.notarius.models.PeriodoAcademico;
import ucla.lab.notarius.models.Profesor;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-03-19T12:17:33", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Seccion.class)
public class Seccion_ { 

    public static volatile SingularAttribute<Seccion, String> codigo;
    public static volatile ListAttribute<Seccion, Calificacion> calificaciones;
    public static volatile SingularAttribute<Seccion, PeriodoAcademico> periodo;
    public static volatile SingularAttribute<Seccion, Decanato> decanato;
    public static volatile SingularAttribute<Seccion, Materia> materia;
    public static volatile SingularAttribute<Seccion, Profesor> profesor;
    public static volatile SingularAttribute<Seccion, Integer> id;
    public static volatile SingularAttribute<Seccion, Carrera> carrera;

}