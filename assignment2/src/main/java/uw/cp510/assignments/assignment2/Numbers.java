package uw.cp510.assignments.assignment2;

import java.math.BigInteger;
import java.util.Arrays;

/**
 * This utility class implements some common class methods that perform arithmetic calculations.
 *
 * @author Jesse Ruth
 */
public class Numbers {

    /**
     * This method will return true if a given number is prime and false if num is not prime. 1 must
     * be treated as non-prime.
     *
     * @param num the given integer
     * @return true if a given number is prime and false if num is not prime
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
     * This method will calculate the least common multiple of two given numbers. The numbers must
     * be greater than 0.
     *
     * @param param1 the first given integer
     * @param param2 the second given integer
     * @return the least common multiple of two given numbers
     */
    public static int lcm(int param1, int param2) {
        if (param1 <= 0 || param2 <= 0) {
            return 0;
        }

        int start = Math.max(param1, param2);

        while (true) {
            if (start % param1 == 0 && start % param2 == 0) {
                return start;
            }
            start++;
        }
    }

    /**
     * This method will calculate the greatest common factor of two given numbers. The numbers must
     * be greater than 0.
     *
     * @param param1 the first given integer
     * @param param2 the second given integer
     * @return the greatest common factor of two given numbers
     */
    public static int gcf(int param1, int param2) {
        if (param1 <= 0 || param2 <= 0) {
            return 0;
        }

        int start = Math.min(param1, param2);

        while (start > 0) {
            if (param1 % start == 0 && param2 % start == 0) {
                return start;
            }
            start--;
        }

        return 1;
    }

    /**
     * This method will calculate the mean of the numbers in a given array. The array must contain
     * at least 1 element.
     *
     * @param arr the given array
     * @return the mean of the numbers in a given array
     */
    public static double mean(double[] arr) {
        double sum = 0;
        for (double num : arr) {
            sum = sum + num;
        }
        return sum / arr.length;
    }

    /**
     * This method will calculate the median of the numbers in a given array. The array must contain
     * at least 1 element.The original array must not be modified. To perform the calculation, make
     * a copy of the array and sort the copy.
     * You may find the java.util.Arrays utility class to be helpful.
     *
     * @param arr the given array
     * @return the median of the numbers in a given array
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
     * This method will calculate the factorial of the given number. The number must be greater than
     * or equal to 0. Note that 0! (0 factorial) is 1. Note also that you will not be able to
     * calculate the factorial of a number greater than 20.
     *
     * @param num the given number
     * @return the factorial of the given number
     */
    public static long factorial(long num) throws Exception {
        if (num > 20) {
            throw new Exception();
        }

        if (num == 0) {
            return 1;
        }

        return num * factorial(num - 1);
    }

    /**
     * Optional: This method will calculate the factorial of the given number. The number must be
     * greater than or equal to 0. Note that 0! (0 factorial) is 1.
     *
     * @param num the given number
     * @return factorial of the given BigInteger
     */
    public static BigInteger factorial(BigInteger num) {
        int res = num.compareTo(new BigInteger("0"));
        if (res == 0 || res == -1) {
            return new BigInteger("1");
        }
        return num.multiply(factorial(num.subtract(new BigInteger("1"))));
    }
}
