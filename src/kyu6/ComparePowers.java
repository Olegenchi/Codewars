package kyu6;

/*
 * 6 kyu - Compare powers
 *
 * https://www.codewars.com/kata/55b2549a781b5336c0000103/train/java
 *
 * DESCRIPTION:
 * You certainly can tell which is the larger number between 210 and 215.
 * But what about, say, 210 and 310? You know this one too.
 * Things tend to get a bit more complicated with both different bases
 * and exponents: which is larger between 39 and 56?
 * Well, by now you have surely guessed that you have to build a function to compare powers,
 * returning -1 if the first member is larger, 0 if they are equal, 1 otherwise;
 * powers to compare will be provided in the [base, exponent] format:
 *
 *      comparePowers(new int[]{2, 10}, new int[]{2, 15}) ==  1;
 *      comparePowers(new int[]{2, 10}, new int[]{3, 10}) ==  1;
 *      comparePowers(new int[]{2, 10}, new int[]{2, 10}) ==  0;
 *      comparePowers(new int[]{3,  9}, new int[]{5,  6}) == -1;
 *      comparePowers(new int[]{7,  7}, new int[]{5,  8}) == -1;
 *
 * Only positive integers will be tested, including bigger numbers - you are warned now, so be diligent try to implement an efficient solution not to drain too much on CW resources ;)!
*/

public class ComparePowers {
    public static void main(String[] args) {
        System.out.println(comparePowers(new int[] {3, 9}, new int[] {5, 6}));
        System.out.println(comparePowers(new int[] {7, 7}, new int[] {5, 8}));
        System.out.println(comparePowers(new int[] {2, 10}, new int[] {4, 15}));
    }

    public static int comparePowers(int[] number1, int[] number2) {
        double a = number1[1] * Math.log(number1[0]);
        double b = number2[1] * Math.log(number2[0]);
        return a == b ? 0 : a > b ? -1 : 1;
    }
}
