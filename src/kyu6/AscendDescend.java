package kyu6;

/*
 * 6 kyu - Ascend, Descend, Repeat?
 *
 * https://www.codewars.com/kata/62ca07aaedc75c88fb95ee2f/train/java
 *
 * DESCRIPTION:
 * You are given three integer inputs: length, minimum, and maximum.
 *
 * Return a string that:
 *      1. Starts at minimum
 *      2. Ascends one at a time until reaching the maximum, then
 *      3. Decends one at a time until reaching the minimum
 *      4. Repeat until the string is the appropriate length
 *
 * Examples:
 *      length: 5, minimum: 1, maximum: 3   ==>  "12321"
 *      length: 14, minimum: 0, maximum: 2  ==>  "01210121012101"
 *      length: 11, minimum: 5, maximum: 9  ==>  "56789876567"
 *
 * Notes:
 *      length will always be non-negative
 *      negative numbers can appear for minimum and maximum values
 *      hyphens/dashes ("-") for negative numbers do count towards the length
 *      the resulting string must be truncated to the exact length provided
 *      return an empty string if maximum < minimum or length == 0
 *      minimum and maximum can equal one another and result in a single number repeated for the length of the string
*/

public class AscendDescend {
    public static String ascendDescend(int length, int minimum, int maximum) {
        StringBuilder sb = new StringBuilder();
        if (length <= 0 || maximum < minimum) {
            return "";
        }
        for (int j = 0; j <= length; j++) {
            for (int i = minimum; i <= maximum; i++) {
                sb.append(i);
            }
            for (int i = maximum - 1; i > minimum; i--) {
                sb.append(i);
            }
        }
        sb.delete(length, sb.length());
        return sb.toString();
    }
}
