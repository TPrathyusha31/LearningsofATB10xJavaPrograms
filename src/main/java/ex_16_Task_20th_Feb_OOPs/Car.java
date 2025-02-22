package ex_16_Task_20th_Feb_OOPs;

public class Car extends Vehicle{
    public Car(String model, String brand){
        this.model=model;
        this.brand=brand;
        System.out.println("The model of Car : " + model + " and brand is : " +brand);
        
    }
    void Car_Cost(){
        System.out.println("The cost of car is : 8L");
    }
}
