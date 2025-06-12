package ex_07_Ternary_Operator;

public class Lab056_Ternary_nested2 {
    public static void main(String[] args) {
        // find the max number b/w 3 number

        int a = 37;
        int b = 66;
        int c = 67;

        int result = (a > b) ? (a > c) ? a : c : (b > c) ? b : c;

        System.out.println(result);
    }
}
