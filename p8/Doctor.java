package p8;

public class Doctor extends Hospital {
    public String doctorName;
    public String specialization;

    @Override
    public void showDetails() {
        super.showDetails();
        System.out.println("Doctor Name: " + doctorName);
        System.out.println("Specialization: " + specialization);
    }
}