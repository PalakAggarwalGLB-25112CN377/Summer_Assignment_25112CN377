import java.util.Scanner;

public class Function_of_palidrome{

    public static boolean ispalidrome(int num ){
        int rev = 0;
        int originalNum = num;
        while(num!=0){
        int rem = num%10;
        rev = rev*10 + rem;
        num = num/10;
    }
    if(rev == originalNum){
        return true;
    }
    else{
        return false;
    }
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();

        if(ispalidrome(num)){
            System.out.println(num + " is a palidrome number ");
        }
        else{
            System.out.println(num + " is not a palidrome number ");
        }
        sc.close();


    }
}