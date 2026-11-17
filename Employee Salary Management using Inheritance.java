
class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
}

class Manager extends Employee {
    double bonus;

    Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Basic Salary: " + salary);
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Salary: " + (salary + bonus));
    }
}

public class EmployeeSalary {
    public static void main(String[] args) {
        Manager m = new Manager("Arun", 30000, 5000);
        m.display();
    }
}
