package es.redflag.katas.marsrover;

import java.util.Arrays;
import java.util.List;

public class Rover
{
    private Compass compass;

    public Rover()
    {
        compass = new Compass();
    }

    public String orientation()
    {
        return compass.orientation();
    }

    public void execute(String input)
    {
        extractCommandsFrom(input).stream()
                .map(this::toCommand)
                .forEach(this::executeCommand);
    }

    private Command toCommand(String input)
    {
        String orientation = compass.orientation();

        Command command = new Stay(orientation);

        if (input.equals("L"))
        {
            command = new TurnLeft(orientation);
        }

        if (input.equals("R"))
        {
            command = new TurnRight(orientation);
        }

        return command;
    }

    private void executeCommand(Command command)
    {
        String orientation = command.execute();
        compass.changeDirection(orientation);
    }

    private List<String> extractCommandsFrom(String commands)
    {
        return Arrays.asList(commands.split(""));
    }
}
