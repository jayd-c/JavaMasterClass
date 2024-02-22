package dev.ele.jon.SetAndHashSet;

import java.util.*;
class Student {
    public String name;
    public int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
public class Main {
    public static void main(String[] args) {

        Set<String> names = new HashSet<>();
        names.add("Tim");
        names.add("John");
        names.add("Skyler");
        names.add("Mike");
        names.add("Tim"); //no compiler error but will not add to the set
        System.out.println(names);

        names.remove("Tim");
        System.out.println(names);
        System.out.println("size = " + names.size());

        System.out.println("Does my set Contains Tim ? " + names.contains("Tim"));

//        names.clear();
//        System.out.println(names);
        for(String name: names){
            System.out.println(name);
        }
        System.out.println("********************");
        names.forEach(System.out::println);
        System.out.println("**********************");
        names.forEach(System.out::println);
        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("*************************");
        List<Integer> numList = Arrays.asList(100,1,2,3,4,5,6,7,8,9,9,10,1,2,-1,5,6,-12,150);
        System.out.println("List with duplicates = " + numList);
        Set<Integer> numSet = new HashSet<>(numList);
        System.out.println("Set without duplicates = " + numSet);

    }
}
