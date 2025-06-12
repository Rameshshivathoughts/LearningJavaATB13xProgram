package ex_05_Operators;

public class Lab036_All_Operator2 {
    public static void main(String[] args) {
        //Logical, assignment, OR and AND Gates, Arithmatic, Unary, Compound, modulus, relational, Equal and Not equal.
        //New, Increment and Decrement, Ternary, Bitwise, Concatination

        //logical Operator
        int a = 10;

        //Arithmatic Operator
        int b = 20;
        int c = 30;
        int d = 40;

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(b/a);

        //Modulus Operator

        System.out.println(b%a);     // remainder = 0 quetient = 2

        //unary operator
        int f = +20;
        int h = f+20;
        System.out.println(h);

        int k = -110;
        int v = h+k;
        System.out.println(v);

        //relational Operator
        System.out.println(a>b);
        System.out.println(b<d);
        System.out.println(a<=c);
        System.out.println(d>=b);


        //OR and AND operator

        System.out.println((a<b) || (b>c));
        System.out.println((a>b && (b<=c)));

        //Concatination Operator

        String s1 = "Ramesh";
        String s2 = "sahana";
        char i = 'A';
        int l = 22;

        System.out.println(l + i + s2 + l);       // + operator behaves different with string and int
        System.out.println(s1 + i + s2 + l);      // also called as method overloading (+ operator)



    }
}
