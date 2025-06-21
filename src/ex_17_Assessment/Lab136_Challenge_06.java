package ex_17_Assessment;

import java.util.Scanner;

public class Lab136_Challenge_06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the numebr");
        int a = scanner.nextInt();

        if (a > 0){
            System.out.println(a + " is positive");
        }
        else if (a == 0){
            System.out.println(a + " is zero");
        }
        else {
            System.out.println(a + " is a Negative");
        }
    }
}
