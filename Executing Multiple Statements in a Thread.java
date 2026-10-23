
class NumberThread extends Thread {
    public void run() {
        System.out.println("Thread:");

        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        NumberThread t = new NumberThread();
        t.start();
    }
}
