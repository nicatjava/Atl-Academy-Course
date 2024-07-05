package lesson24;

public class DBConnection {
    private static DBConnection dbConnection;
    private static String queryHistory = "Query History:";

    public static DBConnection getDBConnection() {
        if (dbConnection == null) {
            dbConnection = new DBConnection();
        }
        return dbConnection;
    }

    private DBConnection() {
    }

}
