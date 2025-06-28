package ex_18_Tasks;

import java.util.Scanner;

public class Lab165_SmallestofTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number1");

        if(!scanner.hasNextInt()){
            System.out.println("Please enter the Integer only - Error");
            return;
        }

        int number1 = scanner.nextInt();

        System.out.println("Enter the number2");
        if(!scanner.hasNextInt()){
            System.out.println("Please enter the Integer only - Error");
            return;
        }

        int number2 = scanner.nextInt();
        String result = numbers(number1, number2);
        System.out.println(result);

        scanner.close();

    }

    static String numbers(int input1, int input2){
        if(input1 < input2){
            return "The smallest number is input1 - "+input1;
        } else if (input2 < input1) {
            return "The smallest number is input2 - " + input2;
        }
        else {
            return "Both are equal - "+ input1 + " and " + input2;
        }
    }

}
