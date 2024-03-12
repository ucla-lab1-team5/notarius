package ucla.lab.notarius.models;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import ucla.lab.notarius.models.Carrera;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-03-12T16:50:55", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Decanato.class)
public class Decanato_ { 

    public static volatile SingularAttribute<Decanato, String> rector;
    public static volatile ListAttribute<Decanato, Carrera> carreras;
    public static volatile SingularAttribute<Decanato, String> ubicacion;
    public static volatile SingularAttribute<Decanato, Integer> id;
    public static volatile SingularAttribute<Decanato, String> nombre;

}