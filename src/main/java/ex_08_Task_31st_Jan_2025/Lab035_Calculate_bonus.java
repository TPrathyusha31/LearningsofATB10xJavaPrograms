package ex_08_Task_31st_Jan_2025;

import java.util.Scanner;

public class Lab035_Calculate_bonus {
    public static void main(String[] args) {
//        take the salary and Year info from the User.
//                Implement Bonus Calculation Logic:
//        Define the bonus structure based on salary and years of experience.
//           :- If years of experience is less than 1 year: No bonus.
//           :- If years of experience is between 1 and 3 years: Bonus is 5% of the salary.
//           :- If years of experience is between 4 and 6 years: Bonus is 10% of the salary.
//           :- If years of experience is greater than 6 years: Bonus is 15% of the salary.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the employee salary  : ");
        double salary =0;
        if(sc.hasNextDouble()) {
              salary = sc.nextDouble();
        } else {
            System.out.println("Salary cannot be zero or string value.Please enter correct salary detail.");
            System.exit(0);
        }
        System.out.println("Enter the employee experience(in years) : ");
        float years = sc.nextFloat();
        double bonus;
        if (years>0 && years<1) {
            System.out.println("Sorry, the employee doesn't get any bonus as the experience is less");
        } else if (years >= 1 && years <= 3) {
            bonus = salary*(0.05);
            System.out.println("The employee gets a bonus amount of : " + bonus);
        } else if (years >= 4 && years <= 6) {
            bonus = salary*(0.1);
            System.out.println("The employee gets a bonus amount of : " + bonus);
        } else if (years > 6) {
            bonus = salary * (0.15);
            System.out.println("The employee gets a bonus amount of : " + bonus);
        } else {
            System.out.println("Year of experience can't be zero.Please enter the correct years of experience. ");
        }
    }
}
