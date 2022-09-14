package kyu7;

/*
 * 7 kyu - Factorial
 *
 * https://www.codewars.com/kata/57a049e253ba33ac5e000212/train/java
 *
 * DESCRIPTION:
 * Your task is to write function factorial.
*/

public class Factorial {
    public static long factorial(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
