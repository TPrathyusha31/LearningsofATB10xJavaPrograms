package ex_12_Task_7th_Feb_2025_For_and_WhileLoop;

import java.util.Scanner;

public class Lab057_FactorialOfGivenNumber_WhileLoop {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        int fact = 1;
        int i=1;
        while(i<=num){        //   Using WHILE loop
            fact = fact *i;
            i++;
        }
        System.out.println("The factorial of a given number is : " + fact);
        sc.close();
    }
}
