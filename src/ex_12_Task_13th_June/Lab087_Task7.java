package ex_12_Task_13th_June;

public class Lab087_Task7 {
    public static void main(String[] args) {

        int x = 5;

        int y = x++ + ++x + x++ + ++x;                 // 5 + 7 + 7 + 9

        System.out.println("x = " + x + ", y = " + y);    // x = 9 y = 28


    }
}
