package dev.ele;

public class Truck implements Trackable{
    @Override
    public void track() {
        System.out.println(getClass().getSimpleName() + " 's get coordinates to record ");

    }
}
