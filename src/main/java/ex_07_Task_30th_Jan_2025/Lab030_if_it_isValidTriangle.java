package ex_07_Task_30th_Jan_2025;

import java.util.Scanner;

public class Lab030_if_it_isValidTriangle {
    public static void main(String[] args) {
//        Valid triangle --> if sum of any 2 sides is greater than third side.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side a : ");
        int a = sc.nextInt();
        System.out.println("Enter the side b : ");
        int b = sc.nextInt();
        System.out.println("Enter the side c : ");
        int c = sc.nextInt();
        if ( a+b>c && b+c>a && c+a>b){
            System.out.println("It is a valid triangle");
        }else{
            System.out.println("It is not a valid triangle");
        }
        sc.close();
    }
}
