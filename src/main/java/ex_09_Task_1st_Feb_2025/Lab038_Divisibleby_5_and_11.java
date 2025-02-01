package ex_09_Task_1st_Feb_2025;

import java.util.Scanner;

public class Lab038_Divisibleby_5_and_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num=sc.nextInt();
        if (num%5==0 && num%11==0){
            System.out.println("Number is divisible by 5 and 11");
        } else if (num%5==0) {
            System.out.println("Number is divisible by 5");
        }else if(num%11==0){
            System.out.println("Number is divisible by 11");
        }else{
            System.out.println("It is neither divisible by 5 nor 11");
        }
        sc.close();
    }
}
