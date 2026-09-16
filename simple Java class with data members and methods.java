class Student {
    String name;
    int rollNo;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNo);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s = new Student();

        s.name = "ABC";
        s.rollNo = 101;

        s.display();
    }
}
