import java.sql.SQLOutput;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        LinkedList<String> placesToVisit = new LinkedList<>();
//        var placesToVisit = new LinkedList<String>();
        List<String> placesToVisitList = new ArrayList<>(Arrays.asList("New York", "Trenton", "Philly"));
        Iterator<String> it = placesToVisitList.listIterator();
        while (it.hasNext()) {
            System.out.println(it.next());
            System.out.println("_______________");
        }


        placesToVisit.add("Sydney");
        placesToVisit.add(0, "Canberra");
        System.out.println(placesToVisit);
        addMoreElement(placesToVisit);

        System.out.println(placesToVisit);
//        removeElements(placesToVisit);
        placesToVisit.push("Elemulgrave");
        System.out.println(placesToVisit);

        gettingElements(placesToVisit);
        System.out.println("*".repeat(30));
        printItinerary3(placesToVisit);

        System.out.println("*".repeat(30) + " list 4 ");


        printItinerary4(placesToVisit);

        System.out.println("*".repeat(30) + " testIterator ");

        testIterator(placesToVisit);

    }

    private static void addMoreElement(LinkedList<String> list) {
        list.addFirst("Darwin");
        list.addLast("Hobart");
//        Que methods
        list.offer("Melbourne");
        list.offerFirst("Brisbane");
        list.offerLast("Toowoomba");
        //stack methods
        list.push("Alice Springs");
    }

    private static void removeElements(LinkedList<String> list) {
        list.remove(4);
        list.remove("Brisbane");

        System.out.println(list);

        String s1 = list.remove(); //removes first element
        System.out.println(s1 + " is removed");

        String s2 = list.removeFirst(); //removes first element
        System.out.println(s1 + " is removed");

        //que//deck//poll methods
        String p1 = list.poll(); //remove first
        System.out.println(p1 + " was removed //first");
        String p2 = list.pollFirst(); //first element was remove;
        System.out.println(p2 + " was removed //first");
        String p3 = list.pollLast(); //last element removed
        System.out.println(p3 + " was removed //last");
        String p4 = list.pop(); //remove firstElement
        System.out.println(p4 + " was removed at first");
    }

    public static void gettingElements(LinkedList<String> list) {
        System.out.println("Retrieve item @ 4th index (fifth element) = " + list.get(4));
        System.out.println("First element retrieved : " + list.getFirst());
        System.out.println("Last element retrieved : " + list.getLast());

        System.out.println("Darwin is at position : " + list.indexOf("Darwin"));
        System.out.println("Melbourne is at position : " + list.lastIndexOf("Melbourne"));

        //Queue retrieval methods

        System.out.println("Element from element : " + list.element());//que is fifo
        //stack method
        System.out.println("Element form peek() = " + list.peek());
        System.out.println("Element form peekFirst() = " + list.peekFirst());
        System.out.println("Element form peekLast() = " + list.peekLast());


    }

    public static void printItinerary(LinkedList<String> list) {
        System.out.println("Trip starts at " + list.getFirst());
        for (int i = 1; i < list.size(); i++) {
            System.out.println("--> From: " + list.get(i - 1) + " to " + list.get(i));
        }

        System.out.println("Trip ends at " + list.getLast());
    }

    public static void printItinerary2(LinkedList<String> list) {
        System.out.println("Trip starts at " + list.getFirst());
        String fromPlace = list.getFirst();
        for (String place : list) {
            System.out.println("--> " + fromPlace + " to " + place);
            fromPlace = place;
        }

        System.out.println("Trip ends at " + list.getLast());
    }

    public static void printItinerary3(LinkedList<String> list) {
        System.out.println("Trip starts at " + list.getFirst());
        String fromPlace = list.getFirst();
        ListIterator<String> iterator = list.listIterator(1);
        while (iterator.hasNext()) {
            var place = iterator.next();
            System.out.println("--> From: " + fromPlace + " to " + place);
            fromPlace = place;
        }

        System.out.println("Trip ends at " + list.getLast());
    }


    public static void printItinerary4 (LinkedList<String> list) {
        System.out.println("Trip starts at : " + list.getFirst());
        String fromPlace = list.getFirst();
        ListIterator<String> it = list.listIterator(1);
        while (it.hasNext()) {
            String toPlace = it.next();
            System.out.println("--> From : " + fromPlace + " to " + toPlace);
            fromPlace = toPlace;
        }
        System.out.println("Trip ends at : " + list.getLast());
    }

    private static void testIterator (LinkedList<String> list) {
//        var iterator = list.iterator();
        var iterator = list.listIterator();
        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
            if(iterator.next().equals("Brisbane")) {
                iterator.remove();  //you can remove or add or do both with listIterator but not with iterator.
                iterator.add("Lake Placid");
            }
        }
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }
        System.out.println(list);
        var iterator2 = list.listIterator(3);
        System.out.println(iterator2.next());
    }
}