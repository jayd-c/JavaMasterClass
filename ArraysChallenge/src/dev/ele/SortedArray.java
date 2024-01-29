package dev.ele;

import java.util.Scanner;

public class SortedArray {

    public static int[] getIntegers (int len) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[len];
        for(int i = 0; i< arr.length; i++) {
            String input = sc.nextLine();
            arr[i] = Integer.parseInt(input);
        }
        return arr;
    }

    public static int[] sortIntegers (int[] arr) {

        int temp;
        boolean flag = true;

        while (flag) {
            flag = false;
            for(int i = 0; i<arr.length-1; i++) {
                temp = arr[i];
                if(arr[i] < arr[i+1]) {
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    flag = true;
                }

            }

        }
        return arr;

    }

    public static void printArray (int[] arr) {
        for(int i = 0; i<arr.length; i++) {
            System.out.printf("Element %s contents %s%n",i,arr[i]);
        }
    }
}
