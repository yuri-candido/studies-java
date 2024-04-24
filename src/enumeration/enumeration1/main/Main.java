package src.enumeration.enumeration1.main;

import src.enumeration.enumeration1.entities.DayOfWeek;
import src.enumeration.enumeration1.entities.DayOfWeekConstants;

public class Main {
    public static void main(String[] args) {

        usingConstants();

        System.out.println();

        usingEnum();
    }
        private static void usingConstants(){

            int monday = DayOfWeekConstants.MONDAY;
            int tuesday = DayOfWeekConstants.TUESDAY;
            int wednesday = DayOfWeekConstants.WEDNESDAY;
            int thursday = DayOfWeekConstants.THURSDAY;
            int friday = DayOfWeekConstants.FRIDAY;
            int saturday = DayOfWeekConstants.SATURDAY;
            int sunday = DayOfWeekConstants.SUNDAY;

            System.out.println("Testing using constants in Java");
            printDayOfTheWeek(monday);
            printDayOfTheWeek(tuesday);
            printDayOfTheWeek(wednesday);
            printDayOfTheWeek(thursday);
            printDayOfTheWeek(friday);
            printDayOfTheWeek(saturday);
            printDayOfTheWeek(sunday);
        }
        private static void printDayOfTheWeek(int day){
            switch (day) {
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                case 7:
                    System.out.println("Sunday");
                    break;
            }
        }

        private static void usingEnum(){

            DayOfWeek monday = DayOfWeek.MONDAY;
            DayOfWeek tuesday = DayOfWeek.TUESDAY;
            DayOfWeek wednesday = DayOfWeek.WEDNESDAY;
            DayOfWeek thursday = DayOfWeek.THURSDAY;
            DayOfWeek friday = DayOfWeek.FRIDAY;
            DayOfWeek saturday = DayOfWeek.SATURDAY;
            DayOfWeek sunday = DayOfWeek.SUNDAY;

            System.out.println("Test using enum in Java");

            printDayOfTheWeek(monday);
            printDayOfTheWeek(tuesday);
            printDayOfTheWeek(wednesday);
            printDayOfTheWeek(thursday);
            printDayOfTheWeek(friday);
            printDayOfTheWeek(saturday);
            printDayOfTheWeek(sunday);
        }

        private static void printDayOfTheWeek(DayOfWeek day){
            switch (day) {
                case MONDAY:
                    System.out.println("Monday");
                    break;
                case TUESDAY:
                    System.out.println("Tuesday");
                    break;
                case WEDNESDAY:
                    System.out.println("Wednesday");
                    break;
                case THURSDAY:
                    System.out.println("Thursday");
                    break;
                case FRIDAY:
                    System.out.println("Friday");
                    break;
                case SATURDAY:
                    System.out.println("Saturday");
                    break;
                case SUNDAY:
                    System.out.println("Sunday");
                    break;
            }
        }

    }
