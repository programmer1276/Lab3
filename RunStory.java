import Enums.Action;
import Objects.*;

public class RunStory {
    public static void main(String[] args) {
//        Obj o1 = GetObj.getObj(NameOfObj.KARLSON);
//        ((Karlsons)o1).move(Action.SNORE);
//        Obj o2 = GetObj.getObj(NameOfObj.COVER);
//        Obj o3 = GetObj.getObj(NameOfObj.BABYBOY);
//        Obj o4 = GetObj.getObj(NameOfObj.CURIOUSEYES);
//        Obj o5 = GetObj.getObj(NameOfObj.FLASHLIGHT);
//        ((Cover) o2).setInfo(o3, o1, o4, o5);
//        ((Cover) o2).move(Action.HANGING_AND_HIDING);
//        ((BabyBoys) o3).move(Action.THINK);
//        ((Cover) o2).move(Action.RUSTLE);
//        Obj o6 = GetObj.getObj(NameOfObj.FILLE);
//        Obj o7 = GetObj.getObj(NameOfObj.RULLE);
//        Obj o8 = GetObj.getObj(NameOfObj.MUMMY);
//        Obj o9 = GetObj.getObj(NameOfObj.PILLOW);
//        ((Mummy)o8).setInfo(o9);
//        ((BabyBoys) o3).setInfo(o6, o7, o8);
//        ((BabyBoys) o3).move(Action.HEAR);
//        ((BabyBoys) o3).move(Action.REALIZE);
//        ((BabyBoys) o3).move(Action.SEE);
//        ((Mummy) o8).move(Action.REST);
        Karlsons o1 = new Karlsons("Карлсон");
        BabyBoys o2 = new BabyBoys("Малыш");
        Cover o3 = new Cover("Покрывало");
        CuriousEyes o4 = new CuriousEyes("любопытные глаза");
        FlashLight o5 = new FlashLight("свет фонарика");
        Filles o6 = new Filles("Филле");
        Rulles o7 = new Rulles("Рулле");
        Mummy o8 = new Mummy("Мумия");
        Pillow o9 = new Pillow("Подушка");
        o1.move(Action.SNORE);
        o3.setInfo(o2, o1, o4, o5);
        o3.move(Action.HANGING_AND_HIDING);
        o2.move(Action.THINK);
        o3.move(Action.RUSTLE);
        o8.setInfo(o9);
        o2.setInfo(o6, o7, o8);
        o2.move(Action.HEAR);
        o6.move(Action.WHEEZE);
        o7.move(Action.WHEEZE);
        o2.move(Action.REALIZE);
        o2.move(Action.SEE);
        o8.move(Action.REST);
        o2.move(Action.NOT_SCREEM);
        o6.move(Action.NOT_SCREEM);
        o7.move(Action.NOT_SCREEM);
        System.out.println("а только");
        o2.move(Action.BREATH);
        o6.move(Action.BREATH);
        o7.move(Action.BREATH);
    }
}