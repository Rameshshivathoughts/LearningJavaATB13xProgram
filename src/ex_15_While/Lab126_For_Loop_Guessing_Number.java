package ex_15_While;

import java.util.Random;
import java.util.Scanner;

public class Lab126_For_Loop_Guessing_Number {
    public static void main(String[] args) {

        Random random_Number = new Random();
        int guessRandomNumber = random_Number.nextInt(101); // 0 to 100
        //System.out.println(guessRandomNumber);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number ");

        int guess;
        int attempts = 0;

        while(true){
            guess = scanner.nextInt();
            attempts++;

            if (guess < guessRandomNumber){
                System.out.println("Guessing number is too low, Try agian");
            }
            else if (guess > guessRandomNumber){
                System.out.println("Guessing number is too high, Try agian");
            }
            else {
                System.out.println("got the guessed number of " + attempts + " attempt" + " and number is "+guess);
                break;
            }
        }

    }
}
