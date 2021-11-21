package uw.cp510.assignments.assignment4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class UtilsTest {
    /**
     * Verifies the form will display a message then the value is out of the range or
     * not an integer.
     */
    @Test
    public void canValidateAndReturnDataEnteredTest() {
        System.out.println("\n**************************************");
        System.out.println("Test user: Please enter the following invalid values:");
        System.out.println("\t22 (22 is above range");
        System.out.println("\t1 (1 is below range");
        System.out.println("\tFF (FF is not an integer:()");
        System.out.println("and then ANY valid value in the form please");
        System.out.println("**************************************");
        int actual = 0;
        int min = 1;
        int max = 20;
        try {
            actual = Utils.askInt(10,20);
        } catch (OpCanceledException e) {
            e.printStackTrace();
        }
        assertTrue(actual >= min && actual <= max);
    }

    /**
     * For this manual test enter the integer 5.
     */
    @Test
    public void canReturnAnIntegerTest() {
        System.out.println("\n**************************************");
        System.out.println("\nTest user enter 5 in the form please");
        System.out.println("\n**************************************");
        int actual = 0;
        int expected = 5;
        try {
            actual = Utils.askInt(1,20);
        } catch (OpCanceledException e) {
            e.printStackTrace();
        }
        assertTrue(expected == actual);
    }


    /**
     * This test that pressing cancel throws the OpCanceledException.
     */
    @Test
    public void cancelingThrowsOpCanceledExceptionTest() {
        System.out.println("\n**************************************");
        System.out.println("\nTest user: Press cancel on the form please");
        System.out.println("\n**************************************");
        String actual = "";
        String expected = "uw.cp510.assignments.assignment4.OpCanceledException";
        try {
            Utils.askInt(1,20);
        } catch (OpCanceledException e) {
            e.printStackTrace();
            actual = e.getClass().getName();
        }
        assertTrue(expected.equals(actual));
    }
}
