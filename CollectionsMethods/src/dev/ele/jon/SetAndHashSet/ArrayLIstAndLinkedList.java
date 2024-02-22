package dev.ele.jon.SetAndHashSet;

import java.util.*;
import java.util.stream.Collectors;

public class ArrayLIstAndLinkedList {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("Kevin","melvin","Selvin","Bolt");
//        List<String> list = new ArrayList<>();
//        list.add("Tim");
//        list.addAll(Arrays.asList("Kevin","melvin","Selvin","Bolt"));
        System.out.println("Size : " + list.size());
//        list.add("kamal");
        list.remove("Tim");
//        list.remove(0);
        System.out.println("Size : " + list.size());
        System.out.println("retrieve second in list : " + list.get(1));

        list.forEach(System.out::println);

        System.out.println("*".repeat(100));

        LinkedList<Integer> integerList = new LinkedList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        System.out.println(integerList);
        integerList.offer(4);
        integerList.poll();
        System.out.println(integerList);
        integerList.pop();

        System.out.println(integerList);


        //as queue methods fifo

        System.out.println("*".repeat(100));

        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {10,11,1,2,3,4,7,8,9};
        List<Integer> l1 = new ArrayList<>();
        for(int i: arr1) {
            l1.add(i);
        }

        ArrayList<Integer> resultList = new ArrayList<>();

        for(int i: arr2) {
            if(l1.contains(i)) {
                resultList.add(i);
            }
        }
        System.out.println("*".repeat(100));

        System.out.println(resultList);

        System.out.println("*".repeat(100));

        for(int i: arr1) resultList.add(i);
        for(int i: arr2) resultList.add(i);

        Set<Integer> set = new HashSet<>(resultList);

        resultList.clear();
        resultList.addAll(set);
        System.out.println(resultList);

        LinkedList<Integer> linkedList = new LinkedList<>(resultList);
        System.out.println("********LinkedList**********");
        System.out.println(linkedList);
        linkedList.add(4);
        System.out.println(linkedList);



        linkedList.offer(4);
        System.out.println(linkedList);
        System.out.println(linkedList.pop()); //Deque first in First out FIFO

        LinkedList<Integer> queLinkedList  = new LinkedList<>();
        queLinkedList.add(1);
        queLinkedList.add(2);
        System.out.println(queLinkedList);
        queLinkedList.push(1);
        System.out.println(queLinkedList);
        System.out.println(queLinkedList.pop());





    }
}
