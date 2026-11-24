class Employee {
    double baseSalary;

    double calculateSalary() {
        return baseSalary;
    }
}

class SalesEmployee extends Employee {
    double bonus;

    @Override
    double calculateSalary() {
        return super.calculateSalary() + bonus;
    }
}

public class salary{
    public static void main(String[] args) {
        SalesEmployee emp = new SalesEmployee();
        emp.baseSalary = 45000.0;
        emp.bonus = 12000.0;

        System.out.println("Total Calculated Salary: " + emp.calculateSalary());
    }
}