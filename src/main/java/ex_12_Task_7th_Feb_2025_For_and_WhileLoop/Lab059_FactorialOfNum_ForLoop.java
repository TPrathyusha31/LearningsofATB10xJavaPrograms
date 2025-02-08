package ex_12_Task_7th_Feb_2025_For_and_WhileLoop;

import java.util.Scanner;

public class Lab059_FactorialOfNum_ForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        int fact = 1;
        for(int i=1;i<=num;i++){ //Using FOR Loop
            fact = fact *i;
        }
        System.out.println("The factorial of a given number is : " + fact);
        sc.close();
    }
}
