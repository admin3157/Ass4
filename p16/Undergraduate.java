package p16;

public class Undergraduate extends University {

    private int marks;

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public void checkEligibility() {
        showUniversity();

        System.out.println("Undergraduate Marks: " + marks);

        if (marks >= 50) {
            System.out.println("Admission Eligible");
        } else {
            System.out.println("Admission Not Eligible");
        }
    }
}