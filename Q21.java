import java.util.Scanner;

import Q21.ResultSystem;

class Q21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ResultSystem rs = new ResultSystem();

        System.out.print("Enter Theory Marks: ");
        int t = sc.nextInt();
        rs.getTheoryMarks(t);

        System.out.print("Enter Practical Marks: ");
        int p = sc.nextInt();
        rs.getPracticalMarks(p);

        rs.showResult();
        sc.close();
    }
}