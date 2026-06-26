import java.util.Scanner;
import java.util.Random;

public class number_guessing_game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        //Generate a random number between 1 and 100
        int number = random.nextInt(100) + 1;
        int guess;
        int attempts = 0;

        System.out.println("=== Number Guessing Game ===");
        System.out.println("I have chosen a number between 1 and 100.");
        System.out.println("Try to guess it!");
        System.out.println();

        do{
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();
            attempts++;

            if(guess > number){
                System.out.println("Too high! Try again.");
            }
            else if(guess < number){
                System.out.println("Too Low! Try again.");
            }
            else{
                System.out.println("Congratulation! You guessed the number.");
                System.out.println("Number of attempts: " + attempts);
            }
            System.out.println();
        } while(guess != number);


        sc.close();
    }
    
}
