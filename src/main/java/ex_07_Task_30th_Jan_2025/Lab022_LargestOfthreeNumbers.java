package ex_07_Task_30th_Jan_2025;

import java.util.Scanner;

public class Lab022_LargestOfthreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a : ");
        int a = sc.nextInt();
        System.out.println("Enter the value of b : ");
        int b = sc.nextInt();
        System.out.println("Enter the value of c : ");
        int c = sc.nextInt();
        if (a > b) {
            if (a > c) {
                System.out.println("a is largest ");
            }
        }else if (b > c) {
                System.out.println("b is largest");
            } else {
                System.out.println("c is largest");
            }
        sc.close();
        }
    }


