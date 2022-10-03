package kyu7;

/*
 * 7 kyu - Reverse words
 *
 * https://www.codewars.com/kata/5259b20d6021e9e14c0010d4/train/java
 *
 * DESCRIPTION:
 * Complete the function that accepts a string parameter, and reverses each word in the string.
 * All spaces in the string should be retained.
 *
 * Examples:
 *      "This is an example!" ==> "sihT si na !elpmaxe"
 *      "double  spaces"      ==> "elbuod  secaps"
*/

public class ReverseWords {
    public static String reverseWords(final String original) {
        String[] words = original.split(" ");
        if (words.length == 0) {
            return original;
        }
        String reverse = "";
        for(String word : words){
            StringBuilder sb = new StringBuilder();
            reverse += sb.append(word)
                    .reverse()
                    .append(" ");
        }
        return reverse.trim();
    }
}
