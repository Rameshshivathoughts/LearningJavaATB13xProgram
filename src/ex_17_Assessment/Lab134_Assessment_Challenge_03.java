package ex_17_Assessment;

import java.util.Scanner;

public class Lab134_Assessment_Challenge_03 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the 1st value ");
        int a = scanner.nextInt();


        System.out.println("Enter the 2nd value ");
        int b = scanner.nextInt();


        System.out.println(a == b);
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println((a > b) && (a > 0));
        System.out.println((a < b) || (a > 0));
        System.out.println(!(a > b));

    }
}
