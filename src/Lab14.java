import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Lab14 {
    public static void main(String[] args) {
        String databaseURL = "jdbc:mysql://127.0.0.1:3306/int103_may2";
        String username = "root" ;
        String password = "";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(databaseURL, username, password);
            DatabaseMetaData meta = con.getMetaData();
            System.out.println("database URL: " + meta.getURL());
            System.out.println("database product name: " + meta.getDatabaseProductName()); System.out.println("database product version: " +
                    meta.getDatabaseProductVersion());
            System.out.println("JDBC driver name: " + meta.getDriverName());
            System.out.println("JDBC driver version: " + meta.getDriverVersion());
            System.out.println("JDBC driver major version: " + meta.getDriverMajorVersion());
            System.out.println("JDBC driver minor version: " + meta.getDriverMinorVersion());
            System.out.println("Max number of connections: " + meta.getMaxConnections());
            System.out.println("Max number of columns per table: " + meta.getMaxColumnsInTable());
            con.close();
        } catch (ClassNotFoundException e) {
            Logger.getLogger(dbprogramming3.class.getName()).log(Level.SEVERE, null, e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}