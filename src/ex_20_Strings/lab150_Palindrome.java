package ex_20_Strings;

import java.util.Scanner;

public class lab150_Palindrome {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the String word");

        String name = "";
        if(scanner.hasNextInt()){
//            name = scanner.next();
            System.out.println("Please enter the String - Error");
            return;
          }
        else {
            name = scanner.next();
        }

        String reverse_Name1 = reverse(name);
        System.out.println(reverse_Name1);

        if (name.equalsIgnoreCase(reverse_Name1)){
            System.out.println("It's Palindrome");
        }
        else{
            System.out.println("It's not Palindrome");
        }


    }


    static String reverse_Name = "";
    static String reverse(String name){

        for(int i = name.length()-1; i >= 0 ; i--){
            char ch = name.toLowerCase().charAt(i);
            reverse_Name =  reverse_Name + ch;
        }
        return reverse_Name;
    }

    static String getReverse_NameSB(String name){
        StringBuilder string_Builder = new StringBuilder(name);
        return string_Builder.reverse().toString();

    }
}
