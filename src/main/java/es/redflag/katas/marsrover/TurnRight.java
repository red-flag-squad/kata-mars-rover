package es.redflag.katas.marsrover;

class TurnRight extends Command
{
    public TurnRight(String orientation)
    {
        super(orientation);
    }

    public String execute()
    {
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