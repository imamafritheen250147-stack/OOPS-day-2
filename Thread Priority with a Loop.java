
class LoopPriority extends Thread {
    LoopPriority(String name, int priority) {
        super(name);
        setPriority(priority);
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + " : " + i);
        }
    }

    public static void main(String[] args) {
        LoopPriority t1 = new LoopPriority("Low", 2);
        LoopPriority t2 = new LoopPriority("Normal", 5);
        LoopPriority t3 = new LoopPriority("High", 9);

        t1.start();
        t2.start();
        t3.start();
    }
}
