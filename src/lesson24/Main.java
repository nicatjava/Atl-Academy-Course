package lesson24;

public class Main {
    public static void main(String[] args) {
        //Design Patterns-lerden
        // 1) Singleton
        DBConnection dbConnection = DBConnection.getDBConnection();
        System.out.println(dbConnection.hashCode());
        DBConnection dbConnection2 = DBConnection.getDBConnection();
        System.out.println(dbConnection2.hashCode());
        // var haqqinda arasdirmaq

        // 2) Abstract Factory (arasdirmaq)


    }
}
