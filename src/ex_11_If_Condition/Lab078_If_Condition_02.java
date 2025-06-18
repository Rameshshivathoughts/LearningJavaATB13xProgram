package ex_11_If_Condition;

public class Lab078_If_Condition_02 {
    public static void main(String[] args) {

        // CLI

        int age = Integer.parseInt(args[0]);

        if (age > 18){
            System.out.println("allowed to go to goa");
        }
        else {
            System.out.println("not allowed to go to goa");
        }
    }
}
