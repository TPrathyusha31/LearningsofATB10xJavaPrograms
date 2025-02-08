package ex_12_Task_7th_Feb_2025_For_and_WhileLoop;

import java.util.Scanner;

public class Lab056_TableOfgivenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        int result = 0;
        for(int i = 1; i <=10;i++){ //Using for loop
           result = num*i;
            System.out.println(num + " x " + i + " = " + result);
            sc.close();

        //USING WHILE LOOP
//        int i = 1;
//        while (i <= 10) {
//            result = num * i;
//            System.out.println(num + " x " + i + " = " + result);
//            i++;
        }
    }
}
