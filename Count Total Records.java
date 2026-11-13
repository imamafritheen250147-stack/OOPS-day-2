
import java.sql.*;

public class JDBC8 {
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
                "SELECT COUNT(*) FROM Student"
            );

            if (rs.next()) {
                System.out.println(
                    "Total Number of Students = " + rs.getInt(1)
                );
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
