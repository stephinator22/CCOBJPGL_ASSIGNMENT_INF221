import Explorers.*;
import Planets.*;

public class App {

    public static void main(String[] args) {

        Planet mars = new Mars();
        Planet saturn = new Saturn();
        Planet mercury = new Mercury();
        Planet earth = new Earth();
        Planet jupiter = new Jupiter();
        Planet neptune = new Neptune();
        Planet uranus = new Uranus();
        Planet venus = new Venus();

        Explorer astronaut = new HumanExplorer();
        Explorer rover = new RobotExplorer();

        mars.accept(astronaut);
        saturn.accept(astronaut);
        mercury.accept(astronaut);
        earth.accept(astronaut);
        jupiter.accept(astronaut);
        neptune.accept(astronaut);
        uranus.accept(astronaut);
        venus.accept(astronaut);

        saturn.accept(rover);
        mars.accept(rover);
        mercury.accept(rover);
        jupiter.accept(rover);
       earth.accept(rover);
         venus.accept(rover);
        uranus.accept(rover);
        neptune.accept(rover);
    }
}