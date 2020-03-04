package es.redflag.katas.marsrover;

class Nop extends Command
    {
        public Nop(Compass compass)
        {
            super(compass);
        }

        public String execute()
        {
            return compass.orientation();
        }
    }