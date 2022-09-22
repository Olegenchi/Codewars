package kyu5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//doesn't work
public class Scramblies {
    public static void main(String[] args) {
        scramble("scriptjavx","javascript");
    }

    public static boolean scramble(String str1, String str2) {
        if (str2 == null || str2.length() == 0) {
            return true;
        }
        return false;
    }
}
