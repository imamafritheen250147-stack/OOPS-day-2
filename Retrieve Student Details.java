
import java.sql.*;

public class JDBC3 {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/college",
                "root",
                "your_password"
            );

            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery(
                "SELECT * FROM Student"
            );

            System.out.println("Student Details");

            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id"));
                System.out.println("Name: " + rs.getString("name"));
                System.out.println("Department: "
                                   + rs.getString("department"));
            }

            rs.close();
            st.close();
            con.close();
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
