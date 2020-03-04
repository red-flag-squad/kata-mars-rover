package es.redflag.katas.marsrover;

class Compass
{
    private String facing;

    public Compass()
    {
        facing = "N";
    }

    public void changeDirection(String orientation)
    {
        facing = orientation;
    }

    public String orientation()
    {
        return facing;
    }
}
