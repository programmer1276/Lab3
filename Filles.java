package Objects;

import Enums.Action;
import Interfaces.Moves;

public class Filles extends Obj implements Moves {
    public Filles(String name) {
        super(name);
    }

    @Override
    public void move(Action action) {
        System.out.println(name + " " + action);
    }
}
