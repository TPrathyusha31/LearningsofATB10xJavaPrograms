package ex_06_Task_29th_Jan_Basic_if_else_programs;

import java.util.Scanner;

public class Lab019_Max_of_two_numbers {
    public static void main(String[] args) {
        int a=0,b=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
        if(sc.hasNextInt()){
            a = sc.nextInt();
        }else{
            System.out.println("Enter only integer value.");
            System.exit(0);
        }
        System.out.println("Enter b: ");
        if(sc.hasNextInt()) {
            b = sc.nextInt();
        }else{
            System.out.println("Enter only integer value.");
            System.exit(0);
        }
        if(a>b){
            System.out.println("a is greater than b");
        }else{
            System.out.println("b is greater than a");
        }
        sc.close();
    }
}
