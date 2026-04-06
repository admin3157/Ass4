import p15.Result;
import java.util.Scanner;

public class P15 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Result r = new Result();

        
        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        
        System.out.print("Enter Roll No: ");
        int rollNo = sc.nextInt();

        
        System.out.print("Enter Marks: ");
        int marks = sc.nextInt();

        
        r.setPersonDetails(name, age);
        r.setStudentDetails(rollNo);
        r.setMarks(marks);

        
        r.calculateGrade();

        
        System.out.println("\n--- Student Result ---");
        r.showDetails();
    }
}