package kyu7;

/*
 * 7 kyu - Isograms
 *
 * https://www.codewars.com/kata/54ba84be607a92aa900000f1/train/java
 *
 * DESCRIPTION:
 * An isogram is a word that has no repeating letters, consecutive or non-consecutive.
 * Implement a function that determines whether a string that contains only letters is an isogram.
 * Assume the empty string is an isogram. Ignore letter case.
 *
 * Example: (Input --> Output)
 *      "Dermatoglyphics" --> true
 *      "aba" --> false
 *      "moOse" --> false (ignore letter case)
*/

import java.util.Arrays;
import java.util.HashSet;

public class Isograms {
    public static boolean isIsogram(String str) {
        return str.length() == 0 || str.length() == new HashSet<>(Arrays.asList(str.toLowerCase().split("")))
                .size();
    }
}
