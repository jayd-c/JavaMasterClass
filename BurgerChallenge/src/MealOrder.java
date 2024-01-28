public class MealOrder {

    private static int counter = 1;
    private Burger burger;
    private Item drink;
    private Item side;

    public MealOrder() {
        counter++;
    }


    public MealOrder(Burger burger, Item drink, Item side) {
        counter++;
        this.burger = burger;
        this.drink = drink;
        this.side = side;
    }

    public void addToppings (Item extra, String size) {
        System.out.println("Extra item " + extra.getClass().getSimpleName() + " -> " + extra.getAdjustedPrice(size));
    }

    public void setDrinkSize (String size) {
        this.drink.setSize(size);
    }

    public void printItemizedList (String size) {
        double drinkPrice =   this.drink.getAdjustedPrice(size);
        double burgerPrice =  this.burger.getAdjustedPrice(size);
        double sidePrice = this.side.getAdjustedPrice(size);
        double total = drinkPrice + burgerPrice + sidePrice;
        System.out.printf("""
                Your Order No - %s
                ----------
                %20s -> %6.2f
                %20s -> %6.2f
                %20s -> %6.2f
                        -----
                Total   %6.2f
                """,counter,drink.getName(),drinkPrice,burger.getName(),burgerPrice,side.getName(),sidePrice,total);
    }
}
