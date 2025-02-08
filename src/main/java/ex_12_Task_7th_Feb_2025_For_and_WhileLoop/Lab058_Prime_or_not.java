package ex_12_Task_7th_Feb_2025_For_and_WhileLoop;

import java.util.Scanner;

public class Lab058_Prime_or_not {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        int count=0;
        for(int i=1;i<=num;i++) {
            if (num % i == 0) {
                count++;
            }
        }
        if(count>2){
            System.out.println("It is not a prime number");
        }else{
            System.out.println("It is a prime number");
        }

    }
}
