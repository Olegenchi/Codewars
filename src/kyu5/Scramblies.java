package kyu5;

/*
 * 5 kyu - Scramblies
 *
 * https://www.codewars.com/kata/55c04b4cc56a697bb0000048/train/java
 *
 * DESCRIPTION:
 * Complete the function scramble(str1, str2) that returns true if a portion of str1 characters can be rearranged to match str2, otherwise returns false.

Notes:

Only lower case letters will be used (a-z). No punctuation or digits will be included.
Performance needs to be considered.
Examples
scramble('rkqodlw', 'world') ==> True
scramble('cedewaraaossoqqyt', 'codewars') ==> True
scramble('katas', 'steak') ==> False
 *
 *
*/

public class Scramblies {
    public static boolean scramble(String str1, String str2) {
        if (str2 == null || str2.length() == 0) {
            return true;
        }
        if (str2.length() > str1.length()) {
            return false;
        }
        for (String letter: str2.split("")) {
            if (!str1.contains(letter)) {
                return false;
            }
            str1 = str1.replaceFirst(letter,"");
        }
        return true;
    }
}
