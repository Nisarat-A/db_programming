import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Lab15 {
    public static void main(String[] args) {
        String databaseURL = "jdbc:mysql://127.0.0.1:3306/int103_may2";
        String username = "root" ;
        String password = "";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(databaseURL, username, password);
            Statement statement = con.createStatement();
            String sql = "select * from Student";
            ResultSet result = statement.executeQuery(sql);
            ResultSetMetaData rsMetaData = result.getMetaData();
            for (int i = 1; i <= rsMetaData.getColumnCount(); i++) {
                System.out.print(rsMetaData.getColumnName(i) + " ");
            }
        } catch (ClassNotFoundException e) {
            Logger.getLogger(dbprogramming3.class.getName()).log(Level.SEVERE, null, e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}