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

    public void execute(String commands)
    {
        extractCommandsToExecute(commands).stream()
                .map(this::fromInputToCommand)
                .forEach(this::executeCommand);
    }

    private Command fromInputToCommand(String input)
    {
        Command operation = new Nop(compass);

        if (input.equals("L"))
        {
            operation = new TurnLeft(compass);
        }

        if (input.equals("R"))
        {
            operation = new TurnRight(compass);
        }

        return operation;
    }

    private void executeCommand(Command command)
    {
        String orientation = command.execute();
        compass.changeDirection(orientation);
    }

    private List<String> extractCommandsToExecute(String commands)
    {
        return Arrays.asList(commands.split(""));
    }
}
