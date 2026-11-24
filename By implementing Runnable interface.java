
class MyTask implements Runnable {

    public void run() {
        System.out.println("Runnable Thread Running");
    }

    public static void main(String[] args) {

        MyTask obj = new MyTask();

        Thread t = new Thread(obj);

        t.start();
    }
}
