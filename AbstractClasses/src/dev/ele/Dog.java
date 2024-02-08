package dev.ele;

import java.util.Objects;

public class Dog extends Animal{
    public Dog(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {
        if(speed.equalsIgnoreCase("Slow")) System.out.println(getExplicitType() + " moving slow");
        else if (speed.equals("Fast")) System.out.println(getExplicitType() + " moving fast");
        else System.out.println(getExplicitType() + " not moving");
    }

    @Override
    public void makeNoise() {
        if(Objects.equals(getExplicitType(), "Wolf")) System.out.println("Howling! ");
        else System.out.println("Woof! ");
    }
}
