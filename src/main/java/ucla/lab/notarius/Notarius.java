/*
zar Sánchez CI: 28.316.086
Anthony Moreno CI: 28.204.620
Angel Goyo CI: 29.737.583
Miller Arias CI: 29.561.941
Luis Ochoa CI: 29.778.672
*/

package ucla.lab.notarius;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import ucla.lab.notarius.controllers.Controller;

public class Notarius {
    public static void main(String[] args) {



        EntityManagerFactory managerFactory = null;
        Map<String, String> persistenceMap = new HashMap<String, String>();

        persistenceMap.put("javax.persistence.jdbc.url", "jdbc:postgresql://localhost:5432/notarius");
        persistenceMap.put("javax.persistence.jdbc.user", "postgres");
        persistenceMap.put("javax.persistence.jdbc.password", "");
        persistenceMap.put("javax.persistence.jdbc.driver", "org.postgresql.Driver");

        managerFactory = Persistence.createEntityManagerFactory("notariusPU", persistenceMap);
        
        Controller control = new Controller(managerFactory);

    }
}
