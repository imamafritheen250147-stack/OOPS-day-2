
import java.sql.*;
import java.util.Scanner;

public class JDBC7 {
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
                "DELETE FROM Student WHERE id=?"
            );

            ps.setInt(1, id);

            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Record Deleted Successfully");
            } else {
                System.out.println("Student Not Found");
            }

            ps.close();
            con.close();
            sc.close();
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
