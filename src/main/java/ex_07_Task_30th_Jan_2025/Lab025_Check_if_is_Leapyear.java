package ex_07_Task_30th_Jan_2025;

import java.util.Scanner;

public class Lab025_Check_if_is_Leapyear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year : ");
        int year = sc.nextInt();
        if(year%4==0){
            System.out.println("It is a Leap year");
        }else{
            System.out.println("It is not a Leap year");
        }
        sc.close();
    }
}
