package uw.cp510.assignments.assignment5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Crypto class contains two methods: encrypt and decrypt, which will
 * encrypt and decrypt a string, respectively.
 *
 * @author Jesse Ruth
 */
public class Crypto {
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
//        System.out.println("Encrypting: " + str + "\nOriginal Length: " + str.length());
        StringBuilder newString = new StringBuilder();
        String padChar = "\u0000";
        newString.append(str);
        int modulo3 = str.length() % 3;
        if (str.length() == 0 || modulo3 == 0) {
            newString.append(padChar);
            newString.append(padChar);
            newString.append(padChar);
        } else if (modulo3 == 1) {
            newString.append(padChar);
            newString.append(padChar);
        } else if (modulo3 == 2) {
            newString.append(padChar);
        }
        String finalString = newString.toString();
//        System.out.println("New Word: \"" + finalString + "\"");

        ArrayList<char[]> wordBlocks = new ArrayList<char[]>();

        char[] characters = finalString.toCharArray();
        int counter = 1;

        for (char ccc : characters) {
//            System.out.println("counter " + counter);
//            System.out.println("no cast:" + ccc);
//            System.out.printf("cast %3d \n", (int) ccc);
            if (counter % 3 == 0 && counter != 0) {
                char[] newA = Arrays.copyOfRange(characters, counter - 3, counter);
                wordBlocks.add(newA);
            }
            counter++;
        }

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

        String[] incremented = new String[finalString.length()];
        int index = 0;
        for (char[] wordB: rotated) {
           for (char c : wordB) {
               char temp = (char)(c + index);
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
        if (str.length() % 3 != 0) throw new Error("Not properly encoded");

        char[] chars = str.toCharArray();
        String[] characters = new String[chars.length];
        for (int i = 0; i < chars.length; i++) {
            if (i == 0) {
                characters[i] = String.valueOf(chars[i]);
            } else {
                characters[i] = String.valueOf((char) (chars[i] - 1));
            }
        }

        ArrayList<String[]> wordBlocks = new ArrayList<String[]>();

        int counter = 1;
        for (String ccc : characters) {
            if (counter % 3 == 0 && counter != 0) {
                String[] newA = Arrays.copyOfRange(characters, counter - 3, counter);
                wordBlocks.add(newA);
            }
            counter++;
        }

        System.out.println(str.length());
        System.out.println(wordBlocks.size());
        ArrayList<String[]> rotated = new ArrayList<String[]>();
        if (wordBlocks.size() > 1) {
            for (int i = wordBlocks.size(); i >= 0; i--) {
                if (i == 0) {
                    rotated.add(wordBlocks.get(0));
                } else {
                    rotated.add(wordBlocks.get(i - 1));
                }
            }
        } else {
            rotated.add(wordBlocks.get(0));
        }

        String[] flattened = new String[rotated.size() * 3];
        int index = 0;
        for (String[] wordB: rotated) {
            for (String c : wordB) {
                flattened[index] = c;
                index++;
            }
        }

        return String.join("", flattened);
    }
}
