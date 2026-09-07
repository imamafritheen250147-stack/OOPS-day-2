class Student {
    String name;
    int rollNumber;

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
    }
}

class Main {
    public static void main(String[] args) {
        Student s = new Student();

        s.name = "Priya";
        s.rollNumber = 102;

        s.displayDetails();
    }
}
