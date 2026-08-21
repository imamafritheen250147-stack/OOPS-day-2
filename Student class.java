class Student {
    String name;
    int rollNo;
    int marks;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks: " + marks);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s = new Student();

        s.name = "Imam";
        s.rollNo = 101;
        s.marks = 85;

        s.display();
    }
}
