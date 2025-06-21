package ex_14_For_Loop;

public class Lab117_For_Loop {
    public static void main(String[] args) {

        for(int i =1; i <= 50; i++){
            if (i%2 == 0){
                continue;
            }
            else {
                System.out.println("Odd number is = " + i);
            }
        }
    }
}
