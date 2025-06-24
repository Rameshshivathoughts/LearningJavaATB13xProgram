package ex_18_Task_June17;

import java.util.Scanner;

public class Lab141_Task1_June_18 {
    public static void main(String[] args) {

        // Leap year


        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a Year!");
        int year = scanner.nextInt();

        if(year%4 == 0){
            System.out.println("It's a Leap year");
        }
        else if (year%100 == 0 && year%400 == 0){
            System.out.println("It's a Leap year");
        }
        else {
            System.out.println("It's not a leap year");
        }
    }
}
