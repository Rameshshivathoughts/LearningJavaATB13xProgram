package ex_18_Tasks;

import java.util.Scanner;

public class Lab163_Character_Is_A_Vowel_Or_Consonant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the character");

        String input = scanner.next();

        if(input.length() != 1 || !Character.isLetter(input.charAt(0))){
            System.out.println("Please enter a single alphabetic character only - Error");
            return;
        }

        char ch = Character.toLowerCase(input.charAt(0));
        System.out.println(vowelOrConsonant(ch));



    }

    static String vowelOrConsonant(char ch){
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            return "This character is an Vowel - "+ ch;
        }
        else {
            return "This character is an Consonant - " + ch;
        }
    }
}
