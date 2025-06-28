package ex_19_Functions;

public class Lab145_Functions_03 {
    public static void main(String[] args) {

        f1();
        f2();
        f3();
        f4();
        f5();
        f6();
    }

    static void f1(){
        System.out.println("Simple function");
    }

    static int f2(){
        System.out.println("This is a normal function which return something.");
        System.out.println("This is a normal function which return something.");
        return 10;
    }

    static boolean f3(){
        return true;
    }
    static String f4(){
        return "Ramesh";
    }
    static long f5(){
        return 10l;
    }
    static float f6(){
        return 244.5f;
    }
}
