package kyu7;

/*
 * 7 kyu -
 *
 *
 *
 *
 *
 *
 *
*/

public class OddOrEven {
    public static String oddOrEven (int[] array) {
        int sum = 0;
        for (int digit : array) {
            sum += digit;
        }
        if (sum % 2 == 0 || sum == 0) {
            return "even";
        } else {
            return "odd";
        }
    }
}
