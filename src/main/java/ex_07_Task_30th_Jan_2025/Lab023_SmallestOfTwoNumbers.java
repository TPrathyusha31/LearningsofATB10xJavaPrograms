package ex_07_Task_30th_Jan_2025;

import java.util.Scanner;

public class Lab023_SmallestOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        int a = sc.nextInt();
        System.out.println("Enter the value of b: ");
        int b = sc.nextInt();
        if(a<b){
            System.out.println("a is smallest number");
        }else{
            System.out.println("b is smallest number");
        }
         sc.close();

    }
}
