package Enums;

public enum NameOfObj {
    KARLSON("Карлсон"), BABYBOY("Малыш"), FILLE("Филле"), RULLE("Рулле"), COVER("Покрывало"), CURIOUSEYES("любопытные глаза"),
    FLASHLIGHT("свет фонарика"), MUMMY("мумия"), PILLOW("подушка");
    private final String name;
    NameOfObj(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
