public class Car {
    public static int engine = 1;

    public static int carCount = 0;
    private String make;
    private String model;
    private String color;
    private int door;
    private boolean convertible;

    public Car(String make, String model, String color, int door, boolean convertible) {
        carCount++;
        this.make = make;
        this.model = model;
        this.color = color;
        this.door = door;
        this.convertible = convertible;
    }

    public void describeCar () {
        String convertibleOrNot =  convertible?"convertible":"not a convertible";
        System.out.printf("%d-Door %s %s in %s is a %s %n",door,make,model,color,convertibleOrNot);
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", door=" + door +
                ", convertible=" + convertible +
                '}';
    }
}
