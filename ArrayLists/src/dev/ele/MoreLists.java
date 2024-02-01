package dev.ele;

import java.util.*;

public class MoreLists {
    public static void main(String[] args) {

        String[] items = {"apples","bananas","milk","eggs"};

        List<String> lists = List.of(items);
        System.out.println(lists);

        System.out.println(lists.getClass().getName()); //immutanble

        ArrayList<String> arrayList = new ArrayList<>(lists);
        System.out.println(arrayList);
        System.out.println(arrayList.getClass().getName()); // mutable arraylist

        ArrayList<String> stringArrayList = new ArrayList<>(
          List.of("apples","bananas","mangoes")
        );
        System.out.println(stringArrayList);

        arrayList.addAll(stringArrayList);
        System.out.println(arrayList);

        System.out.println("Third item = " + stringArrayList.get(2));

        if(stringArrayList.contains("bananas")) System.out.println("bananas in the list");

        List<String> list = new ArrayList<>(stringArrayList);
        System.out.println(list);
        list.addAll(arrayList);
        System.out.println(list);

        System.out.println(list.lastIndexOf("bananas"));
        System.out.println(list.indexOf("bananas"));

        list.remove(1);
        list.remove("milk");
        System.out.println(list);

        list.retainAll(List.of("bananas","apples"));
        System.out.println(list);

        list.clear(); //removes all
        System.out.println("Is empty = " + list.isEmpty());

        System.out.println(arrayList);
        arrayList.sort(Comparator.naturalOrder());
        System.out.println(arrayList);

        list.addAll(List.of("bananas","apples","kiwis"));
        System.out.println(list);
        list.addAll(Arrays.asList("mangoes","grapes","guavas"));
        System.out.println(list);
//        Collections.sort(list);
        list.sort(Comparator.naturalOrder());
        System.out.println(list);
        list.sort(Comparator.reverseOrder());
        System.out.println(list);

        String[] groceryArray = list.toArray(new String[]{});
        //or
        var groceryArray1 = list.toArray();
        System.out.println("New array 1 = " + Arrays.toString(groceryArray));
        System.out.println("New array 2 = " + Arrays.toString(groceryArray1));






    }
}
