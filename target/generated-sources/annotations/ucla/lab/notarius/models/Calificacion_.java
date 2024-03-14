package ucla.lab.notarius.models;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import ucla.lab.notarius.models.Estudiante;
import ucla.lab.notarius.models.Materia;
import ucla.lab.notarius.models.PeriodoAcademico;
import ucla.lab.notarius.models.Seccion;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-03-13T23:22:45", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Calificacion.class)
public class Calificacion_ { 

    public static volatile SingularAttribute<Calificacion, Estudiante> estudiante;
    public static volatile SingularAttribute<Calificacion, Seccion> seccion;
    public static volatile SingularAttribute<Calificacion, Float> primeraNota;
    public static volatile SingularAttribute<Calificacion, Float> terceraNota;
    public static volatile SingularAttribute<Calificacion, PeriodoAcademico> periodo;
    public static volatile SingularAttribute<Calificacion, Float> notaFinal;
    public static volatile SingularAttribute<Calificacion, Materia> materia;
    public static volatile SingularAttribute<Calificacion, Integer> id;
    public static volatile SingularAttribute<Calificacion, Float> segundaNota;
    public static volatile SingularAttribute<Calificacion, String> status;

}