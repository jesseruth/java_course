package uw.cp510.lectures.lecture2;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner consoleInput = new Scanner(System.in);  //import java.util.Scanner

        String response;

        do {
            System.out.println("Learning loops is fun");
            System.out.println("Do you want to continue");
            response = consoleInput.next();
        } while (response.equalsIgnoreCase("y"));
    }
}
