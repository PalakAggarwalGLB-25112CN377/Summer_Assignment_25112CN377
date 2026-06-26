import java.util.Scanner;

public class quiz_application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Questions
        String[] questions = {
            "1. What is the capital of India? \n A. Mumbai \n B. Delhi \n C. Chennai \n D. Kolkata",
            "2. Which language is used for Android development? \n A. Python \n B. Java\n C. C++ \n D. PhP",
            "3. Which keyword is used to inherit a class in java? \n A. this \n B. super \n C. extends \n D.implement",
            "4. How many primitive data types are there in Java? \n A. 6 \n B. 7 \n c. 7 \n D. 8",
            "5. Which company developed Java? \n A. Microsoft \n B. Apple \n C. Sun Microsystems \n D. Google"
        };

        //correct answers 
        char[] answers = {'B' , 'B' , 'C' , 'C' , 'C'};
        int score = 0;

        System.out.println("===== QUIZ APPLICATION =====");
        for(int i = 0 ; i<questions.length ; i++){
            System.out.println("\n" + questions[i]); 
            System.out.print("Enter your answer(A/B/C/D): ");
            char userAnswer = Character.toUpperCase(sc.next().charAt(0));

            if(userAnswer == answers[i]){
                System.out.println("correct!");
                score++;
            }else{
                System.out.println("Wrong! correct answer is : " + answers[i]);
            }
        }

        System.out.println("\n ====== RESULT ======");
        System.out.println("Your Score: " + score + "/" + questions.length);

        double percentage = (score*100.0)/questions.length;
        System.out.println("Percentage: " +percentage + "%");

        if(percentage >=80){
            System.out.println("Grade: Excellent");
        }else if(percentage >=60){
            System.out.println("Grade: Good");
        }else{
            System.out.println("Grade: Needs Improvement");
        }
        sc.close();
        }
    }

