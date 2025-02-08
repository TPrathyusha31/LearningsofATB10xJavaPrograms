package ex_12_Task_7th_Feb_2025_For_and_WhileLoop;

import java.util.Scanner;

public class Lab061_Inverted_rightAngled_triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        int rows= sc.nextInt();
        for(int i=1;i<=rows;i++) {
            for (int j = rows;j>=i;j--){
                System.out.print("*  ");
            }
            System.out.println();
        }
        sc.close();
    }
}
