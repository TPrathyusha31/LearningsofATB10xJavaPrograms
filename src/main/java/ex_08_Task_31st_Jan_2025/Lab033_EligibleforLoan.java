package ex_08_Task_31st_Jan_2025;

import java.util.Scanner;

public class Lab033_EligibleforLoan {
    public static void main(String[] args) {
//        Take the below User info and store it into the variables:
//        Age (integer)
//        Salary (double or float)
//        Credit Score (integer)
//                Age Validation:
//              :- Check if the age is a positive integer.
//              :- Ensure the age is at least 18 years old.
//              :- Max age can be 80.
//        Salary Validation:
//        :- Check if the salary is a positive number.
//        :- Define a minimum salary threshold (e.g., 30,000).
//        Credit Score Validation:
//        :- Check if the credit score is a positive integer.
//        :- Define a minimum credit score threshold (e.g., 650).
//        :- Max credit score threshold (e.g., 850)
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age : ");
        int age = 0;
        if (sc.hasNextInt()) {
            age = sc.nextInt();
        } else {
            System.out.println("Please enter age value in integer only ");
            System.exit(0);
        }
        System.out.println("Enter the salary : ");
        double salary = sc.nextDouble();
        System.out.println("Enter the credit score : ");
        int score = sc.nextInt();
        if (age != 0 && age > 18 && age <= 80) {
            if (salary != 0 && salary >= 30000) {
                if (score != 0 && salary >= 650 && salary <= 850) {
                    System.out.println("Congrats!! You are eligible to take loan.");
                } else {
                    System.out.println("You are not eligible to take loan.");
                }
            } else {
                System.out.println("You are not eligible to take loan.");
            }
        }else {
            System.out.println("You are not eligible to take loan.");
        }
    }
}
