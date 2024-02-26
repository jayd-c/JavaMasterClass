package dev.ele.model;

import java.util.Random;

public class Student {
    private String name;
    private String course;
    private int yearStarted;

    protected static Random random = new Random();
    private static String[] firstName = {"Anne","Bill","Cathy","Tim","David"};
    private static String[] courses = {"C++", "Java","Python","JavaScript"};

    public Student() {
        int lastNameIndex = random.nextInt(65,91);
        name = firstName[random.nextInt(5)]+ " " + (char) lastNameIndex;
        course = courses[random.nextInt(3)];
        yearStarted = random.nextInt(2018,2023);
    }

    @Override
    public String toString() {
        return "%-15s %-5s %d".formatted(name,course,yearStarted);
    }

    public int getYearStarted() {
        return yearStarted;
    }

}
