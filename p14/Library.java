package p14;

import java.util.Scanner;

public class Library {

    String bookNames[];
    String authorNames[];
    int totalBooks;

    // Constructor
    public Library(int totalBooks) {
        this.totalBooks = totalBooks;
        bookNames = new String[totalBooks];
        authorNames = new String[totalBooks];
    }

    // Accept book details
    public void acceptBooks() {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < totalBooks; i++) {
            System.out.print("Enter Book Name " + (i + 1) + ": ");
            bookNames[i] = sc.nextLine();

            System.out.print("Enter Author Name " + (i + 1) + ": ");
            authorNames[i] = sc.nextLine();
        }
    }

    // Display all books
    public void displayBooks() {
        System.out.println("\n--- Library Books ---");

        for (int i = 0; i < totalBooks; i++) {
            System.out.println(
                (i + 1) + ". " + bookNames[i].toUpperCase() +
                " by " + authorNames[i].toUpperCase()
            );
        }
    }

    // Search book
    public void searchBook(String bookName) {
        boolean found = false;

        for (int i = 0; i < totalBooks; i++) {
            if (bookNames[i].equalsIgnoreCase(bookName)) {
                System.out.println("\nBook Found:");
                System.out.println(bookNames[i] + " by " + authorNames[i]);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("\nBook not available");
        }
    }

    // Count books by author
    public void countBooksByAuthor(String authorName) {
        int count = 0;

        for (int i = 0; i < totalBooks; i++) {
            if (authorNames[i].equalsIgnoreCase(authorName)) {
                count++;
            }
        }

        System.out.println("\nTotal books by " + authorName.toUpperCase() + ": " + count);
    }
}