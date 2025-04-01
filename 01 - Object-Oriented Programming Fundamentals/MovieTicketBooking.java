import java.util.Scanner;
class MovieTicket{
    private String movieName;
    private int seatNumber;
    private double price;
    private boolean isBooked;
    public MovieTicket(String movieName, int seatNumber, double price){
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
        this.isBooked = false;
    }
    public void bookTicket(){
        if(!isBooked){
            isBooked = true;
            System.out.println("Ticket booked successfully for " + movieName + " at seat " + seatNumber);
        } else {
            System.out.println("Sorry, Seat " + seatNumber + " is already booked.");
        }
    }
    public void displayTicket(){
        if (isBooked){
            System.out.println("\nMovie Ticket Details:");
            System.out.println("Movie Name: " + movieName);
            System.out.println("Seat Number: " + seatNumber);
            System.out.println("Price: " + price);
        } else{
            System.out.println("No ticket booked yet.");
        }
    }
}
public class MovieTicketBooking {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Movie Name: ");
        String movie = scanner.nextLine();
        System.out.print("Enter Seat Number: ");
        int seat = scanner.nextInt();
        System.out.print("Enter Ticket Price: ");
        double price = scanner.nextDouble();
        MovieTicket ticket = new MovieTicket(movie, seat, price);
        System.out.println("\n1. Book Ticket");
        System.out.println("2. Display Ticket Deatils");
        System.out.print("Choose an option: ");
        int choice = scanner.nextInt();
        switch(choice){
            case 1:
                ticket.bookTicket();
                break;
            case 2:
                ticket.displayTicket();
                break;
            default:
                System.out.println("Invalid choice.");
        }
        scanner.close();
    }
}
