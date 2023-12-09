package Objects;

import Enums.Action;
import Interfaces.Moves;
import Interfaces.SetDopInfo;


public class Cover extends Obj implements Moves, SetDopInfo {
    private Obj arr[];
    public Cover(String name) {
        super(name);
    }

//    @Override
//    public String getInfo() {
//        return name;
//    }

    @Override
    public void setInfo(Obj... arr) {
        this.arr = arr;
    }

    @Override
    public void move(Action action) {
        if (action == Action.HANGING_AND_HIDING) {
            System.out.println(this.name + " " + action + " " + arr[0].name + " и " + arr[1].name + " от " + arr[2].name + " и " + arr[3].name);
        }
        if (action == Action.RUSTLE) {
            System.out.println(action + " " + this.name.toLowerCase());
        }
    }
}
