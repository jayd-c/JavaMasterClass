package dev.ele;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] myIntArr = new int[5];
        int[] anotherArray = myIntArr;

        System.out.println("myIntArr = " + Arrays.toString(myIntArr));
        System.out.println("anotherArray = " + Arrays.toString(anotherArray));

        anotherArray[0] = 1;
        modifyArray(myIntArr);

        System.out.println("myIntArr = " + Arrays.toString(myIntArr));
        System.out.println("anotherArray = " + Arrays.toString(anotherArray));


    }

    private static void modifyArray (int[] array) {
        array[1]= 2;

    }
}
