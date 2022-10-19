package kyu6;

/*
 * 6 kyu - Find The Parity Outlier
 *
 * https://www.codewars.com/kata/5526fc09a1bbd946250002dc/train/java
 *
 * DESCRIPTION:
 * You are given an array (which will have a length of at least 3, but could be very large) containing integers.
 * The array is either entirely comprised of odd integers or entirely comprised of even integers
 * except for a single integer N. Write a method that takes the array as an argument and returns this "outlier" N.
 *
 * Examples:
 *      [2, 4, 0, 100, 4, 11, 2602, 36]
 *      Should return: 11 (the only odd number)
 *
 *      [160, 3, 1719, 19, 11, 13, -21]
 *      Should return: 160 (the only even number)
*/

import java.util.ArrayList;
import java.util.List;

public class FindOutlier {
    public static int find(int[] integers) {
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();

        for (int i = 0; i < integers.length; i++) {
            if (integers[i] % 2 == 0) {
                even.add(integers[i]);
            } else {
                odd.add(integers[i]);
            }
        }

        if (odd.size() > even.size()) {
            return even.get(0);
        } else {
            return odd.get(0);
        }
    }
}
