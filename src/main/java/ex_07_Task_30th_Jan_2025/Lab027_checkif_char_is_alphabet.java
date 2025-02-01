package ex_07_Task_30th_Jan_2025;

import java.util.Scanner;

public class Lab027_checkif_char_is_alphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character : ");
        char ch = sc.next().charAt(0);
        if ( ch>='A' && ch<='Z' || ch>='a' && ch<='z' ) {
            System.out.println("It is an alphabet");
        }else{
            System.out.println("It is not an alphabet");
        }
        sc.close();
    }
}
