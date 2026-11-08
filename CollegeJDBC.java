
import java.sql.*;
import java.util.Scanner;

public class CollegeJDBC {

    static final String URL =
        "jdbc:mysql://localhost:3306/college";
    static final String USER = "root";
    static final String PASS = "your_password";

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con =
                DriverManager.getConnection(URL, USER, PASS);

            System.out.println("Database Connected Successfully");

            DatabaseMetaData db = con.getMetaData();
            System.out.println("Connected to Database: "
                               + con.getCatalog());

            int choice;

            do {
                System.out.println("\n1. Insert Student");
                System.out.println("2. Display Students");
                System.out.println("3. Update Student");
                System.out.println("4. Delete Student");
                System.out.println("5. Search Student by Name");
                System.out.println("6. Search Student by ID");
                System.out.println("7. Count Total Records");
                System.out.println("8. Exit");

                System.out.print("Choose Option: ");
                choice = sc.nextInt();
                sc.nextLine();

                switch (choice) {

                    case 1:
                        System.out.print("Enter Student ID: ");
                        int id = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter Student Name: ");
                        String name = sc.nextLine();

                        System.out.print("Enter Department: ");
                        String dept = sc.nextLine();

                        PreparedStatement ps1 = con.prepareStatement(
                            "INSERT INTO Student VALUES(?,?,?)");

                        ps1.setInt(1, id);
                        ps1.setString(2, name);
                        ps1.setString(3, dept);

                        int a = ps1.executeUpdate();

                        if (a > 0)
                            System.out.println(
                                "Student Record Inserted Successfully");

                        ps1.close();
                        break;

                    case 2:
                        Statement st = con.createStatement();

                        ResultSet rs = st.executeQuery(
                            "SELECT * FROM Student");

                        System.out.println("Student Details");

                        while (rs.next()) {
                            System.out.println("ID: "
                                + rs.getInt("id"));
                            System.out.println("Name: "
                                + rs.getString("name"));
                            System.out.println("Department: "
                                + rs.getString("department"));
                        }

                        rs.close();
                        st.close();
                        break;

                    case 3:
                        System.out.print("Enter Student ID: ");
                        int uid = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter New Department: ");
                        String newDept = sc.nextLine();

                        PreparedStatement ps2 = con.prepareStatement(
                            "UPDATE Student SET department=? WHERE id=?");

                        ps2.setString(1, newDept);
                        ps2.setInt(2, uid);

                        int b = ps2.executeUpdate();

                        if (b > 0)
                            System.out.println(
                                "Record Updated Successfully");
                        else
                            System.out.println("Student Not Found");

                        ps2.close();
                        break;

                    case 4:
                        System.out.print("Enter Student ID: ");
                        int did = sc.nextInt();

                        PreparedStatement ps3 = con.prepareStatement(
                            "DELETE FROM Student WHERE id=?");

                        ps3.setInt(1, did);

                        int c = ps3.executeUpdate();

                        if (c > 0)
                            System.out.println(
                                "Record Deleted Successfully");
                        else
                            System.out.println("Student Not Found");

                        ps3.close();
                        break;

                    case 5:
                        System.out.print("Enter Student Name: ");
                        String searchName = sc.nextLine();

                        PreparedStatement ps4 = con.prepareStatement(
                            "SELECT * FROM Student WHERE name=?");

                        ps4.setString(1, searchName);

                        ResultSet rs2 = ps4.executeQuery();

                        if (rs2.next()) {
                            System.out.println("Student Found");
                            System.out.println("ID: "
                                + rs2.getInt("id"));
                            System.out.println("Name: "
                                + rs2.getString("name"));
                            System.out.println("Department: "
                                + rs2.getString("department"));
                        } else {
                            System.out.println("Student Not Found");
                        }

                        rs2.close();
                        ps4.close();
                        break;

                    case 6:
                        System.out.print("Enter Student ID: ");
                        int sid = sc.nextInt();

                        PreparedStatement ps5 = con.prepareStatement(
                            "SELECT * FROM Student WHERE id=?");

                        ps5.setInt(1, sid);

                        ResultSet rs3 = ps5.executeQuery();

                        if (rs3.next()) {
                            System.out.println("Student Details");
                            System.out.println("ID: "
                                + rs3.getInt("id"));
                            System.out.println("Name: "
                                + rs3.getString("name"));
                            System.out.println("Department: "
                                + rs3.getString("department"));
                        } else {
                            System.out.println("Student Not Found");
                        }

                        rs3.close();
                        ps5.close();
                        break;

                    case 7:
                        Statement st2 = con.createStatement();

                        ResultSet rs4 = st2.executeQuery(
                            "SELECT COUNT(*) FROM Student");

                        if (rs4.next()) {
                            System.out.println(
                                "Total Number of Students = "
                                + rs4.getInt(1));
                        }

                        rs4.close();
                        st2.close();
                        break;

                    case 8:
                        System.out.println("Exiting Application");
                        break;

                    default:
                        System.out.println("Invalid Option");
                }

            } while (choice != 8);

            con.close();
            sc.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
