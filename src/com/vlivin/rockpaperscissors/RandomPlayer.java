package com.vlivin.rockpaperscissors;

/**
 * A player which selects different turn each time.
 *
 * @author Vladimir Livin
 */
public class RandomPlayer implements Player {
    @Override
    public Turn getNextTurn() {
        return Turn.values()[((int) (Math.round(Math.random() * 1000) % 3))];
    }
}
