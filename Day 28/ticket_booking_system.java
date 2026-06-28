import java.util.*;

class Ticket {
    int seatNumber;
    String passengerName;

    Ticket(int seatNumber, String passengerName) {
        this.seatNumber = seatNumber;
        this.passengerName = passengerName;
    }

    public String toString() {
        return "Seat No: " + seatNumber + ", Name: " + passengerName;
    }
}

class TicketBookingSystem {
    private final int totalSeats;
    private boolean[] seats;
    private List<Ticket> bookings;

    public TicketBookingSystem(int totalSeats) {
        this.totalSeats = totalSeats;
        this.seats = new boolean[totalSeats]; // false = available
        this.bookings = new ArrayList<>();
    }

    public void showAvailableSeats() {
        System.out.println("\nAvailable Seats:");
        for (int i = 0; i < totalSeats; i++) {
            if (!seats[i]) {
                System.out.print((i + 1) + " ");
            }
        }
        System.out.println();
    }

    public void bookTicket(String name, int seatNumber) {
        if (seatNumber < 1 || seatNumber > totalSeats) {
            System.out.println("Invalid seat number!");
            return;
        }

        if (seats[seatNumber - 1]) {
            System.out.println("Seat already booked!");
        } else {
            seats[seatNumber - 1] = true;
            Ticket t = new Ticket(seatNumber, name);
            bookings.add(t);
            System.out.println("Ticket booked successfully: " + t);
        }
    }

    public void cancelTicket(int seatNumber) {
        if (seatNumber < 1 || seatNumber > totalSeats) {
            System.out.println("Invalid seat number!");
            return;
        }

        if (!seats[seatNumber - 1]) {
            System.out.println("Seat is not booked!");
        } else {
            seats[seatNumber - 1] = false;

            bookings.removeIf(t -> t.seatNumber == seatNumber);
            System.out.println("Ticket cancelled for seat " + seatNumber);
        }
    }

    public void showBookings() {
        System.out.println("\nBooked Tickets:");
        if (bookings.isEmpty()) {
            System.out.println("No bookings yet.");
        } else {
            for (Ticket t : bookings) {
                System.out.println(t);
            }
        }
    }
}

public class ticket_booking_system {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TicketBookingSystem system = new TicketBookingSystem(10);

        while (true) {
            System.out.println("\n=== Ticket Booking System ===");
            System.out.println("1. Show Available Seats");
            System.out.println("2. Book Ticket");
            System.out.println("3. Cancel Ticket");
            System.out.println("4. Show Bookings");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    system.showAvailableSeats();
                    break;

                case 2:
                    System.out.print("Enter name: ");
                    sc.nextLine(); // consume newline
                    String name = sc.nextLine();

                    System.out.print("Enter seat number: ");
                    int seat = sc.nextInt();

                    system.bookTicket(name, seat);
                    break;

                case 3:
                    System.out.print("Enter seat number to cancel: ");
                    int cancelSeat = sc.nextInt();
                    system.cancelTicket(cancelSeat);
                    break;

                case 4:
                    system.showBookings();
                    break;

                case 5:
                    System.out.println("Exiting system...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}