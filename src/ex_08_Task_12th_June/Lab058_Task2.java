package ex_08_Task_12th_June;

public class Lab058_Task2 {
    public static void main(String[] args) {
        //Description: Uses ternary to check whether a number is even or odd. A = 19,
        // update the a value and check again A =20;

        int a = 19;

        String result = (a%2 == 0) ? "Even" : "odd";
        System.out.println(result);


        int b = 20;

        String result1 = (b%2 == 0) ? "Even" : "odd";
        System.out.println(result1);
    }

}
