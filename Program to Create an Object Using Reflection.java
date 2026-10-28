
import java.lang.reflect.*;

class Car {
    public Car() {
        System.out.println("Car object created");
    }

    public void start() {
        System.out.println("Car started");
    }
}

public class ObjectCreateDemo {
    public static void main(String[] args) throws Exception {
        Class<?> c = Car.class;

        Constructor<?> con = c.getDeclaredConstructor();

        Object obj = con.newInstance();

        Method m = c.getMethod("start");
        m.invoke(obj);
    }
}
