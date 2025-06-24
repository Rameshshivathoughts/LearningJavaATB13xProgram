package ex_18_Task_June17;

import javax.xml.transform.Source;
import java.util.Scanner;

public class Lab140_Task02 {

    public static void main(String[] args) {

        //Palindrome

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the String");
        String userInput = scanner.next();
        String reverse_String = "";

        for (int i = (userInput.length())-1; i >= 0; i--){
            char ch = userInput.toLowerCase().charAt(i);
            reverse_String = reverse_String + ch;
        }

        if (userInput.equalsIgnoreCase(reverse_String)){
            System.out.println("It's a Palindrome");
        }
        else {
            System.out.println("It's not a palindrome");
        }
    }
}
