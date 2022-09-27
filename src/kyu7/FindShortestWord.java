package kyu7;

/*
 * 7 kyu - Shortest Word
 *
 * https://www.codewars.com/kata/57cebe1dc6fdc20c57000ac9/train/java
 *
 * DESCRIPTION:
 * Simple, given a string of words, return the length of the shortest word(s).
 * String will never be empty and you do not need to account for different data types.
*/

import java.util.Arrays;
import java.util.Comparator;

public class FindShortestWord {
    public static void main(String[] args) {
        findShort("bitcoin take over the world maybe who knows perhaps");
    }
    public static int findShort(String s) {
        String[] words = s.split(" ");
        int min = words[0].length();
        for (String word : words) {
            if (word.length() < min) {
                min = word.length();
            }
        }
        System.out.println(min);
        return min;
    }
}
