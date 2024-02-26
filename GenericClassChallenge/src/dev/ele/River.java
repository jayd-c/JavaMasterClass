package dev.ele;

public class River extends Line {

    private String name;

    public River(String name, String... locations) {
        super(locations);
        this.name = name;
    }
    @Override
    public void render() {
        System.out.println("Render " + this + " as LINE (" + locations() + ")");
    }
    @Override
    public String toString() {
        return name + " River";
    }
}
