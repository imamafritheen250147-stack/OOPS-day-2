
class PriorityLevels extends Thread {
    PriorityLevels(String name) {
        super(name);
    }

    public void run() {
        System.out.println(
            getName() + " = " + getPriority()
        );
    }

    public static void main(String[] args) {
        PriorityLevels t1 = new PriorityLevels("Low");
        PriorityLevels t2 = new PriorityLevels("Normal");
        PriorityLevels t3 = new PriorityLevels("High");

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
    }
}
