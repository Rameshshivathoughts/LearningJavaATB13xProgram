package ex_13_Switch;

import java.util.Scanner;

public class Lab089_Switch_Without_Break {
    public static void main(String[] args) {
//take user input and tell them a day based on the numbers 1 to 7
        // 1 - Mon, 2 - Tue
        // if more than 7 - Not allowed or error

        //int day = Integer.parseInt(args[0])

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the day 1 to 7");
        int day = scanner.nextInt();

        switch (day){

            case 1 :
                System.out.println("Monday");
            case 2 :
                System.out.println("Tuesday");
            case 3 :
                System.out.println("Wednesday");
            case 4 :
                System.out.println("Thursday");
            case 5 :
                System.out.println("Friday");
            case 6 :
                System.out.println("Saturday");
            case 7 :
                System.out.println("Sunday");
            default :
                System.out.println("Not Allowed or Error");

        }
    }
}
