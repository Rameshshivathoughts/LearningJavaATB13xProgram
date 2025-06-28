package ex_19_Functions;

public class Lab146_Functions_04 {
    public static void main(String[] args) {

        int sum = sum_Of_Numbers(5, 5);
        System.out.println("sum = " + sum);
        sum_Of_Numbers_No_Return(5,5);

    }

    static int sum_Of_Numbers(int a, int b) {
        return a + b;
    }

    static void sum_Of_Numbers_No_Return(int a, int b) {
        System.out.println(a + b);
    }

}

