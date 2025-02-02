package ex_08_Task_31st_Jan_2025;

import java.util.Scanner;

public class Lab031_Palindrome_or_not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = 0;
        int revnum =0,rem =0,tempnum =0;
        if(sc.hasNextInt()){
            num = sc.nextInt();
            tempnum = num;
        }else{
            System.out.println("Please enter only the integer value");
            System.exit(0);
        }
        while(num>0){
            rem = num%10;
            revnum = revnum*10+rem;
            num = num/10;
        }
        System.out.println("Reverse of a number : " + revnum);
        if(revnum==tempnum){
            System.out.println("The given number is a Palindrome");
        }else{
            System.out.println("The given number is not a Palindrome");
        }
        sc.close();
    }
}
