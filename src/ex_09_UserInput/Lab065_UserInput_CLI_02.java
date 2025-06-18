package ex_09_UserInput;

public class Lab065_UserInput_CLI_02 {
    public static void main(String[] args) {

        String s1 = args[0];
        String s2 = args[1];
        String s3 = args[2];
        String s4 = args[3];

        int age = Integer.parseInt(s2);
       // int age = Integer.parseInt(s2);
        //int age = Integer.parseInt(s3);
        //int age = Integer.parseInt(s4;

        String canIVote = age > 18 ? "Yes" : "No";
        System.out.println(canIVote);
        System.out.println(args[3]);




    }
}
