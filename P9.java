import p9.MovieTicket;
import p9.PremiumTicket;
import p9.RegularTicket;
import p9.VIPTicket;

import java.util.Scanner;

public class P9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Movie Name: ");
        String movie = sc.nextLine();

        System.out.print("Enter Theater Name: ");
        String theater = sc.nextLine();

        System.out.print("Enter Number of Tickets: ");
        int tickets = sc.nextInt();

        System.out.println("\nChoose Ticket Type:");
        System.out.println("1. Regular");
        System.out.println("2. Premium");
        System.out.println("3. VIP");

        int choice = sc.nextInt();

        MovieTicket mt = null;

        if (choice == 1) {
            mt = new RegularTicket();
        } else if (choice == 2) {
            mt = new PremiumTicket();
        } else if (choice == 3) {
            mt = new VIPTicket();
        } else {
            System.out.println("Invalid choice");
            System.exit(0);
        }

        mt.movieName = movie;
        mt.theaterName = theater;
        mt.numTickets = tickets;

        mt.confirmBooking();

        sc.close();
    }
}