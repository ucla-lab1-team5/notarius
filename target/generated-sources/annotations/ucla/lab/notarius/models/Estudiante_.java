package ucla.lab.notarius.models;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import ucla.lab.notarius.models.Calificacion;
import ucla.lab.notarius.models.Carrera;
import ucla.lab.notarius.models.PeriodoAcademico;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-03-19T12:17:33", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Estudiante.class)
public class Estudiante_ extends Usuario_ {

    public static volatile ListAttribute<Estudiante, Calificacion> calificaciones;
    public static volatile SingularAttribute<Estudiante, PeriodoAcademico> periodo;
    public static volatile SingularAttribute<Estudiante, Float> promedio;
    public static volatile SingularAttribute<Estudiante, Carrera> carrera;
    public static volatile SingularAttribute<Estudiante, Integer> semestre;

}