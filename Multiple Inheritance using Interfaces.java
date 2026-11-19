interface Printable {
    void print();
}

interface Scannable {
    void scan();
}

class SmartMachine implements Printable, Scannable {

    public void print() {
        System.out.println("Printing Document");
    }

    public void scan() {
        System.out.println("Scanning Document");
    }
}

public class MultipleInterface {
    public static void main(String[] args) {

        SmartMachine s = new SmartMachine();

        s.print();
        s.scan();
    }
}
