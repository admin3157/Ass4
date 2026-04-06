package p15;

public class Result extends Student {

    private int marks;
    private String grade;

    
    public void setMarks(int marks) {
        this.marks = marks;
    }

    
    public void calculateGrade() {
        if (marks >= 80) {
            grade = "A";
        } else if (marks >= 60) {
            grade = "B";
        } else if (marks >= 40) {
            grade = "C";
        } else {
            grade = "Fail";
        }
    }

    
    @Override
    public void showDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + grade);
    }

    
    public void setPersonDetails(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setStudentDetails(int rollNo) {
        this.rollNo = rollNo;
    }
}