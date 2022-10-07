package kyu7;

/*
 * 7 kyu - Filter the number
 *
 * https://www.codewars.com/kata/55b051fac50a3292a9000025/train/java
 *
 * DESCRIPTION:
 * Oh, no! The number has been mixed up with the text. Your goal is to retrieve the number from the text,
 * can you return the number back to its original state?
 *
 * Task:
 * Your task is to return a number from a string.
 *
 * Details:
 * You will be given a string of numbers and letters mixed up,
 * you have to return all the numbers in that string in the order they occur.
*/

public class FilterTheNumber {
    public static long filterString(final String value) {
        if (value.isEmpty()) {
            return 0;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < value.length(); i++) {
            if (Character.isDigit(value.charAt(i))) {
                sb.append(value.charAt(i));
            }
        }
        return Long.parseLong(String.valueOf(sb));
    }
}
