package ex_09_UserInput;

import java.util.Scanner;

public class Lab067_UserInput_Scanner_02 {
    public static void main(String[] args) {
        System.out.println("String");
        Scanner scanner = new Scanner(System.in);
        String string_Input = scanner.next();
        System.out.println(string_Input);

        System.out.println("int");
        int int_Input = scanner.nextInt();
        System.out.println(int_Input);

        System.out.println("double");
        double double_input = scanner.nextDouble();
        System.out.println(double_input);

    }
}
