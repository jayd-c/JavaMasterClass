public class SmartKitchen {
    private CoffeeMaker brewMaster;
    private DishWasher dishWasher;
    private Refrigerator iceBox;

    public SmartKitchen(CoffeeMaker brewMaster, DishWasher dishWasher, Refrigerator iceBox) {
        this.brewMaster = brewMaster;
        this.dishWasher = dishWasher;
        this.iceBox = iceBox;
    }

    private void addWater () {
        if(brewMaster.isHasWorkToDo()) {
            brewMaster.brewCoffee();
        } else System.out.println("Coffee master has nothing to do at this time");
    }
    private void pourMilk () {
        if(iceBox.isHasWorkToDo()) iceBox.orderFood();
        else System.out.println("I am full now");
    }

    private void loadDishwasher () {
        if(dishWasher.isHasWorkToDo()) dishWasher.doDishes();
        else System.out.println("Dishwasher I mind my own business at this time");
    }

    public void setKitchenState (boolean isCoffeeMakerReady, boolean isFridgeReady, boolean isDishwasherReady) {
        if(isCoffeeMakerReady) addWater();
        if(isFridgeReady) pourMilk();
        if(isDishwasherReady) loadDishwasher();
    }

}

class CoffeeMaker {
    private boolean hasWorkToDo;

    public CoffeeMaker(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public boolean isHasWorkToDo() {
        return hasWorkToDo;
    }

    public void brewCoffee () {
        System.out.println("Coffee Maker says, I am brewing coffee for you all");
    }

}

class DishWasher {
    private boolean hasWorkToDo;

    public DishWasher(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public boolean isHasWorkToDo() {
        return hasWorkToDo;
    }

    public void doDishes () {
        System.out.println("Dishwasher says, I have to do all the nasty dishes");
    }
}

class Refrigerator {
    private boolean hasWorkToDo;

    public Refrigerator(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public boolean isHasWorkToDo() {
        return hasWorkToDo;
    }

    public void orderFood() {
        System.out.println("Refrigerator says, I am running out of Milk please order soon");
    }

}