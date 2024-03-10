package ucla.lab.notarius.models;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import ucla.lab.notarius.models.Decanato;
import ucla.lab.notarius.models.Materia;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-03-10T12:05:58", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Carrera.class)
public class Carrera_ { 

    public static volatile SingularAttribute<Carrera, String> descripcion;
    public static volatile SingularAttribute<Carrera, Decanato> decanato;
    public static volatile SingularAttribute<Carrera, Integer> id;
    public static volatile ListAttribute<Carrera, Materia> materias;
    public static volatile SingularAttribute<Carrera, String> nombre;

}