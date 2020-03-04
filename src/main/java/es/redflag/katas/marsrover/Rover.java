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

    abstract class Command
    {
        protected Compass compass;

        abstract public String execute();

        public Command(Compass compass)
        {
            this.compass = compass;
        }
    }

    class TurnLeft extends Command
    {
        public TurnLeft(Compass compass)
        {
            super(compass);
        }

        public String execute()
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
    }

    class TurnRight extends Command
    {
        public TurnRight(Compass compass)
        {
            super(compass);
        }

        public String execute()
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
    }

    private void executeCommand(String command)
    {
        String orientation = compass.orientation();

        if (command.equals("L"))
        {
            orientation = new TurnLeft(compass).execute();
        }

        if (command.equals("R"))
        {
            orientation = new TurnRight(compass).execute();
        }

        compass.changeDirection(orientation);
    }

    private List<String> extractCommandsToExecute(String commands)
    {
        return Arrays.asList(commands.split(""));
    }
}
