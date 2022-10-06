package kyu7;

import java.util.ArrayList;
import java.util.List;

public class LineNumbering {
    public static List<String> number(List<String> lines) {
        List<String> num = new ArrayList<>();
        for (int i = 0; i < lines.size(); i++) {
            num.add((i + 1) + ": " + lines.get(i));
        }
        return num;
    }
}
