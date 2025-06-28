package ex_18_Tasks;

import java.util.Scanner;

public class Lab139_Task01 {
    public static void main(String[] args) {

        // Count the vowels in the given string

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String ");
        String userInput = scanner.next();

        // Convert string to lowercase
        userInput = userInput.toLowerCase();
        int vowels = 0;
        int consonants = 0;


        for(int i = 0; i < (userInput.length())-1; i++) {

            //Convert String to char
            char ch = userInput.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            } else {
                consonants++;
            }
        }

        System.out.println("Vowels are = " + vowels);
        System.out.println("Consonants are = " + consonants);
    }
}
