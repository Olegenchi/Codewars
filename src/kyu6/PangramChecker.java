package kyu6;

/*
 * 6 kyu - Detect Pangram
 *
 * https://www.codewars.com/kata/545cedaa9943f7fe7b000048/train/java
 *
 * DESCRIPTION:
 * A pangram is a sentence that contains every single letter of the alphabet at least once.
 * For example, the sentence "The quick brown fox jumps over the lazy dog" is a pangram,
 * because it uses the letters A-Z at least once (case is irrelevant).
 *
 * Given a string, detect whether or not it is a pangram. Return True if it is, False if not.
 * Ignore numbers and punctuation.
*/

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class PangramChecker {
    public boolean check(String sentence){
        String newSentence = sentence.replaceAll("[^A-Za-z]", "");
        Set<String> letters = new HashSet<>(Arrays.asList(newSentence.split("")));
        return letters.size() >= 26;
    }
}
