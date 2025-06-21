package ex_13_Switch;

import java.util.Random;
import java.util.Scanner;

public class Lab101_Task16thJune {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first line");
        int a = scanner.nextInt();

        System.out.println("Enter the second line");
        int b = scanner.nextInt();

        System.out.println("Enter the first line");
        int c = scanner.nextInt();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        if (a == b && b == c && c == a){
            System.out.println("all sides are equal");
        }
        else if (a == b && b != c && c != a){
            System.out.println("exactly two sides are equal");
        }
        else {
            System.out.println("no sides are equal");
        }

        System.out.println("Enter the character");
        char ch = scanner.next().toLowerCase().charAt(0);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println("this char is an owel");
            }
            else {
                System.out.println("It's not a vowel");
            }


    }
}
