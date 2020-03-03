package es.redflag.katas.marsrover;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class MarsRoverTest
{
    private Rover rover;

    @Before
    public void init()
    {
        rover = new Rover();
    }

    @Test
    public void startsHeadingNorth() throws Exception
    {
        assertThat(rover.orientation(), is(equalTo("N")));
    }

}
