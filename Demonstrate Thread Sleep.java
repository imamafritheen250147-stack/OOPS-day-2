
class SleepThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
                return;
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        SleepThread t = new SleepThread();
        t.start();
    }
}
