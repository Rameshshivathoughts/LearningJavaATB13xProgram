package ex_19_Functions;

import java.util.Scanner;

public class Lab149_Arthmatic {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the num 1");

        int a = 0;
        if (scanner.hasNextInt()){
            a = scanner.nextInt();
        }
        else {
            System.out.println("Please enter positive numbers");
        }

        System.out.println("Enter the num 2");

        int b = 0;
        if (scanner.hasNextInt()){
            b = scanner.nextInt();
        }
        else {
            System.out.println("Please enter positive numbers");
        }


        int result_Sum = sum(a, b);
        int result_Sub = sub(a, b);
        int result_Div = div(a, b);
        int result_Mul = mul(a, b);
        int result_Mod = mod(a, b);

        System.out.println(result_Sum);
        System.out.println(result_Sub);
        System.out.println(result_Div);
        System.out.println(result_Mul);
        System.out.println(result_Mod);


    }

//    Adds two integers.

        static int sum(int a,int b){
            return a + b;
        }

//    Substract the first integer by the second.

        static int sub(int a, int b){
            return a - b;
        }

//    Divides the first integer by the second.

        static int div(int a, int b){
            return a/b;
        }

//    Divides the first integer by the second.

        static int mul(int a, int b){
            return a * b;
        }

//     Mod

        static int mod(int a, int b){
            return a%b;
        }


}
