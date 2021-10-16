package uw.cp510.lectures.lecture2;

import java.util.Scanner;

public class Greeting {

    public static void main(String[] args) {
        Scanner consoleInput = new Scanner(System.in);  //import java.util.Scanner
        System.out.println("First Name:");
        String firstName = consoleInput.next();
        System.out.println("Last Name:");
        String lastName = consoleInput.next();
        System.out.println(greetings(firstName, lastName));


    }
    public static String greetings(String firstName, String lastName) {
        String greeting = String.format("Hello %s %s. How are you today?", firstName, lastName);
        return greeting;
    }
}
