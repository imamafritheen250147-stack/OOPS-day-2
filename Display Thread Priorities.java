
class PriorityDemo extends Thread {
    PriorityDemo(String name, int priority) {
        super(name);
        setPriority(priority);
    }

    public void run() {
        System.out.println(
            getName() + " Priority: " + getPriority()
        );
    }

    public static void main(String[] args) {
        PriorityDemo t1 = new PriorityDemo("Thread A", 3);
        PriorityDemo t2 = new PriorityDemo("Thread B", 5);
        PriorityDemo t3 = new PriorityDemo("Thread C", 8);

        t1.start();
        t2.start();
        t3.start();
    }
}
