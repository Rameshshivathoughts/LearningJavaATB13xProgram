package ex_12_Task_13th_June;

public class Lab085_Task5 {
    public static void main(String[] args) {

        int a = 5;

        int b = a++ + ++a;

        System.out.println("a: " + a); // Output: a: 7

        System.out.println("b: " + b); // Output: b: 12
    }
}
