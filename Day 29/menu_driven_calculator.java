import java.util.Scanner;

// Calculator class 
class Calculator {

    double add(double a, double b) {
        return a + b;
    }

    double subtract(double a, double b) {
        return a - b;
    }

    double multiply(double a, double b) {
        return a * b;
    }

    double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero!");
            return 0;
        }
        return a / b;
    }
}

// Main class
public class menu_driven_calculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();

        int choice;
        double num1, num2, result;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            if (choice >= 1 && choice <= 4) {

                System.out.print("Enter first number: ");
                num1 = sc.nextDouble();

                System.out.print("Enter second number: ");
                num2 = sc.nextDouble();

                switch (choice) {
                    case 1:
                        result = calc.add(num1, num2);
                        System.out.println("Result = " + result);
                        break;

                    case 2:
                        result = calc.subtract(num1, num2);
                        System.out.println("Result = " + result);
                        break;

                    case 3:
                        result = calc.multiply(num1, num2);
                        System.out.println("Result = " + result);
                        break;

                    case 4:
                        result = calc.divide(num1, num2);
                        System.out.println("Result = " + result);
                        break;
                }

            } else if (choice == 5) {
                System.out.println("Exiting program...");
            } else {
                System.out.println("Invalid choice!");
            }

        } while (choice != 5);

        sc.close();
    }
}