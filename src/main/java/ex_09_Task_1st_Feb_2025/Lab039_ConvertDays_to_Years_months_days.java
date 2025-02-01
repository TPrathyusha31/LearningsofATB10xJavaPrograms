package ex_09_Task_1st_Feb_2025;

import java.util.Scanner;

public class Lab039_ConvertDays_to_Years_months_days {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no: of days : ");
        int day = sc.nextInt();
        int years,months,days;
        years = day / 365;
        months = (day % 365) / 30;
        days = (day % 365) % 30;
        System.out.println("Conversion of "+ day +" days is : " + years +"years," + months + "months," + days + "days");
        sc.close();
    }
}
