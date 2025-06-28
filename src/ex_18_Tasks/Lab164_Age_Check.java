package ex_18_Tasks;

import java.util.Scanner;

public class Lab164_Age_Check {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the the age");

        if(!scanner.hasNextInt()){
            System.out.println("Please enter Integers only - Error");
            return;
        }

        int age = scanner.nextInt();

        if(age < 0){
            System.out.println("Please enter the Positive numbers only - Error");
            return;
        }

        String result = vote(age);
        System.out.println(result);
        scanner.close();


    }

    static String vote(int age){
        if (age >= 18){
            return "The person is eligible for voting and the age is - " + age;
        } else {
            return "The person is not eligible for voting and the age is - " + age;
        }
    }
}
