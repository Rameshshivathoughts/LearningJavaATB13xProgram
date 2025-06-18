package ex_11_If_Condition;

import java.util.Scanner;

public class Lab077_If_Condition_01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        if (age > 18){
            System.out.println("allowed to Vote");
        }
    }
}
