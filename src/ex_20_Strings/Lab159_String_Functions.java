package ex_20_Strings;

import java.util.Locale;

public class Lab159_String_Functions {
    public static void main(String[] args) {

        String name = "Ramesh";

        System.out.println(name.length());
        System.out.println(name.charAt(3));
        System.out.println(name.charAt(0));
        System.out.println(name.charAt(1));
//        System.out.println(name.charAt(10)); // java.lang.StringIndexOutOfBoundsException

        System.out.println(name.concat(" Shiva"));

        // 3. contains()
        System.out.println(name.contains("es"));
        System.out.println(name.contains("om"));

        // 4. equal()
        System.out.println(name.equals("Ramesh"));
        System.out.println(name.equals("ramesh"));

        // 5. equalIgnoreCase
        System.out.println("// 5. equalIgnoreCase/________________");
        System.out.println(name);
        System.out.println(name.equalsIgnoreCase("Shiva"));
        System.out.println(name.equalsIgnoreCase("ramesh"));
        System.out.println(name.equalsIgnoreCase("Ramesh Shiva"));

        // 6. indexOf
        System.out.println(name.indexOf('a'));
        System.out.println(name.indexOf('m'));

        String s1 = "madam";
        // Returns the index within this string of the
        // first occurrence of the specified substring.

        System.out.println(s1.indexOf('m'));
        System.out.println(s1.lastIndexOf('m'));


        // 7. length()
        System.out.println(name.length());

        // 8. replace( , )
        System.out.println(name.replace('m','v'));

        // 9. split
        String name2 = "ramesh@live.com@shiva";
        String[] name2_Split = name2.split("@");

        System.out.println(name2_Split[0]);
        System.out.println(name2_Split[1]);
        System.out.println(name2_Split[2]);


        // subString( , )
        System.out.println(" // subString( , )__________________");
        System.out.println(name.substring(1,3));

        // 11. toUpperCase()
        System.out.println("// 11. toLowerCase()_____________________");

        System.out.println("sahana".toUpperCase());

        // 12. toLowerCase()
        System.out.println("SAHANA".toLowerCase());

        // 14. startsWith()
        System.out.println(name.startsWith("R"));
        System.out.println(name.startsWith("r"));


        // 15. endsWith()
        System.out.println(name.endsWith("h"));
        System.out.println(name.endsWith("H"));



        String anotherPalindrome = "Niagara. O roar again!";
        System.out.println(anotherPalindrome.length());

        String extract = anotherPalindrome.substring(11,15);
        System.out.println(extract);


        String s111 = "Hello";
        String s222 = "World";

        String s333 = "ji";
        String result1 = s111 + s333 + s222;
        System.out.println(result1);

        String n = "PRamoddUTTA";
        System.out.println(n.indexOf("d"));
        System.out.println(n.lastIndexOf("d"));
        System.out.println(n.lastIndexOf("s"));


        System.out.println("***********************************");
        char c = 'A';
        System.out.println(c);

        String s = String.valueOf(c);
        System.out.println(s);

    }
}
