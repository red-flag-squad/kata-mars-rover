package es.redflag.katas.marsrover;

class Stay extends Command
{
    public Stay(String orientation)
    {
        super(orientation);
    }

    public String execute()
    {
        return orientation;
    }
}