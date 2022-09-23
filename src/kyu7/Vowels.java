package kyu7;

/*
 * 7 kyu - Vowel Count
 *
 * https://www.codewars.com/kata/54ff3102c1bad923760001f3/train/java
 *
 * DESCRIPTION:
 * Return the number (count) of vowels in the given string.
 * We will consider a, e, i, o, u as vowels for this Kata (but not y).
 * The input string will only consist of lower case letters and/or spaces.
*/

public class Vowels {
    public static int getCount(String str) {
        if (str.isEmpty()) {
            return 0;
        }

        int vowelsCount = 0;
        String[] letter = str.split("");
        for (int i = 0; i < str.length(); i++) {
            if (letter[i].equals("a") ||
                letter[i].equals("e") ||
                letter[i].equals("i") ||
                letter[i].equals("o") ||
                letter[i].equals("u")) {
                vowelsCount++;
            }
        }
        return vowelsCount;
    }
}
