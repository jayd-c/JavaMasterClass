public class Main {
    public static void main(String[] args) {

        /*
        String inspection methods
        String comparison methods
        String manipulation methods


         */

        printInformation("aHellsao World");
        printInformation("");
        printInformation("\t \n");
        String helloWorld = "aHello World";
        System.out.printf("index of r  = %d %n",helloWorld.indexOf('r'));
        System.out.printf("index of World = %d %n", helloWorld.indexOf("World"));

        System.out.printf("index of l = %d %n",helloWorld.indexOf('l'));
        System.out.printf("index of last l = %d %n",helloWorld.lastIndexOf('l'));

        //once the last index is met then seach starts from the beginning
        System.out.printf("index of l = %d %n",helloWorld.indexOf('l',3)); //3
        System.out.printf("index of last l = %d %n",helloWorld.lastIndexOf('l',8)); //3

        String helloworldlower = helloWorld.toLowerCase();
        if (helloWorld.equalsIgnoreCase(helloworldlower)) System.out.printf("Values match ");

        if(helloWorld.startsWith("Hello")) System.out.println("String starts with Hello");
        if(helloWorld.endsWith("World")) System.out.println("String ends with World");
        if(helloWorld.contains("Wold")) System.out.println("String contains world");
        if(helloWorld.contentEquals("Hello World")) {
            System.out.println("Value match exactly");
        }




    }
    public static void printInformation (String str) {
        int length = str.length();
        System.out.printf("Length = %d %n", length);
        if(str.isEmpty()) {
            System.out.println("String is empty");
            return;
        }
        if(str.isBlank()) {
            System.out.println("String is blank");
        }
        System.out.printf("First char = %c %n", str.charAt(0));
        System.out.printf("Last char = %c %n", str.charAt(length-1));


    }
}
