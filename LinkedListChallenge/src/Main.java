import java.util.*;

public class Main {
    public static void main(String[] args) {
           LinkedList<Town> townList = new LinkedList<>();

           Itinerary it = new Itinerary(townList);
           it.addPlaces(new Town("Adelaide", 1374));
           it.addPlaces(new Town("Brisbane",917));
           it.addPlaces(new Town("Perth",3923));
           it.addPlaces(new Town("Darwin",3972));
           it.addPlaces(new Town("Melbourne",877));
           Collections.reverse(townList);
        System.out.println(townList);
        printItinerary(townList);

        Scanner scanner = new Scanner(System.in);
        it.printMenu();
        it.traverseItinerary(townList,scanner.nextLine());


    }
    public static void printItinerary (LinkedList<Town> list) {
        for(Town t: list) {
            System.out.printf("%-20s %10d %n",t.name(),t.distanceFromSydney());
        }
    }

    public static void printBackward (LinkedList<Town> list) {

    }
}
