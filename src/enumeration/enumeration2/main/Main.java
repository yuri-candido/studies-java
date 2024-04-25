package src.enumeration.enumeration2.main;

import src.enumeration.enumeration2.entities.Date;
import src.enumeration.enumeration2.entities.DayOfWeek;

public class Main {
    public static void main(String[] args){

        DayOfWeek day = DayOfWeek.MONDAY;

        System.out.println(day.toString() + " " + day.getValue());

        Date date = new Date(1,4,2023, DayOfWeek.MONDAY);

        System.out.println(date);
    }
}
