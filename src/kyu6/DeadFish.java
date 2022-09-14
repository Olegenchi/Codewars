package kyu6;

/*
 * 6 kyu - Make the Deadfish Swim
 *
 * https://www.codewars.com/kata/51e0007c1f9378fa810002a9/train/java
 *
 * DESCRIPTION:
 * Write a simple parser that will parse and run Deadfish.
 *
 * Deadfish has 4 commands, each 1 character long:
 *      i increments the value (initially 0)
 *      d decrements the value
 *      s squares the value
 *      o outputs the value into the return array
 *
 * Invalid characters should be ignored.
 *
 * Example:
 * Deadfish.parse("iiisdoso") =- new int[] {8, 64};
*/

import java.util.ArrayList;
import java.util.List;

public class DeadFish {
    public static void main(String[] args) {
        DeadFish.parse("iiisdoso");
    }

    public static int[] parse(String data) {
        String[] letters = data.split("");
        List<Integer> value = new ArrayList<>();
        int sum = 0;

        for (String letter : letters) {
            switch (letter) {
                case ("i"):
                    sum++;
                    break;
                case ("d"):
                    sum--;
                    break;
                case ("s"):
                    sum *= sum;
                    break;
                case ("o"):
                    value.add(sum);
                    break;
            }
        }
        for (int i = 0; i < value.size(); i++) {
            System.out.println(value.get(i));
        }
        return value.stream().mapToInt(i -> i).toArray();
    }
}
