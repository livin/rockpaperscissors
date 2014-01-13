package com.vlivin.rockpaperscissors;

import org.junit.Test;

import java.io.PrintWriter;
import java.io.StringWriter;

import static org.junit.Assert.assertTrue;

/**
 * Tests Rock-Paper-Scissors game.
 *
 * @author Vladimir Livin
 */
public class RockPaperScissorsTest {
    @Test
    public void rockPaperScissorsOutputShouldBePredefined() {
        StringWriter output = new StringWriter();
        PrintWriter ps = new PrintWriter(output);
        RockPaperScissors rockPaperScisssors = new RockPaperScissors(ps);
        rockPaperScisssors.run();

        String expected =
            "Rock-Paper-Scissors game\\s+" +
            "Player A wins \\d+ of 100 games\\s+" +
            "Player B wins \\d+ of 100 games\\s+" +
            "Tie: \\d+ of 100 games\\s+";

        assertTrue("Output should match the expected, but was: " + output.toString(), output.toString().matches(expected));
    }

    @Test
    public void rockPaperScissorsShouldRunWithNoOutput() {
        RockPaperScissors rockPaperScissors = new RockPaperScissors();
        rockPaperScissors.run();
    }
}
