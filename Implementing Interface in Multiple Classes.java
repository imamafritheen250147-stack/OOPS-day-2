interface Animal {
    void makeSound();
}

class Dog implements Animal {
    public void makeSound() {
        System.out.println("Dog says: Bark");
    }
}

class Cat implements Animal {
    public void makeSound() {
        System.out.println("Cat says: Meow");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        Cat c = new Cat();

        d.makeSound();
        c.makeSound();
    }
}
