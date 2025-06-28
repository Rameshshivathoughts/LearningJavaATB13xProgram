package ex_18_Tasks;

import java.util.Scanner;

public class Lab142_Task2_June_18 {
    public static void main(String[] args) {

        //Grade Calculator

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the marks!");

//      if (scanner.hasNext()){
//            System.out.println("Please enter the intiger value");
//            return;
//        }

        if (!scanner.hasNextInt()){
            System.out.println("Please enter the intiger value");
            return;
        }

        int marks = scanner.nextInt();

        if(marks < 0){
            System.out.println("Please Enter a positive number");
        }
        else if(marks > 100){
            System.out.println("Invalid or Error");
        }
        else if(marks >=90){
            System.out.println("student got the grade is - A");
        }
        else if(marks >= 80){
            System.out.println("student got the grade is - B");
        }
        else if (marks >=70){
            System.out.println("student got the grade is - C");
        }
        else if (marks >= 60){
            System.out.println("student got the grade is - D");
        }
        else if(marks >= 0){
            System.out.println("student got the grade is - F");
        }
    }
}
