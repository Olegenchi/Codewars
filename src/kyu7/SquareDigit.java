package kyu7;

/*
 * 7 kyu - Square Every Digit
 *
 * https://www.codewars.com/kata/546e2562b03326a88e000020/train/java
 *
 * DESCRIPTION:
 * Welcome. In this kata, you are asked to square every digit of a number and concatenate them.
 * For example, if we run 9119 through the function, 811181 will come out, because 9^2 is 81 and 1^2 is 1.
 * Note: The function accepts an integer and returns an integer
*/

public class SquareDigit {
    public int squareDigits(int n) {
        StringBuilder sb = new StringBuilder();
        String a = String.valueOf(n);
        String[] b = a.split("");
        for (int i = 0; i < b.length; i++) {
            sb.append(Integer.parseInt(b[i]) * Integer.parseInt(b[i]));
        }
        return Integer.parseInt(String.valueOf(sb));
    }
}
