package uw.cp510.lectures.lecture2;

import java.util.Scanner;

public class ReverseWord {
    public static void main(String[] args) {
        Scanner consoleInput = new Scanner(System.in);  //import java.util.Scanner
        System.out.println("Enter a word to reverse:");
        String word = consoleInput.next();
        char[] strings = new char[word.length()];
        for (int i = 0; i < word.length(); i++ ) {
            strings[i] = word.charAt(i);
        }
        StringBuilder sb = new StringBuilder();

        int index = word.length() - 1;
        for (int i = 0; i < word.length(); i++ ) {
            sb.append(strings[index]);
            index--;
        }
        System.out.println(sb);
    }
}
