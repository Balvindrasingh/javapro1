package assignment6;
/**
 * this is a class with main method
 */
import java.util.Scanner;

public class MovieTicketTestHarness
 {
    public static void main(String[] args)
     {
        Scanner scanner = new Scanner(System.in);

        // Instantiate a ticket
        MovieTicket ticket = new MovieTicket(null, 0, 0, 50.0);

        // Capture information from the user and populate the ticket fields
        System.out.print("Enter movie name: ");
        String movieName = scanner.nextLine();
        ticket.setMovieName(movieName);

        System.out.print("Enter ticket number: ");
        int ticketNumber = scanner.nextInt();
        ticket.setTicketNumber(ticketNumber);

        System.out.print("Enter theatre number: ");
        int theatreNumber = scanner.nextInt();
        ticket.setTheatreNumber(theatreNumber);

        // Print out all the ticket fields, ticket price, and tax amount
        System.out.println("Movie Name: " + ticket.getMovieName());
        System.out.println("Ticket Number: " + ticket.getTicketNumber());
        System.out.println("Theatre Number: " + ticket.getTheatreNumber());
        System.out.println("Ticket Price: " + MovieTicket.ticketPrice);
        System.out.println("Tax Amount: " + MovieTicket.calculateTax());

        scanner.nextLine(); // Consume the newline character

        // Ask the user for a movie name and print the movie run dates
        System.out.print("Enter a movie name to inquire about run dates: ");
        String movieNameToInquire = scanner.nextLine();
        String movieRunDatesByName = MovieTicket.inquireMovieRunDates(movieNameToInquire);
        System.out.println("Movie Run Dates by Name: " + movieRunDatesByName);

        // Ask the user for a ticket number and print the movie run dates
        System.out.print("Enter a ticket number to inquire about run dates: ");
        int ticketNumberToInquire = scanner.nextInt();
        String movieRunDatesByTicketNumber = MovieTicket.inquireMovieRunDates(ticketNumberToInquire);
        System.out.println("Movie Run Dates by Ticket Number: " + movieRunDatesByTicketNumber);

        // Call the checkPalindrome method and print the result
        String palindromeResult = ticket.checkPalindrome();
        System.out.println("Palindrome Result: " + palindromeResult);

        scanner.close();
    }
}