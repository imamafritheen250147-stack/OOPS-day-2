interface RemoteControl {
    void turnOn();
    void turnOff();
}

class Television implements RemoteControl {
    public void turnOn() {
        System.out.println("Television is ON");
    }

    public void turnOff() {
        System.out.println("Television is OFF");
    }
}

public class Main {
    public static void main(String[] args) {
        Television tv = new Television();

        tv.turnOn();
        tv.turnOff();
    }
}
