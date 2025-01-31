package ex_06_Task_29th_Jan_Basic_if_else_programs;

import java.util.Scanner;

public class Lab017_Positive_or_Negative
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num=0;
        if(sc.hasNextInt()) {
            num = sc.nextInt();
        }else{
            System.out.println("Enter integer value only");
            System.exit(0);
        }
        if(num >= 0){
            System.out.println("The given number is positive");
        }else{
            System.out.println("The given number is negative");
            sc.close();
        }
    }
}
