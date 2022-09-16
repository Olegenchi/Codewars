package kyu7;

/*
 * 7 kyu - Switcheroo
 *
 * https://www.codewars.com/kata/57f759bb664021a30300007d/train/java
 *
 * DESCRIPTION:
 * Given a string made up of letters a, b, and/or c,
 * switch the position of letters a and b (change a to b and vice versa).
 * Leave any incidence of c untouched.
 *
 * Example:
 *      'acb' --> 'bca'
 *      'aabacbaa' --> 'bbabcabb'
*/

public class Switch {
    public static void main(String[] args) {
        switcheroo("abc");
    }

    public static String switcheroo(String x) {
        String[] a = x.split("");
        StringBuilder builder = new StringBuilder();
        for (String b : a) {
            if (b.equals("a")) {
                builder.append("b");
            }
            if (b.equals("b")) {
                builder.append("a");
            }
            if (b.equals("c")) {
                builder.append("c");
            }
        }
        System.out.println(builder);
        return builder.toString();
    }
}
