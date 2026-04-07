package Q18;

public class Employee implements EmployeeDetails, SalaryCalculations {
    public String employeeName;
    public int empId;
    public double baseSalary;

    @Override
    public void displayEmployeeDetails() {
        System.out.println("ID: " + empId + " | Name: " + employeeName);
    }

    @Override
    public double calculateHRA() {
        return baseSalary * 0.20;
    }

    @Override
    public double calculateDA() {
        return baseSalary * 0.10;
    }

    @Override
    public double calculateGrossSalary() {
        return baseSalary + calculateHRA() + calculateDA();
    }
}