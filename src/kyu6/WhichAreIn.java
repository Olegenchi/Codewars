package kyu6;

/*
 * 6 kyu - Which are in?
 *
 * https://www.codewars.com/kata/550554fd08b86f84fe000a58/train/java
 *
 * DESCRIPTION:
 * Given two arrays of strings a1 and a2 return a sorted array r in lexicographical order
 * of the strings of a1 which are substrings of strings of a2.
 *
 * Example 1:
 *      a1 = ["arp", "live", "strong"]
 *      a2 = ["lively", "alive", "harp", "sharp", "armstrong"]
 *      returns ["arp", "live", "strong"]
 * Example 2:
 *      a1 = ["tarp", "mice", "bull"]
 *      a2 = ["lively", "alive", "harp", "sharp", "armstrong"]
 *      returns []
 *
 * Notes:
 *      -Arrays are written in "general" notation. See "Your Test Cases" for examples in your language.
 *      -In Shell bash a1 and a2 are strings. The return is a string where words are separated by commas.
 *      -Beware: r must be without duplicates.
*/

import java.util.Set;
import java.util.TreeSet;

public class WhichAreIn {
    public static void main(String[] args) {
        inArray(new String[]{ "arp", "live", "strong" },
                new String[]{ "lively", "alive", "harp", "sharp", "armstrong" });
    }

    public static String[] inArray(String[] array1, String[] array2) {
        Set<String> words = new TreeSet<>();
        for (String a : array2) {
            for (String b : array1) {
                if (a.contains(b)) {
                    words.add(b);
                }
            }
        }
        for (String m : words) {
            System.out.println(m);
        }
        return words.toArray(new String[words.size()]);
    }
}
