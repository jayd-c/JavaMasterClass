public class Burger extends Item{
    private Item extra1;
    private Item extra2;
    private Item extra3;

    public Burger (Item extra1, Item extra2) {
        this("Deluxe","Ham Burger",6.50,"large",extra1,extra2);
        this.extra1 = extra1;
        this.extra2 = extra2;

    }

    public Burger(Item extra1) {
        super();
        this.extra1 = extra1;
    }

    public Burger(String name, String type, double price, String size, Item extra1, Item extra2) {
        super(name, type, price, size);
        this.extra1 = extra1;
        this.extra2 = extra2;
    }

    public Burger(String name, String type, double price, String size, Item extra1, Item extra2, Item extra3) {
        super(name, type, price, size);
        this.extra1 = extra1;
        this.extra2 = extra2;
        this.extra3 = extra3;
    }
}
