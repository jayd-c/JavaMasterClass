public class Main {
    public static void main(String[] args) {
        System.out.println("CAR count  = " + Car.carCount);


        Car car =new Car("Toyota","Supra","Yellow",4,false);
        car.describeCar();
        System.out.println(Car.engine);
        System.out.println("Car count after " + Car.carCount);

        Car newCar = new Car("ADfas","dls","yiy",6,true);
        System.out.println(Car.carCount);

    }
}
