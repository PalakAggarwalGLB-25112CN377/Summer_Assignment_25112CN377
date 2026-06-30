import java.util.Scanner;

public class mini_project {

    static int rooms[] = {101, 102, 103, 104, 105};
    static String customers[] = new String[5];

    // User-defined function to display rooms
    static void displayRooms() {
        System.out.println("\nRoom Number\tStatus");

        for (int i = 0; i < rooms.length; i++) {
            if (customers[i] == null)
                System.out.println(rooms[i] + "\t\tAvailable");
            else
                System.out.println(rooms[i] + "\t\tBooked");
        }
    }

    // User-defined function to book a room
    static void bookRoom(Scanner sc) {
        System.out.print("Enter room number: ");
        int room = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i] == room) {
                if (customers[i] == null) {
                    System.out.print("Enter customer name: ");
                    customers[i] = sc.nextLine();
                    System.out.println("Room booked successfully.");
                } else {
                    System.out.println("Room already booked.");
                }
                return;
            }
        }

        System.out.println("Invalid room number.");
    }

    // User-defined function to cancel booking
    static void cancelBooking(Scanner sc) {
        System.out.print("Enter room number to cancel: ");
        int room = sc.nextInt();

        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i] == room) {
                if (customers[i] != null) {
                    customers[i] = null;
                    System.out.println("Booking cancelled.");
                } else {
                    System.out.println("Room is not booked.");
                }
                return;
            }
        }

        System.out.println("Invalid room number.");
    }

    // User-defined function to search booking
    static void searchBooking(Scanner sc) {
        sc.nextLine();
        System.out.print("Enter customer name: ");
        String name = sc.nextLine();

        for (int i = 0; i < customers.length; i++) {
            if (customers[i] != null &&
                customers[i].equalsIgnoreCase(name)) {

                System.out.println("Booking Found");
                System.out.println("Customer: " + customers[i]);
                System.out.println("Room No: " + rooms[i]);
                return;
            }
        }

        System.out.println("Booking not found.");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== HOTEL RESERVATION SYSTEM =====");
            System.out.println("1. Display Rooms");
            System.out.println("2. Book Room");
            System.out.println("3. Cancel Booking");
            System.out.println("4. Search Booking");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    displayRooms();
                    break;

                case 2:
                    bookRoom(sc);
                    break;

                case 3:
                    cancelBooking(sc);
                    break;

                case 4:
                    searchBooking(sc);
                    break;

                case 5:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 5);

        sc.close();
    }
}