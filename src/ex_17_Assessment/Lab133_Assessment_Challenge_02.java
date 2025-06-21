package ex_17_Assessment;

import java.util.Scanner;

public class Lab133_Assessment_Challenge_02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 1st user input value ");
        int userInput_1 = scanner.nextInt();

        System.out.println("Enter 2nd user input value ");
        int userInput_2 = scanner.nextInt();

//        Arithmetic Operators


        int addition = userInput_1 + userInput_2;
        int subtraction = userInput_1 - userInput_2;
        int multiplication = userInput_1 * userInput_2;
        int division = userInput_1 / userInput_2;
        int modulus = userInput_1 % userInput_2;
        System.out.println(addition);
        System.out.println(subtraction);
        System.out.println(multiplication);
        System.out.println(division);
        System.out.println(modulus);

//      Assignment Operator

        userInput_1 += userInput_2;
        System.out.println(userInput_1);

        userInput_1 -= userInput_2;
        System.out.println(userInput_1);

        userInput_1 *= userInput_2;
        System.out.println(userInput_1);

        userInput_1 /= userInput_2;
        System.out.println(userInput_1);

        userInput_1 %= userInput_2;
        System.out.println(userInput_1);

    }
}
