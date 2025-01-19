package ex_02_Inputfrom_CommandLine;

public class Lab009_Max_number_InputFromUser {
    public static void main(String[] args) {

        int n1 = Integer.parseInt(args[0]);
        int n2 = Integer.parseInt(args[1]);
        int Max_num = (n1>n2)?n1 : n2;
        System.out.println("Maximum number is : " + Max_num);
    }
}
