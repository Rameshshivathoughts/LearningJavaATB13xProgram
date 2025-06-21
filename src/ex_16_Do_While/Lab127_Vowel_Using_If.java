package ex_16_Do_While;

import java.util.Scanner;

public class Lab127_Vowel_Using_If {
    public static void main(String[] args) {

        System.out.println("Enter the character");
        Scanner scanner = new Scanner(System.in);
        char ch = scanner.next().toLowerCase().charAt(0);

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println("this char is an Vowel");
        }
        else {
            System.out.println("It's a Consonant");
        }
    }
}
