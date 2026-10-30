
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

class Fan implements RemoteControl {
    public void turnOn() {
        System.out.println("Fan is ON");
    }

    public void turnOff() {
        System.out.println("Fan is OFF");
    }
}

public class Interface40 {
    public static void main(String[] args) {
        RemoteControl tv = new Television();
        RemoteControl fan = new Fan();

        tv.turnOn();
        tv.turnOff();

        fan.turnOn();
        fan.turnOff();
    }
}
