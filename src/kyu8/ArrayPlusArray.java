package kyu8;

/*
 * 8 kyu - Array plus array
 *
 * https://www.codewars.com/kata/5a2be17aee1aaefe2a000151/train/java
 *
 * DESCRIPTION:
 * I'm new to coding and now I want to get the sum of two arrays...
 * Actually the sum of all their elements. I'll appreciate for your help.
 * P.S. Each array includes only integer numbers. Output is a number too.
*/

import java.util.Arrays;
import java.util.stream.IntStream;

public class ArrayPlusArray {
    public static int arrayPlusArray(int[] arr1, int[] arr2) {
        return Arrays.stream(IntStream.concat(IntStream.of(arr1), IntStream.of(arr2))
                .toArray()).sum();
    }
}
