
import java.util.*;

interface Sortable {
    double getValue();
}

class Student implements Sortable {
    String name;
    double marks;

    Student(String name, double marks) {
        this.name = name;
        this.marks = marks;
    }

    public double getValue() {
        return marks;
    }

    public String toString() {
        return name + ": " + marks;
    }
}

public class Interface39 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Arun", 85));
        students.add(new Student("Bala", 70));
        students.add(new Student("Cathy", 95));

        students.sort(
            Comparator.comparingDouble(Student::getValue)
        );

        for (Student s : students)
            System.out.println(s);
    }
}
