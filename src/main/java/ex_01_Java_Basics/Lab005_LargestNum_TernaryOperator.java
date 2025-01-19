package ex_01_Java_Basics;

public class Lab005_LargestNum_TernaryOperator {
    public static void main(String[] args) {
        int a=45,b=-9,c=20;
        int largest_num=(a>b)?((a>c)?a:c):((b>c)?b:c);
        System.out.println("Largest number among a,b and c is : " + largest_num);
    }
}