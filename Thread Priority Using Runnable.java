
class Task implements Runnable {
    public void run() {
        System.out.println(
            Thread.currentThread().getName()
            + " Priority: "
            + Thread.currentThread().getPriority()
        );
    }

    public static void main(String[] args) {
        Task task = new Task();

        Thread t1 = new Thread(task, "Task A");
        Thread t2 = new Thread(task, "Task B");
        Thread t3 = new Thread(task, "Task C");

        t1.setPriority(2);
        t2.setPriority(6);
        t3.setPriority(10);

        t1.start();
        t2.start();
        t3.start();
    }
}
