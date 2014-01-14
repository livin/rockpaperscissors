package com.vlivin.rockpaperscissors;

/**
 * A player which selects one constant kind of turn each time.
 *
 * @author Vladimir Livin
 */
public class ConstantPlayer implements Player {
    private Turn turn;

    public ConstantPlayer(Turn turn) {
        this.turn = turn;
    }

    @Override
    public Turn getNextTurn() {
        return turn;
    }
}
