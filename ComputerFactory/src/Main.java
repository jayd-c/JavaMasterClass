public class Main {
    public static void main(String[] args) {

        ComputerCase computerCase = new ComputerCase("2202","Dell","240");
        Monitor monitor = new Monitor("27 Beast", "Acer",27,"2540 * 1440");
        Motherboard motherboard = new Motherboard("BJ-200","Asus",4,6,"v2.44");

        PersonalComputer pc = new PersonalComputer("2208","Dell", computerCase,monitor,motherboard);

//        pc.getMonitor().drawPixelAt(5,7,"Yellow");
//        pc.getMotherboard().loadProgram("Windows Os");
//        pc.getComputerCase().pressPowerButton();

        pc .powerUp();

        System.out.println("*".repeat(50));

        Refrigerator fridge = new Refrigerator(true);
        DishWasher dish = new DishWasher(false);
        CoffeeMaker coffee = new CoffeeMaker(true);
        SmartKitchen sm = new SmartKitchen(coffee,dish,fridge);
        sm.setKitchenState(true,true,true);
    }
}
