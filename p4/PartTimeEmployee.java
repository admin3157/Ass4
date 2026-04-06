package p4;

public class PartTimeEmployee extends Employee {
    public int hoursWorked;
    public double hourlyRate;

    @Override
    public void calculateSalary() {
        double salary = hoursWorked * hourlyRate;

        System.out.println("Part Time Employee");
        System.out.println("Name: " + empName);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Hourly Rate: " + hourlyRate);
        System.out.println("Total Salary: " + salary);
    }
}