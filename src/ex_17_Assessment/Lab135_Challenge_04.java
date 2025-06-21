package ex_17_Assessment;

import java.util.Scanner;

public class Lab135_Challenge_04 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();

        System.out.println("Original " + a);

        int pre_increment = ++a;
        System.out.println(pre_increment);

        int post_increment = a++;
        System.out.println(post_increment);


        int pre_Decrement = --a;
        System.out.println(pre_Decrement);

        int post_Decrement = a--;
        System.out.println(post_Decrement);
    }
}
