package ex_11_If_Condition;

import java.util.Scanner;

public class Lab079_If_Condition_03 {
    public static void main(String[] args) {

        //Scanner
        //CLI

        System.out.println("Enter the Age");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        if (age <= 18){
            System.out.println("Not allowed to vote");
        }
        else {
            System.out.println("allowed to Vote");
        }
    }
}
