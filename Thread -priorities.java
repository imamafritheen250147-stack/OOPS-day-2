
class ThreadProperties {

    public static void main(String[] args) {

        Thread t = new Thread(() -> {

            System.out.println("Thread is executing");

        });

        // Set thread name
        t.setName("MyJavaThread");

        // Set thread priority
        t.setPriority(Thread.MAX_PRIORITY);

        // Display properties
        System.out.println("Thread Name: " + t.getName());

        System.out.println("Thread Priority: " + t.getPriority());

        System.out.println("Thread ID: " + t.getId());

        System.out.println("Thread State: " + t.getState());

        // Start thread
        t.start();

        System.out.println("Is Thread Alive: " + t.isAlive());
    }
}
