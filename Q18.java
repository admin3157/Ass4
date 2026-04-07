import Q18.Manager;

class Q18 {
    public static void main(String[] args) {
        Manager m = new Manager();
        m.empId = 1001;
        m.employeeName = "Suresh Kumar";
        m.baseSalary = 50000;
        m.bonusAmount = 10000;

        System.out.println("---Employee Details---");
        m.displayEmployeeDetails();
        System.out.println("Base Salary: " + m.baseSalary);
        System.out.println("HRA: " + m.calculateHRA());
        System.out.println("DA: " + m.calculateDA());
        System.out.println("Gross Salary (with Bonus): " + m.calculateGrossSalary());
    }
}