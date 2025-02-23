package ex_16_Task_20th_Feb_OOPs;

public class Lab079_MethodOveridingEx1 {
    public static void main(String[] args) {
        Penguin p=new Penguin();
        p.birdfly();
        Eagle e = new Eagle();
        e.fly();
    }
}
class Bird {
  public void fly() {
        System.out.println("Which bird can fly?");
    }
}
class Penguin extends Bird{
   public void birdfly(){
       fly();

   }
}
  class Eagle extends Bird  {
    @Override
         public void fly(){
        System.out.println("Eagle can fly high");
    }

}