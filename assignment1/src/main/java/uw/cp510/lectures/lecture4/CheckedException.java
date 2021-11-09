package uw.cp510.lectures.lecture4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CheckedException {
    private static String someFile = "/home/laptop/src/java_course/assignment1/src/main/java/uw/cp510/assignments/assignment1/someFile.txt";

    public static int charIndex(String name, char find) {
        int count = 0;
        while (count <= name.length()) {
            if (name.charAt(count) == find) {
                return count;
            }
            count ++;
        }
        return -1;
    }

    public static void main(String[] args) {
        FileReader file = null;
        try {
            file = new FileReader(someFile);
            BufferedReader bufferedReader = new BufferedReader(file);
            System.out.println(bufferedReader.readLine());

        } catch (IOException e) {
            System.out.println(someFile + " is not found");
//            throw new IOException("File not found");
        }

        String str1 = "Java";
        String str2 = "";
        String str3 = " ";
        System.out.println(str1.length());
        System.out.println(str2.length());
        System.out.println(str3.length());

        String name = "Java Program";
        System.out.println(charIndex(name, 'r'));
    }
}
