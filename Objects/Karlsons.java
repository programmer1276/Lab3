package Objects;

import Enums.Action;
import Interfaces.Moves;

public class Karlsons extends Obj implements Moves {
    public Karlsons(String name) {
        super(name);
    }

    @Override
    public void move(Action action) {
        if (action == Action.SNORE) {
            System.out.println(this.name + " " + action);
        }
    }
}
