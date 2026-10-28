
import java.lang.reflect.*;

class Employee {
    private String name = "Arun";
}

public class PrivateFieldDemo {
    public static void main(String[] args) throws Exception {
        Employee e = new Employee();

        Class<?> c = e.getClass();

        Field f = c.getDeclaredField("name");
        f.setAccessible(true);

        System.out.println("Original Name: " + f.get(e));

        f.set(e, "Rahul");

        System.out.println("Modified Name: " + f.get(e));
    }
}
