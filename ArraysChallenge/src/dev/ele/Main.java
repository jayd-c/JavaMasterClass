package dev.ele;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

//        int[] arr = getRandomArray(10);
//        System.out.println("Array before sorting : " + Arrays.toString(arr));
//        int[] copyArr = Arrays.copyOf(arr,10);
//        Arrays.sort(copyArr);
//        System.out.println("Ascending Array : " + Arrays.toString(copyArr));
//        int[] resultArr = new int[10];
//        for(int i = copyArr.length-1; i>=0; i--) {
//            resultArr[i] = copyArr[copyArr.length-1-i];
//        }
//        System.out.println("Descending Array : " + Arrays.toString(resultArr));

//        System.out.println(Arrays.toString(getSortedArray3(10)));
//        System.out.println(Arrays.toString(SortedArray.getIntegers(10)));

//        SortedArray.printArray(SortedArray.sortIntegers(SortedArray.getIntegers(10)));

        System.out.println(Arrays.toString(SortedArray.getIntegers(6)));
    }

    public static int[] getRandomArray(int len) {
        Random random = new Random();
        int[] newArr = new int[len];
        for(int i = 0; i<len; i++) {
            newArr[i]  = random.nextInt(100);
        }
        return newArr;
    }

    public static int[] getSortedArray (int len) {
        int[] arr = getRandomArray(10);
        System.out.println("Random Array : " + Arrays.toString(arr));
        int[] convertArr = Arrays.copyOf(arr,10);
        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            for(int i = 0; i<arr.length-1; i++) {
                if(convertArr[i] < convertArr[i+1]) {
                    temp = convertArr[i];
                    convertArr[i] = convertArr[i+1];
                    convertArr[i+1] = temp;
                    flag = true;
                }
            }
        }
        System.out.println(Arrays.toString(convertArr));;
        return convertArr;
    }

    public static int[] getSortedArray2 (int len) {
        int[] arr = getRandomArray(10);
        System.out.println("Unsorted Array : " + Arrays.toString(arr));

        int[] sortedArr = Arrays.copyOf(arr,10);
        int temp;
        boolean flag = true;
        while (flag) {
            flag = false;
            for(int i = 0; i<sortedArr.length-1; i++) {
                if (sortedArr[i] < sortedArr[i+1]) {
                    temp = sortedArr[i];
                    sortedArr[i] = sortedArr[i+1];
                    sortedArr[i+1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArr;
    }

    public static int[] getSortedArray3 (int n) {
        int[] arr = getRandomArray(10);
        System.out.println(Arrays.toString(arr));
        int temp;
        boolean flag = true;
        while (flag) {
            flag = false;
            for(int i = 0; i<arr.length -1; i++) {
                temp = arr[i];
                if(arr[i] < arr [i+1]) {
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    flag = true;

                }
            }
        }
        return arr;

    }
}
