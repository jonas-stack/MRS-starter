package easv.mrs.DAL.db;


public class MyDatabaseConnector {

<<<<<<< Updated upstream

    //Class will easv.mrs.be included when we start working on DATABASES
    /*
=======
    private static final String PROP_FILE = "config/config.settings";
    //Class will easv.mrs.be included when we start working on DATABASES

>>>>>>> Stashed changes
    private SQLServerDataSource dataSource;

    public MyDatabaseConnector()
    {
        dataSource = new SQLServerDataSource();
<<<<<<< Updated upstream
        dataSource.setServerName("");
        dataSource.setDatabaseName("");
        dataSource.setUser("");
        dataSource.setPassword("");
=======
        dataSource.setServerName(databaseProperties.getProperty("Server"));
        dataSource.setDatabaseName(databaseProperties.getProperty("Database"));
        dataSource.setUser(databaseProperties.getProperty("User"));
        dataSource.setPassword(databaseProperties.getProperty("Password"));
>>>>>>> Stashed changes
        dataSource.setPortNumber(1433);
    }

    public Connection getConnection() throws SQLServerException {
        return dataSource.getConnection();
    }


    public static void main(String[] args) throws SQLException {

        MyDatabaseConnector databaseConnector = new MyDatabaseConnector();

        try (Connection connection = databaseConnector.getConnection()) {

            System.out.println("Is it open? " + !connection.isClosed());

        } //Connection gets closed here
    }
<<<<<<< Updated upstream
    */

=======
>>>>>>> Stashed changes
}
