// package ucla.lab.notarius.utils;

// import java.io.IOException;
// import java.io.InputStream;
// import java.util.Properties;

// public class ConfigManager {
//     private NotariusConfig notariusConfig;

//     public ConfigManager() {
//         try (InputStream inputStream = ConfigManager.class.getClassLoader().getResourceAsStream("config.properties")) {
//             Properties properties = new Properties();
//             properties.load(inputStream);

//             String dbUrl = properties.getProperty("postgres.url");
//             String dbUsername = properties.getProperty("postgres.username");
//             String dbPassword = properties.getProperty("postgres.password");

//             this.notariusConfig = new NotariusConfig(dbUrl, dbUsername, dbPassword); 
//         } catch (IOException ex) {
//             // Handle the exception appropriately (log, throw custom exception, etc.)
//             ex.printStackTrace();
//         }
//     }

//     public NotariusConfig getNotariusConfig() {
//         return notariusConfig;
//     }
// }

