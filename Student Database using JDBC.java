
import java.sql.*;

public class StudentDatabase {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/college";
        String user = "root";
        String password = "your_password";

        try {
            Connection con =
                DriverManager.getConnection(url, user, password);

            String insert =
                "INSERT INTO student VALUES (?, ?, ?)";

            PreparedStatement ps = con.prepareStatement(insert);

            ps.setInt(1, 101);
            ps.setString(2, "Arun");
            ps.setInt(3, 85);

            ps.executeUpdate();

            System.out.println("Record Inserted");

            Statement st = con.createStatement();

            ResultSet rs =
                st.executeQuery("SELECT * FROM student");

            while (rs.next()) {
                System.out.println(
                    rs.getInt(1) + " " +
                    rs.getString(2) + " " +
                    rs.getInt(3)
                );
            }

            rs.close();
            st.close();
            ps.close();
            con.close();

        } catch (SQLException e) {
            System.out.println("Database Error: " + e.getMessage());
        }
    }
}
