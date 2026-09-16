class Student {
    String name = "ABC";
    int rollNo = 101;

    void displayStudent() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNo);
    }
}

class Teacher {
    String name = "DCBA";
    String subject = "Java";

    void displayTeacher() {
        System.out.println("Teacher Name: " + name);
        System.out.println("Subject: " + subject);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s = new Student();
        Teacher t = new Teacher();

        s.displayStudent();
        t.displayTeacher();
    }
}
