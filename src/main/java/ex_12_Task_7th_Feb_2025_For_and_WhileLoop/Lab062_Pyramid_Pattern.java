package ex_12_Task_7th_Feb_2025_For_and_WhileLoop;

import java.util.Scanner;

public class Lab062_Pyramid_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        int rows = sc.nextInt();
        for (int i = 1; i <= rows; i++) {
            //Print spaces first : no of spaces = no of rows - current row
            for(int j=1;j<=rows-i;j++){
                System.out.print("  ");
            }
            //Print * in a row : no of stars = 2*current row-1
            for(int j=1;j<=2*i-1;j++){
                System.out.print("* ");
            }
            System.out.println();
            }
        sc.close();
        }
    }
//            *
//          * * *
//        * * * * *
//      * * * * * * *
//    * * * * * * * * *
