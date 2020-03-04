package es.redflag.katas.marsrover;

import java.util.Arrays;
import java.util.List;

    private Compass compass;

    public Rover(){
        compass= new Compass();
    }

    public String orientation() {
        return compass.orientation();
    }

    public void executeOrder(String commands) {
        for (char command : commands.toCharArray()) {
            executeCommand(command);
        }
    }

    private void executeCommand(char command) {
        String myCommand = String.valueOf(command);
        if (myCommand.equals("L")) turnLeft();
        if (myCommand.equals("R")) turnRight();
    }

    private void turnRight() {
        String orientation = compass.orientation();
        switch (orientation){
            case "N":
                compass.changeDirection("E");
                return;
            case "E":
                compass.changeDirection("S");
                return;
            case "S":
                compass.changeDirection("W");
                return;
            case "W":
                compass.changeDirection("N");
                return;
            default:
                return;
        }
    }

    private void turnLeft() {
        String orientation = compass.orientation();
        switch (orientation){
            case "N":
                compass.changeDirection("W");
                return;
            case "E":
                compass.changeDirection("N");
                return;
            case "S":
                compass.changeDirection("E");
                return;
            case "W":
                compass.changeDirection("S");
                return;
            default:
                return;
        }
    }

    private class Compass{
        private String facing;

        public Compass(){
            facing = "N";
        }

        public void changeDirection(String orientation){
            facing = orientation;
        }

        public String orientation(){
            return facing;
        }
    }
}
