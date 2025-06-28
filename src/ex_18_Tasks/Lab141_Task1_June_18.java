package ex_18_Tasks;

import java.util.Scanner;

public class Lab141_Task1_June_18 {
    public static void main(String[] args) {

        // Leap year


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Year!");
        if (!scanner.hasNextInt()){
            System.out.println("Please enter Positive integer");
            return;
        }
        int year = scanner.nextInt();

        if(year < 0){
            System.out.println("Negative numbers are not allowed");
        }
        else if(year%4 == 0 && (year%100 != 0 || year%400 == 0)){
            System.out.println("It's a Leap year");
        }
        else {
            System.out.println("It's not a leap year");
        }
    }
}
