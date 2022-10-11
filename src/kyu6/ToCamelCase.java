package kyu6;

/*
 * 6 kyu - Convert string to camel case
 *
 * https://www.codewars.com/kata/517abf86da9663f1d2000003/train/java
 *
 * DESCRIPTION:
 * Complete the method/function so that it converts dash/underscore delimited words into camel casing.
 * The first word within the output should be capitalized only if
 * the original word was capitalized (known as Upper Camel Case, also often referred to as Pascal case).
 *
 * Examples:
 *      "the-stealth-warrior" gets converted to "theStealthWarrior"
 *      "The_Stealth_Warrior" gets converted to "TheStealthWarrior"
*/

public class ToCamelCase {
    static String toCamelCase(String s) {
        String[] words = s.split("[^a-zA-Z]");
        StringBuilder sb = new StringBuilder();
        sb.append(words[0]);

        for (int i = 1; i < words.length; i++) {
            sb.append(words[i].substring(0, 1).toUpperCase())
                    .append(words[i].substring(1));
        }
        return String.valueOf(sb);
    }
}
