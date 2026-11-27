
class Student {
    String name;
    int marks;

    Student(String name) {
        this.name = name;
        marks = 0;
    }

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }
}

public class ConstructorOverloading {
    public static void main(String[] args) {

        Student s1 = new Student("Arun");
        Student s2 = new Student("Bala", 85);

        s1.display();
        System.out.println();

        s2.display();
    }
}
