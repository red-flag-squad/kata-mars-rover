package es.redflag.katas.marsrover;

abstract class Command
{
    protected String orientation;

    abstract public String execute();

    public Command(String orientation)
    {
        this.orientation = orientation;
    }
}