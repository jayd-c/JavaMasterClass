package carPackage;

public class Main {
    public static void main(String[] args) {

        Mitsubishi mitsubishi = new Mitsubishi(6,"Outlander");
        System.out.println(mitsubishi.startEngine());
        Car ford = new Car(4,"Fiesta");
        System.out.println(ford.startEngine());

    }
}
