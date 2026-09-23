import java.util.Scanner;

class Employee {
    int id;
    String name;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void displayEmployee() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
    }
}

class Worker extends Employee {
    double salary;

    Worker(int id, String name, double salary) {
        super(id, name);
        this.salary = salary;
    }

    void displayWorker() {
        System.out.printf("Salary: %.2f%n", salary);
    }
}

class Manager extends Worker {
    String department;

    Manager(int id, String name, double salary, String department) {
        super(id, name, salary);
        this.department = department;
    }

    void displayManager() {
        System.out.println("Department: " + department);
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter employee ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter employee name: ");
        String name = sc.nextLine();

        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter department: ");
        String department = sc.nextLine();

        if (salary < 0) {
            System.out.println("Salary cannot be negative.");
            return;
        }

        Manager m = new Manager(id, name, salary, department);

        System.out.println("\nManager Details");
        m.displayEmployee();
        m.displayWorker();
        m.displayManager();
    }
}