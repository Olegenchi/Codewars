package kyu7;

/*
 * 7 kyu - Count the divisors of a number
 *
 * https://www.codewars.com/kata/542c0f198e077084c0000c2e/train/java
 *
 * DESCRIPTION:
 * Count the number of divisors of a positive integer n.
 * Random tests go up to n = 500000.
 *
 * Examples (input --> output):
 *      4 --> 3 (1, 2, 4)
 *      5 --> 2 (1, 5)
 *      12 --> 6 (1, 2, 3, 4, 6, 12)
 *      30 --> 8 (1, 2, 3, 5, 6, 10, 15, 30)
 *
 * Note you should only return a number, the count of divisors.
 * The numbers between parentheses are shown only for you to see which numbers are counted in each case.
*/

public class NumberOfDivisors {
    public long numberOfDivisors(int n) {
        int count = 1;
        int a = 1;

        while (a <= n/2) {
            if (n % a == 0) {
                count += 1;
            }
            a += 1;
        }
        return count;
    }
}
