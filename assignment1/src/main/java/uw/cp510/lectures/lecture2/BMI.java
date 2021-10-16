package uw.cp510.lectures.lecture2;

import java.util.Scanner;

/**
 * BMI is a cli program that accepts height and weight and determines the BMI and
 * then prints out the category.
 *
 */
public class BMI {
    /**
     * Entry method
     * @param args
     */
    public static void main(String[] args) {

        Scanner consoleInput = new Scanner(System.in);  //import java.util.Scanner
        System.out.println("Enter next person's information:");

        System.out.print("height (in inches)? ");
        double height = consoleInput.nextDouble();

        System.out.print("weight (in pounds)? ");
        double weight = consoleInput.nextDouble();

        double bmi = weight / (height * height) * 703;
        System.out.printf("The person body mass index  = %5.2f\n", bmi);

        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi <= 24.9) {
            System.out.println("Healthy weight");
        } else if (bmi <= 29.9) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obesity");
        }
    }
}
