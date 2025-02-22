package ex_16_Task_20th_Feb_OOPs;

import java.sql.SQLOutput;

public class Lab076_EncapsulationExample1 {
    public static void main(String[] args) {
        BankAccount bank_acc=new BankAccount();
        System.out.println(bank_acc.getBank_balance());
        System.out.println(bank_acc.amount_withdraw);
    }

}
class BankAccount {
    private int bank_balance = 70000;
    int amount_withdraw = 80000;
//    private int Withdraw_Amount(){
//        return amount_withdraw;
//    private deposit();
//    return amount_withdraw;
    public int getBank_balance() {
        return bank_balance;
    }
    public void setBank_balance(int bank_balance){
        this.bank_balance=bank_balance;
    }
}
