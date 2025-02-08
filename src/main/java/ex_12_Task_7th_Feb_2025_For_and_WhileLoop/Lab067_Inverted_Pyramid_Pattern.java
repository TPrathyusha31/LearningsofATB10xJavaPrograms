package ex_12_Task_7th_Feb_2025_For_and_WhileLoop;

import java.util.Scanner;

public class Lab067_Inverted_Pyramid_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        int rows = sc.nextInt();
        for(int i=1;i<=rows;i++){
            //Print spaces : no of spaces = current row-1
            for(int j=1;j<=i-1;j++){
                System.out.print("  ");
            }
            //Print stars : no of stars = 2*rows-1
            for(int j=1;j<=2*(rows-i)+1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
