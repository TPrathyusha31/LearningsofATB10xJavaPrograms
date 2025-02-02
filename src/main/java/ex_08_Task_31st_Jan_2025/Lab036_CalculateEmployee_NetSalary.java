package ex_08_Task_31st_Jan_2025;

import java.util.Scanner;

public class Lab036_CalculateEmployee_NetSalary {
    public static void main(String[] args) {
//        calculate Employee Net Salary (Basic Pay, HRA, DA, Tax Deductions,)
//       GrossSalary=BasicPay+HRA+DA+OtherAllowances
//        Deductions=IncomeTax
//       Net Salary = Gross Salary - Total Deductions
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the employee Basic Pay : ");
        double basicPay = sc.nextDouble();
        System.out.println("Enter the house rent allowance percentage: ");
        double HRA_PERCENTAGE= sc.nextDouble();
        System.out.println("Enter the Direct allowance percentage : ");
        double DA_PERCENTAGE = sc.nextDouble();
        System.out.println("Enter the other allowance percentage : ");
        double OA_PERCENTAGE= sc.nextDouble();
        System.out.println("Enter the Providend fund percentage : ");
        double PF_PERCENTAGE= sc.nextDouble();
        System.out.println("Enter the tax rate in %: ");
        double  tax_rate = sc.nextDouble();
        double HRA = basicPay * HRA_PERCENTAGE;
        double DA = basicPay * DA_PERCENTAGE;
        double OA = basicPay * OA_PERCENTAGE;
        double PF = basicPay * PF_PERCENTAGE;
        double tax = basicPay * tax_rate;
        double Gross_salary=0,Deductions=0;
        System.out.println("------------------------------------------------------");
        Gross_salary = basicPay+HRA+DA+OA;
        System.out.println("The Gross salary of an employee is : "+ Gross_salary);
        Deductions = PF+tax;
        System.out.println("Deductions  : "+ Deductions);
        double Net_salary = Gross_salary+Deductions;
        System.out.println("The Net salary of an employee is : "+ Net_salary);
    }
}
