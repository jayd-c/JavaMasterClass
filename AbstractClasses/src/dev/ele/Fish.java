package dev.ele;

import java.util.Objects;

public class Fish extends Animal{
    public Fish(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {
        if(speed.equalsIgnoreCase("Slow")) System.out.println(getExplicitType() + " swimming slow");
        else if (speed.equalsIgnoreCase("Fast")) System.out.println(getExplicitType() + " swimming fast");
        else System.out.println(type + " not moving");
    }

    @Override
    public void makeNoise() {
        if(getExplicitType().equalsIgnoreCase("Goldfish")) System.out.println("swish! ");
        else System.out.println("splash! ");
    }
}
