import java.util.Scanner;

class ATM{
    private double balance;

    //constructor
    ATM(double balance){
        this.balance = balance;
    }

    //Check Balance method
    void checkBalance(){
        System.out.println("Current Balance: "+balance);
    }

    //Deposit method
    void deposit(double amount){
        balance += amount;
        System.out.print("Deposited Amount: "+amount);
    }

    //Withdraw method
    void withdraw(double amount){
        if(amount <= balance){
            balance -= amount;
            System.out.print("Withdraw Amount: " +amount);
        }else{
            System.out.print("Insufficient Balance!");
        }
    }


}

public class ATM_simulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ATM atm = new ATM(10000); //inital amount

        int choice;
        double amount;

        do{
            System.out.println("===== ATM MENU =====");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch(choice){
                case 1:
                    atm.checkBalance();
                    break;

                    case 2:
                        System.out.print("Enter amount to deposit: ");
                        amount = sc.nextDouble();
                        atm.deposit(amount);
                        break;

                        case 3:
                            System.out.print("Enter amount to withdraw: ");
                            amount = sc.nextDouble();
                            atm.withdraw(amount);
                            break;

                            case 4 :
                                System.out.print("Thank you for using ATM: ");
                                break;

                                default:
                                    System.out.print("Invalid choice:");
            }
            System.out.println();
        } while (choice != 4);

        sc.close();
    }
}
