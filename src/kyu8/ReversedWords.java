package kyu8;

/*
 * 8 kyu - Reversed Words
 *
 * https://www.codewars.com/kata/51c8991dee245d7ddf00000e/train/java
 *
 * DESCRIPTION:
 * Complete the solution so that it reverses all of the words within the string passed in.
 *
 *      Example(Input --> Output):
 *      "The greatest victory is that which requires no battle" -->
 *      "battle no requires which that is victory greatest The"
*/

import java.util.ArrayList;

public class ReversedWords {
    public static String reverseWords(String str){
        ArrayList<String> wordsNew = new ArrayList<>();
        String [] words = str.split(" ");
        for (int i = words.length - 1; i >= 0; i--) {
            wordsNew.add(words[i]);
        }
        String arrayToString = String.join(" ", wordsNew);
        System.out.println(arrayToString);
        return arrayToString;
    }
}
