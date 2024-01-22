public class Fish extends Animal{
    private int gills;
    private int fins;

    public Fish(String type, String size, double weight, int gills, int fins) {
        super(type, "smaoo", weight);
        this.gills = gills;
        this.fins = fins;
    }

    @Override
    public void move(String speed) {
        super.move(speed);
        moveMuscles();
        if(speed == "fast") {
            moveBackFins();
        }
        System.out.println();
    }

    private void moveMuscles () {
        System.out.print("Moves muscels ");
    }


    private void moveBackFins () {
        System.out.print("Moves backfin fast ");
    }

    @Override
    public String toString() {
        return "Fish{" +
                "gills=" + gills +
                ", fins=" + fins +
                "} " + super.toString();
    }
}
