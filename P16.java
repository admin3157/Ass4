import p16.Undergraduate;
import p16.Postgraduate;
import java.util.Scanner;

public class P16 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        
        Undergraduate ug = new Undergraduate();
        System.out.print("Enter University Name: ");
        String uni = sc.nextLine();

        ug.setUniversityName(uni);

        System.out.print("Enter Undergraduate Marks: ");
        int ugMarks = sc.nextInt();
        ug.setMarks(ugMarks);

        System.out.println("\n--- Undergraduate Admission ---");
        ug.checkEligibility();

        
        Postgraduate pg = new Postgraduate();

        pg.setUniversityName(uni);

        System.out.print("\nEnter Postgraduate Marks: ");
        int pgMarks = sc.nextInt();
        pg.setMarks(pgMarks);

        System.out.println("\n--- Postgraduate Admission ---");
        pg.checkEligibility();
    }
}