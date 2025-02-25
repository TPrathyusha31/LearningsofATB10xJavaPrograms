package ex_15_Constructors;

public class Lab074_CallingConstructorwithin_otherConstructor {
    public static void main(String[] args) {
     Bike b = new Bike("Yamaha");
    }
}
class Vehicle{
    public Vehicle(){
        System.out.println("This is a parent constructor - Vehicle");
    }
}

class Bike extends Vehicle{
    String model;
    public Bike(String model){
        super(); //When calling parent constructor in child constructor, the first statement in child constructor should be calling the parent using super () keyword
        this.model=model;
        System.out.println("The model of bike is : "+ model);
    }
}
