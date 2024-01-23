public class Circle {
    private double radius;

    public Circle (double radius) {
        this.radius = radius;
    }
    public double getRadius () {
        return radius;
    }
    public double getArea () {
        return radius * radius * Math.PI;
    }
}

class Cylinder extends Circle {

    private double height;
    public Cylinder(double radius, double height) {
        super(radius);
        this.height=height;
    }

    public double getHeight () {
        return  height;
    }

    public double getVolume () {
       return this.getArea() * this.height;
    }
}
