package ex_16_Do_While;

import java.util.Scanner;

public class Lab128_Vowel_Using_Case {
    public static void main(String[] args) {

        System.out.println("Enter the char ");
        Scanner scanner = new Scanner(System.in);
        char ch = scanner.next().toLowerCase().charAt(0);

        switch (ch){

            case 'a', 'e', 'i', 'o', 'u' -> System.out.println("It's a Vowel");
            default -> System.out.println("It's a Consonant");
        }
    }
}
