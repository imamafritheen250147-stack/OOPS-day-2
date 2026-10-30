
class First extends Thread {
    public void run() {
        System.out.println("Hello from Thread 1");
    }
}

class Second extends Thread {
    public void run() {
        System.out.println("Hello from Thread 2");
    }
}

public class Main {
    public static void main(String[] args) {
        First t1 = new First();
        Second t2 = new Second();

        t1.start();
        t2.start();
    }
}
