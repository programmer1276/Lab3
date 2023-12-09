package Objects;

import Enums.Action;
import Interfaces.Moves;
import Interfaces.SetDopInfo;

public class BabyBoys extends Obj implements Moves, SetDopInfo {
    Obj p1, p2, p3;
    public BabyBoys(String name) {
        super(name);
    }

    @Override
    public void setInfo(Obj... p) {
        this.p1 = p[0]; this.p2 = p[1]; this.p3 = p[2];
    }

    @Override
    public void move(Action action) {
        /*Здесь текст "И все же он это здорово придумал - " означает как бы мысли самого Малыша*/
        if (action == Action.THINK) {
            System.out.println("И все же он это здорово придумал - " + action + " " + this.name);
        } else if (action == Action.HEAR && p1 instanceof Rulles && p2 instanceof Filles) {
            System.out.println(this.name + " " + action + " как ");
        } else if (action == Action.HEAR && p1 instanceof Filles && p2 instanceof Rulles) {
            System.out.println(this.name + " " + action + " как ");
        } else if (action == Action.REALIZE) {
            System.out.print(this.name + " " + action + ",что он с " + p1.name + " и " + p2.name + " ");
        } else if (action == Action.SEE && p3 instanceof Mummy) {
            System.out.print(action + " " + ((Mummy)p3).description() + " " + p3.name.toLowerCase() + " ");
        } else if (action == Action.NOT_SCREEM || action == Action.BREATH) {
            System.out.println(name + " " + action);
        }
    }
}
