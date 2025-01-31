package ex_06_Task_29th_Jan_Basic_if_else_programs;

import java.util.Scanner;

public class Lab018_Even_or_Odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = 0;
        if(sc.hasNextInt()) {
             num = sc.nextInt();
        }else{
            System.out.println("Enter only the integer value.");
            System.exit(0);
        }
        if(num%2==0){
            System.out.println("It is an even number");
        }else {
            System.out.println("It is an odd number");
            sc.close();
        }
    }
}
