package uw.cp510.assignments.assignment4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class UtilsTest {

    /**
     * For this manual test enter the integer 5.
     */
    @Test
    public void canReturnAnIntegerTest() {
        Integer actual = 0;
        Integer expected = 5;
        try {
            actual = Utils.askInt(1,20);
        } catch (OpCanceledException e) {
            e.printStackTrace();
        }
        assertTrue(expected == actual);
    }
    @Test
    public void cancelingThrowsOpCanceledExceptionTest() {
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
