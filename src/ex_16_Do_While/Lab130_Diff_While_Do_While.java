package ex_16_Do_While;

public class Lab130_Diff_While_Do_While {
    public static void main(String[] args) {

        int a = 0;

        while (a<10){
            System.out.println(a);
            a++;
        }
        System.out.println("End while loop");
        int b = 0;
        do {
            System.out.println(b);
            b++;
        }while (b<10);
    }
}
