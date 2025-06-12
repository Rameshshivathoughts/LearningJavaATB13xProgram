package ex_08_Task_12th_June;

public class Lab059_Task3 {
    public static void main(String[] args) {
        //Grade Calculation Using Nested Ternary
        // Description: Marks 90 = A+, 75 = A, 60 = B, 40 = C, below 40 Fail.

        String a = "Fail";
        String b = "C";
        String c = "B";
        String d = "A";
        String e = "A+";

        int marks = 89;

        String result = (marks >= 90) ? e : (marks >= 75) ? d : (marks >= 60) ? c : (marks >= 40) ? b : a;
        System.out.println(result);

    }
}
