public class Main {
    public static void main(String... args) {

        System.out.println("Hello World Again");

        String[] splitString = "Hello World Again".split(" ");
        printText(splitString);
        System.out.println("_".repeat(20));

        printText("Hello");
        System.out.println("_".repeat(20));

        printText("Hello","World","Again");
        System.out.println("_".repeat(20));

        String[] sArray = {"First","Second","Third","Fourth","Five"};
        System.out.println(String.join(",",sArray));

    }

    private static void printText (String... textList) {
        for(String s: textList) {
            System.out.println(s);
        }
    }
}
