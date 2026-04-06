import p14.Library;
import java.util.Scanner;

public class P14 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Library lib = new Library(3);

        lib.acceptBooks();
        lib.displayBooks();

        // Search Book
        System.out.print("\nEnter book name to search: ");
        String book = sc.nextLine();
        lib.searchBook(book);

        // Count books by author
        System.out.print("\nEnter author name to count books: ");
        String author = sc.nextLine();
        lib.countBooksByAuthor(author);
    }
}