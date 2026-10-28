
import java.lang.reflect.*;

class Student {
    private int id;
    private String name;

    public Student() {
    }

    public void display() {
        System.out.println("Student Details");
    }

    public int getId() {
        return id;
    }
}

public class ReflectionDemo {
    public static void main(String[] args) {
        Student s = new Student();

        Class<?> c = s.getClass();

        System.out.println("Class Name: " + c.getName());

        System.out.println("\nMethods:");
        Method[] methods = c.getDeclaredMethods();

        for (Method m : methods) {
            System.out.println(m.getName());
        }

        System.out.println("\nConstructors:");
        Constructor<?>[] constructors =
                c.getDeclaredConstructors();

        for (Constructor<?> con : constructors) {
            System.out.println(con.getName());
        }
    }
}
