
interface Employee {
    double calculateSalary();
}

class PermanentEmployee implements Employee {
    double monthlySalary;

    PermanentEmployee(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public double calculateSalary() {
        return monthlySalary;
    }
}

class PartTimeEmployee implements Employee {
    int hours;
    double hourlyRate;

    PartTimeEmployee(int hours, double hourlyRate) {
        this.hours = hours;
        this.hourlyRate = hourlyRate;
    }

    public double calculateSalary() {
        return hours * hourlyRate;
    }
}

public class Interface38 {
    public static void main(String[] args) {
        Employee e1 = new PermanentEmployee(30000);
        Employee e2 = new PartTimeEmployee(80, 200);

        System.out.println("Permanent salary: "
                           + e1.calculateSalary());
        System.out.println("Part-time salary: "
                           + e2.calculateSalary());
    }
}
