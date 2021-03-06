package com.vlivin.rockpaperscissors;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Tests Player behavior
 *
 * @author Vladimir Livin
 */
public class PlayerTest {
    @Test
    public void playerShouldBeAbleToSelectTheTurn() {
        Player p = new Player(Turn.PAPER);
        assertEquals(Turn.PAPER, p.getNextTurn());
    }
}
