package dev.ele.jon.SetAndHashSet;

import java.util.*;

class Stud {
    public String name;
    public int age;

    public Stud(String name, int age) {
        this.name = name;
        this.age = age;
    }

}

class StudByAge implements Comparator<Stud> {

    @Override
    public int compare(Stud o1, Stud o2) {
        return o1.age - o2.age;
    }
}
public class MapClasses {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("a",1);
        map.put("b",2);
        map.put("c",3);

        for(Map.Entry<String,Integer> me: map.entrySet()) {
            System.out.println(me.getKey() + " : " + me.getValue() );
        }


        List<Stud> students = new ArrayList<>();
        students.add(new Stud("Tim",21));
        students.add(new Stud("Dave",15));
        students.add(new Stud("Dav",1));

        students.sort(new StudByAge());

        for(Stud s: students) {
            System.out.print(s.age + " ");
        }


    }
}
