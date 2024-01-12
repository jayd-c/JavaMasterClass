package com.java17;

public class DiagonalStar {
    public static void main(String[] args) {
        diagonalStar(7);

    }
    public static void diagonalStar (int number) {
       for(int col = 1; col <= number; col++) {
           for(int row = 1; row <= number; row++) {
               if(row ==1 || row == number - (col-1) || row == col || row == number ) System.out.print("*");
               else System.out.print(" ");

           }
           System.out.println();
       }
    }

    public static void dag () {
        for(int i = 1 ; i<=5; i++) {
            for (int j = 1; j<=5; j++) {
                System.out.print(i+"*"+j+ "-");
            }
            System.out.println();
        }
    }
}
