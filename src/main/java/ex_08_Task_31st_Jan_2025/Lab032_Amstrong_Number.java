package ex_08_Task_31st_Jan_2025;

import java.util.Scanner;


public class Lab032_Amstrong_Number {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        int length = String.valueOf(num).length();
        System.out.println(length);
        int rem=0,rev_num=0;
        int tempnum=num;
        while(num>0){                            //Logic will work for 3 digit number only
            rem = num%10;
            rev_num = rev_num+rem*rem*rem;
            num = num/10;
        }
        System.out.println(rev_num);
        if ( rev_num == tempnum){
            System.out.println("It is an amstrong number");
        }else{
            System.out.println("It is not an amstrong number");
        }
        sc.close();
    }
}
