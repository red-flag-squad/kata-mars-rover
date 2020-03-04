package es.redflag.katas.marsrover;

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