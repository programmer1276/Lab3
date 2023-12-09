package Enums;

public enum Action {
    SNORE("храпел громко и зловеще"),
    HANGING_AND_HIDING("свисало, скрывая"),
    THINK("подумал"),
    RUSTLE("Зашуршало"), WHEEZE("захрипеть"),
    HEAR("услышал"),
    REALIZE("понял"),
    SEE("увидели"),
    REST("покоилась"),
    NOT_SCREEM("не вскрикнуть"),
    BREATH("дышал странно");
    private final String translation;
    Action(String translation) {
        this.translation = translation;
    }

    @Override
    public String toString() {
        return translation;
    }
}
