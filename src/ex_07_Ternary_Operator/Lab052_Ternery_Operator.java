package ex_07_Ternary_Operator;

public class Lab052_Ternery_Operator {
    public static void main(String[] args) {
        // Max number b/w 2 numbers
        int a = 20;
        int b = 40;

        //System.out.println(Math.max(a,b));
        int min= a<b? a : b;
        System.out.println(min);
    }
}
