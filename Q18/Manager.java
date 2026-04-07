package Q18;

public class Manager extends Employee {
    public double bonusAmount;

    @Override
    public double calculateGrossSalary() {
        return super.calculateGrossSalary() + bonusAmount;
    }
}