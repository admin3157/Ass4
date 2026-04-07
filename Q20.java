import Q20.Library;

class Q20 {
    public static void main(String[] args) {
        Library obj = new Library();

        obj.studentName = "Amit Kumar";
        obj.bookName = "Java Programming";

        obj.showBookInfo();

        int days = 10;
        double totalFine = obj.calculateFine(days);

        System.out.println("Late Days: " + days);
        System.out.println("Total Fine: ₹" + totalFine);
    }
}