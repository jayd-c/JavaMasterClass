public class Main {
    public static void main(String[] args) {

        Item coke = new Item("Coke","drink",1.50,"medium");
        Item topping = new Item("Celery","topping",.50,"small");
        Burger burger = new Burger(topping,topping);
        MealOrder mealOrder = new MealOrder(burger,coke,topping);

        mealOrder.printItemizedList("small");

        Item coke2 = new Item("Coke","drink",1.50,"medium");
        Item topping2 = new Item("Celery","topping",.50,"small");
        Burger burger2 = new Burger("Ham Burger","Rye",11.50,"medium",topping2,topping);
        MealOrder mealOrder2 = new MealOrder(burger2,coke2,topping2);

        mealOrder2.printItemizedList("large");

    }
}
