
import java.sql.*;

public class DatabaseDemo {
    public static void main(String[] args) {

        try {
            // Step 1: Load driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Step 2: Establish connection
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/college",
                "root",
                "password"
            );

            System.out.println("Database Connected Successfully!");

            // Step 3: Create statement
            Statement st = con.createStatement();

            // Step 4: Execute query
            ResultSet rs = st.executeQuery(
                "SELECT * FROM student"
            );

            // Step 5: Display records
            while (rs.next()) {
                System.out.println(
                    rs.getInt("id") + " " +
                    rs.getString("name")
                );
            }

            // Step 6: Close connection
            rs.close();
            st.close();
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
