package ex_07_Task_30th_Jan_2025;

import java.util.Scanner;

public class Lab026_Calculate_grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks : ");
        int marks = sc.nextInt();
        if (marks<0 || marks>100){
            System.out.println("Enter marks between 0 and 100");
            System.exit(0);
        }
        if(marks>=90 && marks <=100){
            System.out.println("Grade is A+");
        }else if(marks>=80 && marks <=89){
            System.out.println("Grade is A");
        }else if(marks>=70 && marks <=79){
            System.out.println("Grade is B");
        }else if(marks>=60 && marks <=69){
            System.out.println("Grade is C");
        }else if(marks>=50 && marks <=59){
            System.out.println("Grade is D");
        }else  if(marks>=40 && marks <=49){
            System.out.println("Grade is E");
        }else{
            System.out.println("FAIL");
        }
        sc.close();
    }
}
