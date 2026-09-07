class Student {
    String name;
    int rollNumber;

    void display() {
        System.out.println("Name: " + name +
                           ", Roll Number: " + rollNumber);
    }
}

class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();

        s1.name = "Arjun";
        s1.rollNumber = 101;

        s2.name = "Priya";
        s2.rollNumber = 102;

        s1.display();
        s2.display();
    }
}
