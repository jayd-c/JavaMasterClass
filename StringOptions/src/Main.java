public class Main {
    public static void main(String[] args) {
        String a  = "amma";
        System.out.println(a.concat("baiya"));
        a = a.concat("baiya");
        System.out.println(a);

        String helloWorld = "Hello" + " World";
        helloWorld.concat(" and GoodBye");

        StringBuilder helloWorldBuilder = new StringBuilder("Hello" + " World");
        helloWorldBuilder.append(" and Goodbye");

        printInformation(helloWorld);
        printInformation(helloWorldBuilder);

        StringBuilder emptyStart = new StringBuilder();
        emptyStart.append("a".repeat(17));
        StringBuilder emptyStart32 = new StringBuilder(32);
        emptyStart32.append("a".repeat(57));



        printInformation(emptyStart);
        printInformation(emptyStart32);
        System.out.println("*************************************************");

        StringBuilder builderPlus = new StringBuilder("Hello" + " World");
        builderPlus.append(" and Goodbye");
        builderPlus.deleteCharAt(16).insert(16,'g');
        System.out.println(builderPlus);

        builderPlus.replace(16,17,"G");
        System.out.println(builderPlus);

        builderPlus.reverse();
        System.out.println(builderPlus);

        builderPlus.reverse().setLength(7);
        System.out.println(builderPlus);

        System.out.println("%".repeat(50));

        Circle circle = new Circle(3.75);
        System.out.println("circle.radius= " + circle.getRadius());
        System.out.println("circle.area= " + circle.getArea());
        Cylinder cylinder = new Cylinder(5.55, 7.25);
        System.out.println("cylinder.radius= " + cylinder.getRadius());
        System.out.println("cylinder.height= " + cylinder.getHeight());
        System.out.println("cylinder.area= " + cylinder.getArea());
        System.out.println("cylinder.volume= " + cylinder.getVolume());

    }
    public static void printInformation (String string) {
        System.out.println("String = " + string);
        System.out.println("length = " + string.length());


    }
    public static void printInformation (StringBuilder builder) {
        System.out.println("StringBuilder = " + builder);
        System.out.println("length = "+ builder.length());
        System.out.println("capacity = " + builder.capacity());
    }
}
