public class Animal {
    protected String type;
    private String size;
    private double weight;

    public Animal(String type, String size, double weight) {
        this.type = type;
        this.size = size;
        this.weight = weight;
    }

    public Animal() {

    }

    public void move (String speed) {
        System.out.printf("%s moves %s %n",type,speed);
    }

    public void makeNoise() {
        System.out.printf("%s makes some kind of noise%n",type);
    }
    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", size='" + size + '\'' +
                ", weight=" + weight +
                '}';
    }
}
