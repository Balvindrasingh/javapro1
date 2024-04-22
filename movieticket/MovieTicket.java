



/**
 * Assignment 6
 * Name - Balvindra Singh
 * Date - june 30,2023
 * time - 11.34 am
 * 
 */
package assignment6;

 //Variable decleration

public class MovieTicket
 {
    private String movieName;
    private int ticketNumber;
    private int theatreNumber;
    public static double ticketPrice;

    // Default constructor
    public MovieTicket()
     {
    }

    // Parametrized constructor (excluding ticketPrice)
    public MovieTicket(String movieName, int ticketNumber, int theatreNumber, double ticketPrice)
     {
        this.movieName = movieName;
        this.ticketNumber = ticketNumber;
        this.theatreNumber = theatreNumber;
        MovieTicket.ticketPrice = ticketPrice;
    }

    // Setters and getters
    public void setMovieName(String movieName) 
    {
        this.movieName = movieName;
    }

    public String getMovieName() 
    {
        return movieName;
    }

    public void setTicketNumber(int ticketNumber) 
    {
        this.ticketNumber = ticketNumber;
    }

    public int getTicketNumber() 
    {
        return ticketNumber;
    }

    public void setTheatreNumber(int theatreNumber) 
    {
        this.theatreNumber = theatreNumber;
    }

    public int getTheatreNumber() 
    {
        return theatreNumber;
    }

    // Method to check if movie name is a palindrome
    public String checkPalindrome() 
    {
        String reversed = "";
        for (int i = movieName.length() - 1; i >= 0; i--)
         {
            reversed += movieName.charAt(i);
        }
        if (movieName.equalsIgnoreCase(reversed)) 
        {
            return movieName.toUpperCase();
        }
         else 
         {
            return "Not A Palindrome";
        }
    }

    // Static method to calculate tax on the ticket price
    public static double calculateTax()
     {
        double taxRate = 0.13;
        return ticketPrice * taxRate;
    }

    // Overloaded method to inquire movie run dates based on movie name
    public static String inquireMovieRunDates(String movieName)
     {
        String runDates;
        switch (movieName)
         {
            case "Die Hard 1":
                runDates = "Jan 1, Jan 2, Jan 3";
                break;
            case "Die Hard 2":
                runDates = "Jan 4, Jan 5, Jan 6";
                break;
            case "Die Hard 3":
                runDates = "Jan 7, Jan 8, Jan 9";
                break;
            case "Die Hard 4":
                runDates = "Jan 10, Jan 11, Jan 12";
                break;
            default:
                runDates = "No information available";
        }
        return runDates;
    }

    // Overloaded method to inquire movie run dates based on ticket number
    public static String inquireMovieRunDates(int ticketNumber)
     {
        String runDates;
        switch (ticketNumber) 
        {
            case 12345:
                runDates = "Jan 1, Jan 2, Jan 3";
                break;
            case 12346:
                runDates = "Jan 4, Jan 5, Jan 6";
                break;
            case 12347:
                runDates = "Jan 7, Jan 8, Jan 9";
                break;
            case 12348:
                runDates = "Jan 10, Jan 11, Jan 12";
                break;
            default:
                runDates = "No information available";
        }
        return runDates;
    }
}