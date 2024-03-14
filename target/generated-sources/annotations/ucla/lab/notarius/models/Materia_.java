package ucla.lab.notarius.models;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import ucla.lab.notarius.models.Carrera;
import ucla.lab.notarius.models.Seccion;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-03-13T23:22:45", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Materia.class)
public class Materia_ { 

    public static volatile SingularAttribute<Materia, String> descripcion;
    public static volatile ListAttribute<Materia, Carrera> carreras;
    public static volatile SingularAttribute<Materia, Integer> id;
    public static volatile ListAttribute<Materia, Seccion> secciones;
    public static volatile SingularAttribute<Materia, String> nombre;

}