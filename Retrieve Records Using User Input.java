
import java.sql.*;
import java.util.Scanner;

public class JDBC4 {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/college",
                "root",
                "your_password"
            );

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter Student ID: ");
            int id = sc.nextInt();

            PreparedStatement ps = con.prepareStatement(
                "SELECT * FROM Student WHERE id=?"
            );

            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                System.out.println("Student Details");
                System.out.println("ID: " + rs.getInt("id"));
                System.out.println("Name: " + rs.getString("name"));
                System.out.println("Department: "
                                   + rs.getString("department"));
            } else {
                System.out.println("Student Not Found");
            }

            rs.close();
            ps.close();
            con.close();
            sc.close();
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
