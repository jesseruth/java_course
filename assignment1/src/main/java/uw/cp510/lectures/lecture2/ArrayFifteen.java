package uw.cp510.lectures.lecture2;

public class ArrayFifteen {
    public static void main(String[] args) {

        int[] numbers = new int[15];
        int index = 0;
        for (int i = 0; index < numbers.length; i++) {
            if (i % 2 != 0) {
                numbers[index++] = i;
            }
        }

        for (int i : numbers) {
            System.out.println(i);
        }
    }
}
