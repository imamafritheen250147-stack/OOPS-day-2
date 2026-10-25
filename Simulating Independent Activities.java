
class Runner extends Thread {
    Runner(String name) {
        super(name);
    }

    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(getName() + " Running...");

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                return;
            }
        }
    }

    public static void main(String[] args) {
        Runner r1 = new Runner("Runner A");
        Runner r2 = new Runner("Runner B");

        r1.start();
        r2.start();
    }
}
