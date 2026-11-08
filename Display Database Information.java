
import java.sql.*;

public class JDBC2 {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/college",
                "root",
                "your_password"
            );

            System.out.println("Connected to Database: "
                               + con.getCatalog());

            con.close();
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
