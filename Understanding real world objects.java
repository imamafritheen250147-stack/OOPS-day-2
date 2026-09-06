class Fan {
    String brand;
    int speed;

    void switchOn() {
        System.out.println(brand + " fan switched ON at speed" + speed);
    }

    void switchOff() {
        System.out.println(brand + " fan switched OFF");
    }
}

class Main {
    public static void main(String[] args) {
        Fan f = new Fan();

        f.brand = "Havells";
        f.speed = 3;

        f.switchOn();
        f.switchOff();
    }
}
