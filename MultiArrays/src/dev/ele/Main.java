package dev.ele;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] array2 = new int[4][4];
        System.out.println(Arrays.toString(array2));
        System.out.println("array2.length = " + array2.length);

        for(int[] outer: array2) {
            System.out.println(Arrays.toString(outer));
        }
        System.out.println("*".repeat(30));


        for(int i = 0;  i<array2.length; i++)  {
            for(int j = 0; j<array2[i].length; j++) {
//                System.out.print(array2[i][j] + " ");
                array2[i][j] = 4;
            }
            System.out.println(" ");
        }
        System.out.println("*".repeat(30));

        for(int i = 0; i<array2.length; i++) {
            var innerArray = array2[i];
            for(int j = 0; j<innerArray.length; j++) {
                System.out.print(array2[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println("*".repeat(30));

        for(var arr: array2) {
            for(var i: arr) {
                System.out.print(i+ " ");
            }
            System.out.println("");
        }
        System.out.println("*".repeat(30));

        System.out.println(Arrays.deepToString(array2));

        System.out.println("*".repeat(30));

        array2[1] = new int[] {1,2,3};

        System.out.println(Arrays.deepToString(array2));
        System.out.println("_".repeat(50));

        Object[] anyArray = new Object[3];
        System.out.println(Arrays.toString(anyArray));

        anyArray[0] = new String[] {"A","B","C"};

        System.out.println(Arrays.deepToString(anyArray));

        anyArray[1] = new String[][]{
                {"1", "2"},
                {"3", "4", "5"},
                {"6","7","8","9"}

        };

        System.out.println(Arrays.deepToString(anyArray));

        anyArray[2] = new int[2][2][2];

        System.out.println(Arrays.deepToString(anyArray));

        for(Object ele: anyArray) {
            System.out.println("Element type  = " + ele.getClass().getSimpleName());
            System.out.println("Element toString() = " + ele);
            System.out.println(Arrays.deepToString((Object[]) ele));

        }
    }
}
