import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Lab10 {
    public static void main(String[] args) {
        String databaseURL = "jdbc:mysql://127.0.0.1:3306/int103_may2";
        String username = "root" ;
        String password = "";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(databaseURL, username, password);
            System.out.println("database connected");
            Statement statement = con.createStatement();
            String sql = "update Student set email = 'noansrnn@gmail.com' where studentID = 65130500107";
            statement.executeUpdate(sql);
        } catch (ClassNotFoundException e) {
            Logger.getLogger(dbprogramming3.class.getName()).log(Level.SEVERE, null, e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
