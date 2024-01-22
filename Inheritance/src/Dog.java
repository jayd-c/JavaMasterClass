import java.util.Objects;

public class Dog extends Animal{

    private String color;
    private String earShape;
    private String tailShape;
    public Dog() {
        super("Mutt","Bigger",100);

    }



    public Dog (String color, String type, String size, double weight, String earShape, String tailShape) {
        super(type,weight<15?"small":(weight>35?"Large":"medium"),weight); //similar to keyword this. to call a parent constructor needs super keyword
        this.color = color;
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    public Dog(String type, double weight) {
    }

    public void makeNoise() {
        if(Objects.equals(type, "Wolf")) {
            System.out.println("Ow woooo houling");
        }
        bark();
        System.out.println();
    }

    @Override
    public void move(String speed) {
        super.move(speed);
//        System.out.println("Dogs walk, run and move fast");
        if(speed == "slow") {
            walk();
            wagTail();
        } else {
            run();
            bark();
        }
    }

    private void bark() {
        System.out.println("Wooof!");
    }

    private void walk() {
        System.out.println("walk!");
    }
    private void run() {
        System.out.println("run!");
    }
    private void wagTail() {
        System.out.println("wagTail!");
    }
    @Override
    public String toString() {
        return "Dog{" +
                "color='" + color + '\'' +
                ", earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }
}
