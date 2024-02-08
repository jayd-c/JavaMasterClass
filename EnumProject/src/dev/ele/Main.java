package dev.ele;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        DayOfWeek weekDay = DayOfWeek.TUE;
        System.out.println(weekDay);
        for(int i = 0; i<10; i++) {
            weekDay = getRandomDay();
//            System.out.printf("Name is %s, Ordinal value is = %d%n",weekDay.name(), weekDay.ordinal());
//
//            if(weekDay == DayOfWeek.FRI) System.out.println("Oh it's friday!");
            switchDayOfWeek(weekDay);
        }
        for(Topping topping : Topping.values()) {
            System.out.println(topping.name() + " : " + topping.getPrice());
        }
    }
    public static void switchDayOfWeek (DayOfWeek weekDay) {
        int weekDayInt = weekDay.ordinal() + 1;
        switch (weekDay) {
            case WED -> System.out.println("Wednesday is Day " + weekDayInt);
            case SAT -> System.out.println("Saturday is Day " + weekDayInt);
            default -> System.out.println(weekDay.name().charAt(0) + weekDay.name().substring(1).toLowerCase() + "day is Day " + weekDayInt );
        }
    }
    public static DayOfWeek getRandomDay() {
        int random = new Random().nextInt(7);
        var allDays = DayOfWeek.values();
        return allDays[random];
    }
}
