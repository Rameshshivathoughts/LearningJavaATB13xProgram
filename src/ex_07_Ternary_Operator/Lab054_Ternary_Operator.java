package ex_07_Ternary_Operator;

public class Lab054_Ternary_Operator {
    public static void main(String[] args) {
        // even or odd number

        int a = 55;
        int b = a%2;
        String result = b==0? "even" : "odd";
        System.out.println(result);
    }

}
