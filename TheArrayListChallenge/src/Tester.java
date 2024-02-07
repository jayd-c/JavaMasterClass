import java.util.*;

public class Tester {

    private static Scanner scanner;
    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        boolean flag = true;
        List<String> groceryList = new ArrayList<>();
        new ArrayList<>();
        while (flag) {
            printGreeting();

        switch (Integer.parseInt(scanner.nextLine())) {
            case 1 -> addOrRemove("add",groceryList);
            case 2 -> addOrRemove("remove",groceryList);
            default -> flag = false;
        }
            groceryList.sort(Comparator.naturalOrder());
            if(!groceryList.isEmpty()) {
                System.out.println(groceryList);
            } else {
                System.out.println("Grocery Lit is empty, Please add items");
            }
        }

    }

    private static void printGreeting () {
        System.out.print("""
                Available Actions:
                0 - to shutdown
                1- to add item(s) to list (comma delimited list);
                2- to remove any item (comma delimited list)
                Enter a number for which action you want to do:
                """);
    }
    private static void addOrRemove(String addOrRemove, List<String> list) {
        if(addOrRemove.equals("remove")) {
            System.out.println("Enter an item or comma delimited list to remove:");
            System.out.println("You are removing above from the list:");
            removeList(list);
        } else {
            System.out.println("Enter an item or comma delimited list to add:");
            System.out.println("You are adding above to the list:");
            addToList(list);
        }

    }
    private static void addToList (List<String> list) {
        List<String> tempList = new ArrayList<>();
        String[] arr = scanner.nextLine().split(",");
        for(String s: arr) {
            if(list.contains(s.trim().toLowerCase())) {
                tempList.add(s.trim());
            } else {
                list.add(s.trim());
            }
        }
        list.sort(Comparator.naturalOrder());
        if(!tempList.isEmpty()) {
            System.out.println("Duplicate items of : " + tempList + " were not added to this list");

        }
    }

    private static void removeList (List<String> list) {
        List<String> tempList = new ArrayList<>();
        String[] arr = scanner.nextLine().split(",");
        for(String s: arr) {
            if(list.contains(s.trim())) {
                list.remove(s.trim());
            } else {
                tempList.add(s.trim());

            }
        }
        list.sort(Comparator.naturalOrder());
        if(!tempList.isEmpty()) {
            System.out.println("Following items were not found in the list to remove : ");
            System.out.println(tempList);
            System.out.println("-".repeat(20));
        }
    }

    public static void printContacts () {
        ArrayList<String> myContacts = new ArrayList<>(Arrays.asList("Nimak", "kamaK"));
        System.out.println("Contact List:");
        for(int i = 0; i<myContacts.size(); i++) {
            System.out.printf("%d. %s -> %s%n",i+1,myContacts.get(0),myContacts.get(1));
        }
    }

}
