package ex_18_Tasks;

import java.util.Scanner;

public class Lab160_Number_Is_Positive_Or_Negative {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");

        if(!scanner.hasNextInt()){
            System.out.println("Please enter the integer values only");
            return;
        }

        int userInput = scanner.nextInt();
        String result = Number(userInput);
        System.out.println(result);

    }
    static String Number(int userInput){
        if (userInput > 0){
            return "It's Positive Number";
        }
        else if(userInput < 0){
            return "It's a negative number";
        }
        else {
            return "It's a Zero";
        }
    }
}
