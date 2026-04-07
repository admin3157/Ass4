package Q20;

public class Library implements BookDetails, FineCalculator {
    public String bookName;
    public String studentName;

    @Override
    public void showBookInfo() {
        System.out.println("---Book Details---");
        System.out.println("Student Name: " + studentName);
        System.out.println("Book Name: " + bookName);
    }

    @Override
    public double calculateFine(int lateDays) {

        double fine = lateDays * 10;

        if (lateDays > 7) {
            fine = fine + 50;
        }
        return fine;
    }
}