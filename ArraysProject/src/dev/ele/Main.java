package dev.ele;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] myIntArray = new int[10];
        myIntArray[5] = 50;

        int[] fistFiveArray = new int[] {1,2,3,4,5};

        double[] myDoubleArray = new double[10];
        myDoubleArray[2] = 3.5;

        System.out.println(myDoubleArray[1]);

        int[] firstTenAnonymousArray = {1,2,3,4,5,6,7,8,9,10};

        System.out.println(firstTenAnonymousArray[0]);
        System.out.println(firstTenAnonymousArray.length);

        System.out.println(firstTenAnonymousArray.length-1);

        int[] newArray;
        newArray = new int[10];

        for(int i = 0; i<10; i++) {
            newArray[i] = (i+1)*10;
        }
        System.out.println(Arrays.toString(newArray));

        Object objectVariable = newArray;

        if(objectVariable instanceof int[]) {
            System.out.println("objectVariable is really an int array");
        }

        Object[] objectsArray = new Object[3];
        objectsArray[0]= "Hello";
        objectsArray[1] = new StringBuilder("Hello");
        objectsArray[2] = newArray;

//        System.out.println(Arrays.toString(Arrays.stream(objectsArray).toArray()));
        System.out.println(Arrays.toString(objectsArray));
    }
}
