package uw.cp510.assignments.assignment5;

import org.junit.jupiter.api.Test;

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
                "Alligators",
                "Alligator",
                "Squirrel",
                "Wallaby",
                "Parrot",
                "Moose",
                "Lynx",
                "cat",
                "42",
                "X",
                ""
        };

        System.out.println("**************************************");
        for (int i = 0; i <= stringsToEncrypt.length - 1; i++) {
            String encrypted = Crypto.encrypt(stringsToEncrypt[i]);
            String decrypted = Crypto.decrypt(encrypted);
            assertTrue(decrypted.equals(stringsToEncrypt[i]));
        }
    }
}
