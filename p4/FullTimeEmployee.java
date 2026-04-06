package p4;

public class FullTimeEmployee extends Employee {
    public double bonus;

    @Override
    public void calculateSalary() {
        if (basicSalary >= 30000) {
            bonus = 5000;
        } else {
            bonus = 2000;
        }

        double totalSalary = basicSalary + bonus;

        System.out.println("Full Time Employee");
        System.out.println("Name: " + empName);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Salary: " + totalSalary);
    }
}