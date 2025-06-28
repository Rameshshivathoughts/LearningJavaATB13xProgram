package ex_18_Tasks;

import java.util.Scanner;

public class Lab166_LargestofThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number1");

        if (!scanner.hasNextInt()){
            System.out.println("Please enter the Integers only - Error");
            return;
        }
        int number1 = scanner.nextInt();


        System.out.println("Enter the number2");

        if (!scanner.hasNextInt()){
            System.out.println("Please enter the Integers only - Error");
            return;
        }
        int number2 = scanner.nextInt();

        System.out.println("Enter the number3");

        if (!scanner.hasNextInt()){
            System.out.println("Please enter the Integers only - Error");
            return;
        }
        int number3 = scanner.nextInt();

        maximumNumber(number1, number2, number3);



    }

    static void maximumNumber(int a, int b, int c) {
        if (a == b && b == c){
            System.out.println("All are equal");
        }
        else if (a >= b && a >= c) {
            System.out.println("Maximum value is - " + a);
        }
        else if (b >= a && b >= c) {
            System.out.println("Maximum value is - " + b);
        }
        else{
            System.out.println("Maximum value is - " + c);
        }

    }
}
