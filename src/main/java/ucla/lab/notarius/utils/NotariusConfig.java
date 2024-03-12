package ucla.lab.notarius.utils;

public class NotariusConfig {
    private String postgresUrl;
    private String postgresUsername;
    private String postgresPassword;

    // Constructor
    public NotariusConfig(String postgresUrl, String postgresUsername, String postgresPassword) {
        this.postgresUrl = postgresUrl;
        this.postgresUsername = postgresUsername;
        this.postgresPassword = postgresPassword;
    }

    // Getters (no setters for immutability, optional)
    public String getPostgresUrl() {
        return postgresUrl;
    }

    public String getPostgresUsername() {
        return postgresUsername;
    }

    public String getpostgresPassword() {
        return postgresPassword;
    }
}
