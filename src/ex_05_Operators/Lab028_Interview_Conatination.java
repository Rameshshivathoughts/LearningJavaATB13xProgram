package ex_05_Operators;

public class Lab028_Interview_Conatination {
    public static void main(String[] args) {
        String First_Name = "Ramesh";
        String Last_Name = "Shiva";

        int a=10;
        int b =20;

        System.out.println(First_Name + Last_Name + a + b);
        // First plus behaves as concatination

        System.out.println(a + b + Last_Name + First_Name);

        System.out.println(First_Name + Last_Name + (a + b));

    }
}
