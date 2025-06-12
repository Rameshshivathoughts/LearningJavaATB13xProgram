package ex_06_Type_Casting;

public class Lab046_TypeCasting_Narrowing {
    public static void main(String[] args) {
        int a = 1000;
        //byte b = a;    // Narrowing (int - byte) - Implicit Caating is not possible
        byte b = (byte)a;
        System.out.println(b);

    }
}
