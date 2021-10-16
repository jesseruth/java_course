package uw.cp510.lectures.lecture2;

import java.util.Scanner;

/**
 *
 */
public class EvenOrOdd {
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner consoleInput = new Scanner(System.in);  //import java.util.Scanner
        System.out.print("Enter a number: ");
        int number = consoleInput.nextInt();
        int test = number % 2;
        if (test == 0) {
            System.out.print("Even");
        } else {
            System.out.print("Odd");
        }
    }
}
