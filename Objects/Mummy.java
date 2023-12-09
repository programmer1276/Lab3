package Objects;

import Enums.Action;
import Interfaces.Moves;
import Interfaces.SetDopInfo;

public class Mummy extends Obj implements Moves, SetDopInfo {
    Obj p;
    public String description() {
        return "наводящий ужас оскал";
    }
    public Mummy(String name) {
        super(name);
    }

    @Override
    public void setInfo(Obj... arr) {
        p = arr[0];
    }

    @Override
    public void move(Action action) {
        System.out.println("которая " + action + " на " + p.name.toLowerCase());
    }
}
