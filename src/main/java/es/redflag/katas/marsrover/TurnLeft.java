package es.redflag.katas.marsrover;

class TurnLeft extends Command
{
    public TurnLeft(String orientation)
    {
        super(orientation);
    }

    public String execute()
    {
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