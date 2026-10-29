
interface Printable {
    void print();
}

class Report implements Printable {
    public void print() {
        System.out.println("Printing report");
    }
}

public class InterfaceReflectionDemo {
    public static void main(String[] args) {
        Class<?> c = Report.class;

        Class<?>[] interfaces = c.getInterfaces();

        System.out.println("Class: " + c.getName());

        for (Class<?> i : interfaces) {
            System.out.println(
                "Implemented Interface: " + i.getName()
            );
        }

        System.out.println(
            "Implements Printable: " +
            Printable.class.isAssignableFrom(c)
        );
    }
}
