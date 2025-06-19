package ex_13_Switch;

public class Lab097_JDK13_Without_Break {
    public static void main(String[] args) {

        // JDK > 13

        // without break keyword

        // one line supported

        int itemCode = 002;
        switch (itemCode){

            case 001 -> System.out.println("001");
            case 002 -> System.out.println("002");
            case 003 -> System.out.println("003");
            case 004 -> System.out.println("004");
            default  -> System.out.println("default");

        }
    }
}
