import java.util.*;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

//        System.out.println(getInput());
        Tester.printContacts();
    }

    public static String getInput () {
        List<String> list = new ArrayList<>();
        printGreeting();
        String input = scanner.nextLine();
        while (!Objects.equals(input, "0")) {
           if(input.equals("1")) {
               System.out.println("Enter an item or comma delimited list to add:");
               input = scanner.nextLine();
               System.out.println("You are adding above to the list:");
               addToList(input,list);
               System.out.println(list);
           }
           else if(input.equals("2")){
               System.out.println("Enter an item or comma delimited list to remove:");
               input = scanner.nextLine();
               System.out.println("You are removing above from the list:");
               removeList(input,list);
               System.out.println(list);
           }

           else if (input.equals("0")) {
                System.out.println("Good bye");
                break;
            } else {
                printGreeting();
                input = scanner.nextLine();
            }
        }
        return input;

    }

    private static void addToList (String str, List<String> list) {
        List<String> tempList = new ArrayList<>();
        String[] arr = str.split(",");
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

    private static void removeList (String str, List<String> list) {
        List<String> tempList = new ArrayList<>();
        String[] arr = str.split(",");
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
        String input;
        if(addOrRemove.equals("remove")) {
            System.out.println("Enter an item or comma delimited list to remove:");
            input = scanner.nextLine();
            System.out.println("You are removing above from the list:");
        } else {
            System.out.println("Enter an item or comma delimited list to add:");
            input = scanner.nextLine();
            System.out.println("You are adding above to the list:");
        }
        addToList(input,list);
        System.out.println(list);

    }
}
