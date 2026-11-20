
class SharedData {
    int value;
    boolean available = false;

    synchronized void produce(int n)
            throws InterruptedException {

        while (available) {
            wait();
        }

        value = n;
        available = true;

        System.out.println("Produced: " + value);

        notifyAll();
    }

    synchronized void consume()
            throws InterruptedException {

        while (!available) {
            wait();
        }

        System.out.println("Consumed: " + value);

        available = false;

        notifyAll();
    }
}

public class ProducerConsumer {
    public static void main(String[] args) {

        SharedData data = new SharedData();

        Thread producer = new Thread(() -> {
            try {
                data.produce(100);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        Thread consumer = new Thread(() -> {
            try {
                data.consume();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        consumer.start();
        producer.start();
    }
}
