package dev.ele;

public class MountainRange extends Polygon{

    private String name;
    public MountainRange(String name, int peakHeight, String... locations) {
        super(peakHeight, locations);
        this.name = name;
    }

    @Override
    public String toString() {
        return name + " MountainRange";
    }
}
