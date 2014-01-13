package com.vlivin.rockpaperscissors;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Vladimir Livin
 */
public class GameTest {
    @Test
    public void paperShouldBeatRock() {
        assertEquals("Paper beats Rock, second player (index: 1) should win", 1, new Game(Turn.ROCK, Turn.PAPER).getWinner());
    }

    @Test
    public void scissorsShouldBeatPaper() {
        assertEquals("Scissors beats Paper, first player (index: 1) should win", 0, new Game(Turn.SCISSORS, Turn.PAPER).getWinner());
    }

    @Test
    public void rockShouldBeatScissors() {
        assertEquals("Rock beats Scissors, first player (index: 1) should win", 0, new Game(Turn.ROCK, Turn.SCISSORS).getWinner());
    }

    @Test
    public void rockVsRockShouldBeTie() {
        assertEquals("Rock and Rock should give a tie", -1, new Game(Turn.ROCK, Turn.ROCK).getWinner());
    }
}
