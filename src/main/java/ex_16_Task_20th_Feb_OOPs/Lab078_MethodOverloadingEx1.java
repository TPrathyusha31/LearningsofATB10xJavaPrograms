package ex_16_Task_20th_Feb_OOPs;

public class Lab078_MethodOverloadingEx1 {
    public static void main(String[] args) {
      Calculator c= new Calculator();
      c.add(4,6);
      c.add("Method","Overloading-","java");
    }
}
class Calculator{
    public void add(int a, int b){
        int result = a+b;
        System.out.println("The sum of integer numbers is : "+ result);
    }

    public void add(String s1, String s2,String s3){
        System.out.println(s1+s2+s3);
    }
}