class Person {
    String name;

    void displayName() {
        System.out.println("Name: " + name);
    }
}

class Doctor extends Person {
    String specialization;

    void displayDoctor() {
        System.out.println("Specialization: " + specialization);
    }
}

public class Main {
    public static void main(String[] args) {
        Doctor d = new Doctor();

        d.name = "Dr. Kumar";
        d.specialization = "Cardiology";

        d.displayName();
        d.displayDoctor();
    }
}
