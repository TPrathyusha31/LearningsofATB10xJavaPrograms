package ex_02_Inputfrom_CommandLine;

public class Lab008_Print_Name_Age_Salary {
    public static void main(String[] args) {
        String name=args[0];
        int age=Integer.parseInt(args[1]);
        float salary = Float.parseFloat(args[2]);
        System.out.println("Name is : " + name);
        System.out.println("Age is : " + age);
        System.out.println("Salary is : " + salary);
    }
}
