package ex_12_Task_7th_Feb_2025_For_and_WhileLoop;

public class Lab055_SumOfNumbers_1_to_100 {
    public static void main(String[] args) {
        int num=100,sum=0;
        for(int i=1;i<=100;i++){
            sum=sum+i;
        }
        System.out.println("The sum of numbers from 1 to 100 : " + sum);
    }
}
