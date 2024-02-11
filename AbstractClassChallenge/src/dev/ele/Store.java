package dev.ele;

import java.lang.reflect.Array;
import java.util.ArrayList;

record OrderItem (int qty, ProductForSale product) {}
public class Store {
    private static ArrayList<ProductForSale> storeProducts = new ArrayList<>();

    public static void main(String[] args) {

        storeProducts.add(new ArtObject("Oil painting",1000, "Impressive work of Leonardo Davinci"));
        storeProducts.add(new ArtObject("Sculpture",20000,"asdlf; asfldk;jlsad;fjl sdafljlkjk"));
        storeProducts.add(new Furniture("Desk",200,"dl;aj;lasfdlajlas dfl;sdf;laskdfl"));
        storeProducts.add(new Furniture("Lamp",50,"fdslakfdal;fjdsflkasdjfs;"));
        listProducts();

        System.out.println("\nOrder 1");
        var order1  = new ArrayList<OrderItem>();
        addItemToOrder(order1, 1,2);
        addItemToOrder(order1,0,1);
        printOrder(order1);

        System.out.println("\nOrder 2");
        var order2  = new ArrayList<OrderItem>();
        addItemToOrder(order2, 0,2);
        addItemToOrder(order2,3,6);
        printOrder(order2);
        double total = 0;
        for(var i: order2) {
            total+= i.product().getSalesPrice(i.qty());
        }
        System.out.println("Total sales : "+  total);

    }
    public static void listProducts ( ){
        for(var item: storeProducts) {
            System.out.println("_".repeat(30));
            item.showDetails();
        }
    }

    public static void addItemToOrder (ArrayList<OrderItem> order, int orderIndex, int qty) {
        order.add(new OrderItem(qty,storeProducts.get(orderIndex)));
    }
    public static void printOrder (ArrayList<OrderItem> order) {
        double salesTotal = 0;
        for(var item: order) {
            item.product().printPricedItem(item.qty());
            salesTotal += item.product().getSalesPrice(item.qty());
        }
    }

}
