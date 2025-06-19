package ex_13_Switch;

public class Lab098_Multiple_March {
    public static void main(String[] args) {
        //multiple matching cases

        int itemCode = 001;
        switch (itemCode){

            case 001,003,005 :
                System.out.println("yes it's a odd number");
                break;
            case 002, 004, 006 :
                System.out.println("yes it's even number");
                break;
            default:
                System.out.println("nothing");
                break;

        }
    }
}
