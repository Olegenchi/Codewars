package kyu7;

/*
 * 7 kyu - Dot Calculator
 *
 * https://www.codewars.com/kata/6071ef9cbe6ec400228d9531/train/java
 *
 * DESCRIPTION:
 * You have to write a calculator that receives strings for input.
 * The dots will represent the number in the equation.
 * There will be dots on one side, an operator, and dots again after the operator.
 * The dots and the operator will be separated by one space.
 *
 * Here are the following valid operators :
 *      + Addition
 *      - Subtraction
 *      * Multiplication
 *      // Integer Division
 *
 * Your Work (Task)
 * You'll have to return a string that contains dots, as many the equation returns.
 * If the result is 0, return the empty string.
 * When it comes to subtraction, the first number will always be greater than or equal to the second number.
 *
 * Examples (Input => Output)
 *      * "..... + ..............." => "...................."
 *      * "..... - ..."             => ".."
 *      * "..... - ."               => "...."
 *      * "..... * ..."             => "..............."
 *      * "..... * .."              => ".........."
 *      * "..... // .."             => ".."
 *      * "..... // ."              => "....."
 *      * ". // .."                 => ""
 *      * ".. - .."                 => ""
*/

public class DotCalc {
    public static void main(String[] args) {
        dotCalc("..... - .");
        System.out.println(dotCalc("..... - ."));
    }
    public static String dotCalc(String txt) {
        if (txt.contains("+")) {
            String[] a = txt.split("\\+");
            return a[0].trim() + a[1].trim();
        }
        if (txt.contains("-")) {
            String[] a = txt.split("-");
            if (a[0].trim().length() == a[1].trim().length()) {
                return "";
            }
            return a[0].trim().substring(0, a[0].trim().length() - a[1].trim().length());
        }
        if (txt.contains("*")) {
            StringBuilder sb = new StringBuilder();
            String[] a = txt.split("\\*");
            int b = a[0].trim().length() * a[1].trim().length();
            for (int i = 0; i < b; i++) {
                sb.append(".");
            }
            return sb.toString();
        }
        if (txt.contains("//")) {
            StringBuilder sb = new StringBuilder();
            String[] a = txt.split("//");
            if (a[0].trim().length() < a[1].trim().length()) {
                return "";
            }
            int b = a[0].trim().length() / a[1].trim().length();
            for (int i = 0; i < b; i++) {
                sb.append(".");
            }
            return sb.toString();
        }
        return "";
    }
}
