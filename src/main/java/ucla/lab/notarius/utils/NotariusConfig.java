package ucla.lab.notarius.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class NotariusConfig {
    private String postgresUrl;
    private String postgresUsername;
    private String postgresPassword;
    private String postgresDriver;
    private String postgresSchemaGenerationDatabaseAction;

    // Constructor
    public NotariusConfig(String postgresUrl, String postgresUsername, String postgresPassword, String postgresDriver, String postgresSchemaGenerationDatabaseAction) {
        this.postgresUrl = postgresUrl;
        this.postgresUsername = postgresUsername;
        this.postgresPassword = postgresPassword;
        this.postgresDriver = postgresDriver;
        this.postgresSchemaGenerationDatabaseAction = postgresSchemaGenerationDatabaseAction;
    }
    
    public NotariusConfig() {
         try (InputStream inputStream = NotariusConfig.class.getClassLoader().getResourceAsStream("config.properties")) {
            Properties properties = new Properties();
            properties.load(inputStream);

            this.postgresUrl = properties.getProperty("postgres.url");
            this.postgresUsername = properties.getProperty("postgres.username");
            this.postgresPassword = properties.getProperty("postgres.password");
            this.postgresDriver = properties.getProperty("postgres.Driver");
            this.postgresSchemaGenerationDatabaseAction = properties.getProperty("postgres.schema-generation.database.action");

            
        } catch (IOException ex) {
            // Handle the exception appropriately (log, throw custom exception, etc.)
            ex.printStackTrace();
        }
    }

    // Getters (no setters for immutability, optional)
    public String getPostgresUrl() {
        return postgresUrl;
    }

    public String getPostgresUsername() {
        return postgresUsername;
    }

    public String getPostgresPassword() {
        return postgresPassword;
    }

    public String getPostgresDriver () {
        return postgresDriver;
    }

    public String getPostgresSchemaGenerationDatabaseAction () {
        return postgresSchemaGenerationDatabaseAction;
    }
}
