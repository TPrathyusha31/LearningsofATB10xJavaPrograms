package ex_03_Conditions_and_Loops;

import java.util.Scanner;

public class Lab014_Leap_year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year :");
        long year = sc.nextLong();
        if (year%4==0){
            System.out.println("The given year is a LEAP YEAR");
        }else{
            System.out.println("The given year is not a leap year");
        }
    }
}
