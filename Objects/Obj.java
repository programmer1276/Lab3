package Objects;

import Interfaces.GetObj;
import java.util.Objects;

public abstract class Obj implements GetObj {
    protected String name;
    public Obj(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this.hashCode() != ((Obj)o).hashCode()) return false;
        if (this == o) return true;
        if (this.getClass() != o.getClass() || o == null) return false;
        return Objects.equals(name, ((Obj) o).name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
    //    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) return true;
//        if (obj == null || getClass() != obj.getClass()) return false;
//        if (this.hashCode() == obj.hashCode()) {
//            return this.name == ((Obj) obj).name;
//        }
//        return false;
//    }
//
//    @Override
//    public int hashCode() {
//        return this.id;
//    }
}
