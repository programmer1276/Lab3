package Interfaces;

import Enums.NameOfObj;
import Objects.*;

public interface GetObj {
    static Obj getObj(Enum e) {
        if (e == NameOfObj.KARLSON) {
            return new Karlsons(e.toString());
        }
        if (e == NameOfObj.BABYBOY) {
            return new BabyBoys(e.toString());
        }
        if (e == NameOfObj.COVER) {
            return new Cover(e.toString());
        }
        if (e == NameOfObj.CURIOUSEYES) {
            return new CuriousEyes(e.toString());
        }
        if (e == NameOfObj.FLASHLIGHT) {
            return new FlashLight(e.toString());
        }
        if (e == NameOfObj.FILLE) {
            return new Filles(e.toString());
        }
        if (e == NameOfObj.RULLE) {
            return new Rulles(e.toString());
        }
        if (e == NameOfObj.MUMMY) {
            return new Mummy(e.toString());
        }
        if (e == NameOfObj.PILLOW) {
            return new Pillow(e.toString());
        }
        return null;
    }
}
