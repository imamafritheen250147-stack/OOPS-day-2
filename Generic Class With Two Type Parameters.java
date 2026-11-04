
class Student<T, U> {
    T name;
    U marks;

    Student(T name, U marks) {
        this.name = name;
        this.marks = marks;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }
}

public class Generic23 {
    public static void main(String[] args) {
        Student<String, Integer> s =
            new Student<>("Arun", 95);

        s.display();
    }
}
