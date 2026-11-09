class MyRunnable implements Runnable {

    public void run() {

        for (int i = 1; i <= 5; i++) {

            System.out.println("Thread is executing");
        }
    }
}

public class RunnableDemo {

    public static void main(String[] args) {

        MyRunnable obj = new MyRunnable();

        Thread t = new Thread(obj);

        t.start();
    }
}
