package es.redflag.katas.marsrover;

abstract class Command
    {
        protected Compass compass;

        abstract public String execute();

        public Command(Compass compass)
        {
            this.compass = compass;
        }
    }