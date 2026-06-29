import java.util.Scanner;

class ArrayOperations {
    private int[] arr;
    private int size;

    // Constructor
    public ArrayOperations(int capacity) {
        arr = new int[capacity];
        size = 0;
    }

    // Insert element
    public void insert(int value) {
        if (size == arr.length) {
            System.out.println("Array is full!");
            return;
        }
        arr[size++] = value;
        System.out.println("Inserted successfully.");
    }

    // Display elements
    public void display() {
        if (size == 0) {
            System.out.println("Array is empty.");
            return;
        }

        System.out.print("Array elements: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Search element
    public void search(int value) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == value) {
                System.out.println("Element found at position: " + (i + 1));
                return;
            }
        }
        System.out.println("Element not found.");
    }

    // Delete element
    public void delete(int value) {
        int index = -1;

        for (int i = 0; i < size; i++) {
            if (arr[i] == value) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("Element not found.");
            return;
        }

        for (int i = index; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }

        size--;
        System.out.println("Deleted successfully.");
    }

    // Update element
    public void update(int oldValue, int newValue) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == oldValue) {
                arr[i] = newValue;
                System.out.println("Updated successfully.");
                return;
            }
        }
        System.out.println("Element not found.");
    }
}

public class menu_driven_array_operation_system{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayOperations obj = new ArrayOperations(100);

        int choice;

        do {
            System.out.println("\n===== ARRAY MENU (OOP) =====");
            System.out.println("1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Search");
            System.out.println("4. Update");
            System.out.println("5. Display");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to insert: ");
                    obj.insert(sc.nextInt());
                    break;

                case 2:
                    System.out.print("Enter value to delete: ");
                    obj.delete(sc.nextInt());
                    break;

                case 3:
                    System.out.print("Enter value to search: ");
                    obj.search(sc.nextInt());
                    break;

                case 4:
                    System.out.print("Enter old value: ");
                    int oldVal = sc.nextInt();
                    System.out.print("Enter new value: ");
                    obj.update(oldVal, sc.nextInt());
                    break;

                case 5:
                    obj.display();
                    break;

                case 6:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 6);

        sc.close();
    }
}