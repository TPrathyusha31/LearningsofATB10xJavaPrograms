package ex_04_Functions;

import java.util.Scanner;

public class Lab015_Factorial_of_a_given_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = sc.nextInt();
        int fact=1;
        for (int i = 1; i <= num ;i++) {
            fact = fact*i;

        }
        System.out.println("The factorial of a given number is :"+ fact);
    }
}
