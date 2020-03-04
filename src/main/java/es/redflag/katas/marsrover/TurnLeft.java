package es.redflag.katas.marsrover;

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