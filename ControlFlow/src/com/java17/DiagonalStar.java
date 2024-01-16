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
}
