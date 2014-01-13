package com.vlivin.rockpaperscissors;

/**
 * A game in which two players compete in a game of Rock-Paper-Scissors with different strategies.
 * Who will win more rounds?
 *
 * The rules:
 *
 * - Scissors beats Paper
 * - Rock beat Scissors
 * - Paper beats Rock
 *
 * If both players choose the same, the round is counted as a tie.
 *
 * Implements two players:
 * - Player A always chooses Paper
 * - Player B chooses randomly
 *
 * Sample output:
 *
 * "Player A wins 31 of 100 games"
 * "Player B wins 37 of 100 games"
 * "Tie: 32 of 100 games"
 *
 * @author Vladimir Livin
 */
public class RockPaperScissors {
    public void run() {
        System.out.println("Rock-Paper-Scissors game");
    }

    public static void main(String[] args) {
        new RockPaperScissors().run();
    }
}
