package p8;

public class Patient extends Doctor {
    public String patientName;
    public double consultationFee;

    @Override
    public void showDetails() {
        super.showDetails();

        double finalFee = consultationFee;

        if (consultationFee >= 1000) {
            double discount = consultationFee * 0.10;
            finalFee = consultationFee - discount;
            System.out.println("10% Discount Applied: " + discount);
        }

        System.out.println("Patient Name: " + patientName);
        System.out.println("Consultation Fee: " + finalFee);
    }
}