import java.util.ArrayList;
import java.util.Arrays;

record GroceryItem (String name, String type, int count) {
    public GroceryItem (String name){
        this(name,"DAIRY",1);
    }
    @Override
    public String toString() {
        return String.format("%d %s in %s",count,name,type);
    }

}
public class Main {
    public static void main(String[] args) {
        GroceryItem[] groceryArray = new GroceryItem[3];
        groceryArray[0] = new GroceryItem("milk");
        groceryArray[1] = new GroceryItem("apples","PRODUCE",6);
        groceryArray[2] = new GroceryItem("oranges","PRODUCE",5);
        System.out.println(Arrays.toString(groceryArray));

        ArrayList<GroceryItem> groceryItems = new ArrayList<>();
        groceryItems.add(new GroceryItem("Butter"));
        groceryItems.add(new GroceryItem("milk"));
        groceryItems.add(new GroceryItem("oranges","PRODUCE",5));
        groceryItems.add(0, new GroceryItem("apples","PRODUCE",6)); //add at index 0;

        System.out.println(groceryItems);

        groceryItems.set(1,new GroceryItem("cake","PRODUCE",1));
        System.out.println(groceryItems);
        groceryItems.remove(2);
    }
}
