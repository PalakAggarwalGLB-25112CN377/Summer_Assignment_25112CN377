import java.util.ArrayList;
import java.util.Scanner;

class Contact {
    private String name;
    private String phone;
    private String email;

    public Contact(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Phone: " + phone + ", Email: " + email;
    }
}

public class contact_management_system {

    static ArrayList<Contact> contacts = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            System.out.println("\n===== CONTACT MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Contact");
            System.out.println("2. View Contacts");
            System.out.println("3. Search Contact");
            System.out.println("4. Update Contact");
            System.out.println("5. Delete Contact");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1 -> addContact();
                case 2 -> viewContacts();
                case 3 -> searchContact();
                case 4 -> updateContact();
                case 5 -> deleteContact();
                case 6 -> {
                    System.out.println("Exiting system...");
                    return;
                }
                default -> System.out.println("Invalid choice!");
            }
        }
    }

    static void addContact() {
        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter phone: ");
        String phone = sc.nextLine();

        System.out.print("Enter email: ");
        String email = sc.nextLine();

        contacts.add(new Contact(name, phone, email));
        System.out.println("Contact added successfully!");
    }

    static void viewContacts() {
        if (contacts.isEmpty()) {
            System.out.println("No contacts found.");
            return;
        }

        System.out.println("\n--- Contact List ---");
        for (Contact c : contacts) {
            System.out.println(c);
        }
    }

    static void searchContact() {
        System.out.print("Enter name to search: ");
        String name = sc.nextLine();

        boolean found = false;
        for (Contact c : contacts) {
            if (c.getName().equalsIgnoreCase(name)) {
                System.out.println("Found: " + c);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Contact not found.");
        }
    }

    static void updateContact() {
        System.out.print("Enter name to update: ");
        String name = sc.nextLine();

        for (Contact c : contacts) {
            if (c.getName().equalsIgnoreCase(name)) {
                System.out.print("Enter new phone: ");
                c.setPhone(sc.nextLine());

                System.out.print("Enter new email: ");
                c.setEmail(sc.nextLine());

                System.out.println("Contact updated successfully!");
                return;
            }
        }

        System.out.println("Contact not found.");
    }

    static void deleteContact() {
        System.out.print("Enter name to delete: ");
        String name = sc.nextLine();

        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getName().equalsIgnoreCase(name)) {
                contacts.remove(i);
                System.out.println("Contact deleted successfully!");
                return;
            }
        }

        System.out.println("Contact not found.");
    }
}