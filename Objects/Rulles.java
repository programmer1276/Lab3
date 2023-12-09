package Objects;

import Enums.Action;
import Interfaces.Moves;


public class Rulles extends Obj implements Moves {
    public Rulles(String name) {
        super(name);
    }


    @Override
    public void move(Action action) {
        System.out.println(name + " " + action);
    }
}
