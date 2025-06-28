package ex_20_Strings;

import java.util.Locale;

public class Lab151_String_Immutable {
    public static void main(String[] args) {
        String name = "Ramesh"; // SCP - String constant pool
//        name.toUpperCase();
        name = name.toUpperCase(); // RAMESH
        System.out.println(name);
    }
}
