public class Car {
    private String make;
    private String model;
    private String description;
    private boolean isSUV;

    public Car() {
        this("Unbranded","model","unspecified fuel type vehicle",false);
    }

    public Car(String make, String model, String description, boolean isSUV) {
        this.make = make;
        this.model = model;
        this.description = description;
        this.isSUV = isSUV;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getDescription() {
        return description;
    }

    public boolean isSUV() {
        return isSUV;
    }

    public void startEngine() {
        if(isSUV) System.out.printf("%s %s SUV -> starts engine %n",make,model);
        else System.out.printf("%s %s CAR -> starts engine %n",make,model);
    }

    public void drive() {
        String instantType = this.getClass().getSimpleName();
        System.out.printf("%s is driving %n",instantType);
    }

    protected void runEngine () {
        System.out.println(this.make + " " + this.model + " is on idle");
    }

    @Override
    public String toString() {
        return String.format("%s, %s vehicle is a %s",make,model,isSUV?"SUV":"CAR");
    }
}

class GasPoweredCar extends Car{

    private double avgKmPerLitre;
    private int cylinders;

    public GasPoweredCar(String make, String model, String description, boolean isSUV, double avgKmPerLitre, int cylinders) {
        super(make, model, description, isSUV);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }



    @Override
    public void startEngine() {
        super.startEngine();
    }

    @Override
    public void drive() {
        super.drive();
        System.out.println("The carbon emission is high");
    }

    @Override
    protected void runEngine() {
        super.runEngine();
    }
    @Override
    public String toString() {
        return String.format("%s, %s vehicle is a %s",getMake(),getModel(),isSUV()?"SUV":"CAR");
    }
}

class ElectricCar extends Car {
    private double avgKmPerCharge;
    private int batterySize;

    public ElectricCar(String make, String model, String description, boolean isSUV, double avgKmPerCharge, int batterySize) {
        super(make, model, description, isSUV);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }
    @Override
    public void drive() {
        super.drive();
        System.out.println("The carbon emission is zero");
    }
    @Override
    public String toString() {
        return String.format("%s, %s vehicle is a %s",getMake(),getModel(),isSUV()?"SUV":"CAR");
    }

}

class HybridCar extends Car {

    public HybridCar() {
    }

    public HybridCar(String make, String model, String description, boolean isSUV) {
        super(make, model, description, isSUV);
    }

    @Override
    public void drive() {
        super.drive();
        System.out.println("The carbon emission is moderate");
    }

    @Override
    public String toString() {
        return String.format("%s, %s vehicle is a %s",getMake(),getModel(),isSUV()?"SUV":"CAR");
    }
}