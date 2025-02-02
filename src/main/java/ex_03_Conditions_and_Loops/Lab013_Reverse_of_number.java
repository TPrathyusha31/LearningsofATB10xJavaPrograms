package ex_03_Conditions_and_Loops;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Lab013_Reverse_of_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        int rem=0,revnum=0;
        while(num>0) {
            rem = num % 10;
            revnum = rem + revnum * 10;
            num = num / 10;
        }
            System.out.println("Reverse of num is : "+ revnum);

    }
}
