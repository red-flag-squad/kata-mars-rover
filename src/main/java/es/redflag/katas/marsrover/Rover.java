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
        extractCommandsToExecute(commands)
                .forEach(this::executeCommand);
    }

    private void executeCommand(String command)
    {
        if (command.equals("L"))
        {
            turnLeft();
        }
        
        if (command.equals("R"))
        {
            turnRight();
        }
    }

    private void turnRight()
    {
        String orientation = compass.orientation();

        switch (orientation)
        {
            case "N":
                compass.changeDirection("E");
                break;
            case "E":
                compass.changeDirection("S");
                break;
            case "S":
                compass.changeDirection("W");
                break;
            case "W":
                compass.changeDirection("N");
                break;
        }
    }

    private void turnLeft()
    {
        String orientation = compass.orientation();

        switch (orientation)
        {
            case "N":
                compass.changeDirection("W");
                break;
            case "E":
                compass.changeDirection("N");
                break;
            case "S":
                compass.changeDirection("E");
                break;
            case "W":
                compass.changeDirection("S");
                break;
        }
    }

    private List<String> extractCommandsToExecute(String commands)
    {
        return Arrays.asList(commands.split(""));
    }
}
