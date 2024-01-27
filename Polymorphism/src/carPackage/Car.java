package carPackage;

public class Car {

    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;


    public Car(int cylinders, String name) {
        this.engine = true;
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
    }

    public int getCylinders () {
        return cylinders;
    }
    public String getName () {
        return name;
    }

    public String startEngine () {
        String instantType = this.getClass().getSimpleName();
       return instantType + " -> startEngine";
    }
    public String accelerate () {
        String instantType = this.getClass().getSimpleName();
        return instantType + " -> accelerate";
    }
    public String brake() {
        String instantType = this.getClass().getSimpleName();
       return instantType + " -> brake";
    }

}

class Mitsubishi extends Car{

    public Mitsubishi (int cylinders, String name) {
        super(cylinders,name);

    }

    @Override
    public String startEngine () {
        return super.startEngine();
    }
    @Override
    public String accelerate() {
        return super.accelerate();
    }
    @Override
    public String brake() {
       return super.brake();
    }
}

class Holden extends Car{

    public Holden (int cylinders, String name) {
        super(cylinders,name);

    }

    @Override
    public String startEngine () {
        return  super.startEngine();
    }
    @Override
    public String accelerate() {
        return super.accelerate();
    }
    @Override
    public String brake() {
       return super.brake();
    }

}

class Ford extends Car {

    public Ford (int cylinders, String name) {
        super(cylinders,name);

    }

    @Override
    public String startEngine () {
       return super.startEngine();
    }
    @Override
    public String accelerate() {
        return super.accelerate();
    }
    @Override
    public String brake() {
        return super.brake();
    }
}