package Q21;

public class ResultSystem implements TheoryMarks, PracticalMarks {
    public int theory;
    public int practical;

    @Override
    public void getTheoryMarks(int marks) {
        this.theory = marks;
    }

    @Override
    public void getPracticalMarks(int marks) {
        this.practical = marks;
    }

    public void showResult() {
        System.out.println("---College Result---");
        int total = theory + practical;
        System.out.println("Theory: " + theory);
        System.out.println("Practical: " + practical);
        System.out.println("Total: " + total);

        if (total >= 75) {
            System.out.println("Result: Distinction");
        } else if (total >= 50) {
            System.out.println("Result: Pass");
        } else {
            System.out.println("Result: Fail");
        }
    }
}