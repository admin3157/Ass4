import p2.Result;
import p2.Student;

import java.util.Scanner;

public class P2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Result r = new Result();

        System.out.print("Enter Student Name: ");
        r.studentName = sc.nextLine();

        System.out.print("Enter Roll No: ");
        r.rollNo = sc.nextInt();

        System.out.print("Enter Marks: ");
        r.marks = sc.nextInt();

        r.calculateGrade();
        r.showResult();

        sc.close();
    }
}