import java.sql.*;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;



public class dbprogramming3 {
    public static void main(String[] args) {
        String databaseURL = "jdbc:mysql://127.0.0.1:3306/int103_may2";
        String username = "root" ;
        String password = "";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("driver is loaded");
            Connection con = DriverManager.getConnection(databaseURL, username, password);
            System.out.println("database connected");
            Statement statement = con.createStatement();
            String sql = "select * from Student";
            ResultSet result = statement.executeQuery(sql);
            while (result.next()){
            System.out.println(result.getString(1) + " " + result.getString(2) + " " + result.getString(3) + " " + result.getString(4));
            }
        } catch (ClassNotFoundException e) {
            Logger.getLogger(dbprogramming3.class.getName()).log(Level.SEVERE, null, e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
