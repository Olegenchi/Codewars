package kyu6;

/*
 * 6 kyu -
 *
 * https://www.codewars.com/kata/5264d2b162488dc400000001/train/java
 *
 * DESCRIPTION:
 * Write a function that takes in a string of one or more words, and returns the same string,
 * but with all five or more letter words reversed (Just like the name of this Kata).
 * Strings passed in will consist of only letters and spaces.
 * Spaces will be included only when more than one word is present.
 *
 * Examples:
 *      spinWords( "Hey fellow warriors" ) => returns "Hey wollef sroirraw"
 *      spinWords( "This is a test") => returns "This is a test"
 *      spinWords( "This is another test" )=> returns "This is rehtona test"
*/

public class SpinWords {
    public static void main(String[] args) {
        spinWords("Hey wollef sroirraw");
    }
    public static String spinWords(String sentence) {
        StringBuilder sb = new StringBuilder();
        String[] words = sentence.split(" ");

        for (String word : words) {
            if (word.length() >= 5) {
                char[] array = word.toCharArray();
                StringBuilder result = new StringBuilder();
                for (int i = array.length - 1; i >= 0; i--) {
                    result.append(array[i]);
                }
                sb.append(result).append(" ");
            } else {
                sb.append(word).append(" ");
            }
        }
        System.out.println(sb);
        return sb.toString().trim();
    }
}
