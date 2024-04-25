package src.enumeration.enumeration2.entities;

public enum DayOfWeek {

    MONDAY(1), TUESDAY(2), WEDNESDAY(3), THURSDAY(4),
    FRIDAY(5), SATURDAY(6), SUNDAY(7);
    private int value;

    DayOfWeek(int value){
        this.value = value;
    }

    public int getValue(){
        return this.value;
    }
}
