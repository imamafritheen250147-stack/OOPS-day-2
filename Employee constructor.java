class Employee {
    String name;
    int salary;

    Employee(String n, int s) {
        name = n;
        salary = s;
    }

    void display() {
        System.out.println("Employee: " + name);
        System.out.println("Salary: ₹" + salary);
    }
}

public class Main {
    public static void main(String[] args) {
        Employee e = new Employee("Rahul", 30000);

        e.display();
    }
}
