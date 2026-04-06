package p2;

public class Result extends Student {
    String grade;

    public void calculateGrade() {
        if (marks >= 75) {
            grade = "Distinction";
        } else if (marks >= 60) {
            grade = "First Class";
        } else if (marks >= 50) {
            grade = "Second Class";
        } else {
            grade = "Fail";
        }
    }

    public void showResult() {
        showStudent();
        System.out.println("Grade: " + grade);
    }
}