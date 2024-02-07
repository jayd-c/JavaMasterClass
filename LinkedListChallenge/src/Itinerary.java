import java.util.*;

public class Itinerary {

    LinkedList<Town> list;

    public Itinerary(LinkedList<Town> list) {
        this.list = list;
    }

    public void addPlaces(Town town) {
        if(list.contains(town)) {
            System.out.println("Found Duplicate : " + town);
            return;
        }
        for(Town t: list) {
            if(t.name().equalsIgnoreCase(town.name())) {
                System.out.println("Found duplicate : " + t);
                return;
            }
        }
        int index = 0;
        for(Town t: list) {
            if(t.distanceFromSydney() < town.distanceFromSydney()) {
                list.add(index,town);
                return;
            }
            index++;
        }
        list.add(town);
    }

    public LinkedList<Town> sortPlacesByDistance (LinkedList<Town> list) {

        LinkedList<Town> sortedList = new LinkedList<>();
        for(int i = 0; i<list.size(); i++) {
            int tempDistance;
            if(list.get(i).distanceFromSydney() < list.get(i+1).distanceFromSydney()) {
                tempDistance = list.get(i).distanceFromSydney();
                sortedList.add(list.get(i));
            }
        }
        return sortedList;
    }

    public  void printMenu () {
        System.out.println("""
                Available actions (select word or letter):
                    (F)orward
                    (B)ackward
                    (L)ist Places
                    (M)enu
                    (L)ist
                """);
    }

    public void traverseItinerary (LinkedList<Town> list, String menuItem) {

        var iterator = list.listIterator();

        Scanner scanner = new Scanner(System.in);
        boolean quitLoop = false;
        boolean forward = true;

        printMenu();

        while (!quitLoop) {
            if(!iterator.hasPrevious()) {
                System.out.println("Originating : " + iterator.next());

                forward = true;
            }
            if(!iterator.hasNext()) {
                System.out.println("Final : " + iterator.hasPrevious());
                forward= false;
            }
            System.out.println("Enter a value");
             menuItem = scanner.nextLine().toUpperCase().substring(0,1);

            switch (menuItem) {
                case "F" :
                    System.out.println("User wants to go forward");
                    if(!forward) {
                        forward = true;
                        if(iterator.hasNext()) iterator.next();
                    }
                    if(iterator.hasNext()) System.out.println(iterator.next());
                    break;
                case "B":
                    System.out.println("User wants to go backward");
                    if(forward) {
                        forward = false;
                        if(iterator.hasPrevious()) iterator.previous();
                    }
                    if(iterator.hasPrevious()) System.out.println(iterator.previous());
                    break;
                case "M":
                    printMenu();
                    break;
                case "L":
                    System.out.println(list);
                    break;
                default :
                    quitLoop = true;
                    break;

            }
        }
    }

}
