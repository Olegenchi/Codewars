package kyu6;

/*
 * 6 kyu - Split Strings
 *
 * https://www.codewars.com/kata/515de9ae9dcfc28eb6000001/train/java
 *
 * DESCRIPTION:
 * Complete the solution so that it splits the string into pairs of two characters.
 * If the string contains an odd number of characters then it should replace
 * the missing second character of the final pair with an underscore ('_').
 *
 * Examples:
 *      'abc' =>  ['ab', 'c_']
 *      'abcdef' => ['ab', 'cd', 'ef']
*/

import java.util.ArrayList;
import java.util.List;

public class SplitStrings {
    public static String[] solution(String s) {
        if (s.length() == 0) {
            return new String[0];
        }
        String[] a = s.split("");
        List<String> splitStrings = new ArrayList<>();
        for (int i = 0; i < a.length - 1; i += 2) {
                splitStrings.add(a[i] + a[i+1]);
        }
        if (a.length % 2 != 0) {
            splitStrings.add(a[a.length - 1] + "_");
        }
        return splitStrings.toArray(String[]::new);
    }
}
