package kyu6;

/*
 * 6 kyu - Decode the Morse code
 *
 * https://www.codewars.com/kata/54b724efac3d5402db00065e/train/java
 *
 * DESCRIPTION:
 * In this kata you have to write a simple Morse code decoder.
 * While the Morse code is now mostly superseded by voice and digital data communication channels,
 * it still has its use in some applications around the world.
 *
 * The Morse code encodes every character as a sequence of "dots" and "dashes".
 * For example, the letter A is coded as ·−, letter Q is coded as −−·−, and digit 1 is coded as ·−−−−.
 * The Morse code is case-insensitive, traditionally capital letters are used.
 * When the message is written in Morse code, a single space is used to separate
 * the character codes and 3 spaces are used to separate words.
 * For example, the message HEY JUDE in Morse code is ···· · −·−−   ·−−− ··− −·· ·.
 *
 * NOTE: Extra spaces before or after the code have no meaning and should be ignored.
 *
 * In addition to letters, digits and some punctuation, there are some special service codes,
 * the most notorious of those is the international distress signal SOS (that was first issued by Titanic),
 * that is coded as ···−−−···. These special codes are treated as single special characters,
 * and usually are transmitted as separate words.
 *
 * Your task is to implement a function that would take the morse code as input and return a decoded human-readable string.
 *
 * For example:
 *      MorseCodeDecoder.decode(".... . -.--   .--- ..- -.. .")
 *      //should return "HEY JUDE"
 *
 * NOTE: For coding purposes you have to use ASCII characters . and -, not Unicode characters.
 *
 * The Morse code table is preloaded for you as a dictionary, feel free to use it:
 *      Java: MorseCode.get(".--")
*/

import java.util.*;

public class MorseCodeDecoder {
    public static void main(String[] args) {
        decode(".... . -.--   .--- ..- -.. .");
    }
    public static String decode(String morseCode) {
        Map<String, String> letters = new HashMap<>();
        letters.put(".-", "A");
        letters.put("-...", "B");
        letters.put("-.-.", "C");
        letters.put("-..", "D");
        letters.put(".", "E");
        letters.put("..-.", "F");
        letters.put("--.", "G");
        letters.put("....", "H");
        letters.put("..", "I");
        letters.put(".---", "J");
        letters.put("-.-", "K");
        letters.put(".-..", "L");
        letters.put("--", "M");
        letters.put("-.", "N");
        letters.put("---", "O");
        letters.put(".--.", "P");
        letters.put("--.-", "Q");
        letters.put(".-.", "R");
        letters.put("...", "S");
        letters.put("-" ,"T");
        letters.put("..-", "U");
        letters.put("...-", "V");
        letters.put(".--", "W");
        letters.put("-..-", "X");
        letters.put("-.--", "Y");
        letters.put("--..", "Z");

        letters.put(".----", "1");
        letters.put("..---", "2");
        letters.put("...--", "3");
        letters.put("....-", "4");
        letters.put(".....", "5");
        letters.put("-....", "6");
        letters.put("--...", "7");
        letters.put("---..", "8");
        letters.put("----.", "9");
        letters.put("-----", "0");

        String[] decodeMorse = morseCode.split("   ");

        System.out.println(decodeMorse);
        return "";
    }
}
