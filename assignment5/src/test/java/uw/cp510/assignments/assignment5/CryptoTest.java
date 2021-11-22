package uw.cp510.assignments.assignment5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CryptoTest {
    /**
     * Verifies the form will display a message then the value is out of the range or
     * not an integer.
     */
    @Test
    public void canEncryptStringsProperly() {
        System.out.println("\n**************************************");
        System.out.println("Testing encrypting strings");
        String[] stringsToEncrypt = new String[]{
                "Alligator",
                "Squirrel",
                "Wallaby",
                "Parrot",
                "Moose",
                "Lynx",
                "cat",
                "42",
                "X"
        };

        String[] expectedValues = new String[]{
                "Alligator",
                "Squirrel",
                "Wallaby",
                "Parrot",
                "Moose",
                "Lynx",
                "cat",
                "42",
                "X"
        };

        System.out.println("**************************************");
        for (int i = 0; i <= expectedValues.length - 1; i++) {
            String actual = Crypto.encrypt(stringsToEncrypt[i]);
            String expected = expectedValues[i];
            assertFalse(actual.equals(expected));
        }
    }
}
