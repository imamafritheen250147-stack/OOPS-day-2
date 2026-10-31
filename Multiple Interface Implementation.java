
interface Printable {
    void print();
}

interface Showable {
    void show();
}

class Demo implements Printable, Showable {
    public void print() {
        System.out.println("Printing document");
    }

    public void show() {
        System.out.println("Showing document");
    }
}

public class Interface35 {
    public static void main(String[] args) {
        Demo d = new Demo();
        d.print();
        d.show();
    }
}
