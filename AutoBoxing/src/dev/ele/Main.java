package dev.ele;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Integer boxedInt = Integer.valueOf(15);
//    Integer deprecatedIntBoxing = new Integer(15);
        Integer autoBoxed = 15;
        int autoUnBoxed = autoBoxed;

        System.out.println(autoBoxed.getClass().getName()); //this Wrapper class
//        System.out.println(autoUnBoxed.getName()); //this is primitive type

        Double resultBoxed = getPrimitiveDouble();
        double resultUnboxed = getDoubleObject();

        Integer[] wrapperArray = new Integer[5];
        wrapperArray[0] = 50;
        System.out.println(Arrays.toString(wrapperArray));
        System.out.println(wrapperArray[0].getClass().getName());

        Character[] characterArray = {'a','b','c','c'};
        System.out.println(Arrays.toString(characterArray));

        var ourList = getList(1,2,3,4,5,6);
        System.out.println(ourList);
    }

    private static double getDoubleObject () {
        return  Double.valueOf(100.00);
    }

    private static double getPrimitiveDouble () {
        return 100.00;
    }

    private static int returnAnInt (Integer i) {
        return  i;
    }

    private static Integer returnInt (int i) {
        return i;
    }
    private static ArrayList<Integer> getList (Integer... varargs) {
        ArrayList<Integer> aList = new ArrayList<>();
        for(int i: varargs) {
            aList.add(i);;
        }
        return aList;
    }


}
