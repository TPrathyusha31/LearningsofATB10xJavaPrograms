package ex_06_Task_29th_Jan_Basic_if_else_programs;

import java.util.Scanner;

public class Lab021_check_eligibility_to_Vote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age : ");
        int age= sc.nextInt();
        if(age>18){
            System.out.println("Eligible to vote");
        }else {
            System.out.println("Not eligible to vote");
        }
    }
}
