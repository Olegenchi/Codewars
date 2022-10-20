package kyu7;

/*
 * 7 kyu - Fibonacci
 *
 * https://www.codewars.com/kata/57a1d5ef7cb1f3db590002af/train/java
 *
 * DESCRIPTION:
 * Create function fib that returns n'th element of Fibonacci sequence (classic programming task).
*/

public class Fibonacci {
    public static long fib(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }
}
