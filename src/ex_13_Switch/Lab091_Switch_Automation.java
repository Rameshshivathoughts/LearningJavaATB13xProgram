package ex_13_Switch;

import java.util.Scanner;

public class Lab091_Switch_Automation {
    public static void main(String[] args) {

        //Web Automation
        // User should provide an user input based on that browser should open and execute the testcases
        //

        // String browser = args[0];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Browser, which they want to use!!");
        String browser = scanner.next();
        browser = browser.toLowerCase();

        switch (browser){

            case "chrome":
                System.out.println("Start the Chrome Browser");
                System.out.println("..........");
                System.out.println("TC1");
                System.out.println("TC2");
                break;
            case "Mozilla" :
                System.out.println("Start the Mozilla browser");
                break;
            case "edge" :
                System.out.println("Start the edge Browser");
                break;
            default:
                System.out.println("I have no idea which this browser");
                break;
        }
    }
}
