package kyu6;

/*
 * 6 kyu - Handshake problem
 *
 * https://www.codewars.com/kata/5574835e3e404a0bed00001b/train/java
 *
 * DESCRIPTION:
 * Johnny is a farmer and he annually holds a beet farmers convention "Drop the beet".
 *
 * Every year he takes photos of farmers handshaking. Johnny knows that no two farmers handshake more than once.
 * He also knows that some of the possible handshake combinations may not happen.
 *
 * However, Johnny would like to know the minimal amount of people that participated
 * this year just by counting all the handshakes.
 *
 * Help Johnny by writing a function, that takes the amount of handshakes and returns the minimal
 * amount of people needed to perform these handshakes (a pair of farmers handshake only once).
*/

public class HandshakeProblem {
    public static void main(String[] args) {
        getParticipants(3);
    }

    public static int getParticipants(int handshakes) {
        int count = 1;
        int people = 0;

        if (handshakes == 0) {
            return 0;
        }
        while (people < handshakes) {
            people = (count * (count - 1)) / 2;
            count += 1;
        }
        return count - 1;
    }
}
