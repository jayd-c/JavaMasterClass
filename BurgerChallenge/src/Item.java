public class Item {
    private String name;
    private String type;
    private double price;
    private String size;

    public Item() {

    }


    public Item(String name, String type, double price, String size) {
        this.name = name;
        this.type = type;
        this.price = price;
        this.size = size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getName () {
        return size + " " + name;
    }
    public double getBasePrice () {
        return price;
    }

    public double getAdjustedPrice (String size) {
        return size.equalsIgnoreCase("large") ? getBasePrice() + 1.0 : size.equalsIgnoreCase("medium") ?getBasePrice() + 0.50 : getBasePrice();
    }

    public void printItem () {
        System.out.println("Cost of Extra Item >>>>>>>>>>");
        System.out.println(getName() + " -> $" + getAdjustedPrice(size));
    }
}
