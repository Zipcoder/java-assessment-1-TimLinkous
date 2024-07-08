package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class IntegerUtils {


    /**
     * @param n integer value input by client
     * @return the sum of all integers between 0 and not including `n`
     */
    public static Integer getSumOfN(Integer n) {
        int sum = n * (n + 1)/2;
        return sum;
//        return null;
    }

    /**
     * @param n integer value input by client
     * @return the product of all integers between 0 and not including `n`
     */
    public static Integer getProductOfN(Integer n) {
        int result = 1;
        for (int i = 2; i <= n; i++)
            result = result * i;
        return result;
//        return null;
    }

    /**
     * @param val integer value input by client
     * @return integer with identical digits in the reverse order
     */
    public static Integer reverseDigits(Integer val) {
        String reverse = new StringBuilder(String.valueOf(val)).reverse().toString();
        return Integer.parseInt(reverse);
//        return null;
    }
}
