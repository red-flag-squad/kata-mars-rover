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
        String orientation = compass.orientation();

        if (command.equals("L"))
        {
            orientation = turnLeft();
        }

        if (command.equals("R"))
        {
            orientation = turnRight();
        }

        compass.changeDirection(orientation);
    }

    private String turnRight()
    {
        String orientation = compass.orientation();

        switch (orientation)
        {
            case "N":
                return "E";
            case "E":
                return "S";
            case "S":
                return "W";
            case "W":
                return "N";
        }

        return orientation;
    }

    private String turnLeft()
    {
        String orientation = compass.orientation();

        switch (orientation)
        {
            case "N":
                return "W";
           case "E":
                return "N";
            case "S":
                return "E";
            case "W":
                return "S";
        }

        return orientation;
    }

    private List<String> extractCommandsToExecute(String commands)
    {
        return Arrays.asList(commands.split(""));
    }
}
