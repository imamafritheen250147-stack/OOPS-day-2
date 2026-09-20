import java.util.Scanner;

class Employee {
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void getData() {
        System.out.println("Employee data received.");
    }

    void displayData() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.printf("Monthly Salary: %.2f%n", salary);
    }

    double annualSalary() {
        return salary * 12;
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

        System.out.print("Enter monthly salary: ");
        double salary = sc.nextDouble();

        if (salary < 0) {
            System.out.println("Salary cannot be negative.");
            return;
        }

        Employee emp = new Employee(id, name, salary);

        emp.getData();
        emp.displayData();

        System.out.printf("Annual Salary: %.2f%n", emp.annualSalary());
    }
}
