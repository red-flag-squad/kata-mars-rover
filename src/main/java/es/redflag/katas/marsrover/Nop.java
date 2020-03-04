package es.redflag.katas.marsrover;

class Nop extends Command
{
    public Nop(String orientation)
    {
        super(orientation);
    }

    public String execute()
    {
        return orientation;
    }
}