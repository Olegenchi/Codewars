package kyu6;

/*
 * 6 kyu - Highest Scoring Word
 *
 * https://www.codewars.com/kata/57eb8fcdf670e99d9b000272/train/java
 *
 * DESCRIPTION:
 * Given a string of words, you need to find the highest scoring word.
 * Each letter of a word scores points according to its position in the alphabet: a = 1, b = 2, c = 3 etc.
 * You need to return the highest scoring word as a string.
 * If two words score the same, return the word that appears earliest in the original string.
 * All letters will be lowercase and all inputs will be valid.
*/

import java.util.Arrays;
import java.util.Comparator;

public class HighestScoringWord {
    public static void main(String[] args) {
        high("man i need a taxi up to ubud");
    }
    public static String high(String s) {
        return Arrays.stream(s.split(" "))
                .max(Comparator.comparingInt(
                        a -> a.chars().map(i -> i - 96).sum()
                )).get();
    }
}
