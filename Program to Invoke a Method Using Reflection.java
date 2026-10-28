
import java.lang.reflect.*;

class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
}

public class MethodInvokeDemo {
    public static void main(String[] args) throws Exception {
        Calculator obj = new Calculator();

        Class<?> c = obj.getClass();

        Method m = c.getMethod(
                "add", int.class, int.class);

        Object result = m.invoke(obj, 10, 20);

        System.out.println("Sum: " + result);
    }
}
