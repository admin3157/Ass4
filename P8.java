import p8.Doctor;
import p8.Hospital;
import p8.Patient;

import java.util.Scanner;

public class P8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Patient p = new Patient();

        System.out.print("Enter Hospital Name: ");
        p.hospitalName = sc.nextLine();

        System.out.print("Enter Location: ");
        p.location = sc.nextLine();

        System.out.print("Enter Doctor Name: ");
        p.doctorName = sc.nextLine();

        System.out.print("Enter Specialization: ");
        p.specialization = sc.nextLine();

        System.out.print("Enter Patient Name: ");
        p.patientName = sc.nextLine();

        System.out.print("Enter Consultation Fee: ");
        p.consultationFee = sc.nextDouble();

        System.out.println("\n--- Details ---");
        p.showDetails();

        sc.close();
    }
}