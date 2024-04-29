package src.enumeration.enumeration3;

import src.enumeration.enumeration2.entities.DayOfWeek;

public class Main {
    public static void main(String[] args) {

        DayOfWeek[] days = DayOfWeek.values();

        for(int i=0; i< days.length; i++){
            System.out.println(days[i]);
        }

        for (DayOfWeek day : DayOfWeek.values()){
            System.out.println(day);
        }
    }
}
