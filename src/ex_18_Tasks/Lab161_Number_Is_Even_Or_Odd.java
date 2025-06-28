package ex_18_Tasks;

import java.util.Scanner;

public class Lab161_Number_Is_Even_Or_Odd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number ");

        if(!scanner.hasNextInt()){
            System.out.println("Please enter a integer number - Error");
            return;
        }

        int input = scanner.nextInt();

        if (input < 0){
            System.out.println("Please enter the positive number only - Error");
            return;
        }
        String result = evenOrOdd(input);
        System.out.println(result);

    }

    static String evenOrOdd(int input){
        if (input % 2 == 0){
            return "It's an Even Number";
        }
        else {
            return "It's an Odd Number";
        }
    }
}
