package uw.cp510.assignments.assignment2;

import java.math.BigInteger;
import java.util.Arrays;

/**
 * This utility class implements some common class methods that perform arithmetic calculations.
 */
public class Numbers {

    /**
     * This method will return true if a given number is prime and false if num is not prime. 1 must be treated as
     * non-prime.
     *
     * @param num
     * @return
     */
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    /**
     * This method will calculate the least common multiple of two given numbers. The numbers must be greater than 0.
     *
     * @param param1
     * @param param2
     * @return
     */
    public static int lcm(int param1, int param2) {
        if (param1 <= 0 || param2 <= 0) {
            return 0;
        }

        int start = param1 > param2 ? param1 : param2;

        while (true) {
            if (start % param1 == 0 && start % param2 == 0) {
                return start;
            }
            start++;
        }
    }

    /**
     * This method will calculate the greatest common factor of two given numbers. The numbers must be greater than 0.
     *
     * @param param1
     * @param param2
     * @return
     */
    public static int gcf(int param1, int param2) {
        if (param1 <= 0 || param2 <= 0) {
            return 0;
        }

        int start = param1 < param2 ? param1 : param2;

        while (start > 0) {
            if (param1 % start == 0 && param2 % start == 0) {
                return start;
            }
            start--;
        }

        return 1;
    }

    /**
     * This method will calculate the mean of the numbers in a given array. The array must contain at least 1 element.
     *
     * @param arr
     * @return
     */
    public static double mean(double[] arr) {
        double sum = 0;
        for (double num : arr) {
            sum = sum + num;
        }
        return sum / arr.length;
    }

    /**
     * This method will calculate the median of the numbers in a given array. The array must contain at least 1 element.
     * The original array must not be modified. To perform the calculation, make a copy of the array and sort the copy.
     * You may find the java.util.Arrays utility class to be helpful.
     *
     * @param arr
     * @return
     */
    public static double median(double[] arr) {
        int size = arr.length;
        double[] sorted = Arrays.copyOf(arr, size);
        Arrays.sort(sorted);
        if (size % 2 == 1) {
            return sorted[size / 2];
        } else {
            return (sorted[size / 2] + sorted[size / 2 - 1]) / 2;
        }
    }

    /**
     * This method will calculate the factorial of the given number. The number must be greater than or equal to 0.
     * Note that 0! (0 factorial) is 1. Note also that you will not be able to calculate the factorial of a number
     * greater than 20.
     *
     * @param num
     * @return
     */
    public static long factorial(long num) {
        if (num == 0) {
            return 1;
        }

        return num * factorial(num - 1);
    }

    /**
     * Optional: This method will calculate the factorial of the given number. The number must be greater than or equal
     * to 0. Note that 0! (0 factorial) is 1.
     *
     * @param num
     * @return
     */
    public static BigInteger factorial(BigInteger num) {
        if (num.equals(0)) {
            return new BigInteger("1");
        }
        return num.multiply(factorial(num.subtract(new BigInteger("1"))));
    }
}
