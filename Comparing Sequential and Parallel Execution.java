
class Task implements Runnable {
    private String name;

    Task(String name) {
        this.name = name;
    }

    public void run() {
        System.out.println(name + " Started");

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
            return;
        }

        System.out.println(name + " Completed");
    }
}

class ExecutionDemo {
    public static void main(String[] args) {
        System.out.println("Sequential Execution");

        Task t1 = new Task("Task 1");
        Task t2 = new Task("Task 2");

        t1.run();
        t2.run();

        System.out.println("Parallel Execution");

        Thread th1 = new Thread(t1);
        Thread th2 = new Thread(t2);

        th1.start();
        th2.start();
    }
}
