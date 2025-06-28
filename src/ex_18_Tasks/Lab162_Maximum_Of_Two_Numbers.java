package ex_18_Tasks;

import java.util.Scanner;

public class Lab162_Maximum_Of_Two_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number1");

        if(!scanner.hasNextInt()){
            System.out.println("Please enter the integer numbers only");
            return;
        }

        int number1 = scanner.nextInt();

        System.out.println("Enter the number2");
        if(!scanner.hasNextInt()) {
            System.out.println("Please enter the integer numbers only");
            return;
        }


        int number2 = scanner.nextInt();
        System.out.println(maximumOfTwoNumbers(number1, number2));



    }

    static String maximumOfTwoNumbers(int number1, int number2){
        if (number1 > number2){
            return "Maximum Number is Number1" + number1;
        }
        else if (number2 > number1){
            return "Maximum Number (Number2) is = "+number2;
        }
        else {
            return "Both are equal";
        }
    }
}
