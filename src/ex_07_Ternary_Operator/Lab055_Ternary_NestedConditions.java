package ex_07_Ternary_Operator;

public class Lab055_Ternary_NestedConditions {
    public static void main(String[] args) {

        //age < 18 - Minor
        //age - 18 - 65 - Adult
        //age > 65 - Senior

        int age = 29;

        String result = (age < 18) ? "Minor" : ((age < 65) ? "Adult" : "Senior");
        System.out.println(result);
    }
}
