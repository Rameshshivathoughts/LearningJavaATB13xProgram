package ex_14_For_Loop;

public class Lab116_For_Loop_Break {
    public static void main(String[] args) {

        for (int i = 0; i < 20; i++){
            if(i == 5){
                break;
            }
            else {
                System.out.println(i);
            }
        }
    }
}
