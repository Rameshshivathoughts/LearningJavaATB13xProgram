package ex_14_For_Loop;

public class Lab115_For_Loop {
    public static void main(String[] args) {


        // from 1 to 20, i don't want to print 3, 5 10 15 18
        // Using Continue Keyword

        for (int i = 1; i <= 20; i++){

            if (i == 3 || i == 5 || i == 10 || i == 15 || i == 18){
                continue;
            }
            else {
                System.out.println(i);
            }
        }
    }
}
