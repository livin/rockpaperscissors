package com.vlivin.rockpaperscissors;

import java.io.PrintWriter;

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
    private PrintWriter out;

    public RockPaperScissors() {
        this(new PrintWriter(System.out, true));
    }

    public RockPaperScissors(PrintWriter out) {
        this.out = out;
    }


    public void run() {
        out.println("Rock-Paper-Scissors game");
        out.println();

        out.println("Player A wins 0 of 100 games");
        out.println("Player B wins 0 of 100 games");
        out.println("Tie: 0 of 100 games");
    }

    public static void main(String[] args) {
        new RockPaperScissors().run();
    }
}
