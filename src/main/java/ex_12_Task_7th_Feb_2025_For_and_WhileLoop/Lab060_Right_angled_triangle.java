package ex_12_Task_7th_Feb_2025_For_and_WhileLoop;

import java.util.Scanner;

public class Lab060_Right_angled_triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total number of rows: ");
        int rows = sc.nextInt();
        for (int i = 0; i <= rows-1; i++) {  //matrix starts from index 0
            for (int j = 0; j <= i; j++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
        sc.close();
    }
}
