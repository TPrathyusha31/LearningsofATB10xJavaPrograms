package ex_07_Task_30th_Jan_2025;

import java.util.Scanner;

public class Lab029_ATM_Withdrawl {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the amount to be withdrawl : ");
    double amount = sc.nextInt();
    double acc_bal = 10000;
    if ((amount>0) && (amount<acc_bal) && (amount%100==0)){
        System.out.println("Deduct the amount " +amount+ " from the available account balance "+ acc_bal);
        double Updated_bal = acc_bal-amount;
        System.out.println("Updated balance in the account after withdrawl of "+ amount+ " is " + Updated_bal);
    }else if(amount%100!=0){
        System.out.println("Please enter the amount in the multiples of 100");
    }else if(amount > acc_bal){
        System.out.println("Sorry, do not have sufficient balance in your account to withdraw the entered amount");
    } else if (amount<=0) {
        System.out.println("Please enter valid amount details to withdraw");

    }
sc.close();
    }
}
