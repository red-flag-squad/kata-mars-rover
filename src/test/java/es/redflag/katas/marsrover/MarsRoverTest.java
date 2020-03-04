package es.redflag.katas.marsrover;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class MarsRoverTest
{
    private Rover rover;

    @Test
    public void startsHeadingNorth() throws Exception
    {
        rover = new Rover();
        assertThat(rover.orientation(), is(equalTo("N")));
    }

    @Test
    public void commandLTurnsLeft() throws Exception
    {
        rover = new Rover();
        rover.execute("L");
        assertThat(rover.orientation(), is(equalTo("W")));
    }

    @Test
    public void commandRTurnsRight() throws Exception
    {
        rover = new Rover();
        rover.execute("R");
        assertThat(rover.orientation(), is(equalTo("E")));
    }

    @Test
    public void canExecuteMultipleCommands() throws Exception
    {
        rover = new Rover();
        rover.execute("RRLLLL");
        assertThat(rover.orientation(), is(equalTo("S")));
    }
}
