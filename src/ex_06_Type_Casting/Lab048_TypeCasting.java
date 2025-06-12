package ex_06_Type_Casting;

public class Lab048_TypeCasting {
    public static void main(String[] args) {
        int courcee = 100;
        float GST = 18.45f;

        //int total1 = courcee+GST;         // Narrow implicit
        int total1 = courcee+(int)GST;
        System.out.println(total1);          // it will not count the whole value

        float total2 = courcee+GST;
        float total3 = (float)courcee + GST;
        System.out.println(total2);
        System.out.println(total3);

    }
}
