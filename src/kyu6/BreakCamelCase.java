package kyu6;

/*
 * 6 kyu - Break camelCase
 *
 * https://www.codewars.com/kata/5208f99aee097e6552000148/train/java
 *
 * DESCRIPTION:
 * Complete the solution so that the function will break up camel casing, using a space between words.
 *
 * Example:
 *      "camelCasing"  =>  "camel Casing"
 *      "identifier"   =>  "identifier"
 *      ""             =>  ""
*/

public class BreakCamelCase {
    public static void main(String[] args) {
        camelCase("camelCasing");
    }
    public static String camelCase(String input) {
        String[] words = input.split("(?<!^)(?=[A-Z])");
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            sb.append(word).append(" ");
        }
        System.out.println(sb.toString().trim());
        return sb.toString().trim();
    }
}
