public class Main {
    public static void main(String[] args) {

        Printer printer = new Printer(120,true);

        System.out.println(printer.getTonerLevel());
        printer.addToner(100);
        System.out.println(printer.getTonerLevel());
        System.out.println(printer.printPages(100));
    }
}
