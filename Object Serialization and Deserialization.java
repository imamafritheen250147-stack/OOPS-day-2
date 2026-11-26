
import java.io.*;

class Student implements Serializable {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class SerializationDemo {
    public static void main(String[] args) {

        Student s1 = new Student(101, "Arun");

        try {
            ObjectOutputStream out =
                new ObjectOutputStream(
                    new FileOutputStream("student.dat"));

            out.writeObject(s1);
            out.close();

            ObjectInputStream in =
                new ObjectInputStream(
                    new FileInputStream("student.dat"));

            Student s2 = (Student) in.readObject();
            in.close();

            System.out.println("ID: " + s2.id);
            System.out.println("Name: " + s2.name);

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("File Error");
        }
    }
}
