package ucla.lab.notarius.models;

import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import ucla.lab.notarius.models.Seccion;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-03-10T12:05:17", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(PeriodoAcademico.class)
public class PeriodoAcademico_ { 

    public static volatile SingularAttribute<PeriodoAcademico, Date> fechaTopeTercerParcial;
    public static volatile SingularAttribute<PeriodoAcademico, Date> fechaCierre;
    public static volatile SingularAttribute<PeriodoAcademico, String> codigo;
    public static volatile SingularAttribute<PeriodoAcademico, Date> fechaTopeSegundoParcial;
    public static volatile SingularAttribute<PeriodoAcademico, Date> fechaInicio;
    public static volatile SingularAttribute<PeriodoAcademico, Date> fechaTopePrimerParcial;
    public static volatile SingularAttribute<PeriodoAcademico, Date> fechaTopeInclusion;
    public static volatile SingularAttribute<PeriodoAcademico, Integer> id;
    public static volatile ListAttribute<PeriodoAcademico, Seccion> secciones;
    public static volatile SingularAttribute<PeriodoAcademico, Date> fechaTopeRetiro;

}