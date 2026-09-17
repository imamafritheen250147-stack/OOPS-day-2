class Dog {
    void sound() {
        System.out.println("Dog says: Bark");
    }
}

class Cat {
    void sound() {
        System.out.println("Cat says: Meow");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        Cat c = new Cat();

        d.sound();
        c.sound();
    }
}
