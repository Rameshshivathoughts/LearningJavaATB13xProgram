package ex_15_While;

import java.util.Scanner;

public class Lab125_While_Loop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the factorial Program \nEnter the Factorial Number ");
        if (!scanner.hasNextInt()){
            System.out.println("Please enter valid integer number");
            return;
        }
        int factorial = 1;





        int number = scanner.nextInt();

        if (number < 0){
            System.out.println("Negative numbers are not allowed");
            return;
        }

        int i = 1;
        if (number <=0){
            System.out.println(factorial);
        }
        else {
            while (i <= number){                       // for loop also we can use
                factorial = factorial*i;
                i++;
            }
        }
        System.out.println("factorial is - " + factorial);
    }
}
