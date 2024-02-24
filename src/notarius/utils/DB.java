package notarius.utils;
import java.util.HashMap;
import java.util.Map;
import javax.persistence.spi.PersistenceUnitTransactionType;
import notarius.controllers.Controller;
import static org.eclipse.persistence.config.PersistenceUnitProperties.JDBC_DRIVER;
import static org.eclipse.persistence.config.PersistenceUnitProperties.JDBC_PASSWORD;
import static org.eclipse.persistence.config.PersistenceUnitProperties.JDBC_URL;
import static org.eclipse.persistence.config.PersistenceUnitProperties.JDBC_USER;
import static org.eclipse.persistence.config.PersistenceUnitProperties.LOGGING_LEVEL;
import static org.eclipse.persistence.config.PersistenceUnitProperties.TARGET_SERVER;
import org.eclipse.persistence.config.TargetServer;

public class DB {

    public void main() {
    Map properties = new HashMap();
 
// Ensure RESOURCE_LOCAL transactions is used.

    properties.put("RESOURCE_LOCAL",
      PersistenceUnitTransactionType.RESOURCE_LOCAL.name());
    
    // Configure the internal EclipseLink connection pool
    properties.put(JDBC_DRIVER, "org.postgresql.Driver");
    properties.put(JDBC_URL, "jdbc:postgresql:notarius");
    properties.put(JDBC_USER, "admin");
    properties.put(JDBC_PASSWORD, "admin");

    // Configure logging. FINE ensures all SQL is shown
    properties.put(LOGGING_LEVEL, "FINE");

    // Ensure that no server-platform is configured
    properties.put(TARGET_SERVER, TargetServer.None);
    
    Controller control = new Controller();
        
        
    }
    
    
 
}
   

