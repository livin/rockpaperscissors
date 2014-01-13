package com.vlivin.rockpaperscissors;

/**
 * @author Vladimir Livin
 */
public class Game {
    private Turn turnOfPlayerA;
    private Turn turnOfPlayerB;

    public Game(Turn turnOfPlayerA, Turn turnOfPlayerB) {
        this.turnOfPlayerA = turnOfPlayerA;
        this.turnOfPlayerB = turnOfPlayerB;
    }

    /**
     * Returns an index of the winning player:
     * 0 - for the first player.
     * 1 - for the second player.
     *
     * -1 - if it's a tie.
     *
     * @return an index indicating a winning player or -1 for a tie.
     */
    public int getWinner() {
        Turn winningTurn = turnOfPlayerA.versus(turnOfPlayerB);
        if (turnOfPlayerA.equals(winningTurn)) {
            return 0;
        } else if (turnOfPlayerB.equals(winningTurn)) {
            return 1;
        }
        return -1;
    }
}
