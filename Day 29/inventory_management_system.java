
import java.util.ArrayList;
import java.util.Scanner;

// Product class (OOP concept: Encapsulation)
class Product {
    private int id;
    private String name;
    private int quantity;
    private double price;

    public Product(int id, String name, int quantity, double price) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public void displayProduct() {
        System.out.println(id + " | " + name + " | Qty: " + quantity + " | Price: " + price);
    }
}

// Inventory class
class Inventory {
    private ArrayList<Product> products = new ArrayList<>();

    // Add product
    public void addProduct(Product p) {
        products.add(p);
        System.out.println("Product added successfully!");
    }

    // Display all products
    public void showProducts() {
        if (products.isEmpty()) {
            System.out.println("Inventory is empty!");
            return;
        }

        System.out.println("\n--- Inventory List ---");
        for (Product p : products) {
            p.displayProduct();
        }
    }

    // Search product by ID
    public void searchProduct(int id) {
        for (Product p : products) {
            if (p.getId() == id) {
                System.out.println("Product Found:");
                p.displayProduct();
                return;
            }
        }
        System.out.println("Product not found!");
    }
}

// Main class
public class inventory_management_system {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Inventory inv = new Inventory();

        while (true) {
            System.out.println("\n===== Inventory Menu =====");
            System.out.println("1. Add Product");
            System.out.println("2. View Products");
            System.out.println("3. Search Product");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();

                    System.out.print("Enter Name: ");
                    String name = sc.next();

                    System.out.print("Enter Quantity: ");
                    int qty = sc.nextInt();

                    System.out.print("Enter Price: ");
                    double price = sc.nextDouble();

                    inv.addProduct(new Product(id, name, qty, price));
                    break;

                case 2:
                    inv.showProducts();
                    break;

                case 3:
                    System.out.print("Enter Product ID to search: ");
                    int searchId = sc.nextInt();
                    inv.searchProduct(searchId);
                    break;

                case 4:
                    System.out.println("Exiting system...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}