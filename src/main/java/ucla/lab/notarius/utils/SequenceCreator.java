import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import ucla.lab.notarius.utils.NotariusConfig;

public class SequenceCreator {
    public static void main(String[] args) {
        NotariusConfig nc = new NotariusConfig();
        String dbUrl = nc.getPostgresUrl();
        String user = nc.getPostgresUsername();
        String password = nc.getPostgresPassword();

        try (Connection connection = DriverManager.getConnection(dbUrl, user, password)) {
            createSequenceIfNotExist(connection, "Calificacion_Seq");
            createSequenceIfNotExist(connection, "Carrera_Seq");
createSequenceIfNotExist(connection, "Decanato_Seq");
createSequenceIfNotExist(connection, "Estudiante_Seq");
createSequenceIfNotExist(connection, "Inscripcion_Seq");
createSequenceIfNotExist(connection, "Materia_Seq");
createSequenceIfNotExist(connection, "PeriodoAcademico_Seq");
createSequenceIfNotExist(connection, "Profesor_Seq");
createSequenceIfNotExist(connection, "Usuario_Seq");
// Example
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void createSequenceIfNotExist(Connection connection, String sequenceName) throws SQLException {
        DatabaseMetaData metadata = connection.getMetaData();
        ResultSet resultSet = metadata.getTables(null, null, sequenceName.toUpperCase(), new String[]{"SEQUENCE"});

        // Check if sequence exists
        if (!resultSet.next()) {
            // Sequence doesn't exist, create it
            String createSequenceSql = "CREATE SEQUENCE " + sequenceName + " START WITH 1 INCREMENT BY 1";
            try (Statement statement = connection.createStatement()) {
                statement.executeUpdate(createSequenceSql);
            }
        } else {
            System.out.println("Sequence " + sequenceName + " already exists.");
        }
    }
}
