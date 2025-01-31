package ex_06_Task_29th_Jan_Basic_if_else_programs;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Lab020_Vowel_or_Consonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character : ");
        char ch=sc.next().charAt(0);
//        if (sc.hasNext()) {
//            ch = sc.next().trim();
//        } else if (ch.length() > 1) {
//            System.out.println("Enter only one character");
//            System.exit(0);
//        } else if (ch.isEmpty()) {
//            System.out.println("Input can't be empty.Enter only one character");
//            System.exit(0);
//        } else {
//            System.out.println("Enter a valid alphabetic character only");
//            System.exit(0);
//        }
        if (ch=='a'|| ch=='e' || ch=='i' || ch=='o' || ch=='u'||
                ch=='A' || ch=='E'|| ch=='I' || ch=='O' || ch=='U') {
            System.out.println("It is a vowel.");
        } else {
            System.out.println("It is a Consonant.");
        }
    }
}





