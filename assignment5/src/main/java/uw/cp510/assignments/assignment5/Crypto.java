package uw.cp510.assignments.assignment5;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Crypto class contains two methods: encrypt and decrypt, which will
 * encrypt and decrypt a string, respectively.
 *
 * @author Jesse Ruth
 */
public class Crypto {
    private Crypto(){};

    /**
     * Encrypts a string by padding the end of the input string with the null character,
     * '\u0000'. The number of characters to pad depends on the length of the string; after
     * padding the length of the string will be greater than 0, and a multiple of 3; there
     * must always be at least one pad character.
     *
     * @param str
     * @return
     */
    public static String encrypt(String str) {
        // Pad the string
        StringBuilder padBuilder = new StringBuilder();
        String padChar = "\u0000";
        padBuilder.append(str);

        int modulo3 = str.length() % 3;
        if (str.length() == 0 || modulo3 == 0) {
            padBuilder.append(padChar);
            padBuilder.append(padChar);
            padBuilder.append(padChar);
        } else if (modulo3 == 1) {
            padBuilder.append(padChar);
            padBuilder.append(padChar);
        } else {
            padBuilder.append(padChar);
        }
        String paddedString = padBuilder.toString();

        // Break into blocks
        ArrayList<char[]> wordBlocks = new ArrayList<char[]>();

        char[] characters = paddedString.toCharArray();
        for (int i = 1; i <= characters.length; i++) {
            if (i % 3 == 0) {
                wordBlocks.add(Arrays.copyOfRange(characters, i - 3, i));
            }
        }

        // rotate
        ArrayList<char[]> rotated = new ArrayList<char[]>();

        if (wordBlocks.size() > 1) {
            for (int i = 0; i <= wordBlocks.size() - 1; i++) {
                if (i == 0) {
                    rotated.add(wordBlocks.get(wordBlocks.size() - 1));
                } else {
                    rotated.add(wordBlocks.get(i - 1));
                }
            }
        } else {
            rotated.add(wordBlocks.get(0));
        }

        // Increment
        String[] incremented = new String[paddedString.length()];
        int index = 0;
        for (char[] wordB : rotated) {
            for (char c : wordB) {
                char temp = (char) (c + index);
                incremented[index] = String.valueOf(temp);
                index++;
            }
        }

        return String.join("", incremented);
    }

    /**
     * @param str A string that was encrypted using Crypto.encrypt method.
     * @return The decrypted plain text value.
     */
    public static String decrypt(String str) {
        // Decrement
        char[] chars = str.toCharArray();
        String[] characters = new String[chars.length];
        for (int i = 0; i < chars.length; i++) {
            if (i == 0) {
                char value = chars[i];
                characters[i] = String.valueOf(value);
            } else {
                char value = (char) (chars[i] - i);
                characters[i] = String.valueOf(value);
            }
        }

        // break into word blocks
        ArrayList<String[]> wordBlocks = new ArrayList<String[]>();

        for (int i = 1; i <= characters.length; i++) {
            if (i % 3 == 0) {
                wordBlocks.add(Arrays.copyOfRange(characters, i - 3, i));
            }
        }

        // un rotate
        ArrayList<String[]> rotated = new ArrayList<String[]>();
        if (wordBlocks.size() > 1) {
            for (int i = wordBlocks.size() - 1; i >= 0; i--) {
                if (i == 0) {
                    rotated.add(wordBlocks.get(0));
                } else {
                    rotated.add(wordBlocks.get(wordBlocks.size() - i));
                }
            }
        } else {
            rotated.add(wordBlocks.get(0));
        }

        // Flatten
        String[] flattened = new String[rotated.size() * 3];
        int index = 0;
        for (String[] wordB : rotated) {
            for (String c : wordB) {
                flattened[index] = c;
                index++;
            }
        }

        return String.join("", flattened).replace("\0", "");
    }
}
