package src.enumeration.enumeration3;

import src.enumeration.enumeration2.entities.DayOfWeek;

public class Main2 {
    public static void main(String[] args){

        System.out.println(Enum.valueOf(DayOfWeek.class, "SUNDAY"));

        DayOfWeek day = Enum.valueOf(DayOfWeek.class, "SUNDAY");

        System.out.println(day);
    }
}
