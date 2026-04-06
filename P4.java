import p4.Employee;
import p4.FullTimeEmployee;
import p4.PartTimeEmployee;

import java.util.Scanner;

public class P4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        FullTimeEmployee ft = new FullTimeEmployee();
        System.out.println("Enter Full Time Employee Details:");
        System.out.print("Name: ");
        ft.empName = sc.nextLine();

        System.out.print("Basic Salary: ");
        ft.basicSalary = sc.nextDouble();

        ft.calculateSalary();

        
        PartTimeEmployee pt = new PartTimeEmployee();
        sc.nextLine(); // clear buffer

        System.out.println("\nEnter Part Time Employee Details:");
        System.out.print("Name: ");
        pt.empName = sc.nextLine();

        System.out.print("Hours Worked: ");
        pt.hoursWorked = sc.nextInt();

        System.out.print("Hourly Rate: ");
        pt.hourlyRate = sc.nextDouble();

        pt.calculateSalary();

        sc.close();
    }
}