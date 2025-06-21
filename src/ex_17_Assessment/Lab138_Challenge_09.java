package ex_17_Assessment;

import java.util.Scanner;

public class Lab138_Challenge_09 {
    public static void main(String[] args) {

        // 1 to 7 --> 1 - Mon, 2 - Tue ....

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number ");
        int i = scanner.nextInt();
        switch (i){

            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Numbers outside 1-7 range are invalid");



        }
    }
}
