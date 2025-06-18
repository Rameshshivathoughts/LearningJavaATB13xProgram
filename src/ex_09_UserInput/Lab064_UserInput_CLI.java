package ex_09_UserInput;

public class Lab064_UserInput_CLI {
    public static void main(String[] args) {

        String s1 = args[2];
        int age = Integer.parseInt(s1);
        String canIVote = age > 18 ? "Yes" : "No";
        System.out.println(canIVote);
    }
}
