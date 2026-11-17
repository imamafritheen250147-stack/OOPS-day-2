
import java.util.ArrayList;

public class StudentList {
    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();

        students.add("Arun");
        students.add("Bala");
        students.add("Kumar");

        System.out.println("Student List: " + students);

        students.remove("Bala");

        System.out.println("Updated List: " + students);
    }
}
