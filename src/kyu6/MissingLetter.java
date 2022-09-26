package kyu6;

/*
 * 6 kyu - Find the missing letter
 *
 * https://www.codewars.com/kata/5839edaa6754d6fec10000a2/train/java
 *
 * DESCRIPTION:
 * Find the missing letter
 * Write a method that takes an array of consecutive (increasing) letters
 * as input and that returns the missing letter in the array.
 * You will always get an valid array. And it will be always exactly one letter be missing.
 * The length of the array will always be at least 2.
 * The array will always contain letters in only one case.
 * Use the English alphabet with 26 letters!
 *
 * Example:
 *      ['a','b','c','d','f'] -> 'e' ['O','Q','R','S'] -> 'P'
 *      ["a","b","c","d","f"] -> "e"
 *      ["O","Q","R","S"] -> "P"
*/

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MissingLetter {
    public static char findMissingLetter(char[] array) {
        int a = 0;
        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int prev = array[i - 1];
            if (current - prev != 1) {
                a = prev + 1;
            }
        }
        return (char) a;
    }
}
